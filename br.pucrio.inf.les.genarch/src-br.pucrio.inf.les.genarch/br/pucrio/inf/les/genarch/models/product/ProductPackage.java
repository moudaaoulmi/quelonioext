/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product;

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
 * @see br.pucrio.inf.les.genarch.models.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ProductMetaModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.pucrio.inf.les.genarch.models.product";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Product Implementation Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Product Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Domain Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DOMAIN_MODELS = 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImplementationElementsImpl <em>Implementation Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductImplementationElementsImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductImplementationElements()
	 * @generated
	 */
	int PRODUCT_IMPLEMENTATION_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Fragment Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS = 1;

	/**
	 * The feature id for the '<em><b>Resource Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS = 2;

	/**
	 * The number of structural features of the '<em>Implementation Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_IMPLEMENTATION_ELEMENTS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductContainerImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductContainer()
	 * @generated
	 */
	int PRODUCT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTAINER__COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductResourcesContainerImpl <em>Resources Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductResourcesContainerImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductResourcesContainer()
	 * @generated
	 */
	int PRODUCT_RESOURCES_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RESOURCES_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RESOURCES_CONTAINER__FOLDERS = 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RESOURCES_CONTAINER__FILES = 2;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RESOURCES_CONTAINER__TEMPLATES = 3;

	/**
	 * The number of structural features of the '<em>Resources Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_RESOURCES_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductEntityImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductEntity()
	 * @generated
	 */
	int PRODUCT_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ENTITY__PATH = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductComponent()
	 * @generated
	 */
	int PRODUCT_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__NAME = PRODUCT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__PATH = PRODUCT_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__CLASSES = PRODUCT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__ASPECTS = PRODUCT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__FILES = PRODUCT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__TEMPLATES = PRODUCT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT__SUB_COMPONENTS = PRODUCT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_COMPONENT_FEATURE_COUNT = PRODUCT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductClassImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductClass()
	 * @generated
	 */
	int PRODUCT_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CLASS__NAME = PRODUCT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CLASS__PATH = PRODUCT_ENTITY__PATH;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CLASS_FEATURE_COUNT = PRODUCT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductAspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductAspectImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductAspect()
	 * @generated
	 */
	int PRODUCT_ASPECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASPECT__NAME = PRODUCT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASPECT__PATH = PRODUCT_ENTITY__PATH;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASPECT_FEATURE_COUNT = PRODUCT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFileImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFile()
	 * @generated
	 */
	int PRODUCT_FILE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FILE__NAME = PRODUCT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FILE__PATH = PRODUCT_ENTITY__PATH;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FILE_FEATURE_COUNT = PRODUCT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFolderImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFolder()
	 * @generated
	 */
	int PRODUCT_FOLDER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FOLDER__NAME = PRODUCT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FOLDER__PATH = PRODUCT_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FOLDER__SUB_FOLDERS = PRODUCT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FOLDER__FILES = PRODUCT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FOLDER__TEMPLATES = PRODUCT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FOLDER_FEATURE_COUNT = PRODUCT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductTemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductTemplateImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductTemplate()
	 * @generated
	 */
	int PRODUCT_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEMPLATE__NAME = PRODUCT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEMPLATE__PATH = PRODUCT_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Generate To Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEMPLATE__GENERATE_TO_PATH = PRODUCT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEMPLATE_FEATURE_COUNT = PRODUCT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFragment()
	 * @generated
	 */
	int PRODUCT_FRAGMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FRAGMENT__NAME = PRODUCT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FRAGMENT__PATH = PRODUCT_ENTITY__PATH;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FRAGMENT__CONTENT = PRODUCT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FRAGMENT_FEATURE_COUNT = PRODUCT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentContainerImpl <em>Fragment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentContainerImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFragmentContainer()
	 * @generated
	 */
	int PRODUCT_FRAGMENT_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FRAGMENT_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FRAGMENT_CONTAINER__FRAGMENTS = 1;

	/**
	 * The number of structural features of the '<em>Fragment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FRAGMENT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeaturesConfigurationImpl <em>Features Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFeaturesConfigurationImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFeaturesConfiguration()
	 * @generated
	 */
	int PRODUCT_FEATURES_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURES_CONFIGURATION__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURES_CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURES_CONFIGURATION__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Features Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURES_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl <em>Feature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFeatureConfiguration()
	 * @generated
	 */
	int PRODUCT_FEATURE_CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CONFIGURATION__MAX = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CONFIGURATION__MIN = 3;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED = 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CONFIGURATION__FEATURES = 5;

	/**
	 * The number of structural features of the '<em>Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelsImpl <em>Domain Models</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelsImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductDomainModels()
	 * @generated
	 */
	int PRODUCT_DOMAIN_MODELS = 15;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DOMAIN_MODELS__DOMAIN_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Domain Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DOMAIN_MODELS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelImpl
	 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductDomainModel()
	 * @generated
	 */
	int PRODUCT_DOMAIN_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DOMAIN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DOMAIN_MODEL__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DOMAIN_MODEL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference '{@link br.pucrio.inf.les.genarch.models.product.Product#getProductImplementationElements <em>Product Implementation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Implementation Elements</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.Product#getProductImplementationElements()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductImplementationElements();

	/**
	 * Returns the meta object for the containment reference '{@link br.pucrio.inf.les.genarch.models.product.Product#getProductFeatures <em>Product Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Features</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.Product#getProductFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link br.pucrio.inf.les.genarch.models.product.Product#getDomainModels <em>Domain Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Models</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.Product#getDomainModels()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_DomainModels();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductImplementationElements <em>Implementation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Elements</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductImplementationElements
	 * @generated
	 */
	EClass getProductImplementationElements();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getContainers()
	 * @see #getProductImplementationElements()
	 * @generated
	 */
	EReference getProductImplementationElements_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getFragmentContainers <em>Fragment Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragment Containers</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getFragmentContainers()
	 * @see #getProductImplementationElements()
	 * @generated
	 */
	EReference getProductImplementationElements_FragmentContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getResourceContainers <em>Resource Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Containers</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getResourceContainers()
	 * @see #getProductImplementationElements()
	 * @generated
	 */
	EReference getProductImplementationElements_ResourceContainers();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductContainer
	 * @generated
	 */
	EClass getProductContainer();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductContainer#getName()
	 * @see #getProductContainer()
	 * @generated
	 */
	EAttribute getProductContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductContainer#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductContainer#getComponents()
	 * @see #getProductContainer()
	 * @generated
	 */
	EReference getProductContainer_Components();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer <em>Resources Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer
	 * @generated
	 */
	EClass getProductResourcesContainer();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getName()
	 * @see #getProductResourcesContainer()
	 * @generated
	 */
	EAttribute getProductResourcesContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getFolders()
	 * @see #getProductResourcesContainer()
	 * @generated
	 */
	EReference getProductResourcesContainer_Folders();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getFiles()
	 * @see #getProductResourcesContainer()
	 * @generated
	 */
	EReference getProductResourcesContainer_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer#getTemplates()
	 * @see #getProductResourcesContainer()
	 * @generated
	 */
	EReference getProductResourcesContainer_Templates();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductEntity
	 * @generated
	 */
	EClass getProductEntity();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductEntity#getName()
	 * @see #getProductEntity()
	 * @generated
	 */
	EAttribute getProductEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductEntity#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductEntity#getPath()
	 * @see #getProductEntity()
	 * @generated
	 */
	EAttribute getProductEntity_Path();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductComponent
	 * @generated
	 */
	EClass getProductComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductComponent#getClasses()
	 * @see #getProductComponent()
	 * @generated
	 */
	EReference getProductComponent_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductComponent#getAspects()
	 * @see #getProductComponent()
	 * @generated
	 */
	EReference getProductComponent_Aspects();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductComponent#getFiles()
	 * @see #getProductComponent()
	 * @generated
	 */
	EReference getProductComponent_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductComponent#getTemplates()
	 * @see #getProductComponent()
	 * @generated
	 */
	EReference getProductComponent_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getSubComponents <em>Sub Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Components</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductComponent#getSubComponents()
	 * @see #getProductComponent()
	 * @generated
	 */
	EReference getProductComponent_SubComponents();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductClass
	 * @generated
	 */
	EClass getProductClass();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductAspect
	 * @generated
	 */
	EClass getProductAspect();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFile
	 * @generated
	 */
	EClass getProductFile();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFolder
	 * @generated
	 */
	EClass getProductFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductFolder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFolder#getSubFolders()
	 * @see #getProductFolder()
	 * @generated
	 */
	EReference getProductFolder_SubFolders();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductFolder#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFolder#getFiles()
	 * @see #getProductFolder()
	 * @generated
	 */
	EReference getProductFolder_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductFolder#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFolder#getTemplates()
	 * @see #getProductFolder()
	 * @generated
	 */
	EReference getProductFolder_Templates();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductTemplate
	 * @generated
	 */
	EClass getProductTemplate();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductTemplate#getGenerateToPath <em>Generate To Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate To Path</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductTemplate#getGenerateToPath()
	 * @see #getProductTemplate()
	 * @generated
	 */
	EAttribute getProductTemplate_GenerateToPath();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFragment
	 * @generated
	 */
	EClass getProductFragment();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFragment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFragment#getContent()
	 * @see #getProductFragment()
	 * @generated
	 */
	EAttribute getProductFragment_Content();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer <em>Fragment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Container</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer
	 * @generated
	 */
	EClass getProductFragmentContainer();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer#getName()
	 * @see #getProductFragmentContainer()
	 * @generated
	 */
	EAttribute getProductFragmentContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer#getFragments()
	 * @see #getProductFragmentContainer()
	 * @generated
	 */
	EReference getProductFragmentContainer_Fragments();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration <em>Features Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Configuration</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration
	 * @generated
	 */
	EClass getProductFeaturesConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration#getFeatures()
	 * @see #getProductFeaturesConfiguration()
	 * @generated
	 */
	EReference getProductFeaturesConfiguration_Features();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration#getName()
	 * @see #getProductFeaturesConfiguration()
	 * @generated
	 */
	EAttribute getProductFeaturesConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration#getAttribute()
	 * @see #getProductFeaturesConfiguration()
	 * @generated
	 */
	EAttribute getProductFeaturesConfiguration_Attribute();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration <em>Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Configuration</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration
	 * @generated
	 */
	EClass getProductFeatureConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getName()
	 * @see #getProductFeatureConfiguration()
	 * @generated
	 */
	EAttribute getProductFeatureConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getAttribute()
	 * @see #getProductFeatureConfiguration()
	 * @generated
	 */
	EAttribute getProductFeatureConfiguration_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getMax()
	 * @see #getProductFeatureConfiguration()
	 * @generated
	 */
	EAttribute getProductFeatureConfiguration_Max();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getMin()
	 * @see #getProductFeatureConfiguration()
	 * @generated
	 */
	EAttribute getProductFeatureConfiguration_Min();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#isIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#isIsSelected()
	 * @see #getProductFeatureConfiguration()
	 * @generated
	 */
	EAttribute getProductFeatureConfiguration_IsSelected();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration#getFeatures()
	 * @see #getProductFeatureConfiguration()
	 * @generated
	 */
	EReference getProductFeatureConfiguration_Features();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductDomainModels <em>Domain Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Models</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductDomainModels
	 * @generated
	 */
	EClass getProductDomainModels();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.models.product.ProductDomainModels#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Model</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductDomainModels#getDomainModel()
	 * @see #getProductDomainModels()
	 * @generated
	 */
	EReference getProductDomainModels_DomainModel();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.models.product.ProductDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductDomainModel
	 * @generated
	 */
	EClass getProductDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductDomainModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductDomainModel#getName()
	 * @see #getProductDomainModel()
	 * @generated
	 */
	EAttribute getProductDomainModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.models.product.ProductDomainModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductDomainModel#getElements()
	 * @see #getProductDomainModel()
	 * @generated
	 */
	EAttribute getProductDomainModel_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductFactory getProductFactory();

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
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Product Implementation Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS = eINSTANCE.getProduct_ProductImplementationElements();

		/**
		 * The meta object literal for the '<em><b>Product Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_FEATURES = eINSTANCE.getProduct_ProductFeatures();

		/**
		 * The meta object literal for the '<em><b>Domain Models</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__DOMAIN_MODELS = eINSTANCE.getProduct_DomainModels();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImplementationElementsImpl <em>Implementation Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductImplementationElementsImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductImplementationElements()
		 * @generated
		 */
		EClass PRODUCT_IMPLEMENTATION_ELEMENTS = eINSTANCE.getProductImplementationElements();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS = eINSTANCE.getProductImplementationElements_Containers();

		/**
		 * The meta object literal for the '<em><b>Fragment Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS = eINSTANCE.getProductImplementationElements_FragmentContainers();

		/**
		 * The meta object literal for the '<em><b>Resource Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS = eINSTANCE.getProductImplementationElements_ResourceContainers();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductContainerImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductContainer()
		 * @generated
		 */
		EClass PRODUCT_CONTAINER = eINSTANCE.getProductContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTAINER__NAME = eINSTANCE.getProductContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTAINER__COMPONENTS = eINSTANCE.getProductContainer_Components();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductResourcesContainerImpl <em>Resources Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductResourcesContainerImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductResourcesContainer()
		 * @generated
		 */
		EClass PRODUCT_RESOURCES_CONTAINER = eINSTANCE.getProductResourcesContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_RESOURCES_CONTAINER__NAME = eINSTANCE.getProductResourcesContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_RESOURCES_CONTAINER__FOLDERS = eINSTANCE.getProductResourcesContainer_Folders();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_RESOURCES_CONTAINER__FILES = eINSTANCE.getProductResourcesContainer_Files();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_RESOURCES_CONTAINER__TEMPLATES = eINSTANCE.getProductResourcesContainer_Templates();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductEntityImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductEntity()
		 * @generated
		 */
		EClass PRODUCT_ENTITY = eINSTANCE.getProductEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ENTITY__NAME = eINSTANCE.getProductEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ENTITY__PATH = eINSTANCE.getProductEntity_Path();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductComponent()
		 * @generated
		 */
		EClass PRODUCT_COMPONENT = eINSTANCE.getProductComponent();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COMPONENT__CLASSES = eINSTANCE.getProductComponent_Classes();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COMPONENT__ASPECTS = eINSTANCE.getProductComponent_Aspects();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COMPONENT__FILES = eINSTANCE.getProductComponent_Files();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COMPONENT__TEMPLATES = eINSTANCE.getProductComponent_Templates();

		/**
		 * The meta object literal for the '<em><b>Sub Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_COMPONENT__SUB_COMPONENTS = eINSTANCE.getProductComponent_SubComponents();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductClassImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductClass()
		 * @generated
		 */
		EClass PRODUCT_CLASS = eINSTANCE.getProductClass();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductAspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductAspectImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductAspect()
		 * @generated
		 */
		EClass PRODUCT_ASPECT = eINSTANCE.getProductAspect();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFileImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFile()
		 * @generated
		 */
		EClass PRODUCT_FILE = eINSTANCE.getProductFile();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFolderImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFolder()
		 * @generated
		 */
		EClass PRODUCT_FOLDER = eINSTANCE.getProductFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FOLDER__SUB_FOLDERS = eINSTANCE.getProductFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FOLDER__FILES = eINSTANCE.getProductFolder_Files();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FOLDER__TEMPLATES = eINSTANCE.getProductFolder_Templates();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductTemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductTemplateImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductTemplate()
		 * @generated
		 */
		EClass PRODUCT_TEMPLATE = eINSTANCE.getProductTemplate();

		/**
		 * The meta object literal for the '<em><b>Generate To Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TEMPLATE__GENERATE_TO_PATH = eINSTANCE.getProductTemplate_GenerateToPath();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFragment()
		 * @generated
		 */
		EClass PRODUCT_FRAGMENT = eINSTANCE.getProductFragment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FRAGMENT__CONTENT = eINSTANCE.getProductFragment_Content();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentContainerImpl <em>Fragment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFragmentContainerImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFragmentContainer()
		 * @generated
		 */
		EClass PRODUCT_FRAGMENT_CONTAINER = eINSTANCE.getProductFragmentContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FRAGMENT_CONTAINER__NAME = eINSTANCE.getProductFragmentContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FRAGMENT_CONTAINER__FRAGMENTS = eINSTANCE.getProductFragmentContainer_Fragments();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeaturesConfigurationImpl <em>Features Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFeaturesConfigurationImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFeaturesConfiguration()
		 * @generated
		 */
		EClass PRODUCT_FEATURES_CONFIGURATION = eINSTANCE.getProductFeaturesConfiguration();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURES_CONFIGURATION__FEATURES = eINSTANCE.getProductFeaturesConfiguration_Features();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURES_CONFIGURATION__NAME = eINSTANCE.getProductFeaturesConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURES_CONFIGURATION__ATTRIBUTE = eINSTANCE.getProductFeaturesConfiguration_Attribute();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl <em>Feature Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductFeatureConfiguration()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_CONFIGURATION = eINSTANCE.getProductFeatureConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CONFIGURATION__NAME = eINSTANCE.getProductFeatureConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE = eINSTANCE.getProductFeatureConfiguration_Attribute();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CONFIGURATION__MAX = eINSTANCE.getProductFeatureConfiguration_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CONFIGURATION__MIN = eINSTANCE.getProductFeatureConfiguration_Min();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED = eINSTANCE.getProductFeatureConfiguration_IsSelected();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_CONFIGURATION__FEATURES = eINSTANCE.getProductFeatureConfiguration_Features();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelsImpl <em>Domain Models</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelsImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductDomainModels()
		 * @generated
		 */
		EClass PRODUCT_DOMAIN_MODELS = eINSTANCE.getProductDomainModels();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DOMAIN_MODELS__DOMAIN_MODEL = eINSTANCE.getProductDomainModels_DomainModel();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductDomainModelImpl
		 * @see br.pucrio.inf.les.genarch.models.product.impl.ProductPackageImpl#getProductDomainModel()
		 * @generated
		 */
		EClass PRODUCT_DOMAIN_MODEL = eINSTANCE.getProductDomainModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DOMAIN_MODEL__NAME = eINSTANCE.getProductDomainModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DOMAIN_MODEL__ELEMENTS = eINSTANCE.getProductDomainModel_Elements();

	}

} //ProductPackage
