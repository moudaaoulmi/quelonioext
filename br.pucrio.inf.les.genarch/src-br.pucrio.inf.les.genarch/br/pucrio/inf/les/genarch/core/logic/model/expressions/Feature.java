package br.pucrio.inf.les.genarch.core.logic.model.expressions;

import java.util.List;

import choco.kernel.model.constraints.Constraint;

import br.pucrio.inf.les.genarch.core.logic.model.IFeature;

public class Feature implements IFeature {

	private String name;

	public Feature(String name) {
		this.name = name;
	}

	public List<IFeature> getChildren() {
		return null;
	}

	public String getName() {
		return this.name;
	}

	public IFeature getParent() {
		return null;
	}

	public FeatureType getType() {
		return null;
	}

	public void setParent(IFeature parent) {
	}

	public void setType(FeatureType parameterType) {
	}

	public Constraint accept(ExpressionVisitor visitor) {
		return visitor.visitIFeature(this);
	}

	public String getCode() {
		return this.name;
	}
}
