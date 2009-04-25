package br.pucrio.inf.les.genarch.core.extension;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

import br.pucrio.inf.les.genarch.models.product.Product;

public interface IPostProcessor {
	
	public void process(IProject project,IProject derivationProject,Product productModel, IProgressMonitor monitor);

}
