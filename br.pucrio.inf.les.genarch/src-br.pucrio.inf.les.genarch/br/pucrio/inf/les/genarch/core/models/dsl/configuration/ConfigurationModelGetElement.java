package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.eclipse.emf.query.conditions.strings.StringValue;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationAspect;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationClass;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFolder;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragment;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragmentContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationResourcesContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.configuration.MappingEntity;

public class ConfigurationModelGetElement {

	private ConfigurationModel configurationModelHandle;

	public ConfigurationModelGetElement(ConfigurationModel architectureModelHandle) {
		this.configurationModelHandle = architectureModelHandle;
	}
	
	public MappingEntity mappingEntity(String path) {
		return element(path);
	}

	public ConfigurationComponent component(String path) {
		return (ConfigurationComponent)element(path);
	}

	public ConfigurationFolder folder(String path) {
		return (ConfigurationFolder)element(path);
	}

	public ConfigurationClass clazz(String path) {
		return (ConfigurationClass)element(path);
	}

	public ConfigurationAspect aspect(String path) {
		return (ConfigurationAspect)element(path);
	}

	public ConfigurationFile file(String path) {
		return (ConfigurationFile)element(path);
	}

	public ConfigurationTemplate template(String path) {
		return (ConfigurationTemplate)element(path);
	}

	public ConfigurationFragment fragment(String path) {
		return (ConfigurationFragment)element(path);
	}

	public DSMElement domainModelElement(String name,String domainModelName) {
		return getDomainElement(name, domainModelName);
	}

	public ConfigurationContainer sourceContainer(String name) {
		return (ConfigurationContainer)getContainer(name,ConfigurationPackage.eINSTANCE.getConfigurationContainer_Name());
	}

	public ConfigurationResourcesContainer resourceContainer(String name) {
		return (ConfigurationResourcesContainer)getContainer(name,ConfigurationPackage.eINSTANCE.getConfigurationResourcesContainer_Name());
	}

	public ConfigurationFragmentContainer fragmentContainer(String name) {
		return (ConfigurationFragmentContainer)getContainer(name,ConfigurationPackage.eINSTANCE.getConfigurationFragmentContainer_Name());
	}

	public DSM domainModel(String name) {
		return getDSM(name);
	}

	public MappingEntity element(String path) {
		IQueryResult result = new SELECT(
				new FROM(this.configurationModelHandle.getMappingRelationships()),
				new WHERE(new EObjectAttributeValueCondition(ConfigurationPackage.eINSTANCE.getMappingEntity_Path(),new StringValue(path)))).execute();
		
		Iterator<EObject> i = result.getEObjects().iterator();
		
		if ( !result.isEmpty() ) {
			return (MappingEntity)i.next();
		}
		
		return null;				
	}

	private EObject getContainer(String name,EAttribute attribute) {	
		IQueryResult result = new SELECT(
				new FROM(this.configurationModelHandle.getMappingRelationships()),
				new WHERE(new EObjectAttributeValueCondition(attribute, new StringValue(name)))).execute();
		
		Iterator<EObject> i = result.getEObjects().iterator();
		
		if ( !result.isEmpty() ) {
			return i.next();
		}
		
		return null;
	}

	private DSMElement getDomainElement(String name,String domainModelName) {
		DSM domainModel = getDSM(domainModelName);

		if ( domainModel != null ) {

			EList elements = domainModel.getElements();

			for ( int y = 0; y < elements.size(); y++ ) {
				DSMElement element = (DSMElement)elements.get(y);

				if ( element.getName().equals(name) ) {
					return element;
				}
			}
		}

		return null;
	}

	private DSM getDSM(String name) {
		EList domainModels = this.configurationModelHandle.getDSMMappings().getModels();

		for ( int x = 0; x < domainModels.size(); x++ ) {
			DSM domainModel = (DSM)domainModels.get(x);

			if ( domainModel.getName().equals(name) ) {
				return domainModel;
			}
		}

		return null;
	}
}