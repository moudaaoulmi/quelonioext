/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;

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
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmFactory
 * @model kind="package"
 * @generated
 */
public interface SpringdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "springdm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///SpringOSGiDomainModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.pucrio.inf.les.genarch.models.springdm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpringdmPackage eINSTANCE = br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringDynamicModulesImpl <em>Spring Dynamic Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringDynamicModulesImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getSpringDynamicModules()
	 * @generated
	 */
	int SPRING_DYNAMIC_MODULES = 0;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_DYNAMIC_MODULES__BUNDLES = 0;

	/**
	 * The number of structural features of the '<em>Spring Dynamic Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_DYNAMIC_MODULES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanImpl <em>Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBean()
	 * @generated
	 */
	int BEAN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN__NAME = DsamtypesPackage.GROUP_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN__CLASSES = DsamtypesPackage.GROUP_CLASS__CLASSES;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN__VARIANTS = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_FEATURE_COUNT = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanReferenceImpl <em>Bean Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanReferenceImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBeanReference()
	 * @generated
	 */
	int BEAN_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Bean Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.OSGiReferenceImpl <em>OS Gi Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.OSGiReferenceImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getOSGiReference()
	 * @generated
	 */
	int OS_GI_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_REFERENCE__BUNDLE = 1;

	/**
	 * The number of structural features of the '<em>OS Gi Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeansImpl <em>Beans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeansImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBeans()
	 * @generated
	 */
	int BEANS = 4;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS__BEANS = 0;

	/**
	 * The number of structural features of the '<em>Beans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEANS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NAME = DsamtypesPackage.VARIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__CONTENTS = DsamtypesPackage.VARIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Require Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__REQUIRE_BUNDLE = DsamtypesPackage.VARIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BEANS = DsamtypesPackage.VARIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = DsamtypesPackage.VARIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleContentsImpl <em>Bundle Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleContentsImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBundleContents()
	 * @generated
	 */
	int BUNDLE_CONTENTS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTENTS__NAME = DsamtypesPackage.FOLDER_DEPENDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTENTS__FOLDERS = DsamtypesPackage.FOLDER_DEPENDENCE__FOLDERS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTENTS__COMPONENTS = DsamtypesPackage.FOLDER_DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTENTS__FILES = DsamtypesPackage.FOLDER_DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bundle Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTENTS_FEATURE_COUNT = DsamtypesPackage.FOLDER_DEPENDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.RequireBundleImpl <em>Require Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.RequireBundleImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getRequireBundle()
	 * @generated
	 */
	int REQUIRE_BUNDLE = 7;

	/**
	 * The feature id for the '<em><b>Require Bundle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE__REQUIRE_BUNDLE = 0;

	/**
	 * The number of structural features of the '<em>Require Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleReqImpl <em>Bundle Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleReqImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBundleReq()
	 * @generated
	 */
	int BUNDLE_REQ = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQ__NAME = 0;

	/**
	 * The number of structural features of the '<em>Bundle Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQ_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanVariantImpl <em>Bean Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanVariantImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBeanVariant()
	 * @generated
	 */
	int BEAN_VARIANT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__NAME = DsamtypesPackage.GROUP_FRAGMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__FRAGMENTS = DsamtypesPackage.GROUP_FRAGMENTS__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__CLASSES = DsamtypesPackage.GROUP_FRAGMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Osgi Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__OSGI_REF = DsamtypesPackage.GROUP_FRAGMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bean Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__BEAN_REF = DsamtypesPackage.GROUP_FRAGMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bean Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT_FEATURE_COUNT = DsamtypesPackage.GROUP_FRAGMENTS_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules <em>Spring Dynamic Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Dynamic Modules</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules
	 * @generated
	 */
	EClass getSpringDynamicModules();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules#getBundles()
	 * @see #getSpringDynamicModules()
	 * @generated
	 */
	EReference getSpringDynamicModules_Bundles();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean
	 * @generated
	 */
	EClass getBean();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean#getVariants()
	 * @see #getBean()
	 * @generated
	 */
	EReference getBean_Variants();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference <em>Bean Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Reference</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference
	 * @generated
	 */
	EClass getBeanReference();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference#getName()
	 * @see #getBeanReference()
	 * @generated
	 */
	EAttribute getBeanReference_Name();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference <em>OS Gi Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Gi Reference</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference
	 * @generated
	 */
	EClass getOSGiReference();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getName()
	 * @see #getOSGiReference()
	 * @generated
	 */
	EAttribute getOSGiReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getBundle()
	 * @see #getOSGiReference()
	 * @generated
	 */
	EAttribute getOSGiReference_Bundle();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beans</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans
	 * @generated
	 */
	EClass getBeans();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beans</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans#getBeans()
	 * @see #getBeans()
	 * @generated
	 */
	EReference getBeans_Beans();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the containment reference '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getContents()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Contents();

	/**
	 * Returns the meta object for the containment reference '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getRequireBundle <em>Require Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require Bundle</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getRequireBundle()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_RequireBundle();

	/**
	 * Returns the meta object for the containment reference '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beans</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getBeans()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Beans();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleContents <em>Bundle Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Contents</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleContents
	 * @generated
	 */
	EClass getBundleContents();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle <em>Require Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Bundle</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle
	 * @generated
	 */
	EClass getRequireBundle();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle#getRequireBundle <em>Require Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Require Bundle</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle#getRequireBundle()
	 * @see #getRequireBundle()
	 * @generated
	 */
	EReference getRequireBundle_RequireBundle();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq <em>Bundle Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Req</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq
	 * @generated
	 */
	EClass getBundleReq();

	/**
	 * Returns the meta object for the attribute '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq#getName()
	 * @see #getBundleReq()
	 * @generated
	 */
	EAttribute getBundleReq_Name();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant <em>Bean Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Variant</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant
	 * @generated
	 */
	EClass getBeanVariant();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant#getOsgiRef <em>Osgi Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osgi Ref</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant#getOsgiRef()
	 * @see #getBeanVariant()
	 * @generated
	 */
	EReference getBeanVariant_OsgiRef();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant#getBeanRef <em>Bean Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Ref</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant#getBeanRef()
	 * @see #getBeanVariant()
	 * @generated
	 */
	EReference getBeanVariant_BeanRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpringdmFactory getSpringdmFactory();

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
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringDynamicModulesImpl <em>Spring Dynamic Modules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringDynamicModulesImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getSpringDynamicModules()
		 * @generated
		 */
		EClass SPRING_DYNAMIC_MODULES = eINSTANCE.getSpringDynamicModules();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_DYNAMIC_MODULES__BUNDLES = eINSTANCE.getSpringDynamicModules_Bundles();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanImpl <em>Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBean()
		 * @generated
		 */
		EClass BEAN = eINSTANCE.getBean();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN__VARIANTS = eINSTANCE.getBean_Variants();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanReferenceImpl <em>Bean Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanReferenceImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBeanReference()
		 * @generated
		 */
		EClass BEAN_REFERENCE = eINSTANCE.getBeanReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAN_REFERENCE__NAME = eINSTANCE.getBeanReference_Name();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.OSGiReferenceImpl <em>OS Gi Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.OSGiReferenceImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getOSGiReference()
		 * @generated
		 */
		EClass OS_GI_REFERENCE = eINSTANCE.getOSGiReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_GI_REFERENCE__NAME = eINSTANCE.getOSGiReference_Name();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_GI_REFERENCE__BUNDLE = eINSTANCE.getOSGiReference_Bundle();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeansImpl <em>Beans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeansImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBeans()
		 * @generated
		 */
		EClass BEANS = eINSTANCE.getBeans();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEANS__BEANS = eINSTANCE.getBeans_Beans();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__CONTENTS = eINSTANCE.getBundle_Contents();

		/**
		 * The meta object literal for the '<em><b>Require Bundle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__REQUIRE_BUNDLE = eINSTANCE.getBundle_RequireBundle();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__BEANS = eINSTANCE.getBundle_Beans();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleContentsImpl <em>Bundle Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleContentsImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBundleContents()
		 * @generated
		 */
		EClass BUNDLE_CONTENTS = eINSTANCE.getBundleContents();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.RequireBundleImpl <em>Require Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.RequireBundleImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getRequireBundle()
		 * @generated
		 */
		EClass REQUIRE_BUNDLE = eINSTANCE.getRequireBundle();

		/**
		 * The meta object literal for the '<em><b>Require Bundle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_BUNDLE__REQUIRE_BUNDLE = eINSTANCE.getRequireBundle_RequireBundle();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleReqImpl <em>Bundle Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleReqImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBundleReq()
		 * @generated
		 */
		EClass BUNDLE_REQ = eINSTANCE.getBundleReq();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_REQ__NAME = eINSTANCE.getBundleReq_Name();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanVariantImpl <em>Bean Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanVariantImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmPackageImpl#getBeanVariant()
		 * @generated
		 */
		EClass BEAN_VARIANT = eINSTANCE.getBeanVariant();

		/**
		 * The meta object literal for the '<em><b>Osgi Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_VARIANT__OSGI_REF = eINSTANCE.getBeanVariant_OsgiRef();

		/**
		 * The meta object literal for the '<em><b>Bean Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_VARIANT__BEAN_REF = eINSTANCE.getBeanVariant_BeanRef();

	}

} //SpringdmPackage
