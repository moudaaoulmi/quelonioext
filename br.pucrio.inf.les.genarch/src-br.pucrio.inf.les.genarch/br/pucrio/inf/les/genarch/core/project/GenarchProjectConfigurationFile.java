package br.pucrio.inf.les.genarch.core.project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class GenarchProjectConfigurationFile {

	public static GenarchProjectConfigurationFile open(IProject project) {
		IFile configFile = project.getFile("genarch.gcf");

		try {
			Properties props = new Properties();
			props.load(configFile.getContents());

			GenarchProjectConfigurationFile genarchProjectConfigurationFile = new GenarchProjectConfigurationFile();
			genarchProjectConfigurationFile.setImplementationModelPath(props.getProperty("ImplementationModelPath"));
			genarchProjectConfigurationFile.setConfigurationModelPath(props.getProperty("ConfigurationModelPath"));
			genarchProjectConfigurationFile.setFeatureModelPath(props.getProperty("FeatureModelPath"));

			//Decode Domain Models

			String domainModels = props.getProperty("DomainModels");

			if ( domainModels != null ) {

				StringTokenizer domainModelsTokens = new StringTokenizer(domainModels,",");

				Map<String,String> domainModelsPath = new HashMap<String, String>();

				while ( domainModelsTokens.hasMoreElements() ) {
					String domainModelDescription = domainModelsTokens.nextToken();
					StringTokenizer domainModelDescriptionTokens = new StringTokenizer(domainModelDescription,"@");
					String name = domainModelDescriptionTokens.nextToken();
					String path = domainModelDescriptionTokens.nextToken();
					domainModelsPath.put(name,path);
				}

				genarchProjectConfigurationFile.setDomainModelsFiles(domainModelsPath);
			}		

			//Decode Source Containers

			String sourceContainers = props.getProperty("SourceContainers");

			if ( sourceContainers != null ) {

				StringTokenizer sourceContainersTokes = new StringTokenizer(sourceContainers,",");

				Set<String> sourceContainersPath = new TreeSet<String>(); 

				while ( sourceContainersTokes.hasMoreElements() ) {
					String sourceContainerPath = sourceContainersTokes.nextToken();
					sourceContainersPath.add(sourceContainerPath);
				}

				genarchProjectConfigurationFile.setSourceContainers(sourceContainersPath);
			}

			//Decode Resource Containers

			String resourceContainers = props.getProperty("ResourceContainers");

			if ( resourceContainers != null ) {
				StringTokenizer resourceContainersTokens = new StringTokenizer(resourceContainers,",");

				Set<String> resourceContainersPath = new TreeSet<String>();

				while ( resourceContainersTokens.hasMoreElements() ) {
					String resourceContainerPath = resourceContainersTokens.nextToken();
					resourceContainersPath.add(resourceContainerPath);
				}

				genarchProjectConfigurationFile.setResourceContainers(resourceContainersPath);
			}

			//Decode Importing Files

			String importingXMLFiles = props.getProperty("ImportingXMLFiles");

			if ( importingXMLFiles != null ){
				StringTokenizer importingXMLFilesTokens = new StringTokenizer(importingXMLFiles,",");

				Set<String> importingXMLFilesPath = new TreeSet<String>();

				while ( importingXMLFilesTokens.hasMoreElements() ) {
					String importingXMLFilePath = importingXMLFilesTokens.nextToken();
					importingXMLFilesPath.add(importingXMLFilePath);
				}

				genarchProjectConfigurationFile.setImportingXMLFiles(importingXMLFilesPath);
			}

			/*XMLDecoder xmlDecoder = new XMLDecoder(configFile.getContents());
			GenarchProjectConfigurationFile genarchProjectConfigurationFile = (GenarchProjectConfigurationFile)xmlDecoder.readObject();*/
			genarchProjectConfigurationFile.setConfigurationFile(configFile);
			return genarchProjectConfigurationFile;
		} catch (CoreException e) {
			e.printStackTrace();
			GenarchProjectConfigurationFile genarchProjectConfigurationFile = new GenarchProjectConfigurationFile();
			genarchProjectConfigurationFile.setConfigurationFile(configFile);
			return genarchProjectConfigurationFile;
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
			GenarchProjectConfigurationFile genarchProjectConfigurationFile = new GenarchProjectConfigurationFile();
			genarchProjectConfigurationFile.setConfigurationFile(configFile);
			return genarchProjectConfigurationFile;
		} catch (IOException e) {
			e.printStackTrace();
			GenarchProjectConfigurationFile genarchProjectConfigurationFile = new GenarchProjectConfigurationFile();
			genarchProjectConfigurationFile.setConfigurationFile(configFile);
			return genarchProjectConfigurationFile;			
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
		
		Properties props = new Properties();
		props.setProperty("ImplementationModelPath",this.getImplementationModelPath());
		props.setProperty("ConfigurationModelPath",this.getConfigurationModelPath());
		props.setProperty("FeatureModelPath",this.getFeatureModelPath());

		//Codify Domain Models

		StringBuilder domainModels = new StringBuilder();
		Map<String,String> domainModelsFiles = this.getDomainModelsFiles();

		for ( String key : domainModelsFiles.keySet() ) {
			String domainModelPath = domainModelsFiles.get(key);
			domainModels.append(key + "@" + domainModelPath);
			domainModels.append(",");
		}

		//domainModels.deleteCharAt(domainModels.length());	
		props.setProperty("DomainModels",domainModels.toString());

		//Codify Source Container

		StringBuilder sourceContainers = new StringBuilder();
		Set<String> sourceContainersSet = this.getSourceContainers();

		for ( String sourceContainer : sourceContainersSet ) {
			sourceContainers.append(sourceContainer);
			sourceContainers.append(",");
		}

		//sourceContainers.deleteCharAt(sourceContainers.length());
		props.setProperty("SourceContainers",sourceContainers.toString());

		//Codify Resource Containers

		StringBuilder resourceContainers = new StringBuilder();
		Set<String> resourceContainersSet = this.getResourceContainers();

		for ( String resourceContainer : resourceContainersSet ) {
			resourceContainers.append(resourceContainer);
			resourceContainers.append(",");
		}

		//resourceContainers.deleteCharAt(resourceContainers.length());
		props.setProperty("ResourceContainers",resourceContainers.toString());

		//Codify Importing XML Files

		StringBuilder importingXMLFiles = new StringBuilder();
		Set<String> importingXMLFilesSet = this.importingXMLFiles;

		for ( String importingXMLFile : importingXMLFilesSet ) {
			importingXMLFiles.append(importingXMLFile);
			importingXMLFiles.append(",");
		}

		//,importingXMLFiles.deleteCharAt(importingXMLFiles.length());
		props.setProperty("ImportingXMLFiles",importingXMLFiles.toString());

		try {		
			PipedInputStream inStream = new PipedInputStream();
			PipedOutputStream outStream = new PipedOutputStream(inStream);
						
			props.store(outStream,"");
			outStream.flush();
			outStream.close();
			
			if ( configurationFile != null ) {
				try {
					if ( this.configurationFile.exists() ) {
						this.configurationFile.setContents(inStream,IFile.FORCE,monitor);
					} else {					
						this.configurationFile.create(inStream,true,monitor);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*PipedOutputStream outStream = new PipedOutputStream();
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
		}*/

		monitor.worked(1);
	}

	private String implementationModelPath = "";
	private String configurationModelPath = "";
	private String featureModelPath = "";
	private String classExtension = "java";
	private String interfaceExtension = "java";
	private String aspectExtension = "aj";
	private String templateExtension = "xpt";
	private Set<String> sourceContainers = new TreeSet<String>();
	private Set<String> resourceContainers = new TreeSet<String>();
	private Map<String,String> domainModelsFiles = new HashMap<String,String>();
	private Set<String> importingXMLFiles = new TreeSet<String>();

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

	public Set<String> getImportingXMLFiles() {
		return importingXMLFiles;
	}

	public void setImportingXMLFiles(Set<String> importingXMLFiles) {
		this.importingXMLFiles = importingXMLFiles;
	}
}