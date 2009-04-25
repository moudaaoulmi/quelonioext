package br.pucrio.inf.les.genarch.core.project;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class GenarchProjectConfigurationFile {
		
	public static GenarchProjectConfigurationFile open(IProject project) {
		IFile configFile = project.getFile("genarch.gcf");
					
		try {
			XMLDecoder xmlDecoder = new XMLDecoder(configFile.getContents());
			GenarchProjectConfigurationFile genarchProjectConfigurationFile = (GenarchProjectConfigurationFile)xmlDecoder.readObject();
			genarchProjectConfigurationFile.setConfigurationFile(configFile);
			return genarchProjectConfigurationFile;
		} catch (CoreException e) {
			GenarchProjectConfigurationFile genarchProjectConfigurationFile = new GenarchProjectConfigurationFile();
			genarchProjectConfigurationFile.setConfigurationFile(configFile);
			return genarchProjectConfigurationFile;
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	public GenarchProjectConfigurationFile() {
		
	}
	
	private volatile IFile configurationFile;
	
	public void setConfigurationFile(IFile configurationFile) {
		this.configurationFile = configurationFile;
	}
	
	public void save(IProgressMonitor monitor) {
		monitor.beginTask("Saving Genarch Configuration File", 1);
		PipedOutputStream outStream = new PipedOutputStream();
		PipedInputStream inStream = new PipedInputStream();
		try {
			inStream.connect(outStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		XMLEncoder encoder = new XMLEncoder(outStream);
		encoder.writeObject(this);
		encoder.flush();
		encoder.close();
			
		if ( configurationFile != null ) {
			try {
				if ( this.configurationFile.exists() ) {
					this.configurationFile.setContents(inStream, true,true, monitor);
				} else {					
					this.configurationFile.create(inStream, true, monitor);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
					
		monitor.worked(1);
	}
	
	private String implementationModelPath;
	private String configurationModelPath;
	private String featureModelPath;
	private String classExtension = "java";
	private String interfaceExtension = "java";
	private String aspectExtension = "aj";
	private String templateExtension = "xpt";
	private Set<String> sourceContainers = new TreeSet<String>();
	private Set<String> resourceContainers = new TreeSet<String>();
	private Map<String,String> domainModelsFiles = new HashMap<String,String>();
		
	public String getImplementationModelPath() {
		return this.implementationModelPath;
	}

	public void setImplementationModelPath(String implementationModelFileName) {
		this.implementationModelPath = implementationModelFileName;
	}

	public String getConfigurationModelPath() {
		return this.configurationModelPath;
	}

	public void setConfigurationModelPath(String configurationModelFileName) {
		this.configurationModelPath = configurationModelFileName;
	}

	public String getFeatureModelPath() {
		return this.featureModelPath;
	}

	public void setFeatureModelPath(String featureModelFileName) {
		this.featureModelPath = featureModelFileName;
	}

	public String getAspectExtension() {
		return aspectExtension;
	}

	public void setAspectExtension(String aspectExtension) {
		this.aspectExtension = aspectExtension;
	}

	public String getClassExtension() {
		return classExtension;
	}

	public void setClassExtension(String classExtension) {
		this.classExtension = classExtension;
	}

	public String getInterfaceExtension() {
		return interfaceExtension;
	}

	public void setInterfaceExtension(String interfaceExtension) {
		this.interfaceExtension = interfaceExtension;
	}

	public String getTemplateExtension() {
		return templateExtension;
	}

	public void setTemplateExtension(String templateExtension) {
		this.templateExtension = templateExtension;
	}

	public Set<String> getSourceContainers() {
		return sourceContainers;
	}

	public void setSourceContainers(Set<String> container) {
		this.sourceContainers = container;
	}

	public Set<String> getResourceContainers() {
		return resourceContainers;
	}

	public void setResourceContainers(Set<String> resourceContainers) {
		this.resourceContainers = resourceContainers;
	}

	public Map<String,String> getDomainModelsFiles() {
		return domainModelsFiles;
	}

	public void setDomainModelsFiles(Map<String,String> domainModelFiles) {
		this.domainModelsFiles = domainModelFiles;
	}
}