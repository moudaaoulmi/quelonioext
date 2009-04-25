package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;

public class ImplementationSourceContainerBuilder {
	
	private ImplementationContainer implementationContainer;
	
	private ImplementationSourceContainerBuilder() {
		this.implementationContainer = ImplementationFactory.eINSTANCE.createImplementationContainer();
	}
	
	public static ImplementationSourceContainerBuilder implementationSourceContainer() {
		return new ImplementationSourceContainerBuilder();
	}
	
	public ImplementationContainer build() {
		return this.implementationContainer;
	}
	
	public ImplementationSourceContainerBuilder name(String name) {
		this.implementationContainer.setName(name);
		return this;
	}
	
	public ImplementationSourceContainerBuilder addComponent(ImplementationComponent implementationComponent) {
		this.implementationContainer.getComponents().add(implementationComponent);
		return this;
	}

}
