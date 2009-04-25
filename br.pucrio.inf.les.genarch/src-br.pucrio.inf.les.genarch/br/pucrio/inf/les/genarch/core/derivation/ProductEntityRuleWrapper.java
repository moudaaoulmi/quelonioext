package br.pucrio.inf.les.genarch.core.derivation;

import br.pucrio.inf.les.genarch.models.product.ProductEntity;

public class ProductEntityRuleWrapper {
	
	private String path;
	private ProductEntity productEntity;
	
	public ProductEntityRuleWrapper(ProductEntity productEntity) {
		this.productEntity = productEntity;
		this.path = productEntity.getPath();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity implementationEntity) {
		this.productEntity = productEntity;
	}
	
	public void addEntity() {
		
	}
}
