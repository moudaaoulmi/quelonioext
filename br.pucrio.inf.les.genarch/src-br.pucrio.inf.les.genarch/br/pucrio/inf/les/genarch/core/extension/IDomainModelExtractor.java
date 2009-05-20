package br.pucrio.inf.les.genarch.core.extension;

import org.eclipse.core.resources.IProject;

import br.pucrio.inf.les.genarch.core.plugin.IDomainModelPath;

public interface IDomainModelExtractor {
	
	public IDomainModelPath extract(IProject project);

}
