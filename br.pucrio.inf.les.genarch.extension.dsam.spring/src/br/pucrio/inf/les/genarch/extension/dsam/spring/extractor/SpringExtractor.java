package br.pucrio.inf.les.genarch.extension.dsam.spring.extractor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import br.pucrio.inf.les.genarch.core.extension.IDomainModelExtractor;
import br.pucrio.inf.les.genarch.extension.dsam.spring.Spring;
import br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl;

public class SpringExtractor implements IDomainModelExtractor {
	
	public SpringExtractor() {
		
	}

	public String extract(IProject project) {
		String springFileName = "/models/SpringModel.spring";
		IFile springModelFile = project.getFile(springFileName);
		URI springFileURI = URI.createPlatformResourceURI(springModelFile.getFullPath().toString());

		ResourceSet springResourceSet = new ResourceSetImpl();
		Resource springResource = springResourceSet.createResource(springFileURI);
		
		Spring spring = SpringPackageImpl.eINSTANCE.getSpringFactory().createSpring();
		
		springResource.getContents().add(spring);
		
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		try {
			springResource.save(options);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		return "Spring";
	}

}
