package br.pucrio.inf.les.genarch.extension.mas.extractor;

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
import br.pucrio.inf.les.genarch.extension.mas.MAS;
import br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl;

public class MasExtractor implements IDomainModelExtractor {
	
	public MasExtractor() {
		
	}

	public String extract(IProject project) {
		String springdmFileName = "/models/MasModel.mas";
		IFile springdmModelFile = project.getFile(springdmFileName);
		URI architectureFileURI = URI.createPlatformResourceURI(springdmModelFile.getFullPath().toString());

		ResourceSet springdmResourceSet = new ResourceSetImpl();
		Resource springdmResource = springdmResourceSet.createResource(architectureFileURI);
		
		MAS springdm = MasPackageImpl.eINSTANCE.getMasFactory().createMAS();
		
		springdmResource.getContents().add(springdm);
		
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		try {
			springdmResource.save(options);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		return "Mas";
	}

}
