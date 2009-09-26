package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;

public class ImplementationModelHandle {

	private Implementation implementation;
	private Resource implementationResource;
	private IResource resource;

	private ImplementationModelAddElement implementationModelAddElement;
	private ImplementationModelGetElement implementationModelGetElement;
	private ImplementationModelIterator implementationModelIterator;

	private ImplementationModelHandle(IResource resource,URI implementationFileURI) {
		ResourceSet implementationResourceSet = new ResourceSetImpl();
		this.implementationResource = implementationResourceSet.getResource(implementationFileURI, true);
		this.implementation = (Implementation)implementationResource.getContents().get(0);
		this.resource = resource;

		this.implementationModelAddElement = new ImplementationModelAddElement(this);
		this.implementationModelGetElement = new ImplementationModelGetElement(this);
		this.implementationModelIterator = new ImplementationModelIterator(this);
	}

	public static ImplementationModelHandle implementationModel(IProject project) {
		GenarchProjectConfigurationFile configurationFile = GenarchProjectConfigurationFile.open(project);

		IFile implementationModelFile = project.getFile(configurationFile.getImplementationModelPath());
		URI implementationFileURI = URI.createPlatformResourceURI(implementationModelFile.getFullPath().toString(),false);

		return new ImplementationModelHandle(implementationModelFile,implementationFileURI);
	}

	public ImplementationContainerGetter<ImplementationResourcesContainer> resourceContainer() {
		return new ImplementationContainerGetter<ImplementationResourcesContainer>(this.implementation);
	}

	public ImplementationModelGetElement get() {
		return this.implementationModelGetElement;
	}

	public ImplementationModelAddElement add() {
		return this.implementationModelAddElement;
	}
	
	public ImplementationModelIterator iterator() {
		return this.implementationModelIterator;
	}
	
	public IResource getResource() {
		return this.resource;
	}

	public void save() {
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		try {
			this.implementationResource.save(options);
		} catch (  IOException e) {
			e.printStackTrace();
		}
	}

	public Implementation getImplementation() {
		return this.implementation;
	}
}
