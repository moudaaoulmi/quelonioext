package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;


public class ConfigurationModelIterator {
	
	private ConfigurationModel configurationModel;
	private TreeIterator<EObject> iterator;
	
	public ConfigurationModelIterator(ConfigurationModel configurationModel) {
		this.configurationModel = configurationModel;
		this.iterator = configurationModel.getMappingRelationships().eAllContents();
	}
	
	public boolean hasNext() {
		return iterator.hasNext();
	}
	
	public EObject next() {
		return iterator.next();
	}
	
	public void reset() {
		this.iterator = configurationModel.getMappingRelationships().eAllContents();
	}

}
