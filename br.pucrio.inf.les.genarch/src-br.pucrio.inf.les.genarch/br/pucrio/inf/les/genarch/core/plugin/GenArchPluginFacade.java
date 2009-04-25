package br.pucrio.inf.les.genarch.core.plugin;

import java.util.ArrayList;
import java.util.List;

import br.pucrio.inf.les.genarch.core.extension.IDomainModelExtractor;
import br.pucrio.inf.les.genarch.core.extension.IPostProcessor;
import br.pucrio.inf.les.genarch.core.extension.IPreProcessor;

public class GenArchPluginFacade {
	
	private static GenArchPluginFacade instance;
	
	private GenArchPluginFacade() {
		this.domainModelDescriptions = new ArrayList<DomainModelDescription>();
		this.domainModelExtractors = new ArrayList<IDomainModelExtractor>();
		this.postProcessors = new ArrayList<IPostProcessor>();
		this.preProcessors = new ArrayList<IPreProcessor>();
	}
	
	public static GenArchPluginFacade Instance() {
		
		if ( instance == null ) {
			instance = new GenArchPluginFacade();
		}
		
		return instance;
	}
	
	private List<IDomainModelExtractor> domainModelExtractors;
	
	private List<IPostProcessor> postProcessors;
	
	private List<IPreProcessor> preProcessors;
	
	private List<DomainModelDescription> domainModelDescriptions;
	
	public void addDomainModelExtractor(IDomainModelExtractor domainModelExtractor) {
		domainModelExtractors.add(domainModelExtractor);
	}
	
	public void addPostProcessor(IPostProcessor postProcessor) {
		postProcessors.add(postProcessor);
	}
	
	public void addPreProcessor(IPreProcessor preProcessor) {
		preProcessors.add(preProcessor);
	}
	
	public void addDomainModel(DomainModelDescription domainModelDescription) {
		domainModelDescriptions.add(domainModelDescription);
	}

	public List<IDomainModelExtractor> getDomainModelExtractors() {
		return domainModelExtractors;
	}

	public List<IPostProcessor> getPostProcessors() {
		return postProcessors;
	}

	public List<IPreProcessor> getPreProcessors() {
		return preProcessors;
	}

	public List<DomainModelDescription> getDomainModelDescriptions() {
		return domainModelDescriptions;
	}
}
