package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

public class ImplementationFileBuilder {
	
	private ImplementationFile implementationFile;
	
	private ImplementationFileBuilder() {
		this.implementationFile = ImplementationPackageImpl.eINSTANCE.getImplementationFactory().createImplementationFile();
	}
	
	public ImplementationFile build() {
		return implementationFile;
	}
	
	public static ImplementationFileBuilder implementationFile() {
		return new ImplementationFileBuilder();
	}
	
	public ImplementationFileBuilder name(String name) {
		this.implementationFile.setName(name);
		return this;
	}
	
	public ImplementationFileBuilder path(String path) {
		this.implementationFile.setPath(path);
		return this;
	}

}
