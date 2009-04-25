package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationComponentBuilder {
	
	private ImplementationComponent implementationComponent;
	
	private ImplementationComponentBuilder() {
		this.implementationComponent = ImplementationPackageImpl.eINSTANCE.getImplementationFactory().createImplementationComponent();
	}
	
	public ImplementationComponent build() {
		return this.implementationComponent;
	}
	
	public static ImplementationComponentBuilder implementationComponent() {
		return new ImplementationComponentBuilder();
	}
	
	public ImplementationComponentBuilder name(String name) {
		this.implementationComponent.setName(name);
		return this;
	}
	
	public ImplementationComponentBuilder path(String path) {
		this.implementationComponent.setPath(path);
		return this;
	}
	
	public ImplementationComponentBuilder addClass(ImplementationClass implementationClass) {
		this.implementationComponent.getClasses().add(implementationClass);
		return this;
	}
	
	public ImplementationComponentBuilder addAspect(ImplementationAspect implementationAspect) {
		this.implementationComponent.getAspects().add(implementationAspect);
		return this;
	}
	
	public ImplementationComponentBuilder addFile(ImplementationFile implementationFile) {
		this.implementationComponent.getFiles().add(implementationFile);
		return this;
	}
	
	public ImplementationComponentBuilder addTemplate(ImplementationTemplate implementationTemplate) {
		this.implementationComponent.getTemplates().add(implementationTemplate);
		return this;
	}
	
	public ImplementationComponentBuilder addSubComponents(ImplementationComponent implementationComponent) {
		this.implementationComponent.getSubComponents().add(implementationComponent);
		return this;
	}

}
