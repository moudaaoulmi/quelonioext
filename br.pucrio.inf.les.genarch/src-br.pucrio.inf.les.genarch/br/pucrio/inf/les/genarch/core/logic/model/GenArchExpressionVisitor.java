package br.pucrio.inf.les.genarch.core.logic.model;

import org.eclipse.emf.common.util.TreeIterator;

import br.pucrio.inf.les.genarch.core.logic.model.expressions.AndExpression;
import br.pucrio.inf.les.genarch.core.logic.model.expressions.ExpressionVisitor;
import br.pucrio.inf.les.genarch.core.logic.model.expressions.NotExpression;
import br.pucrio.inf.les.genarch.core.logic.model.expressions.OrExpression;
import br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import choco.kernel.model.constraints.Constraint;


public class GenArchExpressionVisitor extends ExpressionVisitor {
	
	private StringBuilder expressionBuilder;
	private ProductFeaturesConfiguration productFeaturesConfiguration;
	
	public GenArchExpressionVisitor(ProductFeaturesConfiguration productFeaturesConfiguration) {
		 this.expressionBuilder = new StringBuilder();
		 this.productFeaturesConfiguration = productFeaturesConfiguration;
	}

	@Override
	public Constraint visitAndExpression(AndExpression andExpression) {
		expressionBuilder.append("(");
		andExpression.getLhs().accept(this);
		expressionBuilder.append(" && ");
		andExpression.getRhs().accept(this);
		expressionBuilder.append(")");
		return null;
	}

	@Override
	public Constraint visitIFeature(IFeature feature) {
		ProductFeatureConfiguration productFeature = findProductFeatureWithName(feature.getName());

		if ( productFeature != null ) {
			if ( productFeature.isIsSelected() ) {
				expressionBuilder.append("true");
			} else {
				expressionBuilder.append("false");
			}
		} else {
			expressionBuilder.append("false");			
		}
		
		return null;
	}

	@Override
	public Constraint visitNotExpression(NotExpression notExpression) {
		expressionBuilder.append("!");
		expressionBuilder.append("(");
		notExpression.getExp().accept(this);		
		expressionBuilder.append(")");
		return null;
	}

	@Override
	public Constraint visitOrExpression(OrExpression orExpression) {
		expressionBuilder.append("(");
		orExpression.getLhs().accept(this);
		expressionBuilder.append(" || ");
		orExpression.getRhs().accept(this);
		expressionBuilder.append(")");		
		return null;
	}
	
	private ProductFeatureConfiguration findProductFeatureWithName(String name) {
		TreeIterator iterator = this.productFeaturesConfiguration.eAllContents();
		
		while ( iterator.hasNext() ) {
			ProductFeatureConfiguration productFeatureConfiguration = (ProductFeatureConfiguration)iterator.next();
			
			if ( productFeatureConfiguration.getName().equals(name) ) {
				return productFeatureConfiguration;
			}
		}
		
		return null;
	}
	
	public String getExpression() {
		return expressionBuilder.toString();
	}

}
