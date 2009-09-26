package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class ImplementationModelIterator {
	
	private ImplementationModelHandle implementationModelHandle;
	private TreeIterator<EObject> iterator;
	
	public ImplementationModelIterator(ImplementationModelHandle implementationModelHandle) {
		this.implementationModelHandle = implementationModelHandle;
		this.iterator = implementationModelHandle.getImplementation().eAllContents();
	}
	
	public boolean hasNext() {
		return iterator.hasNext();
	}
	
	public EObject next() {
		return iterator.next();
	}
	
	public void reset() {
		this.iterator = implementationModelHandle.getImplementation().eAllContents();
	}

}
