package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationAspectBuilder {
		
	private ImplementationAspect implementationAspect;
	
	private ImplementationAspectBuilder() {
		implementationAspect = ImplementationPackageImpl.eINSTANCE.getImplementationFactory().createImplementationAspect();
	}
	
	public ImplementationAspect build() {
		return implementationAspect;
	}
	
	public static ImplementationAspectBuilder implementationAspect() {
		return new ImplementationAspectBuilder();
	}
	
	public ImplementationAspectBuilder name(String name) {
		implementationAspect.setName(name);
		return this;
	}
	
	public ImplementationAspectBuilder path(String path) {
		implementationAspect.setPath(path);
		return this;
	}	
}
