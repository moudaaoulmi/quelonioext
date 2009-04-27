/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.mas;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.extension.mas.MasFactory
 * @model kind="package"
 * @generated
 */
public interface MasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MasDomainModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.pucrio.inf.les.genarch.extension.mas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MasPackage eINSTANCE = br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.MASImpl <em>MAS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MASImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getMAS()
	 * @generated
	 */
	int MAS = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAS__AGENTS = 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAS__CAPABILITIES = 1;

	/**
	 * The number of structural features of the '<em>MAS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = ConfigurationPackage.CONFIGURABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Associated Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ASSOCIATED_TEMPLATES = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CAPABILITIES = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__GOALS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Believes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__BELIEVES = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PLANS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EVENTS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EXPRESSIONS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = ConfigurationPackage.CONFIGURABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Associated Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ASSOCIATED_TEMPLATES = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associated Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ASSOCIATED_FRAGMENTS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__GOALS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Believes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__BELIEVES = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PLANS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EVENTS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EXPRESSIONS = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CAPABILITIES = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = ConfigurationPackage.CONFIGURABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.PlanImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 3;

	/**
	 * The feature id for the '<em><b>Associated Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ASSOCIATED_CLASSES = DsamtypesPackage.CLASSES_IMPL__ASSOCIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Associated Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ASSOCIATED_FRAGMENTS = DsamtypesPackage.CLASSES_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__NAME = DsamtypesPackage.CLASSES_IMPL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = DsamtypesPackage.CLASSES_IMPL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.GoalImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 4;

	/**
	 * The feature id for the '<em><b>Associated Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSOCIATED_FRAGMENTS = DsamtypesPackage.FRAGMENTS_IMPL__ASSOCIATED_FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = DsamtypesPackage.FRAGMENTS_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = DsamtypesPackage.FRAGMENTS_IMPL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.EventImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Associated Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ASSOCIATED_FRAGMENTS = DsamtypesPackage.FRAGMENTS_IMPL__ASSOCIATED_FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = DsamtypesPackage.FRAGMENTS_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = DsamtypesPackage.FRAGMENTS_IMPL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.BeliefImpl <em>Belief</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.BeliefImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getBelief()
	 * @generated
	 */
	int BELIEF = 6;

	/**
	 * The feature id for the '<em><b>Associated Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__ASSOCIATED_CLASSES = DsamtypesPackage.CLASSES_IMPL__ASSOCIATED_CLASSES;

	/**
	 * The feature id for the '<em><b>Associated Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__ASSOCIATED_FRAGMENTS = DsamtypesPackage.CLASSES_IMPL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__NAME = DsamtypesPackage.CLASSES_IMPL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Belief</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF_FEATURE_COUNT = DsamtypesPackage.CLASSES_IMPL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.ExpressionImpl
	 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Associated Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ASSOCIATED_FRAGMENTS = DsamtypesPackage.FRAGMENTS_IMPL__ASSOCIATED_FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = DsamtypesPackage.FRAGMENTS_IMPL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = DsamtypesPackage.FRAGMENTS_IMPL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.MAS <em>MAS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAS</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MAS
	 * @generated
	 */
	EClass getMAS();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.MAS#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MAS#getAgents()
	 * @see #getMAS()
	 * @generated
	 */
	EReference getMAS_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.MAS#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MAS#getCapabilities()
	 * @see #getMAS()
	 * @generated
	 */
	EReference getMAS_Capabilities();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Agent#getCapabilities()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Agent#getGoals()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getBelieves <em>Believes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Believes</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Agent#getBelieves()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Believes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Agent#getPlans()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Plans();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Agent#getEvents()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Agent#getExpressions()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Expressions();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Capability#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Capability#getGoals()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Capability#getBelieves <em>Believes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Believes</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Capability#getBelieves()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Believes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Capability#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Capability#getPlans()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Plans();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Capability#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Capability#getEvents()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Capability#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Capability#getExpressions()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Expressions();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.mas.Capability#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Capability#getCapabilities()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Capabilities();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.mas.Plan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Plan#getName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Name();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.mas.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.mas.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belief</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Belief
	 * @generated
	 */
	EClass getBelief();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.mas.Belief#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Belief#getName()
	 * @see #getBelief()
	 * @generated
	 */
	EAttribute getBelief_Name();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.mas.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.mas.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.mas.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MasFactory getMasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.MASImpl <em>MAS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MASImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getMAS()
		 * @generated
		 */
		EClass MAS = eINSTANCE.getMAS();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAS__AGENTS = eINSTANCE.getMAS_Agents();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAS__CAPABILITIES = eINSTANCE.getMAS_Capabilities();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.AgentImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__CAPABILITIES = eINSTANCE.getAgent_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__GOALS = eINSTANCE.getAgent_Goals();

		/**
		 * The meta object literal for the '<em><b>Believes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__BELIEVES = eINSTANCE.getAgent_Believes();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PLANS = eINSTANCE.getAgent_Plans();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__EVENTS = eINSTANCE.getAgent_Events();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__EXPRESSIONS = eINSTANCE.getAgent_Expressions();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.CapabilityImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__GOALS = eINSTANCE.getCapability_Goals();

		/**
		 * The meta object literal for the '<em><b>Believes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__BELIEVES = eINSTANCE.getCapability_Believes();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__PLANS = eINSTANCE.getCapability_Plans();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__EVENTS = eINSTANCE.getCapability_Events();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__EXPRESSIONS = eINSTANCE.getCapability_Expressions();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__CAPABILITIES = eINSTANCE.getCapability_Capabilities();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.PlanImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.GoalImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.EventImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.BeliefImpl <em>Belief</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.BeliefImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getBelief()
		 * @generated
		 */
		EClass BELIEF = eINSTANCE.getBelief();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BELIEF__NAME = eINSTANCE.getBelief_Name();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.mas.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.ExpressionImpl
		 * @see br.pucrio.inf.les.genarch.extension.mas.impl.MasPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

	}

} //MasPackage
