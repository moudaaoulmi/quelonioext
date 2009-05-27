/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm.impl;

import br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleContents;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmFactory;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;

import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class SpringdmPackageImpl extends EPackageImpl implements SpringdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass springDynamicModulesEClass = null;

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
	private EClass beanReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osGiReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanVariantEClass = null;

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
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpringdmPackageImpl() {
		super(eNS_URI, SpringdmFactory.eINSTANCE);
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
	public static SpringdmPackage init() {
		if (isInited) return (SpringdmPackage)EPackage.Registry.INSTANCE.getEPackage(SpringdmPackage.eNS_URI);

		// Obtain or create and register package
		SpringdmPackageImpl theSpringdmPackage = (SpringdmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SpringdmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SpringdmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DsamtypesPackageImpl theDsamtypesPackage = (DsamtypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) instanceof DsamtypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI) : DsamtypesPackage.eINSTANCE);
		ImplementationPackageImpl theImplementationPackage = (ImplementationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) instanceof ImplementationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) : ImplementationPackage.eINSTANCE);

		// Create package meta-data objects
		theSpringdmPackage.createPackageContents();
		theDsamtypesPackage.createPackageContents();
		theImplementationPackage.createPackageContents();

		// Initialize created meta-data
		theSpringdmPackage.initializePackageContents();
		theDsamtypesPackage.initializePackageContents();
		theImplementationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpringdmPackage.freeze();

		return theSpringdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpringDynamicModules() {
		return springDynamicModulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpringDynamicModules_Bundles() {
		return (EReference)springDynamicModulesEClass.getEStructuralFeatures().get(0);
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
	public EClass getBeanReference() {
		return beanReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeanReference_Name() {
		return (EAttribute)beanReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSGiReference() {
		return osGiReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSGiReference_Name() {
		return (EAttribute)osGiReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSGiReference_Bundle() {
		return (EAttribute)osGiReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeans() {
		return beansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeans_Beans() {
		return (EReference)beansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Contents() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_RequireBundle() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Beans() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleContents() {
		return bundleContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequireBundle() {
		return requireBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequireBundle_RequireBundle() {
		return (EReference)requireBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleReq() {
		return bundleReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleReq_Name() {
		return (EAttribute)bundleReqEClass.getEStructuralFeatures().get(0);
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
	public EReference getBeanVariant_OsgiRef() {
		return (EReference)beanVariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeanVariant_BeanRef() {
		return (EReference)beanVariantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringdmFactory getSpringdmFactory() {
		return (SpringdmFactory)getEFactoryInstance();
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
		springDynamicModulesEClass = createEClass(SPRING_DYNAMIC_MODULES);
		createEReference(springDynamicModulesEClass, SPRING_DYNAMIC_MODULES__BUNDLES);

		beanEClass = createEClass(BEAN);
		createEReference(beanEClass, BEAN__VARIANTS);

		beanReferenceEClass = createEClass(BEAN_REFERENCE);
		createEAttribute(beanReferenceEClass, BEAN_REFERENCE__NAME);

		osGiReferenceEClass = createEClass(OS_GI_REFERENCE);
		createEAttribute(osGiReferenceEClass, OS_GI_REFERENCE__NAME);
		createEAttribute(osGiReferenceEClass, OS_GI_REFERENCE__BUNDLE);

		beansEClass = createEClass(BEANS);
		createEReference(beansEClass, BEANS__BEANS);

		bundleEClass = createEClass(BUNDLE);
		createEReference(bundleEClass, BUNDLE__CONTENTS);
		createEReference(bundleEClass, BUNDLE__REQUIRE_BUNDLE);
		createEReference(bundleEClass, BUNDLE__BEANS);

		bundleContentsEClass = createEClass(BUNDLE_CONTENTS);

		requireBundleEClass = createEClass(REQUIRE_BUNDLE);
		createEReference(requireBundleEClass, REQUIRE_BUNDLE__REQUIRE_BUNDLE);

		bundleReqEClass = createEClass(BUNDLE_REQ);
		createEAttribute(bundleReqEClass, BUNDLE_REQ__NAME);

		beanVariantEClass = createEClass(BEAN_VARIANT);
		createEReference(beanVariantEClass, BEAN_VARIANT__OSGI_REF);
		createEReference(beanVariantEClass, BEAN_VARIANT__BEAN_REF);
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
		beanEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		bundleEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());
		bundleContentsEClass.getESuperTypes().add(theDsamtypesPackage.getFolderDependence());
		bundleContentsEClass.getESuperTypes().add(theDsamtypesPackage.getComponentDependence());
		bundleContentsEClass.getESuperTypes().add(theDsamtypesPackage.getFileDependence());
		beanVariantEClass.getESuperTypes().add(theDsamtypesPackage.getGroupFragments());
		beanVariantEClass.getESuperTypes().add(theDsamtypesPackage.getGroupClass());
		beanVariantEClass.getESuperTypes().add(theDsamtypesPackage.getVariableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(springDynamicModulesEClass, SpringDynamicModules.class, "SpringDynamicModules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpringDynamicModules_Bundles(), this.getBundle(), null, "bundles", null, 1, -1, SpringDynamicModules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanEClass, Bean.class, "Bean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBean_Variants(), this.getBeanVariant(), null, "variants", null, 0, -1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanReferenceEClass, BeanReference.class, "BeanReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeanReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, BeanReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osGiReferenceEClass, OSGiReference.class, "OSGiReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSGiReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, OSGiReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSGiReference_Bundle(), ecorePackage.getEString(), "bundle", null, 0, 1, OSGiReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beansEClass, Beans.class, "Beans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeans_Beans(), this.getBean(), null, "beans", null, 0, -1, Beans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundle_Contents(), this.getBundleContents(), null, "contents", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_RequireBundle(), this.getRequireBundle(), null, "requireBundle", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Beans(), this.getBeans(), null, "beans", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleContentsEClass, BundleContents.class, "BundleContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requireBundleEClass, RequireBundle.class, "RequireBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequireBundle_RequireBundle(), this.getBundleReq(), null, "requireBundle", null, 0, -1, RequireBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleReqEClass, BundleReq.class, "BundleReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleReq_Name(), ecorePackage.getEString(), "name", null, 0, 1, BundleReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beanVariantEClass, BeanVariant.class, "BeanVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeanVariant_OsgiRef(), this.getOSGiReference(), null, "osgiRef", null, 0, -1, BeanVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeanVariant_BeanRef(), this.getBeanReference(), null, "beanRef", null, 0, -1, BeanVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SpringdmPackageImpl
