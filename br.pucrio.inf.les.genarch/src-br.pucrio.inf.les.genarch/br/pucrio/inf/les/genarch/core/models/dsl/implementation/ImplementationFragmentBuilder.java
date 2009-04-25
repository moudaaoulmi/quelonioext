package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;

public class ImplementationFragmentBuilder {
	
	private ImplementationFragment implementationFragment;
	
	private ImplementationFragmentBuilder() {
		this.implementationFragment = ImplementationPackage.eINSTANCE.getImplementationFactory().createImplementationFragment();
	}
	
	public ImplementationFragment build() {
		return this.implementationFragment;
	}
	
	public static ImplementationFragmentBuilder implementationFragment() {
		return new ImplementationFragmentBuilder();
	}
	
	public ImplementationFragmentBuilder name(String name) {
		this.implementationFragment.setName(name);
		return this;
	}
	
	public ImplementationFragmentBuilder content(String content) {
		this.implementationFragment.setContent(content);
		return this;
	}
	
	public ImplementationFragmentBuilder path(String path) {
		this.implementationFragment.setPath(path);
		return this;
	}

}
