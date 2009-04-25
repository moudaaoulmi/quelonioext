package br.pucrio.inf.les.genarch.core.operations;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.operation.IRunnableWithProgress;

import br.pucrio.inf.les.genarch.core.extension.IDomainModelExtractor;
import br.pucrio.inf.les.genarch.core.models.ConfigurationModelContent;
import br.pucrio.inf.les.genarch.core.models.FeatureModelContent;
import br.pucrio.inf.les.genarch.core.models.ImplementationModelContent;
import br.pucrio.inf.les.genarch.core.models.TemplateContent;
import br.pucrio.inf.les.genarch.core.models.dsl.FMPModelUitl;
import br.pucrio.inf.les.genarch.core.plugin.GenArchPluginFacade;
import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.core.project.navigation.ProjectNavigator;
import br.pucrio.inf.les.genarch.core.project.navigation.itens.VariabilityItem;
import br.pucrio.inf.les.genarch.core.project.navigation.itens.VariabilityItemDescription;
import br.pucrio.inf.les.genarch.core.project.navigation.itens.VariabilityItemDescription.ItemType;
import br.pucrio.inf.les.genarch.core.project.navigation.visitors.ConfigurationModelResourceVisitor;
import br.pucrio.inf.les.genarch.core.project.navigation.visitors.FeatureModelResourceVistor;
import br.pucrio.inf.les.genarch.core.project.navigation.visitors.ImplementationModelResourceVisitor;
import br.pucrio.inf.les.genarch.core.project.navigation.visitors.TemplateResourceVisitor;
import br.pucrio.inf.les.genarch.core.templates.AbstractAspectJTemplate;
import br.pucrio.inf.les.genarch.core.templates.AbstractClassTemplate;
import br.pucrio.inf.les.genarch.core.templates.InterfaceTemplate;
import br.pucrio.inf.les.genarch.models.configuration.Configuration;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMMappings;

public class CreateModelsOperation implements IRunnableWithProgress {

	private IProject project;

