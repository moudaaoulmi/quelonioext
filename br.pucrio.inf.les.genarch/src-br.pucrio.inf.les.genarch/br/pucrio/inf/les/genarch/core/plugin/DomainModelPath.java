package br.pucrio.inf.les.genarch.core.plugin;

import org.eclipse.core.runtime.IPath;

public class DomainModelPath implements IDomainModelPath {
	
	private String domainModelName;
	private IPath domainModelFilePath;
	
	public String getDomainModelName() {
		return domainModelName;
	}
	
	public void setDomainModelName(String domainModelName) {
		this.domainModelName = domainModelName;
	}
	
	public IPath getDomainModelFilePath() {
		return domainModelFilePath;
	}
	
	public void setDomainModelFilePath(IPath domainModelFilePath) {
		this.domainModelFilePath = domainModelFilePath;
	}
}
