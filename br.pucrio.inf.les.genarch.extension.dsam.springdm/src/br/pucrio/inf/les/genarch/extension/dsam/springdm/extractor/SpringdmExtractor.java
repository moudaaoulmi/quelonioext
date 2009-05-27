package br.pucrio.inf.les.genarch.extension.dsam.springdm.extractor;

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
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl;

public class SpringdmExtractor implements IDomainModelExtractor {
	
	public SpringdmExtractor() {
		
	}

	public IDomainModelPath extract(IProject project) {
		
		DomainModelPath domainModelPath = new DomainModelPath();
		String springdmFileName = "/models/SpringDMModel.springdm";
		IFile springdmModelFile = project.getFile(springdmFileName);
		URI springdmFileURI = URI.createPlatformResourceURI(springdmModelFile.getFullPath().toString());

		ResourceSet springdmResourceSet = new ResourceSetImpl();
		Resource springdmResource = springdmResourceSet.createResource(springdmFileURI);
		
		SpringDynamicModules spring = SpringdmPackageImpl.eINSTANCE.getSpringdmFactory().createSpringDynamicModules();
		
		springdmResource.getContents().add(spring);
		
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		try {
			springdmResource.save(options);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		domainModelPath.setDomainModelName("SpringDM");
		domainModelPath.setDomainModelFilePath(new Path(springdmFileName));
		
		return domainModelPath;
	}

}
