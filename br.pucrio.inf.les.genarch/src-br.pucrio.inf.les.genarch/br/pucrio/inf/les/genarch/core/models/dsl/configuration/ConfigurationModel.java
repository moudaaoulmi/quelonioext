package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

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
import br.pucrio.inf.les.genarch.models.configuration.Configuration;
import br.pucrio.inf.les.genarch.models.configuration.DSMMappings;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;

public class ConfigurationModel {

	private Configuration configuration;
	private Resource configurationResource;
	private IResource resource;
	
	private ConfigurationModelAddElement configurationModelAddElement;
	private ConfigurationModelGetElement configurationModelGetElement;
	private ConfigurationModelIterator configurationModelIterator;

	private ConfigurationModel(IResource resource,URI configurationFileURI) {
		ResourceSet configurationResourceSet = new ResourceSetImpl();
		this.configurationResource = configurationResourceSet.getResource(configurationFileURI, true);
		this.configuration = (Configuration)configurationResource.getContents().get(0);
		
		this.resource = resource;
		
		this.configurationModelAddElement = new ConfigurationModelAddElement(this);
		this.configurationModelGetElement = new ConfigurationModelGetElement(this);
		this.configurationModelIterator = new ConfigurationModelIterator(this);
	}

	public static ConfigurationModel open(IProject project) {
		GenarchProjectConfigurationFile configurationFile = GenarchProjectConfigurationFile.open(project);

		IFile configurationModelFile = project.getFile(configurationFile.getConfigurationModelPath());
		URI configurationFileURI = URI.createPlatformResourceURI(configurationModelFile.getFullPath().toString(),false);

		return new ConfigurationModel(configurationModelFile,configurationFileURI);
	}
			
	public ConfigurationModelGetElement get() {
		return this.configurationModelGetElement;
	}
			
	public ConfigurationModelAddElement add() {
		return this.configurationModelAddElement;
	}
	
	public ConfigurationModelIterator iterator() {
		return this.configurationModelIterator;
	}
	
	public void save() {
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		try {
			configurationResource.save(options);
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	public IResource getResource() {
		return this.resource;
	}

	protected MappingRelationships getMappingRelationships() {
		return this.configuration.getMappingRelationships();
	}
	
	protected DSMMappings getDSMMappings() {
		return this.configuration.getDsmMappings();
	}
}
