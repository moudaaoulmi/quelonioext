package br.pucrio.inf.les.genarch.extension.dsam.mas.extractor;

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
import br.pucrio.inf.les.genarch.extension.dsam.mas.MAS;
import br.pucrio.inf.les.genarch.extension.dsam.mas.impl.MasPackageImpl;

public class MasExtractor implements IDomainModelExtractor {
	
	public MasExtractor() {
		
	}

	public IDomainModelPath extract(IProject project) {
		
		DomainModelPath domainModelPath = new DomainModelPath();
		
		String masModelFileName = "/models/MasModel.mas";
		IFile masModelFile = project.getFile(masModelFileName);
		URI masFileURI = URI.createPlatformResourceURI(masModelFile.getFullPath().toString());

		ResourceSet masResourceSet = new ResourceSetImpl();
		Resource masResource = masResourceSet.createResource(masFileURI);
		
		MAS springdm = MasPackageImpl.eINSTANCE.getMasFactory().createMAS();
		
		masResource.getContents().add(springdm);
		
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		try {
			masResource.save(options);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		domainModelPath.setDomainModelName("Mas");
		domainModelPath.setDomainModelFilePath(new Path(masModelFileName));
		
		return domainModelPath;
	}

}
