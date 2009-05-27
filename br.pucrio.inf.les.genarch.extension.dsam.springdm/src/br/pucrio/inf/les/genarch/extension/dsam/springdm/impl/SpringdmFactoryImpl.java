/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm.impl;

import br.pucrio.inf.les.genarch.extension.dsam.springdm.*;

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
public class SpringdmFactoryImpl extends EFactoryImpl implements SpringdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpringdmFactory init() {
		try {
			SpringdmFactory theSpringdmFactory = (SpringdmFactory)EPackage.Registry.INSTANCE.getEFactory("http:///SpringOSGiDomainModel.ecore"); 
			if (theSpringdmFactory != null) {
				return theSpringdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpringdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringdmFactoryImpl() {
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
			case SpringdmPackage.SPRING_DYNAMIC_MODULES: return createSpringDynamicModules();
			case SpringdmPackage.BEAN: return createBean();
			case SpringdmPackage.BEAN_REFERENCE: return createBeanReference();
			case SpringdmPackage.OS_GI_REFERENCE: return createOSGiReference();
			case SpringdmPackage.BEANS: return createBeans();
			case SpringdmPackage.BUNDLE: return createBundle();
			case SpringdmPackage.BUNDLE_CONTENTS: return createBundleContents();
			case SpringdmPackage.REQUIRE_BUNDLE: return createRequireBundle();
			case SpringdmPackage.BUNDLE_REQ: return createBundleReq();
			case SpringdmPackage.BEAN_VARIANT: return createBeanVariant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringDynamicModules createSpringDynamicModules() {
		SpringDynamicModulesImpl springDynamicModules = new SpringDynamicModulesImpl();
		return springDynamicModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bean createBean() {
		BeanImpl bean = new BeanImpl();
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanReference createBeanReference() {
		BeanReferenceImpl beanReference = new BeanReferenceImpl();
		return beanReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSGiReference createOSGiReference() {
		OSGiReferenceImpl osGiReference = new OSGiReferenceImpl();
		return osGiReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beans createBeans() {
		BeansImpl beans = new BeansImpl();
		return beans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleContents createBundleContents() {
		BundleContentsImpl bundleContents = new BundleContentsImpl();
		return bundleContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequireBundle createRequireBundle() {
		RequireBundleImpl requireBundle = new RequireBundleImpl();
		return requireBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleReq createBundleReq() {
		BundleReqImpl bundleReq = new BundleReqImpl();
		return bundleReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanVariant createBeanVariant() {
		BeanVariantImpl beanVariant = new BeanVariantImpl();
		return beanVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringdmPackage getSpringdmPackage() {
		return (SpringdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpringdmPackage getPackage() {
		return SpringdmPackage.eINSTANCE;
	}

} //SpringdmFactoryImpl
