package br.pucrio.inf.les.genarch.core.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import br.pucrio.inf.les.genarch.core.derivation.DerivateImplementationElements;
import br.pucrio.inf.les.genarch.core.derivation.DerivateTemplates;
import br.pucrio.inf.les.genarch.core.derivation.ProcessDomainModel;
import br.pucrio.inf.les.genarch.core.derivation.TransformArchModels;
import br.pucrio.inf.les.genarch.core.derivation.TransformFeatureModelConfiguration;
import br.pucrio.inf.les.genarch.core.derivation.csp.CSPBuilder;
import br.pucrio.inf.les.genarch.core.extension.IPostProcessor;
import br.pucrio.inf.les.genarch.core.plugin.DomainModelDescription;
import br.pucrio.inf.les.genarch.core.plugin.GenArchPluginFacade;
import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.Configuration;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.product.Product;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModel;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModels;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import ca.uwaterloo.gp.fmp.Project;
import ca.uwaterloo.gp.fmp.util.FmpExternalLoader;
import ca.uwaterloo.gp.fmp.util.FmpResourceImpl;

public class DerivateAsNewProjectOperation {

	private int configurationIndex;
	private IProject project;
	private IProject newProject;
	private IProgressMonitor monitor;

	public DerivateAsNewProjectOperation(IProject project,IProject newProductProject,int configurationIndex,IProgressMonitor monitor) {
		this.configurationIndex = configurationIndex;
		this.project = project;
		this.newProject = newProductProject;
		this.monitor = monitor;
	}

	public void derivate() {
		GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(project);

		String architectureModelFileName = genarchProjectConfigurationFile.getImplementationModelPath();
		String configurationModelFileName = genarchProjectConfigurationFile.getConfigurationModelPath();
		String featureModelFileName = genarchProjectConfigurationFile.getFeatureModelPath();

		//Architecture Model		
		IFile architectureModelFile = project.getFile(architectureModelFileName);
		URI architectureFileURI = URI.createPlatformResourceURI(architectureModelFile.getFullPath().toString());

		ResourceSet architectureResourceSet = new ResourceSetImpl();
		Resource architectureResource = architectureResourceSet.getResource(architectureFileURI,true);

		Implementation architectureModel = (Implementation)architectureResource.getContents().get(0);

		//Configuration Model
		IFile configurationModelFile = project.getFile(configurationModelFileName);
		URI configurationFileURI = URI.createPlatformResourceURI(configurationModelFile.getFullPath().toString());

		ResourceSet configurationResourceSet = new ResourceSetImpl();
		Resource configurationResource = configurationResourceSet.getResource(configurationFileURI, true);

		Configuration configuration = (Configuration)configurationResource.getContents().get(0);
		MappingRelationships configurationModel = configuration.getMappingRelationships();
		
		//Feature Model
		IFile fmpModelFile = project.getFile(featureModelFileName);
		FmpExternalLoader externalLoader = new FmpExternalLoader();
		externalLoader.load(fmpModelFile);					
		EList resourceList = externalLoader.getResources();					
		FmpResourceImpl fmpResource = (FmpResourceImpl)resourceList.get(0);
		Project fmpProject = (Project)fmpResource.getAllContents().next();
		
		//TSAM
		Map<String,EObject> domainModels = new HashMap<String, EObject>();
		Map<String,String> domainModelsFiles = genarchProjectConfigurationFile.getDomainModelsFiles();
				
		for ( String key : domainModelsFiles.keySet() ) {
			String domainModelFilePath = domainModelsFiles.get(key);

			IFile domainModelIFile = project.getFile(domainModelFilePath);
			URI domainModelFileURI = URI.createPlatformResourceURI(domainModelIFile.getFullPath().toString());

			ResourceSet domainModelResourceSet = new ResourceSetImpl();
			Resource domainModelResource = domainModelResourceSet.getResource(domainModelFileURI,true);

			EObject domainModelRoot = (EObject)domainModelResource.getContents().get(0);
			
			domainModels.put(key,domainModelRoot);
		}
		
		Product productModel = ProductPackage.eINSTANCE.getProductFactory().createProduct();
							
		//Create Product Feature Model Configuration
		ProductFeaturesConfiguration productFeaturesConfiguration = TransformFeatureModelConfiguration.transform(fmpProject,configurationIndex);
		productModel.setProductFeatures(productFeaturesConfiguration);
				
		//Transform Feature Model on a CSP
		CSPBuilder.csp().buildFeatureModelCSP(productFeaturesConfiguration);
		
		//Create Product Implementation Model
		TransformArchModels transformArchModels = new TransformArchModels(project);
		ProductImplementationElements productImplementationElements = transformArchModels.transform(architectureModel,configurationModel,productFeaturesConfiguration);
		productModel.setProductImplementationElements(productImplementationElements);
		
		//Transform Architecture on a CSP
		CSPBuilder.csp().buildArchitectureModelCSP(productImplementationElements,configurationModel);
		
		//Transform TSAM
		List<DomainModelDescription> domainModelDescriptions = GenArchPluginFacade.Instance().getDomainModelDescriptions();
		
		ProductDomainModels proDomainModels = ProductPackage.eINSTANCE.getProductFactory().createProductDomainModels();		
		
		for ( DomainModelDescription domainModelDescription : domainModelDescriptions ) {
			List models = configuration.getDsmMappings().getModels();
			for ( int x = 0; x < models.size(); x++ ) {
				DSM dsm = (DSM)models.get(x);			
				if ( dsm.getName().equals(domainModelDescription.getName()) ) {
					String domainName = domainModelDescription.getName();					
					if ( domainModels.containsKey(domainName) ) {
						EObject domainModel = domainModels.get(domainName);
						
						//Create Products Domain Models
						ProductDomainModel productDomainModel = ProcessDomainModel.process(domainModelDescription,domainModel,dsm,productFeaturesConfiguration);
						proDomainModels.getDomainModel().add(productDomainModel);
						
						CSPBuilder.csp().bulidDomainModelCSP(productDomainModel,domainModel,dsm);
					}																			
				}
			}						
		}
		
		productModel.setDomainModels(proDomainModels);
			
		CSPBuilder.csp().solve(productImplementationElements,proDomainModels.getDomainModel());
	
		DerivateImplementationElements derivateImplementationElements = new DerivateImplementationElements();
		derivateImplementationElements.process(project, newProject, productModel, monitor);

		DerivateTemplates derivateTemplates = new DerivateTemplates();
		derivateTemplates.process(project, newProject, productModel, monitor);

		List<IPostProcessor> postProcessors = GenArchPluginFacade.Instance().getPostProcessors();

		for ( IPostProcessor postProcessor : postProcessors ) {
			postProcessor.process(project, newProject, productModel, monitor);
		}
	}

