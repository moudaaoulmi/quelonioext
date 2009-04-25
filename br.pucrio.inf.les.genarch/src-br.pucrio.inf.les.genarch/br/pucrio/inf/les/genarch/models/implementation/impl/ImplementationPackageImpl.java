/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation.impl;

import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

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
public class ImplementationPackageImpl extends EPackageImpl implements ImplementationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationResourcesContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationFragmentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationFragmentEClass = null;

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
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImplementationPackageImpl() {
		super(eNS_URI, ImplementationFactory.eINSTANCE);
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
	public static ImplementationPackage init() {
		if (isInited) return (ImplementationPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI);

		// Obtain or create and register package
		ImplementationPackageImpl theImplementationPackage = (ImplementationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ImplementationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ImplementationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theImplementationPackage.createPackageContents();

		// Initialize created meta-data
		theImplementationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImplementationPackage.freeze();

		return theImplementationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Containers() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_ResourcesContainer() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_FragmentsContainer() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationContainer() {
		return implementationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationContainer_Name() {
		return (EAttribute)implementationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationContainer_Components() {
		return (EReference)implementationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationResourcesContainer() {
		return implementationResourcesContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationResourcesContainer_Name() {
		return (EAttribute)implementationResourcesContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationResourcesContainer_Folders() {
		return (EReference)implementationResourcesContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationResourcesContainer_Files() {
		return (EReference)implementationResourcesContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationResourcesContainer_Templates() {
		return (EReference)implementationResourcesContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationFragmentContainer() {
		return implementationFragmentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationFragmentContainer_Name() {
		return (EAttribute)implementationFragmentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationFragmentContainer_Fragments() {
		return (EReference)implementationFragmentContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationEntity() {
		return implementationEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationEntity_Name() {
		return (EAttribute)implementationEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationEntity_Path() {
		return (EAttribute)implementationEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationComponent() {
		return implementationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationComponent_Classes() {
		return (EReference)implementationComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationComponent_Aspects() {
		return (EReference)implementationComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationComponent_Templates() {
		return (EReference)implementationComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationComponent_Files() {
		return (EReference)implementationComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationComponent_SubComponents() {
		return (EReference)implementationComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationClass() {
		return implementationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationAspect() {
		return implementationAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationFile() {
		return implementationFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationTemplate() {
		return implementationTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationTemplate_GenerationPath() {
		return (EAttribute)implementationTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationFolder() {
		return implementationFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationFolder_SubFolders() {
		return (EReference)implementationFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationFolder_Files() {
		return (EReference)implementationFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationFolder_Templates() {
		return (EReference)implementationFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationFragment() {
		return implementationFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationFragment_Content() {
		return (EAttribute)implementationFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFactory getImplementationFactory() {
		return (ImplementationFactory)getEFactoryInstance();
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
		implementationEClass = createEClass(IMPLEMENTATION);
		createEReference(implementationEClass, IMPLEMENTATION__CONTAINERS);
		createEReference(implementationEClass, IMPLEMENTATION__RESOURCES_CONTAINER);
		createEReference(implementationEClass, IMPLEMENTATION__FRAGMENTS_CONTAINER);

		implementationContainerEClass = createEClass(IMPLEMENTATION_CONTAINER);
		createEAttribute(implementationContainerEClass, IMPLEMENTATION_CONTAINER__NAME);
		createEReference(implementationContainerEClass, IMPLEMENTATION_CONTAINER__COMPONENTS);

		implementationResourcesContainerEClass = createEClass(IMPLEMENTATION_RESOURCES_CONTAINER);
		createEAttribute(implementationResourcesContainerEClass, IMPLEMENTATION_RESOURCES_CONTAINER__NAME);
		createEReference(implementationResourcesContainerEClass, IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS);
		createEReference(implementationResourcesContainerEClass, IMPLEMENTATION_RESOURCES_CONTAINER__FILES);
		createEReference(implementationResourcesContainerEClass, IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES);

		implementationFragmentContainerEClass = createEClass(IMPLEMENTATION_FRAGMENT_CONTAINER);
		createEAttribute(implementationFragmentContainerEClass, IMPLEMENTATION_FRAGMENT_CONTAINER__NAME);
		createEReference(implementationFragmentContainerEClass, IMPLEMENTATION_FRAGMENT_CONTAINER__FRAGMENTS);

		implementationEntityEClass = createEClass(IMPLEMENTATION_ENTITY);
		createEAttribute(implementationEntityEClass, IMPLEMENTATION_ENTITY__NAME);
		createEAttribute(implementationEntityEClass, IMPLEMENTATION_ENTITY__PATH);

		implementationComponentEClass = createEClass(IMPLEMENTATION_COMPONENT);
		createEReference(implementationComponentEClass, IMPLEMENTATION_COMPONENT__CLASSES);
		createEReference(implementationComponentEClass, IMPLEMENTATION_COMPONENT__ASPECTS);
		createEReference(implementationComponentEClass, IMPLEMENTATION_COMPONENT__TEMPLATES);
		createEReference(implementationComponentEClass, IMPLEMENTATION_COMPONENT__FILES);
		createEReference(implementationComponentEClass, IMPLEMENTATION_COMPONENT__SUB_COMPONENTS);

		implementationClassEClass = createEClass(IMPLEMENTATION_CLASS);

		implementationAspectEClass = createEClass(IMPLEMENTATION_ASPECT);

		implementationFileEClass = createEClass(IMPLEMENTATION_FILE);

		implementationTemplateEClass = createEClass(IMPLEMENTATION_TEMPLATE);
		createEAttribute(implementationTemplateEClass, IMPLEMENTATION_TEMPLATE__GENERATION_PATH);

		implementationFolderEClass = createEClass(IMPLEMENTATION_FOLDER);
		createEReference(implementationFolderEClass, IMPLEMENTATION_FOLDER__SUB_FOLDERS);
		createEReference(implementationFolderEClass, IMPLEMENTATION_FOLDER__FILES);
		createEReference(implementationFolderEClass, IMPLEMENTATION_FOLDER__TEMPLATES);

		implementationFragmentEClass = createEClass(IMPLEMENTATION_FRAGMENT);
		createEAttribute(implementationFragmentEClass, IMPLEMENTATION_FRAGMENT__CONTENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		implementationComponentEClass.getESuperTypes().add(this.getImplementationEntity());
		implementationClassEClass.getESuperTypes().add(this.getImplementationEntity());
		implementationAspectEClass.getESuperTypes().add(this.getImplementationEntity());
		implementationFileEClass.getESuperTypes().add(this.getImplementationEntity());
		implementationTemplateEClass.getESuperTypes().add(this.getImplementationEntity());
		implementationFolderEClass.getESuperTypes().add(this.getImplementationEntity());
		implementationFragmentEClass.getESuperTypes().add(this.getImplementationEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementation_Containers(), this.getImplementationContainer(), null, "containers", null, 0, -1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_ResourcesContainer(), this.getImplementationResourcesContainer(), null, "resourcesContainer", null, 0, -1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_FragmentsContainer(), this.getImplementationFragmentContainer(), null, "fragmentsContainer", null, 0, -1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationContainerEClass, ImplementationContainer.class, "ImplementationContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplementationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationContainer_Components(), this.getImplementationComponent(), null, "components", null, 0, -1, ImplementationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationResourcesContainerEClass, ImplementationResourcesContainer.class, "ImplementationResourcesContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationResourcesContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplementationResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationResourcesContainer_Folders(), this.getImplementationFolder(), null, "folders", null, 0, -1, ImplementationResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationResourcesContainer_Files(), this.getImplementationFile(), null, "files", null, 0, -1, ImplementationResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationResourcesContainer_Templates(), this.getImplementationTemplate(), null, "templates", null, 0, -1, ImplementationResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationFragmentContainerEClass, ImplementationFragmentContainer.class, "ImplementationFragmentContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationFragmentContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplementationFragmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationFragmentContainer_Fragments(), this.getImplementationFragment(), null, "fragments", null, 0, -1, ImplementationFragmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEntityEClass, ImplementationEntity.class, "ImplementationEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplementationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationEntity_Path(), ecorePackage.getEString(), "path", null, 0, 1, ImplementationEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationComponentEClass, ImplementationComponent.class, "ImplementationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationComponent_Classes(), this.getImplementationClass(), null, "classes", null, 0, -1, ImplementationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationComponent_Aspects(), this.getImplementationAspect(), null, "aspects", null, 0, -1, ImplementationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationComponent_Templates(), this.getImplementationTemplate(), null, "templates", null, 0, -1, ImplementationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationComponent_Files(), this.getImplementationFile(), null, "files", null, 0, -1, ImplementationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationComponent_SubComponents(), this.getImplementationComponent(), null, "subComponents", null, 0, -1, ImplementationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationClassEClass, ImplementationClass.class, "ImplementationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationAspectEClass, ImplementationAspect.class, "ImplementationAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationFileEClass, ImplementationFile.class, "ImplementationFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationTemplateEClass, ImplementationTemplate.class, "ImplementationTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationTemplate_GenerationPath(), ecorePackage.getEString(), "generationPath", null, 0, 1, ImplementationTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationFolderEClass, ImplementationFolder.class, "ImplementationFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationFolder_SubFolders(), this.getImplementationFolder(), null, "subFolders", null, 0, -1, ImplementationFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationFolder_Files(), this.getImplementationFile(), null, "files", null, 0, -1, ImplementationFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationFolder_Templates(), this.getImplementationTemplate(), null, "templates", null, 0, -1, ImplementationFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationFragmentEClass, ImplementationFragment.class, "ImplementationFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationFragment_Content(), ecorePackage.getEString(), "content", null, 0, 1, ImplementationFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ImplementationPackageImpl
