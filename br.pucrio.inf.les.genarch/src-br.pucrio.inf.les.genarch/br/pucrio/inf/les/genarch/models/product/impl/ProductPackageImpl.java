/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.Product;
import br.pucrio.inf.les.genarch.models.product.ProductAspect;
import br.pucrio.inf.les.genarch.models.product.ProductClass;
import br.pucrio.inf.les.genarch.models.product.ProductComponent;
import br.pucrio.inf.les.genarch.models.product.ProductContainer;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModel;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModels;
import br.pucrio.inf.les.genarch.models.product.ProductEntity;
import br.pucrio.inf.les.genarch.models.product.ProductFactory;
import br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFile;
import br.pucrio.inf.les.genarch.models.product.ProductFolder;
import br.pucrio.inf.les.genarch.models.product.ProductFragment;
import br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer;
import br.pucrio.inf.les.genarch.models.product.ProductTemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productImplementationElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productResourcesContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFragmentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFeaturesConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDomainModelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDomainModelEClass = null;

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
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductPackageImpl() {
		super(eNS_URI, ProductFactory.eINSTANCE);
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
	public static ProductPackage init() {
		if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

		// Obtain or create and register package
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ProductPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProductPackage.createPackageContents();

		// Initialize created meta-data
		theProductPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductPackage.freeze();

		return theProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_ProductImplementationElements() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_ProductFeatures() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_DomainModels() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductImplementationElements() {
		return productImplementationElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductImplementationElements_Containers() {
		return (EReference)productImplementationElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductImplementationElements_FragmentContainers() {
		return (EReference)productImplementationElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductImplementationElements_ResourceContainers() {
		return (EReference)productImplementationElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductContainer() {
		return productContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductContainer_Name() {
		return (EAttribute)productContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductContainer_Components() {
		return (EReference)productContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductResourcesContainer() {
		return productResourcesContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductResourcesContainer_Name() {
		return (EAttribute)productResourcesContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductResourcesContainer_Folders() {
		return (EReference)productResourcesContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductResourcesContainer_Files() {
		return (EReference)productResourcesContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductResourcesContainer_Templates() {
		return (EReference)productResourcesContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductEntity() {
		return productEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductEntity_Name() {
		return (EAttribute)productEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductEntity_Path() {
		return (EAttribute)productEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductComponent() {
		return productComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductComponent_Classes() {
		return (EReference)productComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductComponent_Aspects() {
		return (EReference)productComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductComponent_Files() {
		return (EReference)productComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductComponent_Templates() {
		return (EReference)productComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductComponent_SubComponents() {
		return (EReference)productComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductClass() {
		return productClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductAspect() {
		return productAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFile() {
		return productFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFolder() {
		return productFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFolder_SubFolders() {
		return (EReference)productFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFolder_Files() {
		return (EReference)productFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFolder_Templates() {
		return (EReference)productFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductTemplate() {
		return productTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductTemplate_GenerateToPath() {
		return (EAttribute)productTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFragment() {
		return productFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFragment_Content() {
		return (EAttribute)productFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFragmentContainer() {
		return productFragmentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFragmentContainer_Name() {
		return (EAttribute)productFragmentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFragmentContainer_Fragments() {
		return (EReference)productFragmentContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFeaturesConfiguration() {
		return productFeaturesConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFeaturesConfiguration_Features() {
		return (EReference)productFeaturesConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeaturesConfiguration_Name() {
		return (EAttribute)productFeaturesConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeaturesConfiguration_Attribute() {
		return (EAttribute)productFeaturesConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFeatureConfiguration() {
		return productFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeatureConfiguration_Name() {
		return (EAttribute)productFeatureConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeatureConfiguration_Attribute() {
		return (EAttribute)productFeatureConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeatureConfiguration_Max() {
		return (EAttribute)productFeatureConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeatureConfiguration_Min() {
		return (EAttribute)productFeatureConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductFeatureConfiguration_IsSelected() {
		return (EAttribute)productFeatureConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFeatureConfiguration_Features() {
		return (EReference)productFeatureConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDomainModels() {
		return productDomainModelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDomainModels_DomainModel() {
		return (EReference)productDomainModelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDomainModel() {
		return productDomainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductDomainModel_Name() {
		return (EAttribute)productDomainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductDomainModel_Elements() {
		return (EAttribute)productDomainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactory getProductFactory() {
		return (ProductFactory)getEFactoryInstance();
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
		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS);
		createEReference(productEClass, PRODUCT__PRODUCT_FEATURES);
		createEReference(productEClass, PRODUCT__DOMAIN_MODELS);

		productImplementationElementsEClass = createEClass(PRODUCT_IMPLEMENTATION_ELEMENTS);
		createEReference(productImplementationElementsEClass, PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS);
		createEReference(productImplementationElementsEClass, PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS);
		createEReference(productImplementationElementsEClass, PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS);

		productContainerEClass = createEClass(PRODUCT_CONTAINER);
		createEAttribute(productContainerEClass, PRODUCT_CONTAINER__NAME);
		createEReference(productContainerEClass, PRODUCT_CONTAINER__COMPONENTS);

		productResourcesContainerEClass = createEClass(PRODUCT_RESOURCES_CONTAINER);
		createEAttribute(productResourcesContainerEClass, PRODUCT_RESOURCES_CONTAINER__NAME);
		createEReference(productResourcesContainerEClass, PRODUCT_RESOURCES_CONTAINER__FOLDERS);
		createEReference(productResourcesContainerEClass, PRODUCT_RESOURCES_CONTAINER__FILES);
		createEReference(productResourcesContainerEClass, PRODUCT_RESOURCES_CONTAINER__TEMPLATES);

		productEntityEClass = createEClass(PRODUCT_ENTITY);
		createEAttribute(productEntityEClass, PRODUCT_ENTITY__NAME);
		createEAttribute(productEntityEClass, PRODUCT_ENTITY__PATH);

		productComponentEClass = createEClass(PRODUCT_COMPONENT);
		createEReference(productComponentEClass, PRODUCT_COMPONENT__CLASSES);
		createEReference(productComponentEClass, PRODUCT_COMPONENT__ASPECTS);
		createEReference(productComponentEClass, PRODUCT_COMPONENT__FILES);
		createEReference(productComponentEClass, PRODUCT_COMPONENT__TEMPLATES);
		createEReference(productComponentEClass, PRODUCT_COMPONENT__SUB_COMPONENTS);

		productClassEClass = createEClass(PRODUCT_CLASS);

		productAspectEClass = createEClass(PRODUCT_ASPECT);

		productFileEClass = createEClass(PRODUCT_FILE);

		productFolderEClass = createEClass(PRODUCT_FOLDER);
		createEReference(productFolderEClass, PRODUCT_FOLDER__SUB_FOLDERS);
		createEReference(productFolderEClass, PRODUCT_FOLDER__FILES);
		createEReference(productFolderEClass, PRODUCT_FOLDER__TEMPLATES);

		productTemplateEClass = createEClass(PRODUCT_TEMPLATE);
		createEAttribute(productTemplateEClass, PRODUCT_TEMPLATE__GENERATE_TO_PATH);

		productFragmentEClass = createEClass(PRODUCT_FRAGMENT);
		createEAttribute(productFragmentEClass, PRODUCT_FRAGMENT__CONTENT);

		productFragmentContainerEClass = createEClass(PRODUCT_FRAGMENT_CONTAINER);
		createEAttribute(productFragmentContainerEClass, PRODUCT_FRAGMENT_CONTAINER__NAME);
		createEReference(productFragmentContainerEClass, PRODUCT_FRAGMENT_CONTAINER__FRAGMENTS);

		productFeaturesConfigurationEClass = createEClass(PRODUCT_FEATURES_CONFIGURATION);
		createEReference(productFeaturesConfigurationEClass, PRODUCT_FEATURES_CONFIGURATION__FEATURES);
		createEAttribute(productFeaturesConfigurationEClass, PRODUCT_FEATURES_CONFIGURATION__NAME);
		createEAttribute(productFeaturesConfigurationEClass, PRODUCT_FEATURES_CONFIGURATION__ATTRIBUTE);

		productFeatureConfigurationEClass = createEClass(PRODUCT_FEATURE_CONFIGURATION);
		createEAttribute(productFeatureConfigurationEClass, PRODUCT_FEATURE_CONFIGURATION__NAME);
		createEAttribute(productFeatureConfigurationEClass, PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE);
		createEAttribute(productFeatureConfigurationEClass, PRODUCT_FEATURE_CONFIGURATION__MAX);
		createEAttribute(productFeatureConfigurationEClass, PRODUCT_FEATURE_CONFIGURATION__MIN);
		createEAttribute(productFeatureConfigurationEClass, PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED);
		createEReference(productFeatureConfigurationEClass, PRODUCT_FEATURE_CONFIGURATION__FEATURES);

		productDomainModelsEClass = createEClass(PRODUCT_DOMAIN_MODELS);
		createEReference(productDomainModelsEClass, PRODUCT_DOMAIN_MODELS__DOMAIN_MODEL);

		productDomainModelEClass = createEClass(PRODUCT_DOMAIN_MODEL);
		createEAttribute(productDomainModelEClass, PRODUCT_DOMAIN_MODEL__NAME);
		createEAttribute(productDomainModelEClass, PRODUCT_DOMAIN_MODEL__ELEMENTS);
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
		productComponentEClass.getESuperTypes().add(this.getProductEntity());
		productClassEClass.getESuperTypes().add(this.getProductEntity());
		productAspectEClass.getESuperTypes().add(this.getProductEntity());
		productFileEClass.getESuperTypes().add(this.getProductEntity());
		productFolderEClass.getESuperTypes().add(this.getProductEntity());
		productTemplateEClass.getESuperTypes().add(this.getProductEntity());
		productFragmentEClass.getESuperTypes().add(this.getProductEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_ProductImplementationElements(), this.getProductImplementationElements(), null, "productImplementationElements", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductFeatures(), this.getProductFeaturesConfiguration(), null, "productFeatures", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_DomainModels(), this.getProductDomainModels(), null, "domainModels", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productImplementationElementsEClass, ProductImplementationElements.class, "ProductImplementationElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductImplementationElements_Containers(), this.getProductContainer(), null, "containers", null, 0, -1, ProductImplementationElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductImplementationElements_FragmentContainers(), this.getProductFragmentContainer(), null, "fragmentContainers", null, 0, -1, ProductImplementationElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductImplementationElements_ResourceContainers(), this.getProductResourcesContainer(), null, "resourceContainers", null, 0, -1, ProductImplementationElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productContainerEClass, ProductContainer.class, "ProductContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContainer_Components(), this.getProductComponent(), null, "components", null, 0, -1, ProductContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productResourcesContainerEClass, ProductResourcesContainer.class, "ProductResourcesContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductResourcesContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductResourcesContainer_Folders(), this.getProductFolder(), null, "folders", null, 0, -1, ProductResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductResourcesContainer_Files(), this.getProductFile(), null, "files", null, 0, -1, ProductResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductResourcesContainer_Templates(), this.getProductTemplate(), null, "templates", null, 0, -1, ProductResourcesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEntityEClass, ProductEntity.class, "ProductEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductEntity_Path(), ecorePackage.getEString(), "path", null, 0, 1, ProductEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productComponentEClass, ProductComponent.class, "ProductComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductComponent_Classes(), this.getProductClass(), null, "classes", null, 0, -1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductComponent_Aspects(), this.getProductAspect(), null, "aspects", null, 0, -1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductComponent_Files(), this.getProductFile(), null, "files", null, 0, -1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductComponent_Templates(), this.getProductTemplate(), null, "templates", null, 0, -1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductComponent_SubComponents(), this.getProductComponent(), null, "subComponents", null, 0, -1, ProductComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productClassEClass, ProductClass.class, "ProductClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productAspectEClass, ProductAspect.class, "ProductAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productFileEClass, ProductFile.class, "ProductFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productFolderEClass, ProductFolder.class, "ProductFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductFolder_SubFolders(), this.getProductFolder(), null, "subFolders", null, 0, -1, ProductFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFolder_Files(), this.getProductFile(), null, "files", null, 0, -1, ProductFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFolder_Templates(), this.getProductTemplate(), null, "templates", null, 0, -1, ProductFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTemplateEClass, ProductTemplate.class, "ProductTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductTemplate_GenerateToPath(), ecorePackage.getEString(), "generateToPath", null, 0, 1, ProductTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFragmentEClass, ProductFragment.class, "ProductFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductFragment_Content(), ecorePackage.getEString(), "content", "", 0, 1, ProductFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFragmentContainerEClass, ProductFragmentContainer.class, "ProductFragmentContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductFragmentContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductFragmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFragmentContainer_Fragments(), this.getProductFragment(), null, "fragments", null, 0, -1, ProductFragmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFeaturesConfigurationEClass, ProductFeaturesConfiguration.class, "ProductFeaturesConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductFeaturesConfiguration_Features(), this.getProductFeatureConfiguration(), null, "features", null, 0, -1, ProductFeaturesConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturesConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductFeaturesConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeaturesConfiguration_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, ProductFeaturesConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFeatureConfigurationEClass, ProductFeatureConfiguration.class, "ProductFeatureConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductFeatureConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeatureConfiguration_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, ProductFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeatureConfiguration_Max(), ecorePackage.getEInt(), "max", null, 0, 1, ProductFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeatureConfiguration_Min(), ecorePackage.getEInt(), "min", null, 0, 1, ProductFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductFeatureConfiguration_IsSelected(), ecorePackage.getEBoolean(), "isSelected", null, 0, 1, ProductFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductFeatureConfiguration_Features(), this.getProductFeatureConfiguration(), null, "features", null, 0, -1, ProductFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productDomainModelsEClass, ProductDomainModels.class, "ProductDomainModels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDomainModels_DomainModel(), this.getProductDomainModel(), null, "domainModel", null, 0, -1, ProductDomainModels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productDomainModelEClass, ProductDomainModel.class, "ProductDomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductDomainModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getProductDomainModel_Elements(), g1, "elements", null, 0, 1, ProductDomainModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProductPackageImpl
