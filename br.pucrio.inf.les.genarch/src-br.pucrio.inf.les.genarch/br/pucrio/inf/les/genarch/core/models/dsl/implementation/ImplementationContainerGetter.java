package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;

public class ImplementationContainerGetter<T> {
	
	private Implementation architecture;

	public ImplementationContainerGetter(Implementation implementation) {
		this.architecture = implementation;
	}

	public T get(String name) {
		TreeIterator iterator = architecture.eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();

			if ( o instanceof ImplementationContainer ) {
				ImplementationContainer c = (ImplementationContainer)o;
				if ( c.getName().equals(name) ) {
					return (T)c;
				}
			} else if (o instanceof ImplementationResourcesContainer ) {
				ImplementationResourcesContainer c = (ImplementationResourcesContainer)o;
				if ( c.getName().equals(name) ) {
					return (T)c;
				}
			}
		}

		return null;
	}

}
