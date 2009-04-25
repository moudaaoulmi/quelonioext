package br.pucrio.inf.les.genarch.core.derivation;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.core.extension.IPostProcessor;
import br.pucrio.inf.les.genarch.core.templates.GenerateXPandTemplates;
import br.pucrio.inf.les.genarch.models.product.Product;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import br.pucrio.inf.les.genarch.models.product.ProductTemplate;

public class DerivateTemplates implements IPostProcessor {

	public void process(IProject project, IProject derivationProject, Product productModel, IProgressMonitor monitor) {

		ProductImplementationElements implementationElements = productModel.getProductImplementationElements();
		TreeIterator i = implementationElements.eAllContents();

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next(); 

			if ( o instanceof ProductTemplate ) {
				ProductTemplate template = (ProductTemplate)o;
				monitor.subTask("Processing Template \"" + template.getPath() + "\"");

				IPath filePath = new Path(template.getPath());
				IResource entityResource = project.getFile(filePath);

				IPath resourcePath = entityResource.getProjectRelativePath();

				IPath instantiationPath = derivationProject.getLocation().append(template.getGenerateToPath());

				if ( filePath.getFileExtension().equals("xpt") ) {
					IPath templatePath = project.getFile(template.getPath()).getFullPath();

					String xPandPath = resourcePath.removeFirstSegments(1).removeFileExtension().toString().replace("/", "::") + "::Main";
					GenerateXPandTemplates.getInstance().generate(instantiationPath,templatePath,xPandPath,productModel,ProductPackage.eINSTANCE);
				}

				monitor.worked(1);
			}
		}
	}

}
