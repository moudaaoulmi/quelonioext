/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.mas.impl;

import br.pucrio.inf.les.genarch.extension.mas.Belief;
import br.pucrio.inf.les.genarch.extension.mas.Capability;
import br.pucrio.inf.les.genarch.extension.mas.Event;
import br.pucrio.inf.les.genarch.extension.mas.Expression;
import br.pucrio.inf.les.genarch.extension.mas.Goal;
import br.pucrio.inf.les.genarch.extension.mas.MasPackage;
import br.pucrio.inf.les.genarch.extension.mas.Plan;

import br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurableElementImpl;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.FragmentsImpl;
import br.pucrio.inf.les.genarch.models.dsamtypes.TemplatesImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
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
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getAssociatedTemplates <em>Associated Templates</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getAssociatedFragments <em>Associated Fragments</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getBelieves <em>Believes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends ConfigurableElementImpl implements Capability {
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
	 * The cached value of the '{@link #getAssociatedFragments() <em>Associated Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationFragment> associatedFragments;

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
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationTemplate> getAssociatedTemplates() {
		if (associatedTemplates == null) {
			associatedTemplates = new EObjectContainmentEList<ImplementationTemplate>(ImplementationTemplate.class, this, MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES);
		}
		return associatedTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFragment> getAssociatedFragments() {
		if (associatedFragments == null) {
			associatedFragments = new EObjectContainmentEList<ImplementationFragment>(ImplementationFragment.class, this, MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS);
		}
		return associatedFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, MasPackage.CAPABILITY__GOALS);
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
			believes = new EObjectContainmentEList<Belief>(Belief.class, this, MasPackage.CAPABILITY__BELIEVES);
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
			plans = new EObjectContainmentEList<Plan>(Plan.class, this, MasPackage.CAPABILITY__PLANS);
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
			events = new EObjectContainmentEList<Event>(Event.class, this, MasPackage.CAPABILITY__EVENTS);
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
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, MasPackage.CAPABILITY__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, MasPackage.CAPABILITY__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES:
				return ((InternalEList<?>)getAssociatedTemplates()).basicRemove(otherEnd, msgs);
			case MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS:
				return ((InternalEList<?>)getAssociatedFragments()).basicRemove(otherEnd, msgs);
			case MasPackage.CAPABILITY__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case MasPackage.CAPABILITY__BELIEVES:
				return ((InternalEList<?>)getBelieves()).basicRemove(otherEnd, msgs);
			case MasPackage.CAPABILITY__PLANS:
				return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
			case MasPackage.CAPABILITY__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case MasPackage.CAPABILITY__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
			case MasPackage.CAPABILITY__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES:
				return getAssociatedTemplates();
			case MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS:
				return getAssociatedFragments();
			case MasPackage.CAPABILITY__GOALS:
				return getGoals();
			case MasPackage.CAPABILITY__BELIEVES:
				return getBelieves();
			case MasPackage.CAPABILITY__PLANS:
				return getPlans();
			case MasPackage.CAPABILITY__EVENTS:
				return getEvents();
			case MasPackage.CAPABILITY__EXPRESSIONS:
				return getExpressions();
			case MasPackage.CAPABILITY__CAPABILITIES:
				return getCapabilities();
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
			case MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES:
				getAssociatedTemplates().clear();
				getAssociatedTemplates().addAll((Collection<? extends ImplementationTemplate>)newValue);
				return;
			case MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS:
				getAssociatedFragments().clear();
				getAssociatedFragments().addAll((Collection<? extends ImplementationFragment>)newValue);
				return;
			case MasPackage.CAPABILITY__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case MasPackage.CAPABILITY__BELIEVES:
				getBelieves().clear();
				getBelieves().addAll((Collection<? extends Belief>)newValue);
				return;
			case MasPackage.CAPABILITY__PLANS:
				getPlans().clear();
				getPlans().addAll((Collection<? extends Plan>)newValue);
				return;
			case MasPackage.CAPABILITY__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case MasPackage.CAPABILITY__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
				return;
			case MasPackage.CAPABILITY__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
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
			case MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES:
				getAssociatedTemplates().clear();
				return;
			case MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS:
				getAssociatedFragments().clear();
				return;
			case MasPackage.CAPABILITY__GOALS:
				getGoals().clear();
				return;
			case MasPackage.CAPABILITY__BELIEVES:
				getBelieves().clear();
				return;
			case MasPackage.CAPABILITY__PLANS:
				getPlans().clear();
				return;
			case MasPackage.CAPABILITY__EVENTS:
				getEvents().clear();
				return;
			case MasPackage.CAPABILITY__EXPRESSIONS:
				getExpressions().clear();
				return;
			case MasPackage.CAPABILITY__CAPABILITIES:
				getCapabilities().clear();
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
			case MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES:
				return associatedTemplates != null && !associatedTemplates.isEmpty();
			case MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS:
				return associatedFragments != null && !associatedFragments.isEmpty();
			case MasPackage.CAPABILITY__GOALS:
				return goals != null && !goals.isEmpty();
			case MasPackage.CAPABILITY__BELIEVES:
				return believes != null && !believes.isEmpty();
			case MasPackage.CAPABILITY__PLANS:
				return plans != null && !plans.isEmpty();
			case MasPackage.CAPABILITY__EVENTS:
				return events != null && !events.isEmpty();
			case MasPackage.CAPABILITY__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case MasPackage.CAPABILITY__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
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
				case MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES: return DsamtypesPackage.TEMPLATES_IMPL__ASSOCIATED_TEMPLATES;
				default: return -1;
			}
		}
		if (baseClass == FragmentsImpl.class) {
			switch (derivedFeatureID) {
				case MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS: return DsamtypesPackage.FRAGMENTS_IMPL__ASSOCIATED_FRAGMENTS;
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
				case DsamtypesPackage.TEMPLATES_IMPL__ASSOCIATED_TEMPLATES: return MasPackage.CAPABILITY__ASSOCIATED_TEMPLATES;
				default: return -1;
			}
		}
		if (baseClass == FragmentsImpl.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.FRAGMENTS_IMPL__ASSOCIATED_FRAGMENTS: return MasPackage.CAPABILITY__ASSOCIATED_FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityImpl
