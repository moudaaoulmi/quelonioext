/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas.impl;

import br.pucrio.inf.les.genarch.extension.dsam.mas.Agent;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Belief;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Capability;
import br.pucrio.inf.les.genarch.extension.dsam.mas.CapabilityReference;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Event;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Expression;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Goal;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MasFactory;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Plan;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;

import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasPackageImpl extends EPackageImpl implements MasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beliefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MasPackageImpl() {
		super(eNS_URI, MasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MasPackage init() {
		if (isInited) return (MasPackage)EPackage.Registry.INSTANCE.getEPackage(MasPackage.eNS_URI);

		// Obtain or create and register package
		MasPackageImpl theMasPackage = (MasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof MasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new MasPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DsamtypesPackageImpl theDsamtypesPackage = (DsamtypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) instanceof DsamtypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) : DsamtypesPackage.eINSTANCE);
		ImplementationPackageImpl theImplementationPackage = (ImplementationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) instanceof ImplementationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) : ImplementationPackage.eINSTANCE);

		// Create package meta-data objects
		theMasPackage.createPackageContents();
		theDsamtypesPackage.createPackageContents();
		theImplementationPackage.createPackageContents();

		// Initialize created meta-data
		theMasPackage.initializePackageContents();
		theDsamtypesPackage.initializePackageContents();
		theImplementationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMasPackage.freeze();

		return theMasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAS() {
		return masEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAS_Agents() {
		return (EReference)masEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMAS_Capabilities() {
		return (EReference)masEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Capabilities() {
		return (EReference)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Goals() {
		return (EReference)agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Believes() {
		return (EReference)agentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Plans() {
		return (EReference)agentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Events() {
		return (EReference)agentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Expressions() {
		return (EReference)agentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Goals() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Believes() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Plans() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Events() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Expressions() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Capabilities() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBelief() {
		return beliefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityReference() {
		return capabilityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasFactory getMasFactory() {
		return (MasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		masEClass = createEClass(MAS);
		createEReference(masEClass, MAS__AGENTS);
		createEReference(masEClass, MAS__CAPABILITIES);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__CAPABILITIES);
		createEReference(agentEClass, AGENT__GOALS);
		createEReference(agentEClass, AGENT__BELIEVES);
		createEReference(agentEClass, AGENT__PLANS);
		createEReference(agentEClass, AGENT__EVENTS);
		createEReference(agentEClass, AGENT__EXPRESSIONS);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__GOALS);
		createEReference(capabilityEClass, CAPABILITY__BELIEVES);
		createEReference(capabilityEClass, CAPABILITY__PLANS);
		createEReference(capabilityEClass, CAPABILITY__EVENTS);
		createEReference(capabilityEClass, CAPABILITY__EXPRESSIONS);
		createEReference(capabilityEClass, CAPABILITY__CAPABILITIES);

		planEClass = createEClass(PLAN);

		goalEClass = createEClass(GOAL);

		eventEClass = createEClass(EVENT);

		beliefEClass = createEClass(BELIEF);

		expressionEClass = createEClass(EXPRESSION);

		capabilityReferenceEClass = createEClass(CAPABILITY_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DsamtypesPackage theDsamtypesPackage = (DsamtypesPackage)EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		agentEClass.getESuperTypes().add(theDsamtypesPackage.getGroupTemplates());
		capabilityEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		capabilityEClass.getESuperTypes().add(theDsamtypesPackage.getGroupTemplates());
		planEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		planEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		planEClass.getESuperTypes().add(theDsamtypesPackage.getGroupClass());
		goalEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		goalEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		eventEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		eventEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		beliefEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		beliefEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		expressionEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		expressionEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		capabilityReferenceEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		capabilityReferenceEClass.getESuperTypes().add(theDsamtypesPackage.getIntraDependence());

		// Initialize classes and features; add operations and parameters
		initEClass(masEClass, br.pucrio.inf.les.genarch.extension.dsam.mas.MAS.class, "MAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAS_Agents(), this.getAgent(), null, "agents", null, 0, -1, br.pucrio.inf.les.genarch.extension.dsam.mas.MAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAS_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, br.pucrio.inf.les.genarch.extension.dsam.mas.MAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Capabilities(), this.getCapabilityReference(), null, "capabilities", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Goals(), this.getGoal(), null, "goals", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Believes(), this.getBelief(), null, "believes", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Plans(), this.getPlan(), null, "plans", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Events(), this.getEvent(), null, "events", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Goals(), this.getGoal(), null, "goals", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Believes(), this.getBelief(), null, "believes", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Plans(), this.getPlan(), null, "plans", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Events(), this.getEvent(), null, "events", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beliefEClass, Belief.class, "Belief", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityReferenceEClass, CapabilityReference.class, "CapabilityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MasPackageImpl
