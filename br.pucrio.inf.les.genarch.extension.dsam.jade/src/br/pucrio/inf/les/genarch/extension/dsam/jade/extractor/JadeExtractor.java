package br.pucrio.inf.les.genarch.extension.dsam.jade.extractor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import br.pucrio.inf.les.genarch.core.extension.IDomainModelExtractor;
import br.pucrio.inf.les.genarch.core.plugin.DomainModelPath;
import br.pucrio.inf.les.genarch.core.plugin.IDomainModelPath;
import br.pucrio.inf.les.genarch.extension.dsam.jade.Jade;
import br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl;

public class JadeExtractor implements IDomainModelExtractor {
	
	public JadeExtractor() {
		
	}

	public IDomainModelPath extract(IProject project) {
		
		DomainModelPath domainModelPath = new DomainModelPath();
		String jadeFileName = "/models/JadeModel.jade";
		IFile jadeModelFile = project.getFile(jadeFileName);
		URI jadeFileURI = URI.createPlatformResourceURI(jadeModelFile.getFullPath().toString());

		ResourceSet jadeResourceSet = new ResourceSetImpl();
		Resource jadeResource = jadeResourceSet.createResource(jadeFileURI);
		
		Jade spring = JadePackageImpl.eINSTANCE.getJadeFactory().createJade();
		
		jadeResource.getContents().add(spring);
		
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		try {
			jadeResource.save(options);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		domainModelPath.setDomainModelName("Jade");
		domainModelPath.setDomainModelFilePath(new Path(jadeFileName));
		
		return domainModelPath;
	}

}
