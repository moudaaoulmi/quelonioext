/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation;

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
 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory
 * @model kind="package"
 * @generated
 */
public interface ImplementationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "implementation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ImplementationMetaModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.pucrio.inf.les.genarch.models.implementation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationPackage eINSTANCE = br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Resources Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__RESOURCES_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Fragments Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__FRAGMENTS_CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationContainerImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationContainer()
	 * @generated
	 */
	int IMPLEMENTATION_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONTAINER__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl <em>Resources Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationResourcesContainer()
	 * @generated
	 */
	int IMPLEMENTATION_RESOURCES_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_RESOURCES_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS = 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_RESOURCES_CONTAINER__FILES = 2;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES = 3;

	/**
	 * The number of structural features of the '<em>Resources Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_RESOURCES_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentContainerImpl <em>Fragment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentContainerImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFragmentContainer()
	 * @generated
	 */
	int IMPLEMENTATION_FRAGMENT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FRAGMENT_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FRAGMENT_CONTAINER__FRAGMENTS = 1;

	/**
	 * The number of structural features of the '<em>Fragment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FRAGMENT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationEntityImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationEntity()
	 * @generated
	 */
	int IMPLEMENTATION_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ENTITY__PATH = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationComponent()
	 * @generated
	 */
	int IMPLEMENTATION_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT__NAME = IMPLEMENTATION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT__PATH = IMPLEMENTATION_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT__CLASSES = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT__ASPECTS = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT__TEMPLATES = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT__FILES = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT__SUB_COMPONENTS = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_FEATURE_COUNT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationClassImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationClass()
	 * @generated
	 */
	int IMPLEMENTATION_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS__NAME = IMPLEMENTATION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS__PATH = IMPLEMENTATION_ENTITY__PATH;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CLASS_FEATURE_COUNT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationAspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationAspectImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationAspect()
	 * @generated
	 */
	int IMPLEMENTATION_ASPECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ASPECT__NAME = IMPLEMENTATION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ASPECT__PATH = IMPLEMENTATION_ENTITY__PATH;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ASPECT_FEATURE_COUNT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFileImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFile()
	 * @generated
	 */
	int IMPLEMENTATION_FILE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FILE__NAME = IMPLEMENTATION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FILE__PATH = IMPLEMENTATION_ENTITY__PATH;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FILE_FEATURE_COUNT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationTemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationTemplateImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationTemplate()
	 * @generated
	 */
	int IMPLEMENTATION_TEMPLATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TEMPLATE__NAME = IMPLEMENTATION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TEMPLATE__PATH = IMPLEMENTATION_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Generation Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TEMPLATE__GENERATION_PATH = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TEMPLATE_FEATURE_COUNT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFolderImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFolder()
	 * @generated
	 */
	int IMPLEMENTATION_FOLDER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FOLDER__NAME = IMPLEMENTATION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FOLDER__PATH = IMPLEMENTATION_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FOLDER__SUB_FOLDERS = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FOLDER__FILES = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FOLDER__TEMPLATES = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FOLDER_FEATURE_COUNT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentImpl
	 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFragment()
	 * @generated
	 */
	int IMPLEMENTATION_FRAGMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FRAGMENT__NAME = IMPLEMENTATION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FRAGMENT__PATH = IMPLEMENTATION_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FRAGMENT__CONTENT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FRAGMENT_FEATURE_COUNT = IMPLEMENTATION_ENTITY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.Implementation#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.Implementation#getContainers()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.Implementation#getResourcesContainer <em>Resources Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.Implementation#getResourcesContainer()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_ResourcesContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.Implementation#getFragmentsContainer <em>Fragments Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.Implementation#getFragmentsContainer()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_FragmentsContainer();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer
	 * @generated
	 */
	EClass getImplementationContainer();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer#getName()
	 * @see #getImplementationContainer()
	 * @generated
	 */
	EAttribute getImplementationContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer#getComponents()
	 * @see #getImplementationContainer()
	 * @generated
	 */
	EReference getImplementationContainer_Components();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer <em>Resources Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer
	 * @generated
	 */
	EClass getImplementationResourcesContainer();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getName()
	 * @see #getImplementationResourcesContainer()
	 * @generated
	 */
	EAttribute getImplementationResourcesContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getFolders()
	 * @see #getImplementationResourcesContainer()
	 * @generated
	 */
	EReference getImplementationResourcesContainer_Folders();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getFiles()
	 * @see #getImplementationResourcesContainer()
	 * @generated
	 */
	EReference getImplementationResourcesContainer_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer#getTemplates()
	 * @see #getImplementationResourcesContainer()
	 * @generated
	 */
	EReference getImplementationResourcesContainer_Templates();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer <em>Fragment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer
	 * @generated
	 */
	EClass getImplementationFragmentContainer();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer#getName()
	 * @see #getImplementationFragmentContainer()
	 * @generated
	 */
	EAttribute getImplementationFragmentContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer#getFragments()
	 * @see #getImplementationFragmentContainer()
	 * @generated
	 */
	EReference getImplementationFragmentContainer_Fragments();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity
	 * @generated
	 */
	EClass getImplementationEntity();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity#getName()
	 * @see #getImplementationEntity()
	 * @generated
	 */
	EAttribute getImplementationEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity#getPath()
	 * @see #getImplementationEntity()
	 * @generated
	 */
	EAttribute getImplementationEntity_Path();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent
	 * @generated
	 */
	EClass getImplementationComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getClasses()
	 * @see #getImplementationComponent()
	 * @generated
	 */
	EReference getImplementationComponent_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getAspects()
	 * @see #getImplementationComponent()
	 * @generated
	 */
	EReference getImplementationComponent_Aspects();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getTemplates()
	 * @see #getImplementationComponent()
	 * @generated
	 */
	EReference getImplementationComponent_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getFiles()
	 * @see #getImplementationComponent()
	 * @generated
	 */
	EReference getImplementationComponent_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getSubComponents <em>Sub Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Components</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent#getSubComponents()
	 * @see #getImplementationComponent()
	 * @generated
	 */
	EReference getImplementationComponent_SubComponents();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationClass
	 * @generated
	 */
	EClass getImplementationClass();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect
	 * @generated
	 */
	EClass getImplementationAspect();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFile
	 * @generated
	 */
	EClass getImplementationFile();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate
	 * @generated
	 */
	EClass getImplementationTemplate();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate#getGenerationPath <em>Generation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Path</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate#getGenerationPath()
	 * @see #getImplementationTemplate()
	 * @generated
	 */
	EAttribute getImplementationTemplate_GenerationPath();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder
	 * @generated
	 */
	EClass getImplementationFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder#getSubFolders()
	 * @see #getImplementationFolder()
	 * @generated
	 */
	EReference getImplementationFolder_SubFolders();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder#getFiles()
	 * @see #getImplementationFolder()
	 * @generated
	 */
	EReference getImplementationFolder_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder#getTemplates()
	 * @see #getImplementationFolder()
	 * @generated
	 */
	EReference getImplementationFolder_Templates();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment
	 * @generated
	 */
	EClass getImplementationFragment();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment#getContent()
	 * @see #getImplementationFragment()
	 * @generated
	 */
	EAttribute getImplementationFragment_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplementationFactory getImplementationFactory();

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
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__CONTAINERS = eINSTANCE.getImplementation_Containers();

		/**
		 * The meta object literal for the '<em><b>Resources Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__RESOURCES_CONTAINER = eINSTANCE.getImplementation_ResourcesContainer();

		/**
		 * The meta object literal for the '<em><b>Fragments Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__FRAGMENTS_CONTAINER = eINSTANCE.getImplementation_FragmentsContainer();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationContainerImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationContainer()
		 * @generated
		 */
		EClass IMPLEMENTATION_CONTAINER = eINSTANCE.getImplementationContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_CONTAINER__NAME = eINSTANCE.getImplementationContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_CONTAINER__COMPONENTS = eINSTANCE.getImplementationContainer_Components();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl <em>Resources Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationResourcesContainer()
		 * @generated
		 */
		EClass IMPLEMENTATION_RESOURCES_CONTAINER = eINSTANCE.getImplementationResourcesContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_RESOURCES_CONTAINER__NAME = eINSTANCE.getImplementationResourcesContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS = eINSTANCE.getImplementationResourcesContainer_Folders();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_RESOURCES_CONTAINER__FILES = eINSTANCE.getImplementationResourcesContainer_Files();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES = eINSTANCE.getImplementationResourcesContainer_Templates();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentContainerImpl <em>Fragment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentContainerImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFragmentContainer()
		 * @generated
		 */
		EClass IMPLEMENTATION_FRAGMENT_CONTAINER = eINSTANCE.getImplementationFragmentContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_FRAGMENT_CONTAINER__NAME = eINSTANCE.getImplementationFragmentContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_FRAGMENT_CONTAINER__FRAGMENTS = eINSTANCE.getImplementationFragmentContainer_Fragments();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationEntityImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationEntity()
		 * @generated
		 */
		EClass IMPLEMENTATION_ENTITY = eINSTANCE.getImplementationEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_ENTITY__NAME = eINSTANCE.getImplementationEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_ENTITY__PATH = eINSTANCE.getImplementationEntity_Path();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationComponent()
		 * @generated
		 */
		EClass IMPLEMENTATION_COMPONENT = eINSTANCE.getImplementationComponent();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT__CLASSES = eINSTANCE.getImplementationComponent_Classes();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT__ASPECTS = eINSTANCE.getImplementationComponent_Aspects();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT__TEMPLATES = eINSTANCE.getImplementationComponent_Templates();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT__FILES = eINSTANCE.getImplementationComponent_Files();

		/**
		 * The meta object literal for the '<em><b>Sub Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT__SUB_COMPONENTS = eINSTANCE.getImplementationComponent_SubComponents();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationClassImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationClass()
		 * @generated
		 */
		EClass IMPLEMENTATION_CLASS = eINSTANCE.getImplementationClass();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationAspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationAspectImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationAspect()
		 * @generated
		 */
		EClass IMPLEMENTATION_ASPECT = eINSTANCE.getImplementationAspect();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFileImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFile()
		 * @generated
		 */
		EClass IMPLEMENTATION_FILE = eINSTANCE.getImplementationFile();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationTemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationTemplateImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationTemplate()
		 * @generated
		 */
		EClass IMPLEMENTATION_TEMPLATE = eINSTANCE.getImplementationTemplate();

		/**
		 * The meta object literal for the '<em><b>Generation Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TEMPLATE__GENERATION_PATH = eINSTANCE.getImplementationTemplate_GenerationPath();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFolderImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFolder()
		 * @generated
		 */
		EClass IMPLEMENTATION_FOLDER = eINSTANCE.getImplementationFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_FOLDER__SUB_FOLDERS = eINSTANCE.getImplementationFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_FOLDER__FILES = eINSTANCE.getImplementationFolder_Files();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_FOLDER__TEMPLATES = eINSTANCE.getImplementationFolder_Templates();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentImpl
		 * @see br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationPackageImpl#getImplementationFragment()
		 * @generated
		 */
		EClass IMPLEMENTATION_FRAGMENT = eINSTANCE.getImplementationFragment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_FRAGMENT__CONTENT = eINSTANCE.getImplementationFragment_Content();

	}

} //ImplementationPackage
