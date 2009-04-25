package br.pucrio.inf.les.genarch.models.configuration.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import br.pucrio.inf.les.genarch.models.configuration.DSL;
import br.pucrio.inf.les.genarch.models.configuration.EElement;

public class ConfigurationAdapterFactoryContentProvider extends AdapterFactoryContentProvider {


	public ConfigurationAdapterFactoryContentProvider(AdapterFactory arg0) {
		super(arg0);
	}

	public Object[] getElements(Object object) {
		DSL mappingDSL = (DSL)object;
		TreeIterator iterator = mappingDSL.eAllContents();

		List elements = new ArrayList();

		while ( iterator.hasNext() ) {
			Object element = iterator.next(); 
			if ( element instanceof EElement ) {
				EElement eelement = (EElement)element;
				if ( eelement.getFeatureExpression() != null ) {	
					elements.add(element);
				}
			}
		}

		return elements.toArray();

	}
}
