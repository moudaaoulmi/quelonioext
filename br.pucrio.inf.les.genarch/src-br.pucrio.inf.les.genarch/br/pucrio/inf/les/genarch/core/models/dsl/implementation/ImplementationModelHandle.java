package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

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

import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;

public class ImplementationModelHandle {

	private Implementation amplementation;
	private Resource amplementationResource;

	private ImplementationModelAddElement amplementationModelAddElement;
	private ImplementationModelGetElement amplementationModelGetElement;

	private ImplementationModelHandle(URI amplementationFileURI) {
		ResourceSet amplementationResourceSet = new ResourceSetImpl();
		this.amplementationResource = amplementationResourceSet.getResource(amplementationFileURI, true);
		this.amplementation = (Implementation)amplementationResource.getContents().get(0);

		this.amplementationModelAddElement = new ImplementationModelAddElement(this);
		this.amplementationModelGetElement = new ImplementationModelGetElement(this);
	}

	public static ImplementationModelHandle implementationModel(IProject project) {
		GenarchProjectConfigurationFile configurationFile = GenarchProjectConfigurationFile.open(project);

		IFile amplementationModelFile = project.getFile(configurationFile.getImplementationModelPath());
		URI amplementationFileURI = URI.createPlatformResourceURI(amplementationModelFile.getFullPath().toString(),false);

		return new ImplementationModelHandle(amplementationFileURI);
	}

	public ImplementationContainerGetter<ImplementationResourcesContainer> resourceContainer() {
		return new ImplementationContainerGetter<ImplementationResourcesContainer>(this.amplementation);
	}

	public ImplementationModelGetElement get() {
		return this.amplementationModelGetElement;
	}

	public ImplementationModelAddElement add() {
		return this.amplementationModelAddElement;
	}

	public void save() {
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		try {
			amplementationResource.save(options);
		} catch (  IOException e) {
			e.printStackTrace();
		}
	}

	protected Implementation getImplementation() {
		return this.amplementation;
	}
}
