package br.pucrio.inf.les.genarch.core.derivation;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;

import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationModel;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationAspect;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationClass;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFolder;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragment;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.product.ProductAspect;
import br.pucrio.inf.les.genarch.models.product.ProductClass;
import br.pucrio.inf.les.genarch.models.product.ProductComponent;
import br.pucrio.inf.les.genarch.models.product.ProductContainer;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFile;
import br.pucrio.inf.les.genarch.models.product.ProductFolder;
import br.pucrio.inf.les.genarch.models.product.ProductFragment;
import br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer;
import br.pucrio.inf.les.genarch.models.product.ProductTemplate;

public class TransformArchModels {

	private IProject project;

	public TransformArchModels(IProject project) {
		this.project = project;
	}

	public ProductImplementationElements transform(Implementation implementationModel,MappingRelationships configurationModel,ProductFeaturesConfiguration productFeaturesConfiguration) {
		ProductImplementationElements productImplementationElements = ProductPackage.eINSTANCE.getProductFactory().createProductImplementationElements();

		EList containers = implementationModel.getContainers();

		for ( int y = 0; y < containers.size(); y++ ) {
			ImplementationContainer container = (ImplementationContainer)containers.get(y);
			ProductContainer productContainer = ProductPackage.eINSTANCE.getProductFactory().createProductContainer();
			productContainer.setName(container.getName());

			EList components = container.getComponents();

			for (int x = 0; x < components.size(); x++) {
				ImplementationComponent component = (ImplementationComponent)components.get(x);
				productContainer.getComponents().add(createComponent(component,productFeaturesConfiguration));  				
			}

			productImplementationElements.getContainers().add(productContainer);
		}

		EList resourcesContainers = implementationModel.getResourcesContainer();

		for ( int y = 0; y < resourcesContainers.size(); y++ ) {
			ImplementationResourcesContainer container = (ImplementationResourcesContainer)resourcesContainers.get(y);
			ProductResourcesContainer productResourcesContainer = ProductPackage.eINSTANCE.getProductFactory().createProductResourcesContainer();
			productResourcesContainer.setName(container.getName());

			EList folders = container.getFolders();

			for (int x = 0; x < folders.size(); x++) {
				ImplementationFolder folder = (ImplementationFolder)folders.get(x);	    
				productResourcesContainer.getFolders().add(createFolder(folder,productFeaturesConfiguration));				
			}

			EList templates = container.getTemplates();

			for ( int templatesCount = 0; templatesCount < templates.size(); templatesCount++ ) {
				ImplementationTemplate template = (ImplementationTemplate)templates.get(templatesCount);
				ConfigurationTemplate configurationTemplate = ConfigurationModel.open(project).get().template(template.getPath());

				ProductTemplate productTemplate = ProductPackage.eINSTANCE.getProductFactory().createProductTemplate();
				productTemplate.setName(template.getName());
				productTemplate.setPath(template.getPath());
				productTemplate.setGenerateToPath(template.getGenerationPath());

				productResourcesContainer.getTemplates().add(productTemplate);
			}

			EList files = container.getFiles();

			for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
				ImplementationFile file = (ImplementationFile)files.get(filesCount);
				ConfigurationFile configurationFile = ConfigurationModel.open(project).get().file(file.getPath());

				ProductFile fileInstanceTwo = ProductPackage.eINSTANCE.getProductFactory().createProductFile();
				fileInstanceTwo.setName(file.getName());
				fileInstanceTwo.setPath(file.getPath());

				productResourcesContainer.getFiles().add(fileInstanceTwo);				
			}

			productImplementationElements.getResourceContainers().add(productResourcesContainer);
		}

		EList fragmentContainer = implementationModel.getFragmentsContainer();

		for ( int y = 0; y < fragmentContainer.size(); y++ ) {
			ImplementationFragmentContainer implementationFragmentContainer = (ImplementationFragmentContainer)fragmentContainer.get(y); 			
			EList fragments = implementationFragmentContainer.getFragments();

			ProductFragmentContainer productFragmentContainer = ProductPackage.eINSTANCE.getProductFactory().createProductFragmentContainer();
			productFragmentContainer.setName(implementationFragmentContainer.getName());

			for ( int fragmentCount = 0; fragmentCount < fragments.size(); fragmentCount++ ) {
				ImplementationFragment fragment = (ImplementationFragment)fragments.get(fragmentCount);
				ConfigurationFragment configurationFragment = ConfigurationModel.open(project).get().fragment(fragment.getPath());

				ProductFragment fragmentInstanceTwo = ProductPackage.eINSTANCE.getProductFactory().createProductFragment();
				fragmentInstanceTwo.setName(fragment.getName());
				fragmentInstanceTwo.setContent(fragment.getContent());
				fragmentInstanceTwo.setPath(fragment.getPath());
				
				productFragmentContainer.getFragments().add(fragmentInstanceTwo);
			}

			productImplementationElements.getFragmentContainers().add(productFragmentContainer);
		}

