package br.pucrio.inf.les.genarch.core.plugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;

public class DomainModelDescription {
	
	private String name;
	private String referenceName;
	private EPackage ePackageClass;
	private AdapterFactory itemProviderAdapertFactory;
	
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
}
