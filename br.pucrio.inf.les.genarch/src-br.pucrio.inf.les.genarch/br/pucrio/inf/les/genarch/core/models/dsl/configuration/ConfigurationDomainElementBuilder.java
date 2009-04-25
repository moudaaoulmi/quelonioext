package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.configuration.FeatureExpression;
import br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationPackageImpl;

public class ConfigurationDomainElementBuilder {
	
	private final DSMElement configurationDomainElement;
	
	private ConfigurationDomainElementBuilder() {
		configurationDomainElement = ConfigurationPackageImpl.eINSTANCE.getConfigurationFactory().createDSMElement();
	}
	
	public DSMElement build() {
		return configurationDomainElement;
	}
	
	public static ConfigurationDomainElementBuilder configurationClass() {		
		return new ConfigurationDomainElementBuilder();
	}
	
	public ConfigurationDomainElementBuilder name(String name) {
		configurationDomainElement.setName(name);
		return this;
	}
	
	public ConfigurationDomainElementBuilder type(String type) {
		configurationDomainElement.setType(type);
		return this;
	}
	
	public ConfigurationDomainElementBuilder imageURI(String uri) {
		configurationDomainElement.setImageURI(uri);
		return this;
	}
		
	public ConfigurationDomainElementBuilder featureExpression(String featureExpression) {
		FeatureExpression expression = ConfigurationPackageImpl.eINSTANCE.getConfigurationFactory().createFeatureExpression();
		expression.setExpression(featureExpression);
		configurationDomainElement.setFeatureExpression(expression);
		return this;
	}

}
