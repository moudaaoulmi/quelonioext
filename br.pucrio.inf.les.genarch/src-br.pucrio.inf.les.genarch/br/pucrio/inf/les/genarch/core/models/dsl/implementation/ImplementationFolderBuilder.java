package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationFolderBuilder {
	
	private ImplementationFolder implementationFolder;
	
	private ImplementationFolderBuilder() {
		this.implementationFolder = ImplementationPackageImpl.eINSTANCE.getImplementationFactory().createImplementationFolder();	
	}
	
	public static ImplementationFolderBuilder implementationFolder() {
		return new ImplementationFolderBuilder();		
	}
	
	public ImplementationFolder build() {
		return implementationFolder;
	}
	
	public ImplementationFolderBuilder name(String name) {
		this.implementationFolder.setName(name);
		return this;
	}
	
	public ImplementationFolderBuilder path(String path) {
		this.implementationFolder.setPath(path);
		return this;
	}
	
	public ImplementationFolderBuilder addFile(ImplementationFile implementationFile) {
		this.implementationFolder.getFiles().add(implementationFile);
		return this;
	}
	
	public ImplementationFolderBuilder addTemplate(ImplementationTemplate implementationTemplate) {
		this.implementationFolder.getTemplates().add(implementationTemplate);
		return this;
	}
	
	public ImplementationFolderBuilder addSubFolder(ImplementationFolder implementationFolder) {
		this.implementationFolder.getSubFolders().add(implementationFolder);
		return this;
	}

}