	public CreateModelsOperation(IProject project) {
		this.project = project;
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		monitor.beginTask("Creating Models",8);

		GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(project);

		List<String> containers = new ArrayList<String>();
		containers.addAll(genarchProjectConfigurationFile.getSourceContainers());
		containers.addAll(genarchProjectConfigurationFile.getResourceContainers());

		IPath folderPath = new Path("models");

		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		monitor.worked(1);
		monitor.subTask("Creating Templates");

		TemplateResourceVisitor templateClient = new TemplateResourceVisitor();

		ProjectNavigator navigator = new ProjectNavigator(this.project,containers);
		navigator.addResourceVisitors(templateClient);
		navigator.navigate();

		TemplateContent variabilityContent = templateClient.getVariabilityContent();
		List<VariabilityItem> variabilities = variabilityContent.getVariabilities();

		for ( VariabilityItem variabilitiesItem : variabilities ) {
			VariabilityItemDescription itemDescription = variabilitiesItem.getItemDescription();
			String content = "";

			if ( itemDescription.getType() == ItemType.abstractClassType ) {
				AbstractClassTemplate abstractClassTemplate = new AbstractClassTemplate();
				content = abstractClassTemplate.generate(itemDescription);
			} else if ( itemDescription.getType() == ItemType.interfaceType ) {
				InterfaceTemplate interfaceTemplate = new InterfaceTemplate();
				content = interfaceTemplate.generate(itemDescription);
			} else if ( itemDescription.getType() == ItemType.aspectType ) {
				AbstractAspectJTemplate abstractAspectJTemplate = new AbstractAspectJTemplate();
				content = abstractAspectJTemplate.generate(itemDescription);
			}

			ByteArrayInputStream stream = new ByteArrayInputStream(content.getBytes());						
			IFile templateTFile = ResourcesPlugin.getWorkspace().getRoot().getFile(itemDescription.getFullPath());

			try {
				if ( templateTFile.exists() ) {
					templateTFile.setContents(stream, true, true, new NullProgressMonitor());
				} else {
					templateTFile.create(stream, true, new NullProgressMonitor());
				}
			} catch (final CoreException e) {
				e.printStackTrace();
			}
		}

		monitor.worked(1);

		String implementationFileName = "ArchitectureModel.implementation";
		IFile implementationModelFile = this.project.getFile(folderPath.append(implementationFileName));
		URI implementationFileURI = URI.createPlatformResourceURI(implementationModelFile.getFullPath().toString());

		ResourceSet implementationResourceSet = new ResourceSetImpl();
		Resource implementationResource = implementationResourceSet.createResource(implementationFileURI);

		genarchProjectConfigurationFile.setImplementationModelPath(folderPath.append(implementationFileName).toString());

		String configurationFileName = "ConfigurationModel.configuration";
		IFile configurationModelFile = this.project.getFile(folderPath.append(configurationFileName));
		URI configurationFileURI = URI.createPlatformResourceURI(configurationModelFile.getFullPath().toString());

		ResourceSet configurationResourceSet = new ResourceSetImpl();
		Resource configurationResource = configurationResourceSet.createResource(configurationFileURI);

		genarchProjectConfigurationFile.setConfigurationModelPath(folderPath.append(configurationFileName).toString());

		ImplementationModelResourceVisitor implementationClient = new ImplementationModelResourceVisitor();
		ConfigurationModelResourceVisitor configurationClient = new ConfigurationModelResourceVisitor();
		FeatureModelResourceVistor featureClient = new FeatureModelResourceVistor();

		monitor.subTask("Reading Resources");

		navigator = new ProjectNavigator(this.project,containers);
		navigator.addResourceVisitors(implementationClient);
		navigator.addResourceVisitors(configurationClient);
		navigator.addResourceVisitors(featureClient);
		navigator.navigate();

		monitor.worked(1);
		monitor.subTask("Creating Architecture Model");

		ImplementationModelContent implementationContent = implementationClient.getImplementationContent();

		implementationResource.getContents().add(implementationContent.getImplementation());

		try {
			implementationResource.save(options);
		} catch (final IOException e) {
			e.printStackTrace();
		}

		monitor.worked(1);
		monitor.subTask("Creating Configuration Model");

		ConfigurationModelContent configurationContent = configurationClient.getConfigurationContent();
		Configuration configuration = (Configuration)configurationContent.getConfiguration();
						
		configurationResource.getContents().add(configuration);

		try {
			configurationResource.save(options);
		} catch (final IOException e1) {						
			e1.printStackTrace();
		}

		monitor.worked(1);
		monitor.subTask("Creating Feature Model");

		FeatureModelContent featuresContent = featureClient.getFeaturesContent();

		String featureFileName = "FeatureModel.fmp";
		FMPModelUitl fmpModel = new FMPModelUitl(this.project,folderPath.append(featureFileName));
		fmpModel.create(featuresContent,project.getName());
		fmpModel.saveModel();

		genarchProjectConfigurationFile.setFeatureModelPath(folderPath.append(featureFileName).toString());
		
		genarchProjectConfigurationFile.save(monitor);
		
		monitor.worked(1);
		monitor.subTask("Changing Configuration File");
				
		//Execute Extractors		
		DSMMappings dsmMappings = configuration.getDsmMappings();
		
		List<IDomainModelExtractor> extractors = GenArchPluginFacade.Instance().getDomainModelExtractors();
		
		for ( IDomainModelExtractor domainModelExtractor : extractors ) {
			String dsmName = domainModelExtractor.extract(project);
							
			DSM dsm = ConfigurationPackage.eINSTANCE.getConfigurationFactory().createDSM();
			dsm.setName(dsmName);
			
			dsmMappings.getModels().add(dsm);						
		}
		
		try {
			configurationResource.save(options);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		monitor.worked(1);
	}
}
