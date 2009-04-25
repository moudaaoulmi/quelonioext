package br.pucrio.inf.les.genarch.core.models.dsl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationModelUtil {

	private Implementation implementation;
	private Resource implementationResource;
	private ImplementationFactory implementationFactory = ImplementationPackageImpl.eINSTANCE.getImplementationFactory();
	private Set<String> sourceContainers;
	private Set<String> resourceContainers;

	public ImplementationModelUtil(IProject project) {
		init(project);
	}

	private void init(IProject project) {		
		GenarchProjectConfigurationFile configuration = GenarchProjectConfigurationFile.open(project);
		
		sourceContainers = configuration.getSourceContainers();
		resourceContainers = configuration.getResourceContainers();

		IFile implementationModelFile = project.getFile(configuration.getImplementationModelPath());
		URI implementationFileURI = URI.createPlatformResourceURI(implementationModelFile.getFullPath().toString());

		ResourceSet implementationResourceSet = new ResourceSetImpl();
		this.implementationResource = implementationResourceSet.getResource(implementationFileURI, true);

		this.implementation = (Implementation)implementationResource.getContents().get(0);
	}

	public void addElement(ImplementationEntity element) {
		String containerName = new Path(element.getPath()).segment(0).toString();
		EObject container = getContainer(containerName);

		if ( container != null ) {
			if ( container instanceof ImplementationResourcesContainer ) {
				addResourceElement(element);
			} else if ( container instanceof ImplementationContainer ) {
				addSourceElement(element);
			}
		} else {
			if ( sourceContainers.contains(containerName) ) {
				ImplementationContainer sourceContaier = implementationFactory.createImplementationContainer();
				sourceContaier.setName(containerName);
				this.implementation.getContainers().add(sourceContaier);
				
				addSourceElement(element);
			} else if ( resourceContainers.contains(containerName) ) {
				ImplementationResourcesContainer resourceContainer = implementationFactory.createImplementationResourcesContainer();
				resourceContainer.setName(containerName);
				this.implementation.getResourcesContainer().add(resourceContainer);
				
				addResourceElement(element);
			}
		}
	}
	
	private void addResourceElement(ImplementationEntity element) {

		if ( element(element.getPath()) != null ) {
			return;
		}

		Path iPath = new Path(element.getPath());
		int segmentCount = iPath.segmentCount();

		if (segmentCount == 2 ) {
			ImplementationResourcesContainer container = resourcesContainer(iPath.segment(0));

			if ( container != null ) {
				if ( element instanceof ImplementationFolder ) {
					container.getFolders().add((ImplementationFolder)element);
				} else if ( element instanceof ImplementationFile ) {
					container.getFiles().add((ImplementationFile)element);
				} else if ( element instanceof ImplementationTemplate ) {
					container.getTemplates().add((ImplementationTemplate)element);
				}
			} else {
				container = implementationFactory.createImplementationResourcesContainer();
				container.setName(iPath.segment(0));
				if ( element instanceof ImplementationFolder ) {
					container.getFolders().add((ImplementationFolder)element);
				} else if ( element instanceof ImplementationFile ) {
					container.getFiles().add((ImplementationFile)element);
				} else if ( element instanceof ImplementationTemplate ) {
					container.getTemplates().add((ImplementationTemplate)element);
				}
				this.implementation.getResourcesContainer().add(container);
			}
		} else {
			String parentPath = iPath.removeLastSegments(1).toString();
			ImplementationFolder parent = (ImplementationFolder)element(parentPath);

			if ( parent == null ) {
				parent = addFolder(parentPath);
			} 

			if ( element instanceof ImplementationTemplate ) {
				parent.getTemplates().add((ImplementationTemplate)element);
			} else if ( element instanceof ImplementationFile ) {
				parent.getFiles().add((ImplementationFile)element); 
			} else if ( element instanceof ImplementationFolder ) {
				parent.getSubFolders().add((ImplementationFolder)element);
			}
		}
	}

	private ImplementationFolder addFolder(String folderPath) {
		ImplementationFolder folder = this.implementationFactory.createImplementationFolder();

		Path iPath = new Path(folderPath);
		int segmentCount = iPath.segmentCount();

		if ( segmentCount == 2 ) {	    
			folder.setName(iPath.segment(1));
			folder.setPath(folderPath);

			ImplementationResourcesContainer container = resourcesContainer(iPath.segment(0));

			if ( container != null ) {
				container.getFolders().add(folder);
			} else {
				container = this.implementationFactory.createImplementationResourcesContainer();
				container.setName(iPath.segment(0));
				container.getFolders().add(folder);
				this.implementation.getResourcesContainer().add(container);
			}	    	   
		} else {
			String parentPath = iPath.removeLastSegments(1).toString();
			ImplementationFolder parent = (ImplementationFolder)element(parentPath);

			if ( parent == null ) {
				parent = addFolder(parentPath);
			}

			folder.setName(iPath.lastSegment());
			folder.setPath(folderPath);
			parent.getSubFolders().add(folder);
		}

		return folder;
	}

	private void addSourceElement(ImplementationEntity element) {

		if ( element(element.getPath()) != null ) {
			return;
		}

		Path iPath = new Path(element.getPath());
		int segmentCount = iPath.segmentCount();

		if (segmentCount == 2 ) {
			ImplementationContainer container = sourceContaier(iPath.segment(0));

			if ( container != null ) {
				container.getComponents().add((ImplementationComponent)element);
			} else {
				container = ImplementationPackage.eINSTANCE.getImplementationFactory().createImplementationContainer();
				container.setName(iPath.segment(1));
				container.getComponents().add((ImplementationComponent)element);
				this.implementation.getContainers().add(container);
			}	    
		} else {
			String parentPath = iPath.removeLastSegments(1).toString();
			ImplementationComponent parent = (ImplementationComponent)element(parentPath);

			if ( parent == null ) {
				parent = addComponent(parentPath);
			} 

			if ( element instanceof ImplementationClass ) {	  
				parent.getClasses().add((ImplementationClass)element);
			} else if ( element instanceof ImplementationAspect ) {
				parent.getAspects().add((ImplementationAspect)element);
			} else if ( element instanceof ImplementationTemplate ) {
				parent.getTemplates().add((ImplementationTemplate)element);
			} else if ( element instanceof ImplementationFile ) {
				parent.getFiles().add((ImplementationFile)element); 
			} else if ( element instanceof ImplementationComponent ) {
				parent.getSubComponents().add((ImplementationComponent)element);
			}	      
		}
	}

	private ImplementationComponent addComponent(String containerPath) {
		ImplementationComponent c = this.implementationFactory.createImplementationComponent();

		Path iPath = new Path(containerPath);
		int segmentCount = iPath.segmentCount();

		if ( segmentCount == 2 ) {
			ImplementationContainer container = sourceContaier(iPath.segment(0));

			if ( container != null ) {
				container.getComponents().add(c);
			} else {
				container = ImplementationPackage.eINSTANCE.getImplementationFactory().createImplementationContainer();
				container.setName(iPath.segment(1));
				container.getComponents().add(c);
				this.implementation.getContainers().add(container);
			}
		} else {
			String parentPath = iPath.removeLastSegments(1).toString();
			ImplementationComponent parent = (ImplementationComponent)element(parentPath);

			if ( parent == null ) {
				parent = addComponent(parentPath);
			} 

			parent.getSubComponents().add(c);

		}

		return c;
	}

	private EObject getContainer(String name) {
		TreeIterator iterator = this.implementation.eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();
			if ( o instanceof ImplementationContainer ) {
				ImplementationContainer c = (ImplementationContainer)o;
				if ( c.getName().equals(name) ) {
					return o;
				}
			} else if ( o instanceof ImplementationResourcesContainer ) {
				ImplementationResourcesContainer c = (ImplementationResourcesContainer)o;
				if ( c.getName().equals(name) ) {
					return o;
				}
			}
		}

		return null;
	}

	private ImplementationResourcesContainer resourcesContainer(String name) {
		EList containers = this.implementation.getResourcesContainer();

		for ( int x = 0; x < containers.size(); x++ ) {
			ImplementationResourcesContainer container = (ImplementationResourcesContainer)containers.get(x);
			if ( container.getName().equals(name) ) {
				return container;
			}
		}

		return null;
	}

	private ImplementationContainer sourceContaier(String name) {
		EList containers = this.implementation.getContainers();

		for ( int x = 0; x < containers.size(); x++ ) {
			ImplementationContainer container = (ImplementationContainer)containers.get(x);
			if ( container.getName().equals(name) ) {
				return container;
			}
		}

		return null;
	}

	public void removeElement(String elementPath) {
		String containerName = new Path(elementPath).segment(0).toString();
		EObject container = getContainer(containerName);

		if ( container != null ) {
			if ( container instanceof ImplementationResourcesContainer ) {
				removeResourceElement(elementPath);
			} else if ( container instanceof ImplementationContainer ) {
				removeSourceElement(elementPath);
			}
		}
	}

	private void removeResourceElement(String elementPath) {
		ImplementationEntity element = element(elementPath);

		if ( element == null ) {
			return;
		}

		Path iPath = new Path(elementPath);	
		int segmentCount = iPath.segmentCount();
		ImplementationFolder parent = (ImplementationFolder)element(iPath.removeLastSegments(1).toString());

		if ( element instanceof ImplementationFolder ) {
			if ( segmentCount == 2 ) {
				ImplementationResourcesContainer container = (ImplementationResourcesContainer)sourceContaier(iPath.segment(0));
				container.getFolders().remove(element);
			} else {			    
				parent.getSubFolders().remove(element);
			}
		} 

		if ( element instanceof ImplementationTemplate ) {
			parent.getTemplates().remove(element);
		} else if ( element instanceof ImplementationFile ) {
			parent.getFiles().remove(element);
		}

		removeFolder(parent.getPath());
	}

	private void removeFolder(String path) {
		EObject o = element(path);

		if ( o == null ) {
			return;
		}

		if ( o instanceof ImplementationFolder ) {
			ImplementationFolder c = (ImplementationFolder)o;
			Path iPath = new Path(path);
			int segmentCount = iPath.segmentCount();

			if ( !c.eContents().isEmpty() ) {
				return;
			}

			if ( segmentCount == 2 ) {
				ImplementationResourcesContainer container = resourcesContainer(iPath.segment(0));
				container.getFolders().remove(c);
			} else {
				String parentPath = iPath.removeLastSegments(1).toString();
				ImplementationFolder parent = (ImplementationFolder)element(parentPath);	    
				parent.getSubFolders().remove(c);
				removeFolder(parent.getPath());
			}
		} 
	}

	private void removeSourceElement(String elementPath) {	
		ImplementationEntity element = element(elementPath);

		if ( element == null ) {
			return;
		}

		Path iPath = new Path(elementPath);	
		int segmentCount = iPath.segmentCount();
		ImplementationComponent parent = (ImplementationComponent)element(iPath.removeLastSegments(1).toString());

		if ( element instanceof ImplementationComponent ) {
			if ( segmentCount == 2 ) {
				ImplementationContainer container = sourceContaier(iPath.segment(0));
				container.getComponents().remove(element);
			} else {			    
				parent.getSubComponents().remove(element);
			}
		} 

		if ( element instanceof ImplementationClass ) {	  
			parent.getClasses().remove(element);
		} else if ( element instanceof ImplementationAspect ) {
			parent.getAspects().remove(element);
		} else if ( element instanceof ImplementationTemplate ) {
			parent.getTemplates().remove(element);
		} else if ( element instanceof ImplementationFile ) {
			parent.getFiles().remove(element);
		}

		removeComponent(parent.getPath());
	}

	private void removeComponent(String path) {
		EObject o = element(path);

		if ( o == null ) {
			return;
		}

		if ( o instanceof ImplementationComponent ) {
			ImplementationComponent c = (ImplementationComponent)o;
			Path iPath = new Path(path);
			int segmentCount = iPath.segmentCount();

			if ( !c.eContents().isEmpty() ) {
				return;
			}

			if ( segmentCount == 2 ) {
				ImplementationContainer container = sourceContaier(iPath.segment(0));
				container.getComponents().remove(c);
			} else {
				String parentPath = iPath.removeLastSegments(1).toString();
				ImplementationComponent parent = (ImplementationComponent)element(parentPath);	    
				parent.getSubComponents().remove(c);
				removeComponent(parent.getPath());
			}
		} 
	}

	public ImplementationEntity element(String path) {
		TreeIterator iterator = implementation.eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();

			if ( o instanceof ImplementationEntity ) {
				ImplementationEntity c = (ImplementationEntity)o;
				if ( c.getPath().equals(path) ) {
					return c;
				}
			}	   
		}

		return null;
	}
	
	public List<ImplementationEntity> elements() {
		List<ImplementationEntity> entities = new ArrayList<ImplementationEntity>();
		TreeIterator iterator = implementation.eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();

			if ( o instanceof ImplementationEntity ) {
				ImplementationEntity c = (ImplementationEntity)o;
				entities.add(c);
			}	   
		}
		
		return entities;
	}
		
	public void saveModel() {
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		try {
			implementationResource.save(options);
		} catch (  IOException e) {
			e.printStackTrace();
		}
	}
}
