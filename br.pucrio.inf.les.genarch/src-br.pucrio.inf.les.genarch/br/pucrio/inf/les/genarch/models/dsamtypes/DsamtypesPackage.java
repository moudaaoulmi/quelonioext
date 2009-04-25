/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes;

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
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesFactory
 * @model kind="package"
 * @generated
 */
public interface DsamtypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsamtypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///DSAMElementTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.pucrio.inf.les.genarch.models.dsamtypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsamtypesPackage eINSTANCE = br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DomainElementImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupRelationshipImpl <em>Group Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupRelationshipImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupRelationship()
	 * @generated
	 */
	int GROUP_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_RELATIONSHIP__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Group Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_RELATIONSHIP_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.DependenceRelationshipImpl <em>Dependence Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DependenceRelationshipImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getDependenceRelationship()
	 * @generated
	 */
	int DEPENDENCE_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATIONSHIP__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Dependence Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATIONSHIP_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupClassImpl <em>Group Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupClassImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupClass()
	 * @generated
	 */
	int GROUP_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CLASS__NAME = GROUP_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CLASS__CLASSES = GROUP_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_CLASS_FEATURE_COUNT = GROUP_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupAspectsImpl <em>Group Aspects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupAspectsImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupAspects()
	 * @generated
	 */
	int GROUP_ASPECTS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ASPECTS__NAME = GROUP_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ASPECTS__ASPECTS = GROUP_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Aspects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ASPECTS_FEATURE_COUNT = GROUP_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFilesImpl <em>Group Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFilesImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupFiles()
	 * @generated
	 */
	int GROUP_FILES = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FILES__NAME = GROUP_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FILES__FILES = GROUP_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FILES_FEATURE_COUNT = GROUP_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupTemplatesImpl <em>Group Templates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupTemplatesImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupTemplates()
	 * @generated
	 */
	int GROUP_TEMPLATES = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TEMPLATES__NAME = GROUP_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TEMPLATES__TEMPLATES = GROUP_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TEMPLATES_FEATURE_COUNT = GROUP_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupComponentsImpl <em>Group Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupComponentsImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupComponents()
	 * @generated
	 */
	int GROUP_COMPONENTS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COMPONENTS__NAME = GROUP_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COMPONENTS__COMPONENTS = GROUP_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COMPONENTS_FEATURE_COUNT = GROUP_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFoldersImpl <em>Group Folders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFoldersImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupFolders()
	 * @generated
	 */
	int GROUP_FOLDERS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FOLDERS__NAME = GROUP_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FOLDERS__FOLDERS = GROUP_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Folders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FOLDERS_FEATURE_COUNT = GROUP_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFragmentsImpl <em>Group Fragments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFragmentsImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupFragments()
	 * @generated
	 */
	int GROUP_FRAGMENTS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FRAGMENTS__NAME = GROUP_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FRAGMENTS__FRAGMENTS = GROUP_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Fragments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FRAGMENTS_FEATURE_COUNT = GROUP_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.ClassDependenceImpl <em>Class Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.ClassDependenceImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getClassDependence()
	 * @generated
	 */
	int CLASS_DEPENDENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCE__NAME = DEPENDENCE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCE__CLASSES = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEPENDENCE_FEATURE_COUNT = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.AspectDependenceImpl <em>Aspect Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.AspectDependenceImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getAspectDependence()
	 * @generated
	 */
	int ASPECT_DEPENDENCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEPENDENCE__NAME = DEPENDENCE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEPENDENCE__ASPECTS = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aspect Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_DEPENDENCE_FEATURE_COUNT = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.FileDependenceImpl <em>File Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.FileDependenceImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getFileDependence()
	 * @generated
	 */
	int FILE_DEPENDENCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEPENDENCE__NAME = DEPENDENCE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEPENDENCE__FILES = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEPENDENCE_FEATURE_COUNT = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.TemplateDependenceImpl <em>Template Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.TemplateDependenceImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getTemplateDependence()
	 * @generated
	 */
	int TEMPLATE_DEPENDENCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEPENDENCE__NAME = DEPENDENCE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEPENDENCE__TEMPLATES = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEPENDENCE_FEATURE_COUNT = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.ComponentDependenceImpl <em>Component Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.ComponentDependenceImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getComponentDependence()
	 * @generated
	 */
	int COMPONENT_DEPENDENCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEPENDENCE__NAME = DEPENDENCE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEPENDENCE__COMPONENTS = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEPENDENCE_FEATURE_COUNT = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.FolderDependenceImpl <em>Folder Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.FolderDependenceImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getFolderDependence()
	 * @generated
	 */
	int FOLDER_DEPENDENCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_DEPENDENCE__NAME = DEPENDENCE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_DEPENDENCE__FOLDERS = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_DEPENDENCE_FEATURE_COUNT = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.FragmentDependenceImpl <em>Fragment Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.FragmentDependenceImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getFragmentDependence()
	 * @generated
	 */
	int FRAGMENT_DEPENDENCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DEPENDENCE__NAME = DEPENDENCE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DEPENDENCE__FRAGMENTS = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DEPENDENCE_FEATURE_COUNT = DEPENDENCE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.VariableElementImpl <em>Variable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.VariableElementImpl
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getVariableElement()
	 * @generated
	 */
	int VARIABLE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Variable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ELEMENT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement#getName()
	 * @see #getDomainElement()
	 * @generated
	 */
	EAttribute getDomainElement_Name();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship <em>Group Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Relationship</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship
	 * @generated
	 */
	EClass getGroupRelationship();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship <em>Dependence Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence Relationship</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship
	 * @generated
	 */
	EClass getDependenceRelationship();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass <em>Group Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Class</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass
	 * @generated
	 */
	EClass getGroupClass();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass#getClasses()
	 * @see #getGroupClass()
	 * @generated
	 */
	EReference getGroupClass_Classes();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects <em>Group Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Aspects</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects
	 * @generated
	 */
	EClass getGroupAspects();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects#getAspects()
	 * @see #getGroupAspects()
	 * @generated
	 */
	EReference getGroupAspects_Aspects();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles <em>Group Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles
	 * @generated
	 */
	EClass getGroupFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles#getFiles()
	 * @see #getGroupFiles()
	 * @generated
	 */
	EReference getGroupFiles_Files();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates <em>Group Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates
	 * @generated
	 */
	EClass getGroupTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates#getTemplates()
	 * @see #getGroupTemplates()
	 * @generated
	 */
	EReference getGroupTemplates_Templates();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents <em>Group Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Components</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents
	 * @generated
	 */
	EClass getGroupComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents#getComponents()
	 * @see #getGroupComponents()
	 * @generated
	 */
	EReference getGroupComponents_Components();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders <em>Group Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Folders</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders
	 * @generated
	 */
	EClass getGroupFolders();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders#getFolders()
	 * @see #getGroupFolders()
	 * @generated
	 */
	EReference getGroupFolders_Folders();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments <em>Group Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Fragments</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments
	 * @generated
	 */
	EClass getGroupFragments();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments#getFragments()
	 * @see #getGroupFragments()
	 * @generated
	 */
	EReference getGroupFragments_Fragments();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence <em>Class Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Dependence</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence
	 * @generated
	 */
	EClass getClassDependence();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence#getClasses()
	 * @see #getClassDependence()
	 * @generated
	 */
	EReference getClassDependence_Classes();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence <em>Aspect Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Dependence</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence
	 * @generated
	 */
	EClass getAspectDependence();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence#getAspects()
	 * @see #getAspectDependence()
	 * @generated
	 */
	EReference getAspectDependence_Aspects();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence <em>File Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Dependence</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence
	 * @generated
	 */
	EClass getFileDependence();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence#getFiles()
	 * @see #getFileDependence()
	 * @generated
	 */
	EReference getFileDependence_Files();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence <em>Template Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Dependence</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence
	 * @generated
	 */
	EClass getTemplateDependence();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence#getTemplates()
	 * @see #getTemplateDependence()
	 * @generated
	 */
	EReference getTemplateDependence_Templates();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence <em>Component Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Dependence</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence
	 * @generated
	 */
	EClass getComponentDependence();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence#getComponents()
	 * @see #getComponentDependence()
	 * @generated
	 */
	EReference getComponentDependence_Components();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence <em>Folder Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Dependence</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence
	 * @generated
	 */
	EClass getFolderDependence();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence#getFolders()
	 * @see #getFolderDependence()
	 * @generated
	 */
	EReference getFolderDependence_Folders();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence <em>Fragment Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Dependence</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence
	 * @generated
	 */
	EClass getFragmentDependence();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence#getFragments()
	 * @see #getFragmentDependence()
	 * @generated
	 */
	EReference getFragmentDependence_Fragments();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement <em>Variable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Element</em>'.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement
	 * @generated
	 */
	EClass getVariableElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DsamtypesFactory getDsamtypesFactory();

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
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.DomainElementImpl <em>Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DomainElementImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getDomainElement()
		 * @generated
		 */
		EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ELEMENT__NAME = eINSTANCE.getDomainElement_Name();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupRelationshipImpl <em>Group Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupRelationshipImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupRelationship()
		 * @generated
		 */
		EClass GROUP_RELATIONSHIP = eINSTANCE.getGroupRelationship();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.DependenceRelationshipImpl <em>Dependence Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DependenceRelationshipImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getDependenceRelationship()
		 * @generated
		 */
		EClass DEPENDENCE_RELATIONSHIP = eINSTANCE.getDependenceRelationship();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupClassImpl <em>Group Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupClassImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupClass()
		 * @generated
		 */
		EClass GROUP_CLASS = eINSTANCE.getGroupClass();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_CLASS__CLASSES = eINSTANCE.getGroupClass_Classes();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupAspectsImpl <em>Group Aspects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupAspectsImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupAspects()
		 * @generated
		 */
		EClass GROUP_ASPECTS = eINSTANCE.getGroupAspects();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_ASPECTS__ASPECTS = eINSTANCE.getGroupAspects_Aspects();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFilesImpl <em>Group Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFilesImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupFiles()
		 * @generated
		 */
		EClass GROUP_FILES = eINSTANCE.getGroupFiles();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_FILES__FILES = eINSTANCE.getGroupFiles_Files();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupTemplatesImpl <em>Group Templates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupTemplatesImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupTemplates()
		 * @generated
		 */
		EClass GROUP_TEMPLATES = eINSTANCE.getGroupTemplates();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_TEMPLATES__TEMPLATES = eINSTANCE.getGroupTemplates_Templates();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupComponentsImpl <em>Group Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupComponentsImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupComponents()
		 * @generated
		 */
		EClass GROUP_COMPONENTS = eINSTANCE.getGroupComponents();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_COMPONENTS__COMPONENTS = eINSTANCE.getGroupComponents_Components();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFoldersImpl <em>Group Folders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFoldersImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupFolders()
		 * @generated
		 */
		EClass GROUP_FOLDERS = eINSTANCE.getGroupFolders();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_FOLDERS__FOLDERS = eINSTANCE.getGroupFolders_Folders();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFragmentsImpl <em>Group Fragments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFragmentsImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getGroupFragments()
		 * @generated
		 */
		EClass GROUP_FRAGMENTS = eINSTANCE.getGroupFragments();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_FRAGMENTS__FRAGMENTS = eINSTANCE.getGroupFragments_Fragments();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.ClassDependenceImpl <em>Class Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.ClassDependenceImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getClassDependence()
		 * @generated
		 */
		EClass CLASS_DEPENDENCE = eINSTANCE.getClassDependence();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEPENDENCE__CLASSES = eINSTANCE.getClassDependence_Classes();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.AspectDependenceImpl <em>Aspect Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.AspectDependenceImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getAspectDependence()
		 * @generated
		 */
		EClass ASPECT_DEPENDENCE = eINSTANCE.getAspectDependence();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT_DEPENDENCE__ASPECTS = eINSTANCE.getAspectDependence_Aspects();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.FileDependenceImpl <em>File Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.FileDependenceImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getFileDependence()
		 * @generated
		 */
		EClass FILE_DEPENDENCE = eINSTANCE.getFileDependence();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DEPENDENCE__FILES = eINSTANCE.getFileDependence_Files();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.TemplateDependenceImpl <em>Template Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.TemplateDependenceImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getTemplateDependence()
		 * @generated
		 */
		EClass TEMPLATE_DEPENDENCE = eINSTANCE.getTemplateDependence();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_DEPENDENCE__TEMPLATES = eINSTANCE.getTemplateDependence_Templates();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.ComponentDependenceImpl <em>Component Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.ComponentDependenceImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getComponentDependence()
		 * @generated
		 */
		EClass COMPONENT_DEPENDENCE = eINSTANCE.getComponentDependence();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEPENDENCE__COMPONENTS = eINSTANCE.getComponentDependence_Components();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.FolderDependenceImpl <em>Folder Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.FolderDependenceImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getFolderDependence()
		 * @generated
		 */
		EClass FOLDER_DEPENDENCE = eINSTANCE.getFolderDependence();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_DEPENDENCE__FOLDERS = eINSTANCE.getFolderDependence_Folders();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.FragmentDependenceImpl <em>Fragment Dependence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.FragmentDependenceImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getFragmentDependence()
		 * @generated
		 */
		EClass FRAGMENT_DEPENDENCE = eINSTANCE.getFragmentDependence();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_DEPENDENCE__FRAGMENTS = eINSTANCE.getFragmentDependence_Fragments();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.VariableElementImpl <em>Variable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.VariableElementImpl
		 * @see br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesPackageImpl#getVariableElement()
		 * @generated
		 */
		EClass VARIABLE_ELEMENT = eINSTANCE.getVariableElement();

	}

} //DsamtypesPackage
