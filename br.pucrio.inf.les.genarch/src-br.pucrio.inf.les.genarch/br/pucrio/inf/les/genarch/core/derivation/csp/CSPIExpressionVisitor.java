package br.pucrio.inf.les.genarch.core.derivation.csp;

import static choco.Choco.and;
import static choco.Choco.eq;
import static choco.Choco.not;
import static choco.Choco.or;

import java.util.Map;

import br.pucrio.inf.les.genarch.core.logic.model.IFeature;
import br.pucrio.inf.les.genarch.core.logic.model.expressions.AndExpression;
import br.pucrio.inf.les.genarch.core.logic.model.expressions.ExpressionVisitor;
import br.pucrio.inf.les.genarch.core.logic.model.expressions.NotExpression;
import br.pucrio.inf.les.genarch.core.logic.model.expressions.OrExpression;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;

public class CSPIExpressionVisitor extends ExpressionVisitor {
		
	private Map<String,IntegerVariable> modelVariables = null;
	private IntegerVariable sel = null;
	
	public CSPIExpressionVisitor(Map<String,IntegerVariable> featureModelVariables,IntegerVariable sel) {
		this.modelVariables = featureModelVariables;
		this.sel = sel;
	}

	@Override
	public Constraint visitAndExpression(AndExpression andExpression) {
		return and(andExpression.getLhs().accept(this),andExpression.getRhs().accept(this));
	}

	@Override
	public Constraint visitIFeature(IFeature feature) {	
		IntegerVariable variable = modelVariables.get(feature.getName());	
		return eq(variable,sel);
	}

	@Override
	public Constraint visitNotExpression(NotExpression notExpression) {
		return not(notExpression.getExp().accept(this));
	}

	@Override
	public Constraint visitOrExpression(OrExpression orExpression) {
		return or(orExpression.getLhs().accept(this),orExpression.getRhs().accept(this));
	}	
}
