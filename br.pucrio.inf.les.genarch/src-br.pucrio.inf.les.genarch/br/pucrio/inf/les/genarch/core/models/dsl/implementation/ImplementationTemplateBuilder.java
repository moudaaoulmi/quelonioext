package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationTemplateBuilder {
	
	private ImplementationTemplate implementationTemplate;
	
	private ImplementationTemplateBuilder() {
		this.implementationTemplate = ImplementationPackageImpl.eINSTANCE.getImplementationFactory().createImplementationTemplate();
	}
	
	public static ImplementationTemplateBuilder implementationTemplate() {
		return new ImplementationTemplateBuilder();
	}
	
	public ImplementationTemplate build() {
		return this.implementationTemplate;
	}
	
	public ImplementationTemplateBuilder name(String name) {
		this.implementationTemplate.setName(name);
		return this;
	}
	
	public ImplementationTemplateBuilder path(String path) {
		this.implementationTemplate.setPath(path);
		return this;
	}
	
	public ImplementationTemplateBuilder generationPath(String generationPath) {
		this.implementationTemplate.setGenerationPath(generationPath);
		return this;
	}

}
