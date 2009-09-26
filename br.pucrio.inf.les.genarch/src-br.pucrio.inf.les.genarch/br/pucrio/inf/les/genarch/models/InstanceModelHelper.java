package br.pucrio.inf.les.genarch.models;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import br.pucrio.inf.les.genarch.models.product.ProductContainer;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModel;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModels;
import br.pucrio.inf.les.genarch.models.product.ProductEntity;
import br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFragment;
import br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer;

public class InstanceModelHelper {

	public static ProductFeatureConfiguration feature(Object name,Object model) {
		String sName = (String)name;
		
		ProductFeaturesConfiguration productFeaturesConfiguration = (ProductFeaturesConfiguration)model;
		TreeIterator iterator = productFeaturesConfiguration.eAllContents();
		
		while ( iterator.hasNext() ) {
			Object o = iterator.next();
			
			if ( o instanceof ProductFeatureConfiguration ) {
				ProductFeatureConfiguration e = (ProductFeatureConfiguration)o;
				
				if ( e.getName().equals(sName) ) {
					return e;
				}
			}
		}
		
		return null;
	}

	public static List featureConfigurations(Object name,Object model) {		
		String sName = (String)name;
		ProductFeaturesConfiguration productFeaturesConfiguration = (ProductFeaturesConfiguration)model;

		List configuration = new ArrayList();

		TreeIterator iterator = productFeaturesConfiguration.eAllContents();

		while ( iterator.hasNext() ) {
			Object o = iterator.next();

			if ( o instanceof ProductFeatureConfiguration ) {
				ProductFeatureConfiguration f = (ProductFeatureConfiguration)o;
				if ( f.getName().equals(sName) ) {
					configuration.add(f);
				}
			}
		}

		return configuration;
	}

	public static ProductEntity implementationElement(Object name,Object model) {		
		String sName = (String)name;
		
		ProductImplementationElements architectureInstance = (ProductImplementationElements)model;
		TreeIterator iterator = architectureInstance.eAllContents();
		
		while ( iterator.hasNext() ) {
			Object o = iterator.next();
			
			if ( o instanceof ProductEntity ) {
				ProductEntity e = (ProductEntity)o;
				
				if ( e.getPath().equals(sName) ) {
					return e;
				}
			}
		}
		
		return ProductPackage.eINSTANCE.getProductFactory().createProductEntity();
	}
	
	public static ProductFragment fragment(Object name,Object model) {
		String sName = (String)name;
		
		ProductImplementationElements architectureInstance = (ProductImplementationElements)model;
		TreeIterator iterator = architectureInstance.eAllContents();
		
		while ( iterator.hasNext() ) {
			Object o = iterator.next();
			
			if ( o instanceof ProductFragment ) {
				ProductFragment e = (ProductFragment)o;
				
				if ( e.getPath().equals(sName) ) {
					return e;
				}
			}
		}
		
		return ProductPackage.eINSTANCE.getProductFactory().createProductFragment();
	}
	
	public static ProductFragmentContainer fragmentsContainer(Object name,Object model) {
		String sName = (String)name;
		
		ProductImplementationElements architectureInstance = (ProductImplementationElements)model;
		TreeIterator iterator = architectureInstance.eAllContents();
		
		while ( iterator.hasNext() ) {
			Object o = iterator.next();
			
			if ( o instanceof ProductFragmentContainer ) {
				ProductFragmentContainer e = (ProductFragmentContainer)o;
				
				if ( e.getName().equals(sName) ) {
					return e;
				}
			}
		}
		
		return null;
	}
	
	public static ProductContainer container(Object name,Object model) {
		String sName = (String)name;
		
		ProductImplementationElements architectureInstance = (ProductImplementationElements)model;
		EList containers = architectureInstance.getContainers();
		
		for ( int x = 0; x < containers.size(); x++ ) {
			ProductContainer container = (ProductContainer)containers.get(x);
			
			if ( container.getName().equals(sName) ) {
				return container;
			}
		}
		
		return null;
	}
	
	public static ProductResourcesContainer resourceContainer(Object name,Object model) {
		String sName = (String)name;
		
		ProductImplementationElements architectureInstance = (ProductImplementationElements)model;
		EList resourceContainers = architectureInstance.getResourceContainers();
		
		for ( int x = 0; x < resourceContainers.size(); x++ ) {
			ProductResourcesContainer resourceContainer = (ProductResourcesContainer)resourceContainers.get(x);
			
			if ( resourceContainer.getName().equals(sName) ) {
				return resourceContainer;
			}
		}
		
		return null;
	}
	
	public static Object domainElement(Object name,Object domainModelName,Object model) {
		String sName = (String)name;
		String sDomainModelName = (String)domainModelName;
		
		ProductDomainModels domainModels = (ProductDomainModels)model;
		EList models = domainModels.getDomainModel();
		
		for ( int x = 0; x < models.size(); x++ ) {
			ProductDomainModel domainModel = (ProductDomainModel)models.get(x);
			
			if ( domainModel.getName().equals(sDomainModelName) ) {
				return domainModel.getElements().get(name);
			}				
		}
		
		return null;
	}
	
	public static Object domainModelElement(Object domainName,Object name,Object model) {
		ProductDomainModels productDomainModels = (ProductDomainModels)model;
		
		for ( ProductDomainModel productDomainModel : productDomainModels.getDomainModel() ) {
			
			if ( productDomainModel.getName().equals(domainName) ) {
				return productDomainModel.getElements().get(name);
			}
		}
		
		return null;
	}

}