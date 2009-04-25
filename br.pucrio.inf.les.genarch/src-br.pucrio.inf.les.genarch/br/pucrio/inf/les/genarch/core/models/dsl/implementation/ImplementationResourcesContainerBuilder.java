package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;

public class ImplementationResourcesContainerBuilder {
	
	private ImplementationResourcesContainer implementationResourcesContainer;
	
	private ImplementationResourcesContainerBuilder() {
		this.implementationResourcesContainer = ImplementationFactory.eINSTANCE.createImplementationResourcesContainer();
	}
	
	public static ImplementationResourcesContainerBuilder implementationResourcesContainer() {
		return new ImplementationResourcesContainerBuilder();
	}
	
	public ImplementationResourcesContainer build() {
		return implementationResourcesContainer;
	}
	
	public ImplementationResourcesContainerBuilder name(String name) {
		this.implementationResourcesContainer.setName(name);
		return this;
	}
	
	public ImplementationResourcesContainerBuilder addFolder(ImplementationFolder implementationFolder) {
		this.implementationResourcesContainer.getFolders().add(implementationFolder);
		return this;
	}
	
	public ImplementationResourcesContainerBuilder addFile(ImplementationFile implementationFile) {
		this.implementationResourcesContainer.getFiles().add(implementationFile);
		return this;
	}

}
