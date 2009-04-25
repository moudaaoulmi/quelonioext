/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory("http:///ProductMetaModel.ecore"); 
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProductPackage.PRODUCT: return createProduct();
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS: return createProductImplementationElements();
			case ProductPackage.PRODUCT_CONTAINER: return createProductContainer();
			case ProductPackage.PRODUCT_RESOURCES_CONTAINER: return createProductResourcesContainer();
			case ProductPackage.PRODUCT_ENTITY: return createProductEntity();
			case ProductPackage.PRODUCT_COMPONENT: return createProductComponent();
			case ProductPackage.PRODUCT_CLASS: return createProductClass();
			case ProductPackage.PRODUCT_ASPECT: return createProductAspect();
			case ProductPackage.PRODUCT_FILE: return createProductFile();
			case ProductPackage.PRODUCT_FOLDER: return createProductFolder();
			case ProductPackage.PRODUCT_TEMPLATE: return createProductTemplate();
			case ProductPackage.PRODUCT_FRAGMENT: return createProductFragment();
			case ProductPackage.PRODUCT_FRAGMENT_CONTAINER: return createProductFragmentContainer();
			case ProductPackage.PRODUCT_FEATURES_CONFIGURATION: return createProductFeaturesConfiguration();
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION: return createProductFeatureConfiguration();
			case ProductPackage.PRODUCT_DOMAIN_MODELS: return createProductDomainModels();
			case ProductPackage.PRODUCT_DOMAIN_MODEL: return createProductDomainModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductImplementationElements createProductImplementationElements() {
		ProductImplementationElementsImpl productImplementationElements = new ProductImplementationElementsImpl();
		return productImplementationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductContainer createProductContainer() {
		ProductContainerImpl productContainer = new ProductContainerImpl();
		return productContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductResourcesContainer createProductResourcesContainer() {
		ProductResourcesContainerImpl productResourcesContainer = new ProductResourcesContainerImpl();
		return productResourcesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductEntity createProductEntity() {
		ProductEntityImpl productEntity = new ProductEntityImpl();
		return productEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductComponent createProductComponent() {
		ProductComponentImpl productComponent = new ProductComponentImpl();
		return productComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductClass createProductClass() {
		ProductClassImpl productClass = new ProductClassImpl();
		return productClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductAspect createProductAspect() {
		ProductAspectImpl productAspect = new ProductAspectImpl();
		return productAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFile createProductFile() {
		ProductFileImpl productFile = new ProductFileImpl();
		return productFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFolder createProductFolder() {
		ProductFolderImpl productFolder = new ProductFolderImpl();
		return productFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTemplate createProductTemplate() {
		ProductTemplateImpl productTemplate = new ProductTemplateImpl();
		return productTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFragment createProductFragment() {
		ProductFragmentImpl productFragment = new ProductFragmentImpl();
		return productFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFragmentContainer createProductFragmentContainer() {
		ProductFragmentContainerImpl productFragmentContainer = new ProductFragmentContainerImpl();
		return productFragmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeaturesConfiguration createProductFeaturesConfiguration() {
		ProductFeaturesConfigurationImpl productFeaturesConfiguration = new ProductFeaturesConfigurationImpl();
		return productFeaturesConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeatureConfiguration createProductFeatureConfiguration() {
		ProductFeatureConfigurationImpl productFeatureConfiguration = new ProductFeatureConfigurationImpl();
		return productFeatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDomainModels createProductDomainModels() {
		ProductDomainModelsImpl productDomainModels = new ProductDomainModelsImpl();
		return productDomainModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDomainModel createProductDomainModel() {
		ProductDomainModelImpl productDomainModel = new ProductDomainModelImpl();
		return productDomainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl
