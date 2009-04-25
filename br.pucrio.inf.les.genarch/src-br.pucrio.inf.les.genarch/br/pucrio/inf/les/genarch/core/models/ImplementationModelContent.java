package br.pucrio.inf.les.genarch.core.models;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationModelContent {

	private ImplementationPackage implementationPackage;
	private ImplementationFactory implementationFactory;
	private Implementation implementation;

	public ImplementationModelContent() {				
		init();
		this.implementation = this.implementationFactory.createImplementation();	
	}

	public ImplementationModelContent(Implementation implementation) {
		init();
		this.implementation = implementation;	
	}

	private void init() {
		ImplementationPackageImpl.init();
		this.implementationPackage = ImplementationPackage.eINSTANCE;
		this.implementationFactory = this.implementationPackage.getImplementationFactory();	
	}

	public ImplementationContainer addContainer(String name) {
		ImplementationContainer container = this.implementationFactory.createImplementationContainer();
		container.setName(name);
		this.implementation.getContainers().add(container);
		return container;
	}

	public ImplementationResourcesContainer addResourceContainer(String name) {
		ImplementationResourcesContainer container = this.implementationFactory.createImplementationResourcesContainer();
		container.setName(name);
		this.implementation.getResourcesContainer().add(container);
		return container;
	}

	public ImplementationComponent addComponent(String name,ImplementationContainer implementationContainer,String path) {
		ImplementationComponent implementationComponent = this.implementationFactory.createImplementationComponent();
		implementationComponent.setName(name);
		implementationComponent.setPath(path);
		implementationContainer.getComponents().add(implementationComponent);
		return implementationComponent;
	}

	public ImplementationComponent addSubComponent(String name,String path,ImplementationComponent implementationComponent) {
		ImplementationComponent implementationSubComponent = this.implementationFactory.createImplementationComponent();
		implementationSubComponent.setName(name);
		implementationSubComponent.setPath(path);
		implementationComponent.getSubComponents().add(implementationSubComponent);
		return implementationSubComponent;				
	}

	public void addClass(String name,String path,ImplementationComponent implementationComponent) {	
		ImplementationClass implementationClass = this.implementationFactory.createImplementationClass();
		implementationClass.setName(name);
		implementationClass.setPath(path);
		implementationComponent.getClasses().add(implementationClass);
	}

	public void addAspect(String name,String path,ImplementationComponent implementationComponent) {
		ImplementationAspect implementationAspect = this.implementationFactory.createImplementationAspect();
		implementationAspect.setName(name);
		implementationAspect.setPath(path);
		implementationComponent.getAspects().add(implementationAspect);
	}

	public void addTemplate(String name,String path,String generationPath,ImplementationComponent implementationComponent) {
		ImplementationTemplate implementationTemplate = this.implementationFactory.createImplementationTemplate();
		implementationTemplate.setName(name);
		implementationTemplate.setPath(path);
		implementationTemplate.setGenerationPath(generationPath);
		implementationComponent.getTemplates().add(implementationTemplate);		
	}

	public void addTemplate(String name,String path,String generationPath,ImplementationFolder implementationFolder) {
		ImplementationTemplate implementationTemplate = this.implementationFactory.createImplementationTemplate();
		implementationTemplate.setName(name);
		implementationTemplate.setPath(path);
		implementationTemplate.setGenerationPath(generationPath);
		implementationFolder.getTemplates().add(implementationTemplate);		
	}

	public void addFile(String name,String path,ImplementationComponent implementationComponent) {
		ImplementationFile implementationFile = this.implementationFactory.createImplementationFile();
		implementationFile.setName(name);
		implementationFile.setPath(path);
		implementationComponent.getFiles().add(implementationFile);		
	}

	public void addFile(String name,String path,ImplementationResourcesContainer implementationResourcesContainer) {
		ImplementationFile implementationFile = this.implementationFactory.createImplementationFile();
		implementationFile.setName(name);
		implementationFile.setPath(path);
		implementationResourcesContainer.getFiles().add(implementationFile);		
	}

	public void addFile(String name,String path,ImplementationFolder implementationFolder) {
		ImplementationFile implementationFile = this.implementationFactory.createImplementationFile();
		implementationFile.setName(name);
		implementationFile.setPath(path);
		implementationFolder.getFiles().add(implementationFile);		
	}

	public void addFolder(String name,String path,ImplementationResourcesContainer implementationResourcesContainer) {
		ImplementationFolder implementationFolder = this.implementationFactory.createImplementationFolder();
		implementationFolder.setName(name);
		implementationFolder.setPath(path);
		implementationResourcesContainer.getFolders().add(implementationFolder);
	}

	public void addSubFolder(String name,String path,ImplementationFolder implementationResourcesFolder) {
		ImplementationFolder implementationFolder = this.implementationFactory.createImplementationFolder();
		implementationFolder.setName(name);
		implementationFolder.setPath(path);
		implementationResourcesFolder.getSubFolders().add(implementationFolder);
	}

	public ImplementationContainer getContainer(String name) {
		EList containers = this.implementation.getContainers();

		for ( int x = 0; x < containers.size(); x++ ) {
			ImplementationContainer container = (ImplementationContainer)containers.get(x);
			if ( container.getName().equals(name) ) {
				return container;
			}
		}

		return null;
	}

	public EObject getElementByPath(String path) {
		TreeIterator iterator = this.implementation.eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();

			if ( o instanceof ImplementationContainer ) {
				ImplementationContainer c = (ImplementationContainer)o;
				if ( c.getName().equals(path) ) {
					return c;
				}
			} else if ( o instanceof ImplementationResourcesContainer ) {
				ImplementationResourcesContainer c = (ImplementationResourcesContainer)o;
				if ( c.getName().equals(path) ) {
					return c;
				}
			} else if ( o instanceof ImplementationComponent ) {
				ImplementationComponent c = (ImplementationComponent)o;				
				if ( c.getPath().equals(path) ) {
					return c;
				}
			} else if ( o instanceof ImplementationClass ) {
				ImplementationClass c = (ImplementationClass)o;
				if ( c.getPath().equals(path) ) {
					return c;
				}
			} else if ( o instanceof ImplementationAspect ) {
				ImplementationAspect c = (ImplementationAspect)o;
				if ( c.getPath().equals(path) ) {
					return c;
				}
			} else if ( o instanceof ImplementationTemplate ) {
				ImplementationTemplate c = (ImplementationTemplate)o;
				if ( c.getPath().equals(path) ) {
					return c;
				}
			} else if ( o instanceof ImplementationFile ) {
				ImplementationFile c = (ImplementationFile)o;
				if ( c.getPath().equals(path) ) {
					return c;
				}
			} else if ( o instanceof ImplementationFolder ) {
				ImplementationFolder c = (ImplementationFolder)o;
				if ( c.getPath().equals(path) ) {
					return c;
				}
			}
		}

		return null;
	}

	public Implementation getImplementation() {
		return this.implementation;
	}

	public void setImplementation(Implementation implementation) {
		this.implementation = implementation;
	}
}
