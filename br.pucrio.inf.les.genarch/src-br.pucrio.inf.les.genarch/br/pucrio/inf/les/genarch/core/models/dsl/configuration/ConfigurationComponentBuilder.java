package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationAspect;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationClass;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;
import br.pucrio.inf.les.genarch.models.configuration.FeatureExpression;
import br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationPackageImpl;

public class ConfigurationComponentBuilder {
	
	private ConfigurationComponent configurationComponent;
	
	private ConfigurationComponentBuilder() {
		this.configurationComponent = ConfigurationPackageImpl.eINSTANCE.getConfigurationFactory().createConfigurationComponent();
	}
	
	public ConfigurationComponent build() {
		return this.configurationComponent;
	}
	
	public static ConfigurationComponentBuilder configurationComponent() {
		return new ConfigurationComponentBuilder();
	}
	
	public ConfigurationComponentBuilder name(String name) {
		this.configurationComponent.setName(name);
		return this;
	}
	
	public ConfigurationComponentBuilder path(String path) {
		this.configurationComponent.setPath(path);
		return this;
	}
	
	public ConfigurationComponentBuilder addClass(ConfigurationClass configurationClass) {
		this.configurationComponent.getClasses().add(configurationClass);
		return this;
	}
	
	public ConfigurationComponentBuilder addAspect(ConfigurationAspect configurationAspect) {
		this.configurationComponent.getAspects().add(configurationAspect);
		return this;
	}
	
	public ConfigurationComponentBuilder addFile(ConfigurationFile configurationFile) {
		this.configurationComponent.getFiles().add(configurationFile);
		return this;
	}
	
	public ConfigurationComponentBuilder addTemplate(ConfigurationTemplate configurationTemplate) {
		this.configurationComponent.getTemplates().add(configurationTemplate);
		return this;
	}
	
	public ConfigurationComponentBuilder addSubComponents(ConfigurationComponent configurationComponent) {
		this.configurationComponent.getSubComponents().add(configurationComponent);
		return this;
	}
	
	public ConfigurationComponentBuilder featureExpression(String featureExpression) {
		FeatureExpression expression = ConfigurationPackageImpl.eINSTANCE.getConfigurationFactory().createFeatureExpression();
		expression.setExpression(featureExpression);
		configurationComponent.setFeatureExpression(expression);
		return this;
	}

}
