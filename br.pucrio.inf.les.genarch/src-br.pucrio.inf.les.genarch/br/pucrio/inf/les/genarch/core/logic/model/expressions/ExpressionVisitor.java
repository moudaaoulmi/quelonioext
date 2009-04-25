package br.pucrio.inf.les.genarch.core.logic.model.expressions;

import choco.kernel.model.constraints.Constraint;
import br.pucrio.inf.les.genarch.core.logic.model.IFeature;

public abstract class ExpressionVisitor {

	public abstract Constraint visitIFeature(IFeature feature);

	public abstract Constraint visitAndExpression(AndExpression andExpression);

	public abstract Constraint visitOrExpression(OrExpression orExpression);

	public abstract Constraint visitNotExpression(NotExpression notExpression);
}
