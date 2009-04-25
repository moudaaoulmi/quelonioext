package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;

public class ImplementationFragmentContainerBuilder {
	
	private ImplementationFragmentContainer implementationFragmentContainer;
	
	private ImplementationFragmentContainerBuilder() {
		this.implementationFragmentContainer = ImplementationPackage.eINSTANCE.getImplementationFactory().createImplementationFragmentContainer();
	}
	
	public static ImplementationFragmentContainerBuilder implementationFragmentContainer() {
		return new ImplementationFragmentContainerBuilder();
	}
	
	public ImplementationFragmentContainer build() {
		return implementationFragmentContainer;
	}
	
	public ImplementationFragmentContainerBuilder name(String name) {
		this.implementationFragmentContainer.setName(name);
		return this;
	}
	
	public ImplementationFragmentContainerBuilder addFragment(ImplementationFragment fragment) {
		this.implementationFragmentContainer.getFragments().add(fragment);
		return this;
	}
}
