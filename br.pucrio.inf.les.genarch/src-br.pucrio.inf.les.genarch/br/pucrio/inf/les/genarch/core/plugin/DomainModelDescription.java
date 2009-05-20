package br.pucrio.inf.les.genarch.core.plugin;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;

import br.pucrio.inf.les.genarch.core.extension.IDomainModelExtractor;
import br.pucrio.inf.les.genarch.core.extension.IPostProcessor;
import br.pucrio.inf.les.genarch.core.extension.IPreProcessor;

public class DomainModelDescription {
	
	private String name;
	private String referenceName;
	private EPackage ePackageClass;
	private AdapterFactory itemProviderAdapertFactory;
	private List<ImportingMetadata> importingMetadas = new ArrayList<ImportingMetadata>();
	private List<IDomainModelExtractor> domainModelExtractors = new ArrayList<IDomainModelExtractor>();
	private List<IPostProcessor> postProcessors = new ArrayList<IPostProcessor>();
	private List<IPreProcessor> preProcessors = new ArrayList<IPreProcessor>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getReferenceName() {
		return referenceName;
	}
	
	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}
	
	public EPackage getEPackageClass() {
		return ePackageClass;
	}
	
	public void setEPackageClass(EPackage packageClass) {
		ePackageClass = packageClass;
	}

	public AdapterFactory getItemProviderAdapertFactory() {
		return itemProviderAdapertFactory;
	}

	public void setItemProviderAdapertFactory(
			AdapterFactory itemProviderAdapertFactory) {
		this.itemProviderAdapertFactory = itemProviderAdapertFactory;
	}

	public List<ImportingMetadata> getImportingMetadas() {
		return importingMetadas;
	}

	public void setImportingMetadas(List<ImportingMetadata> importingMetadas) {
		this.importingMetadas = importingMetadas;
	}

	public List<IDomainModelExtractor> getDomainModelExtractors() {
		return domainModelExtractors;
	}

	public void setDomainModelExtractors(
			List<IDomainModelExtractor> domainModelExtractors) {
		this.domainModelExtractors = domainModelExtractors;
	}

	public List<IPostProcessor> getPostProcessors() {
		return postProcessors;
	}

	public void setPostProcessors(List<IPostProcessor> postProcessors) {
		this.postProcessors = postProcessors;
	}

	public List<IPreProcessor> getPreProcessors() {
		return preProcessors;
	}

	public void setPreProcessors(List<IPreProcessor> preProcessors) {
		this.preProcessors = preProcessors;
	}
}
