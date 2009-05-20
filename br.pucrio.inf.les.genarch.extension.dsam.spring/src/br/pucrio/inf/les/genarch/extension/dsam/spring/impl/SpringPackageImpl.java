/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.spring.impl;

import br.pucrio.inf.les.genarch.extension.dsam.spring.Bean;
import br.pucrio.inf.les.genarch.extension.dsam.spring.BeanReference;
import br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant;
import br.pucrio.inf.les.genarch.extension.dsam.spring.Interface;
import br.pucrio.inf.les.genarch.extension.dsam.spring.Spring;
import br.pucrio.inf.les.genarch.extension.dsam.spring.SpringFactory;
import br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage;

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
public class SpringPackageImpl extends EPackageImpl implements SpringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass springEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

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
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpringPackageImpl() {
		super(eNS_URI, SpringFactory.eINSTANCE);
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
	public static SpringPackage init() {
		if (isInited) return (SpringPackage)EPackage.Registry.INSTANCE.getEPackage(SpringPackage.eNS_URI);

		// Obtain or create and register package
		SpringPackageImpl theSpringPackage = (SpringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SpringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SpringPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DsamtypesPackageImpl theDsamtypesPackage = (DsamtypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) instanceof DsamtypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) : DsamtypesPackage.eINSTANCE);
		ImplementationPackageImpl theImplementationPackage = (ImplementationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) instanceof ImplementationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) : ImplementationPackage.eINSTANCE);

		// Create package meta-data objects
		theSpringPackage.createPackageContents();
		theDsamtypesPackage.createPackageContents();
		theImplementationPackage.createPackageContents();

		// Initialize created meta-data
		theSpringPackage.initializePackageContents();
		theDsamtypesPackage.initializePackageContents();
		theImplementationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpringPackage.freeze();

		return theSpringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpring() {
		return springEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpring_Beans() {
		return (EReference)springEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBean() {
		return beanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBean_Variants() {
		return (EReference)beanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBean_Interface() {
		return (EReference)beanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeanVariant() {
		return beanVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanVariant_References() {
		return (EReference)beanVariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeanReference() {
		return beanReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringFactory getSpringFactory() {
		return (SpringFactory)getEFactoryInstance();
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
		springEClass = createEClass(SPRING);
		createEReference(springEClass, SPRING__BEANS);

		beanEClass = createEClass(BEAN);
		createEReference(beanEClass, BEAN__VARIANTS);
		createEReference(beanEClass, BEAN__INTERFACE);

		beanVariantEClass = createEClass(BEAN_VARIANT);
		createEReference(beanVariantEClass, BEAN_VARIANT__REFERENCES);

		beanReferenceEClass = createEClass(BEAN_REFERENCE);

		interfaceEClass = createEClass(INTERFACE);
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
		beanEClass.getESuperTypes().add(theDsamtypesPackage.getGroupClass());
		beanVariantEClass.getESuperTypes().add(theDsamtypesPackage.getGroupClass());
		beanVariantEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		beanReferenceEClass.getESuperTypes().add(theDsamtypesPackage.getIntraDependence());
		interfaceEClass.getESuperTypes().add(theDsamtypesPackage.getGroupClass());

		// Initialize classes and features; add operations and parameters
		initEClass(springEClass, Spring.class, "Spring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpring_Beans(), this.getBean(), null, "beans", null, 1, -1, Spring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanEClass, Bean.class, "Bean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBean_Variants(), this.getBeanVariant(), null, "variants", null, 0, -1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBean_Interface(), this.getInterface(), null, "interface", null, 1, 1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanVariantEClass, BeanVariant.class, "BeanVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeanVariant_References(), this.getBeanReference(), null, "references", null, 0, -1, BeanVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanReferenceEClass, BeanReference.class, "BeanReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// XML
		createXMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>XML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMLAnnotations() {
		String source = "XML";		
		addAnnotation
		  (beanVariantEClass, 
		   source, 
		   new String[] {
			 "prop", "Bean",
			 "attr", "name"
		   });
	}

} //SpringPackageImpl
