/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.jade.impl;

import br.pucrio.inf.les.genarch.extension.dsam.jade.Agent;
import br.pucrio.inf.les.genarch.extension.dsam.jade.Behavior;
import br.pucrio.inf.les.genarch.extension.dsam.jade.Jade;
import br.pucrio.inf.les.genarch.extension.dsam.jade.JadeFactory;
import br.pucrio.inf.les.genarch.extension.dsam.jade.JadePackage;

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
public class JadePackageImpl extends EPackageImpl implements JadePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jadeEClass = null;

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
	private EClass behaviorEClass = null;

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
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.JadePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JadePackageImpl() {
		super(eNS_URI, JadeFactory.eINSTANCE);
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
	public static JadePackage init() {
		if (isInited) return (JadePackage)EPackage.Registry.INSTANCE.getEPackage(JadePackage.eNS_URI);

		// Obtain or create and register package
		JadePackageImpl theJadePackage = (JadePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JadePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new JadePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DsamtypesPackageImpl theDsamtypesPackage = (DsamtypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) instanceof DsamtypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) : DsamtypesPackage.eINSTANCE);
		ImplementationPackageImpl theImplementationPackage = (ImplementationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) instanceof ImplementationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) : ImplementationPackage.eINSTANCE);

		// Create package meta-data objects
		theJadePackage.createPackageContents();
		theDsamtypesPackage.createPackageContents();
		theImplementationPackage.createPackageContents();

		// Initialize created meta-data
		theJadePackage.initializePackageContents();
		theDsamtypesPackage.initializePackageContents();
		theImplementationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJadePackage.freeze();

		return theJadePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJade() {
		return jadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJade_Agents() {
		return (EReference)jadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJade_Behaviors() {
		return (EReference)jadeEClass.getEStructuralFeatures().get(1);
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
	public EReference getAgent_Behaviors() {
		return (EReference)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JadeFactory getJadeFactory() {
		return (JadeFactory)getEFactoryInstance();
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
		jadeEClass = createEClass(JADE);
		createEReference(jadeEClass, JADE__AGENTS);
		createEReference(jadeEClass, JADE__BEHAVIORS);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__BEHAVIORS);

		behaviorEClass = createEClass(BEHAVIOR);
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
		agentEClass.getESuperTypes().add(theDsamtypesPackage.getGroupClass());
		agentEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		behaviorEClass.getESuperTypes().add(theDsamtypesPackage.getGroupClass());
		behaviorEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(jadeEClass, Jade.class, "Jade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJade_Agents(), this.getAgent(), null, "agents", null, 0, -1, Jade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJade_Behaviors(), this.getBehavior(), null, "behaviors", null, 0, -1, Jade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Behaviors(), this.getBehavior(), null, "behaviors", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JadePackageImpl
