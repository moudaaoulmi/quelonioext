package br.pucrio.inf.les.genarch.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationAspectBuilder;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationClassBuilder;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationComponentBuilder;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationFileBuilder;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationFolderBuilder;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationFragmentBuilder;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationModel;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationTemplateBuilder;
import br.pucrio.inf.les.genarch.core.plugin.GenArchEMFPlugin;
import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.core.synchronization.AspecJResourceSynchronization;
import br.pucrio.inf.les.genarch.core.synchronization.ClassResourceSyncrhonization;
import br.pucrio.inf.les.genarch.models.configuration.Configuration;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationAspect;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationClass;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFactory;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFolder;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragment;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.configuration.FeatureExpression;
import br.pucrio.inf.les.genarch.models.configuration.MappingEntity;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ConfigureDomainElementWizard extends Wizard implements INewWizard {

	private ConfigureDomainElementWizardPage page;
	private IProject project;
	private IFile modelFile;
	
	private ImplementationEntity element = null;
	private ImplementationFragment fragment = null;
	private VariableElement configurableElement = null;
	
	private MappingRelationships mappingRelationships;
	private Implementation implementation;
	private Configuration configuration;

	public ConfigureDomainElementWizard(IFile modelFile, EObject element) {
		super();
		this.setNeedsProgressMonitor(true);
		this.project = modelFile.getProject();
		this.modelFile = modelFile;

		if ( element instanceof ImplementationEntity ) {
			this.element = (ImplementationEntity)element;
		} else if ( element instanceof ImplementationFragment) {
			this.fragment = (ImplementationFragment)element;
		} else {
			this.configurableElement = (VariableElement)element;
		}
	}

	@Override
	public void addPages() {
		this.page = new ConfigureDomainElementWizardPage(modelFile,element);
		this.addPage(this.page);
	}

	@Override
	public boolean performFinish() {

		final String featureName = this.page.getSelection();
		
		final IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(monitor,featureName);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};

		try {
			this.getContainer().run(true, false, op);
		} catch (final InterruptedException e) {
			GenArchEMFPlugin.INSTANCE.log(e);
			return false;
		} catch (final InvocationTargetException e) {
			GenArchEMFPlugin.INSTANCE.log(e);
			Throwable realException = e.getTargetException();
			MessageDialog.openError(this.getShell(), "Error", realException.getMessage());
			return false;
		}

		return true;
	}


	private void doFinish(IProgressMonitor monitor,String expression) throws CoreException {
		monitor.beginTask("Configuring element", 1);

		GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(this.project);

		String implementationModelPath = genarchProjectConfigurationFile.getImplementationModelPath();
		String configurationModelPath = genarchProjectConfigurationFile.getConfigurationModelPath();

		ImplementationPackageImpl.init();	

		IFile implementationModelFile = this.project.getFile(implementationModelPath);
		URI implementationFileURI = URI.createPlatformResourceURI(implementationModelFile.getFullPath().toString());

		ResourceSet implementationResourceSet = new ResourceSetImpl();
		Resource implementationResource = implementationResourceSet.getResource(implementationFileURI,true);

		implementation = (Implementation)implementationResource.getContents().get(0);
		
		IFile configurationModelFile = this.project.getFile(configurationModelPath);
		URI configurationFileURI = URI.createPlatformResourceURI(configurationModelFile.getFullPath().toString());

		ResourceSet configurationResourceSet = new ResourceSetImpl();
		Resource configurationResource = implementationResourceSet.getResource(configurationFileURI,true);
		
		this.configuration = (Configuration)configurationResource.getContents().get(0);

		ConfigurationModel configurationModel = ConfigurationModel.open(project); 
		ConfigurationFactory configurationFactory = ConfigurationPackage.eINSTANCE.getConfigurationFactory();

		if ( element != null ) {
			String elementPath = element.getPath();

			MappingEntity mappingEntity = configurationModel.get().mappingEntity(elementPath);  

			if ( mappingEntity != null) {				
				if ( mappingEntity.getFeatureExpression() != null ) {
					mappingEntity.getFeatureExpression().setExpression(expression);
				} else {
					FeatureExpression feature = configurationFactory.createFeatureExpression();
					feature.setExpression(expression);
					mappingEntity.setFeatureExpression(feature);
				}	    
			} else {
				if ( element instanceof ImplementationClass ) {					
					ConfigurationClass entity = ConfigurationClassBuilder.configurationClass().name(element.getName()).path(element.getPath()).featureExpression(expression).build();
					configurationModel.add().clazz(entity);
				} else if ( element instanceof ImplementationAspect ) {
					ConfigurationAspect entity = ConfigurationAspectBuilder.configurationAspect().name(element.getName()).path(element.getPath()).featureExpression(expression).build();
					configurationModel.add().aspect(entity);
				} else if ( element instanceof ImplementationTemplate ) {
					ConfigurationTemplate entity = ConfigurationTemplateBuilder.configurationTemplate().name(element.getName()).path(element.getPath()).featureExpression(expression).build();
					configurationModel.add().template(entity);
				} else if ( element instanceof ImplementationFile ) {
					ConfigurationFile entity = ConfigurationFileBuilder.configurationFile().name(element.getName()).path(element.getPath()).featureExpression(expression).build();
					configurationModel.add().file(entity);
				} else if ( element instanceof ImplementationFolder ) {
					ConfigurationFolder entity = ConfigurationFolderBuilder.configurationFolder().name(element.getName()).path(element.getPath()).featureExpression(expression).build();
					configurationModel.add().folder(entity);
				} else {
					ConfigurationComponent entity = ConfigurationComponentBuilder.configurationComponent().name(element.getName()).path(element.getPath()).featureExpression(expression).build();
					configurationModel.add().component(entity);
				}				
			}

			IFile resource = project.getFile(element.getPath());

			if ( resource == null ) return;

			if ( "java".equals(resource.getFileExtension()) || "aj".equals(resource.getFileExtension())) {
				try {
					//Create annotation in the source code of the mapping element.
					if ( "java".equals(resource.getFileExtension()) ) {
						ClassResourceSyncrhonization.configureClassElement(resource, expression);
					} else if ( "aj".equals(resource.getFileExtension()) ) {
						AspecJResourceSynchronization.configureAspectElement(resource, expression);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		if ( fragment != null ) {
			String fragmentPath = fragment.getPath();

			ConfigurationFragment configurationFragment = configurationModel.get().fragment(fragmentPath);
			
			if ( configurationFragment != null ) {				
				if ( configurationFragment.getFeatureExpression() != null ) {
					configurationFragment.getFeatureExpression().setExpression(expression);
				} else {
					FeatureExpression feature = configurationFactory.createFeatureExpression();
					feature.setExpression(expression);
					configurationFragment.setFeatureExpression(feature);
				}
			} else {
				configurationFragment = ConfigurationFragmentBuilder.configurationFragment().name(fragment.getName()).path(fragment.getPath()).featureExpression(expression).build(); 
				configurationModel.add().fragment(configurationFragment);
			}

		}
		
		if ( configurableElement != null ) {
			String elementName = configurableElement.getName();
			
			DSMElement eElement = configurationFactory.createDSMElement();
			FeatureExpression feature = configurationFactory.createFeatureExpression();
			feature.setExpression(expression);
			
			eElement.setName(elementName);
			eElement.setFeatureExpression(feature);
			List<Adapter> adapters = configurableElement.eAdapters();
			
			for ( Adapter adapter : adapters ) {
				if ( adapter instanceof ItemProviderAdapter ) {
					ItemProviderAdapter itemProviderAdapter = (ItemProviderAdapter)adapter;
					String uri = ((URL)itemProviderAdapter.getImage(configurableElement)).toExternalForm();
					eElement.setImageURI(uri);
				
				}
			}
									
			configurationModel.add().domainModelElement(domainModelName(genarchProjectConfigurationFile.getDomainModelsFiles()), eElement);
		}

		configurationModel.save();
		monitor.worked(1);
	}
	
	private String domainModelName(Map<String,String> domainModelFiles) {
		String modelFilePath = modelFile.getProjectRelativePath().toString();
		
		for ( String key : domainModelFiles.keySet() ) {
			String path = domainModelFiles.get(key);
			
			if ( path.equals(modelFilePath) ) {
				EList domainModels = configuration.getDsmMappings().getModels();
				
				for ( int x = 0; x < domainModels.size(); x++ ) {
					DSM domainModel = (DSM)domainModels.get(x);				
					if ( domainModel.getName().equals(key) ) {
						return key;						
					}					
				}				
			}
		}
		
		return null;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) { }
}