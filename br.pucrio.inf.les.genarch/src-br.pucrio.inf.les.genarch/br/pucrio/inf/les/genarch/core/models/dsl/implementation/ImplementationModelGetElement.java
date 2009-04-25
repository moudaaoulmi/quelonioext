package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

public class ImplementationModelGetElement {

	private ImplementationModelHandle architectureModelHandle;

	public ImplementationModelGetElement(ImplementationModelHandle architectureModelHandle) {
		this.architectureModelHandle = architectureModelHandle;
	}
	
	public ImplementationComponent component(String path) {
		return (ImplementationComponent)getElement(path);
	}
	
	public ImplementationFolder folder(String path) {
		return (ImplementationFolder)getElement(path);
	}
	
	public ImplementationClass clazz(String path) {
		return (ImplementationClass)getElement(path);
	}
	
	public ImplementationAspect aspect(String path) {
		return (ImplementationAspect)getElement(path);
	}
	
	public ImplementationFile file(String path) {
		return (ImplementationFile)getElement(path);
	}
	
	public ImplementationTemplate template(String path) {
		return (ImplementationTemplate)getElement(path);
	}
	
	public ImplementationFragment fragment(String path) {
		return (ImplementationFragment)getElement(path);
	}
	
	public ImplementationContainer sourceContainer(String name) {
		return (ImplementationContainer)getContainer(name);
	}
			
	public ImplementationResourcesContainer resourceContainer(String name) {
		return (ImplementationResourcesContainer)getContainer(name);
	}
	
	public ImplementationFragmentContainer fragmentContainer(String name) {
		return (ImplementationFragmentContainer)getContainer(name);
	}

	private ImplementationEntity getElement(String path) {
		TreeIterator iterator = this.architectureModelHandle.getImplementation().eAllContents();

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
	
	private EObject getContainer(String name) {
		TreeIterator iterator = this.architectureModelHandle.getImplementation().eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();

			if ( o instanceof ImplementationContainer ) {
				ImplementationContainer c = (ImplementationContainer)o;
				if ( c.getName().equals(name) ) {
					return c;
				}
			} else if ( o instanceof ImplementationResourcesContainer ) {
				ImplementationResourcesContainer c = (ImplementationResourcesContainer)o;
				if ( c.getName().equals(name) ) {
					return c;
				}
			} else if ( o instanceof ImplementationFragmentContainer ) {
				ImplementationFragmentContainer c = (ImplementationFragmentContainer)o;
				if ( c.getName().equals(name) ) {
					return c;
				}
			}
		}

		return null;
	}
}