		return productImplementationElements;
	}

	private ProductFolder createFolder(ImplementationFolder folder,ProductFeaturesConfiguration productFeaturesConfiguration) {
		ConfigurationFolder configurationFolder = ConfigurationModel.open(project).get().folder(folder.getPath());

		ProductFolder productFolder = ProductPackage.eINSTANCE.getProductFactory().createProductFolder();
		productFolder.setName(folder.getName());
		productFolder.setPath(folder.getPath());

		EList templates = folder.getTemplates();

		for ( int templatesCount = 0; templatesCount < templates.size(); templatesCount++ ) {
			ImplementationTemplate template = (ImplementationTemplate)templates.get(templatesCount);
			ConfigurationTemplate configurationTemplate = ConfigurationModel.open(project).get().template(template.getPath());

			ProductTemplate productTemplate = ProductPackage.eINSTANCE.getProductFactory().createProductTemplate();
			productTemplate.setName(template.getName());
			productTemplate.setPath(template.getPath());
			productTemplate.setGenerateToPath(template.getGenerationPath());

			productFolder.getTemplates().add(productTemplate);
		}

		EList files = folder.getFiles();

		for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
			ImplementationFile file = (ImplementationFile)files.get(filesCount);
			ConfigurationFile configurationFile = ConfigurationModel.open(project).get().file(file.getPath());

			ProductFile fileInstanceOne = ProductPackage.eINSTANCE.getProductFactory().createProductFile();
			fileInstanceOne.setName(file.getName());
			fileInstanceOne.setPath(file.getPath());

			productFolder.getFiles().add(fileInstanceOne);

		}

		EList subFolders = folder.getSubFolders();

		for ( int subFoldersCount = 0; subFoldersCount < subFolders.size(); subFoldersCount++ ) {
			ImplementationFolder subFolder = (ImplementationFolder)subFolders.get(subFoldersCount);
			ConfigurationFolder configurationSubFolder = ConfigurationModel.open(project).get().folder(subFolder.getPath());

			ProductFolder subFolderInstance = createFolder(subFolder,productFeaturesConfiguration);
			if ( subFolderInstance.eAllContents().hasNext() ) {				
				productFolder.getSubFolders().add(subFolderInstance);
			}
		}

		return productFolder;
	}

	private ProductComponent createComponent(ImplementationComponent component,ProductFeaturesConfiguration productFeaturesConfiguration) {		
		ConfigurationComponent configurationComponent = ConfigurationModel.open(project).get().component(component.getPath());

		ProductComponent productComponent = ProductPackage.eINSTANCE.getProductFactory().createProductComponent();		
		productComponent.setName(component.getName());
		productComponent.setPath(component.getPath());

		EList classes = component.getClasses();

		for ( int classesCount = 0; classesCount < classes.size(); classesCount++ ) {
			ImplementationClass clazz = (ImplementationClass)classes.get(classesCount);
			ConfigurationClass configurationClass = ConfigurationModel.open(project).get().clazz(clazz.getPath());

			ProductClass classInstanceOne = ProductPackage.eINSTANCE.getProductFactory().createProductClass();
			classInstanceOne.setName(clazz.getName());
			classInstanceOne.setPath(clazz.getPath());			

			productComponent.getClasses().add(classInstanceOne);			
		}

		EList aspects = component.getAspects();

		for ( int aspectsCount = 0; aspectsCount < aspects.size(); aspectsCount++ ) {
			ImplementationAspect aspect = (ImplementationAspect)aspects.get(aspectsCount);
			ConfigurationAspect configurationAspect = ConfigurationModel.open(project).get().aspect(aspect.getPath());

			ProductAspect aspectInstanceOne = ProductPackage.eINSTANCE.getProductFactory().createProductAspect();
			aspectInstanceOne.setName(aspect.getName());
			aspectInstanceOne.setPath(aspect.getPath());

			productComponent.getAspects().add(aspectInstanceOne);
		}

		EList templates = component.getTemplates();

		for ( int templatesCount = 0; templatesCount < templates.size(); templatesCount++ ) {
			ImplementationTemplate template = (ImplementationTemplate)templates.get(templatesCount);
			ConfigurationTemplate configurationTemplate = ConfigurationModel.open(project).get().template(template.getPath());

			ProductTemplate productTemplate = ProductPackage.eINSTANCE.getProductFactory().createProductTemplate();
			productTemplate.setName(template.getName());
			productTemplate.setPath(template.getPath());
			productTemplate.setGenerateToPath(template.getGenerationPath());

			productComponent.getTemplates().add(productTemplate);		
		}

		EList files = component.getFiles();

		for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
			ImplementationFile file = (ImplementationFile)files.get(filesCount);
			ConfigurationFile configurationFile = ConfigurationModel.open(project).get().file(file.getPath());

			ProductFile fileInstanceOne = ProductPackage.eINSTANCE.getProductFactory().createProductFile();
			fileInstanceOne.setName(file.getName());
			fileInstanceOne.setPath(file.getPath());

			productComponent.getFiles().add(fileInstanceOne);
		}

		EList subComponents = component.getSubComponents();

		for ( int subComponentCount = 0; subComponentCount < subComponents.size(); subComponentCount++ ) {
			ImplementationComponent subComponent = (ImplementationComponent)subComponents.get(subComponentCount);
			ConfigurationComponent configurationSubComponent = ConfigurationModel.open(project).get().component(subComponent.getPath());

			ProductComponent subComponentInstance = createComponent(subComponent,productFeaturesConfiguration);
			if ( subComponentInstance.eAllContents().hasNext() ) {
				productComponent.getSubComponents().add(subComponentInstance);
			}
		}

		return productComponent;
	}
}
