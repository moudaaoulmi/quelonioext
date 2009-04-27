/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.mas.impl;

import br.pucrio.inf.les.genarch.extension.mas.Agent;
import br.pucrio.inf.les.genarch.extension.mas.Belief;
import br.pucrio.inf.les.genarch.extension.mas.Capability;
import br.pucrio.inf.les.genarch.extension.mas.Event;
import br.pucrio.inf.les.genarch.extension.mas.Expression;
import br.pucrio.inf.les.genarch.extension.mas.Goal;
import br.pucrio.inf.les.genarch.extension.mas.MasPackage;
import br.pucrio.inf.les.genarch.extension.mas.Plan;

import br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurableElementImpl;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.TemplatesImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl#getAssociatedTemplates <em>Associated Templates</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl#getBelieves <em>Believes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends ConfigurableElementImpl implements Agent {
	/**
	 * The cached value of the '{@link #getAssociatedTemplates() <em>Associated Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationTemplate> associatedTemplates;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getBelieves() <em>Believes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelieves()
	 * @generated
	 * @ordered
	 */
	protected EList<Belief> believes;

	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> plans;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationTemplate> getAssociatedTemplates() {
		if (associatedTemplates == null) {
			associatedTemplates = new EObjectContainmentEList<ImplementationTemplate>(ImplementationTemplate.class, this, MasPackage.AGENT__ASSOCIATED_TEMPLATES);
		}
		return associatedTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, MasPackage.AGENT__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, MasPackage.AGENT__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Belief> getBelieves() {
		if (believes == null) {
			believes = new EObjectContainmentEList<Belief>(Belief.class, this, MasPackage.AGENT__BELIEVES);
		}
		return believes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getPlans() {
		if (plans == null) {
			plans = new EObjectContainmentEList<Plan>(Plan.class, this, MasPackage.AGENT__PLANS);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, MasPackage.AGENT__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, MasPackage.AGENT__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MasPackage.AGENT__ASSOCIATED_TEMPLATES:
				return ((InternalEList<?>)getAssociatedTemplates()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__BELIEVES:
				return ((InternalEList<?>)getBelieves()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__PLANS:
				return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MasPackage.AGENT__ASSOCIATED_TEMPLATES:
				return getAssociatedTemplates();
			case MasPackage.AGENT__CAPABILITIES:
				return getCapabilities();
			case MasPackage.AGENT__GOALS:
				return getGoals();
			case MasPackage.AGENT__BELIEVES:
				return getBelieves();
			case MasPackage.AGENT__PLANS:
				return getPlans();
			case MasPackage.AGENT__EVENTS:
				return getEvents();
			case MasPackage.AGENT__EXPRESSIONS:
				return getExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MasPackage.AGENT__ASSOCIATED_TEMPLATES:
				getAssociatedTemplates().clear();
				getAssociatedTemplates().addAll((Collection<? extends ImplementationTemplate>)newValue);
				return;
			case MasPackage.AGENT__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case MasPackage.AGENT__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case MasPackage.AGENT__BELIEVES:
				getBelieves().clear();
				getBelieves().addAll((Collection<? extends Belief>)newValue);
				return;
			case MasPackage.AGENT__PLANS:
				getPlans().clear();
				getPlans().addAll((Collection<? extends Plan>)newValue);
				return;
			case MasPackage.AGENT__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case MasPackage.AGENT__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MasPackage.AGENT__ASSOCIATED_TEMPLATES:
				getAssociatedTemplates().clear();
				return;
			case MasPackage.AGENT__CAPABILITIES:
				getCapabilities().clear();
				return;
			case MasPackage.AGENT__GOALS:
				getGoals().clear();
				return;
			case MasPackage.AGENT__BELIEVES:
				getBelieves().clear();
				return;
			case MasPackage.AGENT__PLANS:
				getPlans().clear();
				return;
			case MasPackage.AGENT__EVENTS:
				getEvents().clear();
				return;
			case MasPackage.AGENT__EXPRESSIONS:
				getExpressions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MasPackage.AGENT__ASSOCIATED_TEMPLATES:
				return associatedTemplates != null && !associatedTemplates.isEmpty();
			case MasPackage.AGENT__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case MasPackage.AGENT__GOALS:
				return goals != null && !goals.isEmpty();
			case MasPackage.AGENT__BELIEVES:
				return believes != null && !believes.isEmpty();
			case MasPackage.AGENT__PLANS:
				return plans != null && !plans.isEmpty();
			case MasPackage.AGENT__EVENTS:
				return events != null && !events.isEmpty();
			case MasPackage.AGENT__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TemplatesImpl.class) {
			switch (derivedFeatureID) {
				case MasPackage.AGENT__ASSOCIATED_TEMPLATES: return DsamtypesPackage.TEMPLATES_IMPL__ASSOCIATED_TEMPLATES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TemplatesImpl.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.TEMPLATES_IMPL__ASSOCIATED_TEMPLATES: return MasPackage.AGENT__ASSOCIATED_TEMPLATES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AgentImpl
