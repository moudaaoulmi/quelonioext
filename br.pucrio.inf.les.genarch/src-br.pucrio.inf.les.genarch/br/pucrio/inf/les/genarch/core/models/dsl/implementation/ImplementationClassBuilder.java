package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationClassBuilder {
	
	private final ImplementationClass implementationClass;
		
	private ImplementationClassBuilder() {
		implementationClass = ImplementationPackageImpl.eINSTANCE.getImplementationFactory().createImplementationClass();
	}
	
	public ImplementationClass build() {
		return implementationClass;
	}
	
	public static ImplementationClassBuilder implementationClass() {		
		return new ImplementationClassBuilder();
	}
	
	public ImplementationClassBuilder name(String name) {
		implementationClass.setName(name);
		return this;
	}
	
	public ImplementationClassBuilder path (String path) {
		implementationClass.setPath(path);
		return this;
	}

}
