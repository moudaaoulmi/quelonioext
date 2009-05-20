/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes.impl;

import br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement;
import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesFactory;
import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.ExtraDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates;
import br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

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
public class DsamtypesPackageImpl extends EPackageImpl implements DsamtypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenceRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupAspectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupFilesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTemplatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupFoldersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupFragmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraDependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableElementEClass = null;

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
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DsamtypesPackageImpl() {
		super(eNS_URI, DsamtypesFactory.eINSTANCE);
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
	public static DsamtypesPackage init() {
		if (isInited) return (DsamtypesPackage)EPackage.Registry.INSTANCE.getEPackage(DsamtypesPackage.eNS_URI);

		// Obtain or create and register package
		DsamtypesPackageImpl theDsamtypesPackage = (DsamtypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DsamtypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DsamtypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ImplementationPackageImpl theImplementationPackage = (ImplementationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) instanceof ImplementationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI) : ImplementationPackage.eINSTANCE);

		// Create package meta-data objects
		theDsamtypesPackage.createPackageContents();
		theImplementationPackage.createPackageContents();

		// Initialize created meta-data
		theDsamtypesPackage.initializePackageContents();
		theImplementationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsamtypesPackage.freeze();

		return theDsamtypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainElement() {
		return domainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainElement_Name() {
		return (EAttribute)domainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupRelationship() {
		return groupRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependenceRelationship() {
		return dependenceRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupClass() {
		return groupClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupClass_Classes() {
		return (EReference)groupClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupAspects() {
		return groupAspectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupAspects_Aspects() {
		return (EReference)groupAspectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupFiles() {
		return groupFilesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupFiles_Files() {
		return (EReference)groupFilesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupTemplates() {
		return groupTemplatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTemplates_Templates() {
		return (EReference)groupTemplatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupComponents() {
		return groupComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupComponents_Components() {
		return (EReference)groupComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupFolders() {
		return groupFoldersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupFolders_Folders() {
		return (EReference)groupFoldersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupFragments() {
		return groupFragmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupFragments_Fragments() {
		return (EReference)groupFragmentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDependence() {
		return classDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDependence_Classes() {
		return (EReference)classDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectDependence() {
		return aspectDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectDependence_Aspects() {
		return (EReference)aspectDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDependence() {
		return fileDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDependence_Files() {
		return (EReference)fileDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateDependence() {
		return templateDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateDependence_Templates() {
		return (EReference)templateDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDependence() {
		return componentDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDependence_Components() {
		return (EReference)componentDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderDependence() {
		return folderDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolderDependence_Folders() {
		return (EReference)folderDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentDependence() {
		return fragmentDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentDependence_Fragments() {
		return (EReference)fragmentDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntraDependence() {
		return intraDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntraDependence_Dependences() {
		return (EReference)intraDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraDependence() {
		return extraDependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtraDependence_Dependences() {
		return (EReference)extraDependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableElement() {
		return variableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsamtypesFactory getDsamtypesFactory() {
		return (DsamtypesFactory)getEFactoryInstance();
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
		domainElementEClass = createEClass(DOMAIN_ELEMENT);
		createEAttribute(domainElementEClass, DOMAIN_ELEMENT__NAME);

		groupRelationshipEClass = createEClass(GROUP_RELATIONSHIP);

		dependenceRelationshipEClass = createEClass(DEPENDENCE_RELATIONSHIP);

		groupClassEClass = createEClass(GROUP_CLASS);
		createEReference(groupClassEClass, GROUP_CLASS__CLASSES);

		groupAspectsEClass = createEClass(GROUP_ASPECTS);
		createEReference(groupAspectsEClass, GROUP_ASPECTS__ASPECTS);

		groupFilesEClass = createEClass(GROUP_FILES);
		createEReference(groupFilesEClass, GROUP_FILES__FILES);

		groupTemplatesEClass = createEClass(GROUP_TEMPLATES);
		createEReference(groupTemplatesEClass, GROUP_TEMPLATES__TEMPLATES);

		groupComponentsEClass = createEClass(GROUP_COMPONENTS);
		createEReference(groupComponentsEClass, GROUP_COMPONENTS__COMPONENTS);

		groupFoldersEClass = createEClass(GROUP_FOLDERS);
		createEReference(groupFoldersEClass, GROUP_FOLDERS__FOLDERS);

		groupFragmentsEClass = createEClass(GROUP_FRAGMENTS);
		createEReference(groupFragmentsEClass, GROUP_FRAGMENTS__FRAGMENTS);

		classDependenceEClass = createEClass(CLASS_DEPENDENCE);
		createEReference(classDependenceEClass, CLASS_DEPENDENCE__CLASSES);

		aspectDependenceEClass = createEClass(ASPECT_DEPENDENCE);
		createEReference(aspectDependenceEClass, ASPECT_DEPENDENCE__ASPECTS);

		fileDependenceEClass = createEClass(FILE_DEPENDENCE);
		createEReference(fileDependenceEClass, FILE_DEPENDENCE__FILES);

		templateDependenceEClass = createEClass(TEMPLATE_DEPENDENCE);
		createEReference(templateDependenceEClass, TEMPLATE_DEPENDENCE__TEMPLATES);

		componentDependenceEClass = createEClass(COMPONENT_DEPENDENCE);
		createEReference(componentDependenceEClass, COMPONENT_DEPENDENCE__COMPONENTS);

		folderDependenceEClass = createEClass(FOLDER_DEPENDENCE);
		createEReference(folderDependenceEClass, FOLDER_DEPENDENCE__FOLDERS);

		fragmentDependenceEClass = createEClass(FRAGMENT_DEPENDENCE);
		createEReference(fragmentDependenceEClass, FRAGMENT_DEPENDENCE__FRAGMENTS);

		intraDependenceEClass = createEClass(INTRA_DEPENDENCE);
		createEReference(intraDependenceEClass, INTRA_DEPENDENCE__DEPENDENCES);

		extraDependenceEClass = createEClass(EXTRA_DEPENDENCE);
		createEReference(extraDependenceEClass, EXTRA_DEPENDENCE__DEPENDENCES);

		variableElementEClass = createEClass(VARIABLE_ELEMENT);
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
		ImplementationPackage theImplementationPackage = (ImplementationPackage)EPackage.Registry.INSTANCE.getEPackage(ImplementationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupRelationshipEClass.getESuperTypes().add(this.getDomainElement());
		dependenceRelationshipEClass.getESuperTypes().add(this.getDomainElement());
		groupClassEClass.getESuperTypes().add(this.getGroupRelationship());
		groupAspectsEClass.getESuperTypes().add(this.getGroupRelationship());
		groupFilesEClass.getESuperTypes().add(this.getGroupRelationship());
		groupTemplatesEClass.getESuperTypes().add(this.getGroupRelationship());
		groupComponentsEClass.getESuperTypes().add(this.getGroupRelationship());
		groupFoldersEClass.getESuperTypes().add(this.getGroupRelationship());
		groupFragmentsEClass.getESuperTypes().add(this.getGroupRelationship());
		classDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		aspectDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		fileDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		templateDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		componentDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		folderDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		fragmentDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		intraDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		extraDependenceEClass.getESuperTypes().add(this.getDependenceRelationship());
		variableElementEClass.getESuperTypes().add(this.getDomainElement());

		// Initialize classes and features; add operations and parameters
		initEClass(domainElementEClass, DomainElement.class, "DomainElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupRelationshipEClass, GroupRelationship.class, "GroupRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependenceRelationshipEClass, DependenceRelationship.class, "DependenceRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupClassEClass, GroupClass.class, "GroupClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupClass_Classes(), theImplementationPackage.getImplementationClass(), null, "classes", null, 0, -1, GroupClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupAspectsEClass, GroupAspects.class, "GroupAspects", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupAspects_Aspects(), theImplementationPackage.getImplementationAspect(), null, "aspects", null, 0, -1, GroupAspects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupFilesEClass, GroupFiles.class, "GroupFiles", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupFiles_Files(), theImplementationPackage.getImplementationFile(), null, "files", null, 0, -1, GroupFiles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupTemplatesEClass, GroupTemplates.class, "GroupTemplates", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupTemplates_Templates(), theImplementationPackage.getImplementationTemplate(), null, "templates", null, 0, -1, GroupTemplates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupComponentsEClass, GroupComponents.class, "GroupComponents", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupComponents_Components(), theImplementationPackage.getImplementationComponent(), null, "components", null, 0, -1, GroupComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(groupFoldersEClass, GroupFolders.class, "GroupFolders", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupFolders_Folders(), theImplementationPackage.getImplementationFolder(), null, "folders", null, 0, -1, GroupFolders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupFragmentsEClass, GroupFragments.class, "GroupFragments", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupFragments_Fragments(), theImplementationPackage.getImplementationFragment(), null, "fragments", null, 0, -1, GroupFragments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDependenceEClass, ClassDependence.class, "ClassDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDependence_Classes(), theImplementationPackage.getImplementationClass(), null, "classes", null, 0, -1, ClassDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectDependenceEClass, AspectDependence.class, "AspectDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspectDependence_Aspects(), theImplementationPackage.getImplementationAspect(), null, "aspects", null, 0, -1, AspectDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDependenceEClass, FileDependence.class, "FileDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileDependence_Files(), theImplementationPackage.getImplementationFile(), null, "files", null, 0, -1, FileDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateDependenceEClass, TemplateDependence.class, "TemplateDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateDependence_Templates(), theImplementationPackage.getImplementationTemplate(), null, "templates", null, 0, -1, TemplateDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDependenceEClass, ComponentDependence.class, "ComponentDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDependence_Components(), theImplementationPackage.getImplementationComponent(), null, "components", null, 0, -1, ComponentDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderDependenceEClass, FolderDependence.class, "FolderDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolderDependence_Folders(), theImplementationPackage.getImplementationFolder(), null, "folders", null, 0, -1, FolderDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentDependenceEClass, FragmentDependence.class, "FragmentDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragmentDependence_Fragments(), theImplementationPackage.getImplementationFragment(), null, "fragments", null, 0, -1, FragmentDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intraDependenceEClass, IntraDependence.class, "IntraDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntraDependence_Dependences(), this.getDomainElement(), null, "dependences", null, 0, 1, IntraDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extraDependenceEClass, ExtraDependence.class, "ExtraDependence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtraDependence_Dependences(), this.getDomainElement(), null, "dependences", null, 0, 1, ExtraDependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableElementEClass, VariableElement.class, "VariableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DsamtypesPackageImpl
