package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationAspect;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationClass;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFolder;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragment;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragmentContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationResourcesContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.configuration.MappingEntity;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;

public class ConfigurationModelGetElement {

	private ConfigurationModel configurationModelHandle;

	public ConfigurationModelGetElement(ConfigurationModel architectureModelHandle) {
		this.configurationModelHandle = architectureModelHandle;
	}
	
	public MappingEntity mappingEntity(String path) {
		return getElement(path);
	}

	public ConfigurationComponent component(String path) {
		return (ConfigurationComponent)getElement(path);
	}

	public ConfigurationFolder folder(String path) {
		return (ConfigurationFolder)getElement(path);
	}

	public ConfigurationClass clazz(String path) {
		return (ConfigurationClass)getElement(path);
	}

	public ConfigurationAspect aspect(String path) {
		return (ConfigurationAspect)getElement(path);
	}

	public ConfigurationFile file(String path) {
		return (ConfigurationFile)getElement(path);
	}

	public ConfigurationTemplate template(String path) {
		return (ConfigurationTemplate)getElement(path);
	}

	public ConfigurationFragment fragment(String path) {
		return (ConfigurationFragment)getElement(path);
	}

	public DSMElement domainModelElement(String name,String domainModelName) {
		return getDomainElement(name, domainModelName);
	}

	public ConfigurationContainer sourceContainer(String name) {
		return (ConfigurationContainer)getContainer(name);
	}

	public ConfigurationResourcesContainer resourceContainer(String name) {
		return (ConfigurationResourcesContainer)getContainer(name);
	}

	public ConfigurationFragmentContainer fragmentContainer(String name) {
		return (ConfigurationFragmentContainer)getContainer(name);
	}

	public DSM domainModel(String name) {
		return getDSM(name);
	}

	private MappingEntity getElement(String path) {
		MappingRelationships m = this.configurationModelHandle.getMappingRelationships();
		TreeIterator iterator = m.eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();

			if ( o instanceof MappingEntity ) {
				MappingEntity c = (MappingEntity)o;
				if ( c.getPath().equals(path) ) {
					return c;
				}
			}	   
		}

		return null;
	}

	private EObject getContainer(String name) {
		TreeIterator iterator = this.configurationModelHandle.getMappingRelationships().eAllContents();

		while ( iterator.hasNext() ) {
			EObject o = (EObject)iterator.next();

			if ( o instanceof ConfigurationContainer ) {
				ConfigurationContainer c = (ConfigurationContainer)o;
				if ( c.getName().equals(name) ) {
					return c;
				}
			} else if ( o instanceof ConfigurationResourcesContainer ) {
				ConfigurationResourcesContainer c = (ConfigurationResourcesContainer)o;
				if ( c.getName().equals(name) ) {
					return c;
				}
			} else if ( o instanceof ConfigurationFragmentContainer ) {
				ConfigurationFragmentContainer c = (ConfigurationFragmentContainer)o;
				if ( c.getName().equals(name) ) {
					return c;
				}
			}
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