/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas.impl;

import br.pucrio.inf.les.genarch.extension.dsam.mas.Agent;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Belief;
import br.pucrio.inf.les.genarch.extension.dsam.mas.CapabilityReference;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Event;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Expression;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Goal;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Plan;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.VariableElementImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
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
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getBelieves <em>Believes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.AgentImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends VariableElementImpl implements Agent {
	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationTemplate> templates;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationComponent> components;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationFile> files;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityReference> capabilities;

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
	public EList<ImplementationTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<ImplementationTemplate>(ImplementationTemplate.class, this, MasPackage.AGENT__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ImplementationComponent>(ImplementationComponent.class, this, MasPackage.AGENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<ImplementationFile>(ImplementationFile.class, this, MasPackage.AGENT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityReference> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<CapabilityReference>(CapabilityReference.class, this, MasPackage.AGENT__CAPABILITIES);
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
			case MasPackage.AGENT__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case MasPackage.AGENT__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
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
			case MasPackage.AGENT__TEMPLATES:
				return getTemplates();
			case MasPackage.AGENT__COMPONENTS:
				return getComponents();
			case MasPackage.AGENT__FILES:
				return getFiles();
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
			case MasPackage.AGENT__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends ImplementationTemplate>)newValue);
				return;
			case MasPackage.AGENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ImplementationComponent>)newValue);
				return;
			case MasPackage.AGENT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends ImplementationFile>)newValue);
				return;
			case MasPackage.AGENT__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends CapabilityReference>)newValue);
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
			case MasPackage.AGENT__TEMPLATES:
				getTemplates().clear();
				return;
			case MasPackage.AGENT__COMPONENTS:
				getComponents().clear();
				return;
			case MasPackage.AGENT__FILES:
				getFiles().clear();
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
			case MasPackage.AGENT__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case MasPackage.AGENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case MasPackage.AGENT__FILES:
				return files != null && !files.isEmpty();
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
		if (baseClass == GroupRelationship.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GroupTemplates.class) {
			switch (derivedFeatureID) {
				case MasPackage.AGENT__TEMPLATES: return DsamtypesPackage.GROUP_TEMPLATES__TEMPLATES;
				default: return -1;
			}
		}
		if (baseClass == GroupComponents.class) {
			switch (derivedFeatureID) {
				case MasPackage.AGENT__COMPONENTS: return DsamtypesPackage.GROUP_COMPONENTS__COMPONENTS;
				default: return -1;
			}
		}
		if (baseClass == GroupFiles.class) {
			switch (derivedFeatureID) {
				case MasPackage.AGENT__FILES: return DsamtypesPackage.GROUP_FILES__FILES;
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
		if (baseClass == GroupRelationship.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GroupTemplates.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.GROUP_TEMPLATES__TEMPLATES: return MasPackage.AGENT__TEMPLATES;
				default: return -1;
			}
		}
		if (baseClass == GroupComponents.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.GROUP_COMPONENTS__COMPONENTS: return MasPackage.AGENT__COMPONENTS;
				default: return -1;
			}
		}
		if (baseClass == GroupFiles.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.GROUP_FILES__FILES: return MasPackage.AGENT__FILES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AgentImpl