	/*private IProject project;
	private IProject newProductProject;
	private IProgressMonitor monitor;
	private int featureModelInstance;
	private String featureModelConfigurationName;

	private InstanceFactory instanceFactory = InstancePackage.eINSTANCE.getInstanceFactory();
	private MappingRelationships mappingRelationships;

	private List<ArchitectureTemplate> architectureTemplates = new ArrayList<ArchitectureTemplate>();

	public DerivateNewProduct(IProject project,IProject newProductProject,int featureModelInstance,String featureModelConfigurationName,IProgressMonitor monitor) {		
		this.project = project;
		this.newProductProject = newProductProject;
		this.monitor = monitor;
		this.featureModelConfigurationName = featureModelConfigurationName;
		this.featureModelInstance = featureModelInstance;
	}
	public void derivate() {
		GenarchConfigurationHelper helper = new GenarchConfigurationHelper(this.project);
		GenarchConfiguration genarchConfiguration = helper.getGenarchConfiguration();

		String architectureModelFileName = genarchConfiguration.getArchitectureModelPath();
		String configurationModelFileName = genarchConfiguration.getConfigurationModelPath();
		String featureModelFileName = genarchConfiguration.getFeatureModelPath();

		IFile architectureModelFile = project.getFile(architectureModelFileName);
		URI architectureFileURI = URI.createPlatformResourceURI(architectureModelFile.getFullPath().toString());

		ResourceSet architectureResourceSet = new ResourceSetImpl();
		Resource architectureResource = architectureResourceSet.getResource(architectureFileURI,true);

		Architecture architecture = (Architecture)architectureResource.getContents().get(0);

		IFile configurationModelFile = project.getFile(configurationModelFileName);
		URI configurationFileURI = URI.createPlatformResourceURI(configurationModelFile.getFullPath().toString());

		ResourceSet configurationResourceSet = new ResourceSetImpl();
		Resource configurationResource = configurationResourc eSet.getResource(configurationFileURI, true);

		Configuration configuration = (Configuration)configurationResource.getContents().get(0);
		this.mappingRelationships = configuration.getMappingRelationships();

		IFile fmpModelFile = project.getFile(featureModelFileName);

		FmpExternalLoader externalLoader = new FmpExternalLoader();
		externalLoader.load(fmpModelFile);					
		EList resourceList = externalLoader.getResources();					
		FmpResourceImpl fmpResource = (FmpResourceImpl)resourceList.get(0);
		Project fmpProject = (Project)fmpResource.getAllContents().next();

		InstancePackageImpl.init();
		Instance instance = instanceFactory.createInstance();

		DerivationInstance derivationInstance = readFeatureModelConfigurations(fmpProject);

		br.pucrio.inf.les.genarch.models.instance.Feature featureConfiguration = derivationInstance.getFeatureConfiguration();

		instance.setFeatureElements(derivationInstance.getFeatureElements());
		instance.setFeatureInstance(derivationInstance.getFeatureInstance());

		ArchitectureInstance architectureInstance = instanceFactory.createArchitectureInstance();
		ArchitectureElements architectureElements = instanceFactory.createArchitectureElements();
		architectureElements.setElements(new HashMap<String, ArchitectureEntity>());

		instance.setArchitecture(architectureInstance);
		instance.setArchitectureElements(architectureElements);			

		architectureTemplates.clear();

		EList containers = architecture.getContainers();

		for ( int y = 0; y < containers.size(); y++ ) {
			ArchitectureContainer container = (ArchitectureContainer)containers.get(y);
			EList components = container.getComponents();

			for (int x = 0; x < components.size(); x++) {
				ArchitectureComponent component = (ArchitectureComponent)components.get(x);	    
				ConfigurationComponent configurationComponent = (ConfigurationComponent)this.findConfigurationElementByPath(component.getPath());

				if ( configurationComponent != null ) {
					boolean status = this.evalFeatureConfiguration(configurationComponent,featureConfiguration);
					if (status) {
						createComponent(component,architectureInstance,architectureElements,featureConfiguration);   
					}
				} else {
					createComponent(component,architectureInstance,architectureElements,featureConfiguration);
				}		
			}
		}

		EList resourcesContainers = architecture.getResourcesContainer();

		for ( int y = 0; y < resourcesContainers.size(); y++ ) {
			ArchitectureResourcesContainer container = (ArchitectureResourcesContainer)resourcesContainers.get(y);
			EList folders = container.getFolders();

			for (int x = 0; x < folders.size(); x++) {
				ArchitectureFolder folder = (ArchitectureFolder)folders.get(x);	    
				ConfigurationFolder configurationFolder = (ConfigurationFolder)this.findConfigurationElementByPath(folder.getPath());

				if ( configurationFolder != null ) {
					boolean status = this.evalFeatureConfiguration(configurationFolder,featureConfiguration);
					if (status) {
						createFolder(folder,architectureInstance,architectureElements,featureConfiguration);
					}
				} else {
					createFolder(folder,architectureInstance,architectureElements,featureConfiguration);
				}		
			}

			EList templates = container.getTemplates();

			for ( int templatesCount = 0; templatesCount < templates.size(); templatesCount++ ) {
				ArchitectureTemplate template = (ArchitectureTemplate)templates.get(templatesCount);
				ConfigurationTemplate configurationTemplate = (ConfigurationTemplate)this.findConfigurationElementByPath(template.getPath());

				if ( configurationTemplate != null ) {
					boolean status = this.evalFeatureConfiguration(configurationTemplate,featureConfiguration);
					if ( status ) {				
						architectureTemplates.add(template);
					}
				} else {
					architectureTemplates.add(template);
				}
			}

			EList files = container.getFiles();

			for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
				ArchitectureFile file = (ArchitectureFile)files.get(filesCount);
				ConfigurationFile configurationFile = (ConfigurationFile)this.findConfigurationElementByPath(file.getPath());

				if ( configurationFile != null ) {
					boolean status = this.evalFeatureConfiguration(configurationFile,featureConfiguration);
					if (status) {
						br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceOne = instanceFactory.createArchitectureFile();
						fileInstanceOne.setName(file.getName());
						fileInstanceOne.setPath(file.getPath());

						br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceTwo = instanceFactory.createArchitectureFile();
						fileInstanceTwo.setName(file.getName());
						fileInstanceTwo.setPath(file.getPath());

						architectureElements.getElements().put(fileInstanceOne.getPath(),fileInstanceOne);
						architectureInstance.getFiles().add(fileInstanceTwo);
					}
				} else {
					br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceOne = instanceFactory.createArchitectureFile();
					fileInstanceOne.setName(file.getName());
					fileInstanceOne.setPath(file.getPath());

					br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceTwo = instanceFactory.createArchitectureFile();
					fileInstanceTwo.setName(file.getName());
					fileInstanceTwo.setPath(file.getPath());

					architectureElements.getElements().put(fileInstanceOne.getPath(),fileInstanceOne);
					architectureInstance.getFiles().add(fileInstanceTwo);
				}
			}					
		}

		EList fragmentContainer = architecture.getFragmentsContainer();

		for ( int y = 0; y < fragmentContainer.size(); y++ ) {

			EList fragments = ((ArchitectureFragmentContainer)fragmentContainer.get(y)).getFragments();

			for ( int fragmentCount = 0; fragmentCount < fragments.size(); fragmentCount++ ) {
				ArchitectureFragment fragment = (ArchitectureFragment)fragments.get(fragmentCount);
				ConfigurationFragment configurationFragment = this.findFragmentByName(fragment.getName());

				if ( configurationFragment != null ) {
					boolean status = this.evalFeatureConfiguration(configurationFragment,featureConfiguration);
					if (status) {
						br.pucrio.inf.les.genarch.models.instance.ArchitectureFragment fragmentInstanceOne = instanceFactory.createArchitectureFragment();
						fragmentInstanceOne.setName(fragment.getName());
						fragmentInstanceOne.setContent(fragment.getContent());

						br.pucrio.inf.les.genarch.models.instance.ArchitectureFragment fragmentInstanceTwo = instanceFactory.createArchitectureFragment();
						fragmentInstanceTwo.setName(fragment.getName());
						fragmentInstanceTwo.setContent(fragment.getContent());

						architectureElements.getFragments().put(fragmentInstanceOne.getName(),fragmentInstanceOne);
						architectureInstance.getFragments().add(fragmentInstanceTwo);				
					}
				} else {
					br.pucrio.inf.les.genarch.models.instance.ArchitectureFragment fragmentInstanceOne = instanceFactory.createArchitectureFragment();
					fragmentInstanceOne.setName(fragment.getName());
					fragmentInstanceOne.setContent(fragment.getContent());

					br.pucrio.inf.les.genarch.models.instance.ArchitectureFragment fragmentInstanceTwo = instanceFactory.createArchitectureFragment();
					fragmentInstanceTwo.setName(fragment.getName());
					fragmentInstanceTwo.setContent(fragment.getContent());

					architectureElements.getFragments().put(fragmentInstanceOne.getName(),fragmentInstanceOne);
					architectureInstance.getFragments().add(fragmentInstanceTwo);
				}
			}
		}

		for ( ArchitectureTemplate template : architectureTemplates ) {
			processTemplate(template,instance);
		}
	}

	private DerivationInstance readFeatureModelConfigurations(Project fmpProject) {
		Feature model = fmpProject.getModel();

		DerivationInstance derivationInstance = new DerivationInstance();

		EList modelChildren = model.getChildren();

		for ( int x = 0; x < modelChildren.size(); x++ ) {
			Feature modelChild = (Feature)modelChildren.get(x);

			if ( modelChild.getName().equals(featureModelConfigurationName) ) {

				EList modelChildConfs = modelChild.getConfs();

				Feature childConf = (Feature)modelChildConfs.get(featureModelInstance);

				FeatureInstance featureInstance = instanceFactory.createFeatureInstance();
				FeatureElements featureElements = instanceFactory.createFeatureElements();		
				featureElements.setFeatures(new HashMap<String,br.pucrio.inf.les.genarch.models.instance.Feature>());

				featureInstance.setName(childConf.getName());				

				for ( Object child : childConf.getChildren() ) {					
					toFeature((Feature)child,featureInstance,featureElements);					
				}

				derivationInstance.setFeatureElements(featureElements);
				derivationInstance.setFeatureInstance(featureInstance);

				br.pucrio.inf.les.genarch.models.instance.Feature featureConfiguration = toFeature(childConf,null,null);							
				derivationInstance.setFeatureConfiguration(featureConfiguration);
			}
		}

		return derivationInstance;
	}

	private br.pucrio.inf.les.genarch.models.instance.Feature toFeature(Feature fmpFeature,FeatureInstance featureInstance,FeatureElements featureElements) {
		String name = fmpFeature.getName();
		String value = "";

		if ( fmpFeature.getTypedValue() != null ) {
			value = fmpFeature.getTypedValue().getValueToString();
		}

		int max = fmpFeature.getMax();
		int min = fmpFeature.getMin();

		ArrayList<br.pucrio.inf.les.genarch.models.instance.Feature> children = new ArrayList<br.pucrio.inf.les.genarch.models.instance.Feature>(); 

		for ( Object child : fmpFeature.getChildren() ) {
			if ( child instanceof FeatureGroup ) {
				FeatureGroup group = (FeatureGroup)child;				
				for ( Object childGroup : group.getChildren() ) {
					children.add(this.toFeatureChild((Feature)childGroup,featureElements));
				}
			} else {
				children.add(this.toFeatureChild((Feature)child,featureElements));
			}			
		}

		boolean optional = false;

		if ( fmpFeature.isOptional() ) {	    			    
			EList confs = fmpFeature.getConfigurations();

			if ( confs != null ) {
				for ( int z = 0; z < confs.size(); z++ ) {
					Feature configFeature = (Feature)confs.get(z);

					if ( (configFeature.getState().getValue() == 1) || (configFeature.getState().getValue() == 3) ) {
						optional = true;
						break;
					}
				}
			}

			if ( (fmpFeature.getState().getValue() == 1) || (fmpFeature.getState().getValue() == 3) ) {
				optional = true;				
			}
		} else {
			optional = checkParent(fmpFeature);
		}

		if ( featureInstance != null ) {
			if ( optional ) {
				br.pucrio.inf.les.genarch.models.instance.Feature newFeatureB = br.pucrio.inf.les.genarch.models.instance.InstanceFactory.eINSTANCE.createFeature();
				newFeatureB.setName(name);
				newFeatureB.setAttribute(value);
				newFeatureB.setMax(max);
				newFeatureB.setMin(min);
				newFeatureB.setIsSelected(optional);

				if ( children.size() > 0 ) {
					for ( int x = 0; x < children.size(); x++ ) {
						br.pucrio.inf.les.genarch.models.instance.Feature c = children.get(x);
						br.pucrio.inf.les.genarch.models.instance.Feature child = br.pucrio.inf.les.genarch.models.instance.InstanceFactory.eINSTANCE.createFeature();
						child.setName(c.getName());
						child.setAttribute(c.getAttribute());
						child.setMax(c.getMax());
						child.setMin(c.getMin());
						child.setIsSelected(c.isIsSelected());
						child.getFeatures().addAll(c.getFeatures());

						newFeatureB.getFeatures().add(child);
					}			
				}

				featureInstance.getFeatures().add(newFeatureB);
			}
		}

		br.pucrio.inf.les.genarch.models.instance.Feature newFeature = br.pucrio.inf.les.genarch.models.instance.InstanceFactory.eINSTANCE.createFeature();
		newFeature.setName(name);
		newFeature.setAttribute(value);
		newFeature.setMax(max);
		newFeature.setMin(min);
		newFeature.setIsSelected(optional);

		if ( children.size() > 0 ) {													
			for ( int x = 0; x < children.size(); x++ ) {
				br.pucrio.inf.les.genarch.models.instance.Feature c = children.get(x);
				br.pucrio.inf.les.genarch.models.instance.Feature child = br.pucrio.inf.les.genarch.models.instance.InstanceFactory.eINSTANCE.createFeature();
				child.setName(c.getName());
				child.setAttribute(c.getAttribute());
				child.setMax(c.getMax());
				child.setMin(c.getMin());
				child.setIsSelected(c.isIsSelected());				
				child.getFeatures().addAll(c.getFeatures());

				newFeature.getFeatures().add(child);
			}				
		}

		if ( featureElements != null ) {			
			featureElements.getFeatures().put(fmpFeature.getId(),newFeature);
			GenarchEMFPlugin.INSTANCE.log(newFeature.getName());
		}

		return newFeature;
	}

	private br.pucrio.inf.les.genarch.models.instance.Feature toFeatureChild(Feature fmpFeature,FeatureElements featureElements) {
		String name = fmpFeature.getName();
		String value = "";

		if ( fmpFeature.getTypedValue() != null ) {
			value = fmpFeature.getTypedValue().getValueToString();
		}

		int max = fmpFeature.getMax();
		int min = fmpFeature.getMin();

		ArrayList<br.pucrio.inf.les.genarch.models.instance.Feature> children = new ArrayList<br.pucrio.inf.les.genarch.models.instance.Feature>(); 

		for ( Object child : fmpFeature.getChildren() ) {
			if ( child instanceof FeatureGroup ) {
				FeatureGroup group = (FeatureGroup)child;				
				for ( Object childGroup : group.getChildren() ) {
					children.add(this.toFeatureChild((Feature)childGroup,featureElements));
				}
			} else {
				children.add(this.toFeatureChild((Feature)child,featureElements));
			}			
		}

		boolean optional = false;

		if ( fmpFeature.isOptional() ) {	    			    
			EList confs = fmpFeature.getConfigurations();

			if ( confs != null ) {
				for ( int z = 0; z < confs.size(); z++ ) {
					Feature configFeature = (Feature)confs.get(z);

					if ( (configFeature.getState().getValue() == 1) || (configFeature.getState().getValue() == 3) ) {
						optional = true;
						break;
					}
				}
			}

			if ( (fmpFeature.getState().getValue() == 1) || (fmpFeature.getState().getValue() == 3) ) {
				optional = true;				
			}
		} else {
			optional = checkParent(fmpFeature);
		}

		br.pucrio.inf.les.genarch.models.instance.Feature newFeature = br.pucrio.inf.les.genarch.models.instance.InstanceFactory.eINSTANCE.createFeature();
		newFeature.setName(name);
		newFeature.setAttribute(value);
		newFeature.setMax(max);
		newFeature.setMin(min);
		newFeature.setIsSelected(optional);

		if ( children.size() > 0 ) {													
			for ( int x = 0; x < children.size(); x++ ) {
				br.pucrio.inf.les.genarch.models.instance.Feature c = children.get(x);
				br.pucrio.inf.les.genarch.models.instance.Feature child = br.pucrio.inf.les.genarch.models.instance.InstanceFactory.eINSTANCE.createFeature();
				child.setName(c.getName());
				child.setAttribute(c.getAttribute());
				child.setMax(c.getMax());
				child.setMin(c.getMin());
				child.setIsSelected(c.isIsSelected());				
				child.getFeatures().addAll(c.getFeatures());

				newFeature.getFeatures().add(child);
			}				
		}

		if ( featureElements != null ) {			
			featureElements.getFeatures().put(fmpFeature.getId(),newFeature);
			GenarchEMFPlugin.INSTANCE.log(newFeature.getName());
		}

		return newFeature;
	}

	private boolean checkParent(Feature fmpFeature) {
		Object parent = fmpFeature.eContainer();

		if ( parent != null ) {
			Feature fmpParent = null;

			if ( parent instanceof Feature ) {
				fmpParent = (Feature)parent;
				//GenarchEMFPlugin.INSTANCE.log(fmpParent.getName());
			} else if ( parent instanceof FeatureGroup ) {
				fmpParent = ((Feature)((FeatureGroup)parent).eContainer());
			}

			if ( fmpParent != null ) {
				if ( fmpParent.isOptional() ) {
					if ( (fmpParent.getState().getValue() == 1) || (fmpParent.getState().getValue() == 3) ) {
						return true;
					} else {
						return false;
					}
				} else {
					return checkParent(fmpParent);
				}
			}

			return true;
		} else {
			return true;
		}
	}

	private br.pucrio.inf.les.genarch.models.instance.ArchitectureFolder createFolder(ArchitectureFolder folder,ArchitectureInstance architectureInstance,ArchitectureElements architectureElements,br.pucrio.inf.les.genarch.models.instance.Feature featureConfiguration) {

		IFolder newFolder = buildFolder(folder.getPath());

		br.pucrio.inf.les.genarch.models.instance.ArchitectureFolder folderInstance = instanceFactory.createArchitectureFolder();
		folderInstance.setName(folder.getName());
		folderInstance.setPath(folder.getPath());

		architectureInstance.getFolders().add(folderInstance);
		architectureElements.getElements().put(folderInstance.getPath(),folderInstance);

		EList templates = folder.getTemplates();

		for ( int templatesCount = 0; templatesCount < templates.size(); templatesCount++ ) {
			ArchitectureTemplate template = (ArchitectureTemplate)templates.get(templatesCount);
			ConfigurationTemplate configurationTemplate = (ConfigurationTemplate)this.findConfigurationElementByPath(template.getPath());

			if ( configurationTemplate != null ) {
				boolean status = this.evalFeatureConfiguration(configurationTemplate,featureConfiguration);
				if ( status ) {				
					architectureTemplates.add(template);
				}
			} else {
				architectureTemplates.add(template);
			}
		}

		EList files = folder.getFiles();

		for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
			ArchitectureFile file = (ArchitectureFile)files.get(filesCount);
			ConfigurationFile configurationFile = (ConfigurationFile)this.findConfigurationElementByPath(file.getPath());

			if ( configurationFile != null ) {
				boolean status = this.evalFeatureConfiguration(configurationFile,featureConfiguration);
				if (status) {
					br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceOne = instanceFactory.createArchitectureFile();
					fileInstanceOne.setName(file.getName());
					fileInstanceOne.setPath(file.getPath());

					br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceTwo = instanceFactory.createArchitectureFile();
					fileInstanceTwo.setName(file.getName());
					fileInstanceTwo.setPath(file.getPath());

					folderInstance.getFiles().add(fileInstanceOne);
					architectureElements.getElements().put(fileInstanceOne.getPath(),fileInstanceOne);

					architectureInstance.getFiles().add(fileInstanceTwo);
				}
			} else {
				br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceOne = instanceFactory.createArchitectureFile();
				fileInstanceOne.setName(file.getName());
				fileInstanceOne.setPath(file.getPath());

				br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceTwo = instanceFactory.createArchitectureFile();
				fileInstanceTwo.setName(file.getName());
				fileInstanceTwo.setPath(file.getPath());

				folderInstance.getFiles().add(fileInstanceOne);
				architectureElements.getElements().put(fileInstanceOne.getPath(),fileInstanceOne);

				architectureInstance.getFiles().add(fileInstanceTwo);
			}
		}

		EList subFolders = folder.getSubFolders();

		for ( int subFoldersCount = 0; subFoldersCount < subFolders.size(); subFoldersCount++ ) {
			ArchitectureFolder subFolder = (ArchitectureFolder)subFolders.get(subFoldersCount);
			ConfigurationFolder configurationSubFolder = (ConfigurationFolder)this.findConfigurationElementByPath(subFolder.getPath());

			if ( configurationSubFolder != null ) {
				boolean status = this.evalFeatureConfiguration(configurationSubFolder,featureConfiguration);
				if ( status ) {
					br.pucrio.inf.les.genarch.models.instance.ArchitectureFolder subFolderInstance = createFolder(subFolder,architectureInstance,architectureElements,featureConfiguration);
					architectureInstance.getFolders().add(subFolderInstance);
					folderInstance.getSubFolders().add(subFolderInstance);
					architectureElements.getElements().put(subFolderInstance.getPath(),subFolderInstance);									    
				}
			} else {
				br.pucrio.inf.les.genarch.models.instance.ArchitectureFolder subFolderInstance = createFolder(subFolder,architectureInstance,architectureElements,featureConfiguration);
				architectureInstance.getFolders().add(subFolderInstance);
				folderInstance.getSubFolders().add(subFolderInstance);
				architectureElements.getElements().put(subFolderInstance.getPath(),subFolderInstance);
			}
		}

		try {
			if ( newFolder.members().length == 0 ) {
				newFolder.delete(true, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return folderInstance;
	}

	private br.pucrio.inf.les.genarch.models.instance.ArchitectureComponent createComponent(ArchitectureComponent component,ArchitectureInstance architectureInstance,ArchitectureElements architectureElements,br.pucrio.inf.les.genarch.models.instance.Feature featureConfiguration) {		
		br.pucrio.inf.les.genarch.models.instance.ArchitectureComponent componentInstance = instanceFactory.createArchitectureComponent();
		componentInstance.setName(component.getName());
		componentInstance.setPath(component.getPath());

		architectureInstance.getComponents().add(componentInstance);
		architectureElements.getElements().put(componentInstance.getPath(),componentInstance);

		IFolder newFolder = buildFolder(component.getPath());

		EList classes = component.getClasses();

		for ( int classesCount = 0; classesCount < classes.size(); classesCount++ ) {
			ArchitectureClass clazz = (ArchitectureClass)classes.get(classesCount);
			ConfigurationClass configurationClass = (ConfigurationClass)this.findConfigurationElementByPath(clazz.getPath());

			if ( configurationClass != null ) {
				boolean status = this.evalFeatureConfiguration(configurationClass,featureConfiguration);
				if (status) {					
					br.pucrio.inf.les.genarch.models.instance.ArchitectureClass classInstanceOne = instanceFactory.createArchitectureClass();
					classInstanceOne.setName(clazz.getName());
					classInstanceOne.setPath(clazz.getPath());

					br.pucrio.inf.les.genarch.models.instance.ArchitectureClass classInstanceTwo = instanceFactory.createArchitectureClass();
					classInstanceTwo.setName(clazz.getName());
					classInstanceTwo.setPath(clazz.getPath());

					componentInstance.getClasses().add(classInstanceOne);
					architectureElements.getElements().put(classInstanceOne.getPath(),classInstanceOne);

					architectureInstance.getClasses().add(classInstanceTwo);

					copyEntity(clazz);
				}		
			} else {
				br.pucrio.inf.les.genarch.models.instance.ArchitectureClass classInstanceOne = instanceFactory.createArchitectureClass();
				classInstanceOne.setName(clazz.getName());
				classInstanceOne.setPath(clazz.getPath());

				br.pucrio.inf.les.genarch.models.instance.ArchitectureClass classInstanceTwo = instanceFactory.createArchitectureClass();
				classInstanceTwo.setName(clazz.getName());
				classInstanceTwo.setPath(clazz.getPath());

				componentInstance.getClasses().add(classInstanceOne);
				architectureElements.getElements().put(classInstanceOne.getPath(),classInstanceOne);

				architectureInstance.getClasses().add(classInstanceTwo);

				copyEntity(clazz);
			}
		}

		EList aspects = component.getAspects();

		for ( int aspectsCount = 0; aspectsCount < aspects.size(); aspectsCount++ ) {
			ArchitectureAspect aspect = (ArchitectureAspect)aspects.get(aspectsCount);
			ConfigurationAspect configurationAspect = (ConfigurationAspect)findConfigurationElementByPath(aspect.getPath());

			if ( configurationAspect != null ) {
				boolean status = this.evalFeatureConfiguration(configurationAspect,featureConfiguration);
				if (status) {					
					br.pucrio.inf.les.genarch.models.instance.ArchitectureAspect aspectInstanceOne = instanceFactory.createArchitectureAspect();
					aspectInstanceOne.setName(aspect.getName());
					aspectInstanceOne.setPath(aspect.getPath());

					br.pucrio.inf.les.genarch.models.instance.ArchitectureAspect aspectInstanceTwo = instanceFactory.createArchitectureAspect();
					aspectInstanceTwo.setName(aspect.getName());
					aspectInstanceTwo.setPath(aspect.getPath());

					architectureInstance.getAspects().add(aspectInstanceOne);
					architectureElements.getElements().put(aspectInstanceOne.getPath(),aspectInstanceOne);

					componentInstance.getAspects().add(aspectInstanceTwo);

					copyEntity(aspect);
				}							
			} else {
				br.pucrio.inf.les.genarch.models.instance.ArchitectureAspect aspectInstanceOne = instanceFactory.createArchitectureAspect();
				aspectInstanceOne.setName(aspect.getName());
				aspectInstanceOne.setPath(aspect.getPath());

				br.pucrio.inf.les.genarch.models.instance.ArchitectureAspect aspectInstanceTwo = instanceFactory.createArchitectureAspect();
				aspectInstanceTwo.setName(aspect.getName());
				aspectInstanceTwo.setPath(aspect.getPath());

				architectureInstance.getAspects().add(aspectInstanceOne);
				architectureElements.getElements().put(aspectInstanceOne.getPath(),aspectInstanceOne);

				componentInstance.getAspects().add(aspectInstanceTwo);

				copyEntity(aspect);
			}
		}

		EList templates = component.getTemplates();

		for ( int templatesCount = 0; templatesCount < templates.size(); templatesCount++ ) {
			ArchitectureTemplate template = (ArchitectureTemplate)templates.get(templatesCount);
			ConfigurationTemplate configurationTemplate = (ConfigurationTemplate)this.findConfigurationElementByPath(template.getPath());

			if ( configurationTemplate != null ) {
				boolean status = this.evalFeatureConfiguration(configurationTemplate,featureConfiguration);
				if ( status ) {				
					architectureTemplates.add(template);
				}
			} else {
				architectureTemplates.add(template);
			}
		}

		EList files = component.getFiles();

		for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
			ArchitectureFile file = (ArchitectureFile)files.get(filesCount);
			ConfigurationFile configurationFile = (ConfigurationFile)this.findConfigurationElementByPath(file.getPath());

			if ( configurationFile != null ) {
				boolean status = this.evalFeatureConfiguration(configurationFile,featureConfiguration);
				if (status) {
					br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceOne = instanceFactory.createArchitectureFile();
					fileInstanceOne.setName(file.getName());
					fileInstanceOne.setPath(file.getPath());

					br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceTwo = instanceFactory.createArchitectureFile();
					fileInstanceTwo.setName(file.getName());
					fileInstanceTwo.setPath(file.getPath());

					componentInstance.getFiles().add(fileInstanceOne);
					architectureElements.getElements().put(fileInstanceOne.getPath(),fileInstanceOne);

					architectureInstance.getFiles().add(fileInstanceTwo);

					copyEntity(file);
				}
			} else {
				br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceOne = instanceFactory.createArchitectureFile();
				fileInstanceOne.setName(file.getName());
				fileInstanceOne.setPath(file.getPath());

				br.pucrio.inf.les.genarch.models.instance.ArchitectureFile fileInstanceTwo = instanceFactory.createArchitectureFile();
				fileInstanceTwo.setName(file.getName());
				fileInstanceTwo.setPath(file.getPath());

				componentInstance.getFiles().add(fileInstanceOne);
				architectureElements.getElements().put(fileInstanceOne.getPath(),fileInstanceOne);

				architectureInstance.getFiles().add(fileInstanceTwo);

				copyEntity(file);
			}
		}

		EList subComponents = component.getSubComponents();

		for ( int subComponentCount = 0; subComponentCount < subComponents.size(); subComponentCount++ ) {
			ArchitectureComponent subComponent = (ArchitectureComponent)subComponents.get(subComponentCount);
			ConfigurationComponent configurationSubComponent = (ConfigurationComponent)this.findConfigurationElementByPath(subComponent.getPath());

			if ( configurationSubComponent != null ) {
				boolean status = this.evalFeatureConfiguration(configurationSubComponent,featureConfiguration);
				if ( status ) {
					br.pucrio.inf.les.genarch.models.instance.ArchitectureComponent subComponentInstance = createComponent(subComponent,architectureInstance,architectureElements,featureConfiguration);
					architectureInstance.getComponents().add(subComponentInstance);
					componentInstance.getSubComponents().add(subComponentInstance);
					architectureElements.getElements().put(subComponentInstance.getPath(),subComponentInstance);
				}
			} else {
				br.pucrio.inf.les.genarch.models.instance.ArchitectureComponent subComponentInstance = createComponent(subComponent,architectureInstance,architectureElements,featureConfiguration);
				architectureInstance.getComponents().add(subComponentInstance);
				componentInstance.getSubComponents().add(subComponentInstance);
				architectureElements.getElements().put(subComponentInstance.getPath(),subComponentInstance);
			}
		}

		try {
			if ( newFolder.members().length == 0 ) {
				newFolder.delete(true, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return componentInstance;
	}

	private void processTemplate(ArchitectureTemplate template,Instance instance) {
		monitor.subTask("Processing Template \"" + template.getPath() + "\"");

		IPath filePath = new Path(template.getPath());
		IResource entityResource = this.project.findMember(filePath);

		IPath resourcePath = entityResource.getProjectRelativePath();

		IPath instantiationPath = newProductProject.getLocation().append(template.getGenerationPath());

		if ( filePath.getFileExtension().equals("xpt") ) {
			IPath templatePath = project.getFile(template.getPath()).getFullPath();

			String xPandPath = resourcePath.removeFirstSegments(1).removeFileExtension().toString().replace("/", "::") + "::Main";
			GenerateXPandTemplates.getInstance().generate(instantiationPath,templatePath,xPandPath,instance,InstancePackage.eINSTANCE);
		}

		monitor.worked(1);
	}

	private boolean evalFeatureConfiguration(MappingEntity entity,br.pucrio.inf.les.genarch.models.instance.Feature featureConfiguration) {
		if ( entity.getFeatureExpression() != null ) {
			return Logic.eval(entity.getFeatureExpression().getExpression(),featureConfiguration);
		} else {
			return true;
		}
	}

	private boolean evalFeatureConfiguration(ConfigurationFragment entity,br.pucrio.inf.les.genarch.models.instance.Feature featureConfiguration) {
		if ( entity.getFeatureExpression() != null ) {
			return Logic.eval(entity.getFeatureExpression().getExpression(),featureConfiguration);
		} else {
			return true;
		}
	}

	private void copyEntity(br.pucrio.inf.les.genarch.models.architecture.ArchitectureEntity entity) {
		monitor.subTask("Coping File \"" + entity.getPath() + "\"");

		String filePath = entity.getPath();

		IResource entityResource = this.project.findMember(filePath);

		IPath instProjectPath = this.newProductProject.getFullPath();
		IPath resourcePath = entityResource.getProjectRelativePath();

		try {
			entityResource.copy(instProjectPath.append(resourcePath), true, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		if ( entityResource instanceof IFile ) {
			IFile newEntityFile = newProductProject.getFile(entity.getPath());

			if ( "java".equals(newEntityFile.getFileExtension()) ) {
				JavaAnnotationUtil.removeFeatureAnnotations(newEntityFile);
				JavaAnnotationUtil.removeVariabilityAnnotation(newEntityFile);				
			} else if ( "aj".equals(newEntityFile.getFileExtension())) {
				AspectAnnotationUtil.removeFeaturesAnnotation(newEntityFile);
				AspectAnnotationUtil.removeVariabilityAnnotation(newEntityFile);
			}				
		}

		monitor.worked(1);
	}

	private IFolder buildFolder(String folderPath) {
		monitor.subTask("Creating Folder \"" + folderPath + "\"");
		IFolder subComponentFolder = this.newProductProject.getFolder(new Path(folderPath));

		if ( !subComponentFolder.exists() ) {
			try {
				subComponentFolder.create(false, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		monitor.worked(1);

		return subComponentFolder;
	}

	private EObject findConfigurationElementByPath(String path) {	
		TreeIterator configurationContents = mappingRelationships.eAllContents();

		while ( configurationContents.hasNext() ) {
			EObject o = (EObject)configurationContents.next();
			if ( o instanceof MappingEntity ) {
				MappingEntity entity = (MappingEntity)o;

				if ( entity.getPath().equals(path) ) {
					return entity;
				}
			}
		}

		return null;
	}

	private ConfigurationFragment findFragmentByName(String name) {
		TreeIterator configurationContents = mappingRelationships.eAllContents();

		while ( configurationContents.hasNext() ) {
			EObject o = (EObject)configurationContents.next();
			if ( o instanceof ConfigurationFragment ) {
				ConfigurationFragment fragment = (ConfigurationFragment)o;

				if ( fragment.getName().equals(name) ) {
					return fragment;
				}
			}
		}

		return null;
	}*/
}
