package br.pucrio.inf.les.genarch.core.derivation;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.core.plugin.DomainModelDescription;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModel;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;

public class ProcessDomainModel {

	public static ProductDomainModel process(DomainModelDescription domainModelDescription,EObject root,DSM dsm,ProductFeaturesConfiguration productFeaturesConfiguration) {
		ProductDomainModel productDomainModel = ProductPackage.eINSTANCE.getProductFactory().createProductDomainModel();
		productDomainModel.setName(domainModelDescription.getReferenceName());
		productDomainModel.setElements(new HashMap<String, EObject>());

		TreeIterator<?> iterator = root.eAllContents();

		while ( iterator.hasNext() ) {
			EObject obj = (EObject)iterator.next();
			if ( obj instanceof DomainElement ) {
				DomainElement de = (DomainElement)obj;
				String elementName = de.getName();												
				productDomainModel.getElements().put(elementName,de);
			}					
		}

		return productDomainModel;
	}
	
	private static boolean bePart(String name,DSM dsm) {
		EList<DSMElement> elements = dsm.getElements();
		
		for ( DSMElement element : elements ) {
			if ( element.getName().equals(name) ) {
				return false;
			}
		}
		
		return true;
	}
}
