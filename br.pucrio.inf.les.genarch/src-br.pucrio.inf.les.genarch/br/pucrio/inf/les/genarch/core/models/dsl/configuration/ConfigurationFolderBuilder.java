package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFolder;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;
import br.pucrio.inf.les.genarch.models.configuration.FeatureExpression;
import br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationPackageImpl;

public class ConfigurationFolderBuilder {
	
	private ConfigurationFolder configurationFolder;
	
	private ConfigurationFolderBuilder() {
		this.configurationFolder = ConfigurationPackageImpl.eINSTANCE.getConfigurationFactory().createConfigurationFolder();	
	}
	
	public static ConfigurationFolderBuilder configurationFolder() {
		return new ConfigurationFolderBuilder();		
	}
	
	public ConfigurationFolder build() {
		return configurationFolder;
	}
	
	public ConfigurationFolderBuilder name(String name) {
		this.configurationFolder.setName(name);
		return this;
	}
	
	public ConfigurationFolderBuilder path(String path) {
		this.configurationFolder.setPath(path);
		return this;
	}
	
	public ConfigurationFolderBuilder addFile(ConfigurationFile configurationFile) {
		this.configurationFolder.getFiles().add(configurationFile);
		return this;
	}
	
	public ConfigurationFolderBuilder addTemplate(ConfigurationTemplate configurationTemplate) {
		this.configurationFolder.getTemplates().add(configurationTemplate);
		return this;
	}
	
	public ConfigurationFolderBuilder addSubFolder(ConfigurationFolder configurationFolder) {
		this.configurationFolder.getSubFolders().add(configurationFolder);
		return this;
	}
	
	public ConfigurationFolderBuilder featureExpression(String featureExpression) {
		FeatureExpression expression = ConfigurationPackageImpl.eINSTANCE.getConfigurationFactory().createFeatureExpression();
		expression.setExpression(featureExpression);
		configurationFolder.setFeatureExpression(expression);
		return this;
	}

}
