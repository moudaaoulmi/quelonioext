package br.pucrio.inf.les.genarch.core.derivation;

import org.eclipse.emf.common.util.EList;

import br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FeatureGroup;
import ca.uwaterloo.gp.fmp.Project;
import ca.uwaterloo.gp.fmp.constraints.ModelToPropositionTranslator;
import ca.uwaterloo.gp.fmp.constraints.PropositionalFormula;
import ca.uwaterloo.gp.fmp.system.RoleQuery;

public class TransformFeatureModelConfiguration {

	public static ProductFeaturesConfiguration transform(Project fmpProject,int configurationIndex) {
		Feature model = fmpProject.getModel();

		EList modelChildren = model.getChildren();

		Feature modelChild = (Feature)modelChildren.get(0);
		EList modelChildConfs = modelChild.getConfs();
		
		ModelToPropositionTranslator modelToPropositionTranslator = new ModelToPropositionTranslator();
		PropositionalFormula propositionalFormula = modelToPropositionTranslator.translate(modelChild, true);
		
		System.out.println(propositionalFormula.getRules());

		Feature childConf = (Feature)modelChildConfs.get(configurationIndex);

		ProductFeaturesConfiguration productFeatureConfiguration = ProductPackage.eINSTANCE.getProductFactory().createProductFeaturesConfiguration();
		productFeatureConfiguration.setName(childConf.getName());

		if ( childConf.getTypedValue() != null ) {
			productFeatureConfiguration.setAttribute(childConf.getTypedValue().getStringValue());
		}

		for ( Object child : childConf.getChildren() ) {
			Feature fmpFeature = (Feature)child;
			productFeatureConfiguration.getFeatures().add(toFeature((Feature)child));
		}			
		return productFeatureConfiguration;
	}

	private static ProductFeatureConfiguration toFeature(Feature fmpFeature) {
		String name = fmpFeature.getName();
		String value = "";

		if ( fmpFeature.getTypedValue() != null ) {
			value = fmpFeature.getTypedValue().getValueToString();
		}

		int max = fmpFeature.getMax();
		int min = fmpFeature.getMin();

		ProductFeatureConfiguration featureConfiguration = ProductPackage.eINSTANCE.getProductFactory().createProductFeatureConfiguration();
		featureConfiguration.setName(name);
		featureConfiguration.setAttribute(value);
		featureConfiguration.setMax(max);
		featureConfiguration.setMin(min);

		boolean checked = true;

		if ( fmpFeature.isOptional() ) {			
			if ( (fmpFeature.getState().getValue() != 1) && (fmpFeature.getState().getValue() != 3) ) {
				checked = false;				
			}
		} 

		featureConfiguration.setIsSelected(checked);

		for ( Object child : fmpFeature.getChildren() ) {
			if ( child instanceof FeatureGroup ) {
				FeatureGroup group = (FeatureGroup)child;				
				for ( Object childGroup : group.getChildren() ) {
					toFeatureChild((Feature)childGroup,featureConfiguration);
				}
			} else {
				toFeatureChild((Feature)child,featureConfiguration);
			}			
		}

		return featureConfiguration;
	}

	private static void toFeatureChild(Feature fmpFeature,ProductFeatureConfiguration parentFeature) {
		boolean optional = false;

		if ( fmpFeature.isOptional() ) {			
			if ( (fmpFeature.getState().getValue() == 1) || (fmpFeature.getState().getValue() == 3) ) {
				optional = true;				
			}
		}
		String name = fmpFeature.getName();
		String value = "";

		if ( fmpFeature.getTypedValue() != null ) {
			value = fmpFeature.getTypedValue().getValueToString();
		}

		int max = fmpFeature.getMax();
		int min = fmpFeature.getMin();

		ProductFeatureConfiguration productFeatureConfiguration = ProductPackage.eINSTANCE.getProductFactory().createProductFeatureConfiguration();
		productFeatureConfiguration.setName(name);
		productFeatureConfiguration.setAttribute(value);
		productFeatureConfiguration.setMax(max);
		productFeatureConfiguration.setMin(min);
		productFeatureConfiguration.setIsSelected(optional); 

		for ( Object child : fmpFeature.getChildren() ) {
			if ( child instanceof FeatureGroup ) {
				FeatureGroup group = (FeatureGroup)child;				
				for ( Object childGroup : group.getChildren() ) {
					toFeatureChild((Feature)childGroup,productFeatureConfiguration);
				}
			} else {
				toFeatureChild((Feature)child,productFeatureConfiguration);
			}			
		}

		parentFeature.getFeatures().add(productFeatureConfiguration);

	}
}
