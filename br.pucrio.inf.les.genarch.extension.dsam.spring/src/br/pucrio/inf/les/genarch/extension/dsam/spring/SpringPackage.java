/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.spring;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;

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
 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.SpringFactory
 * @model kind="package"
 * @generated
 */
public interface SpringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///SpringDomainModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.pucrio.inf.les.genarch.extension.dsam.spring.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpringPackage eINSTANCE = br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringImpl <em>Spring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getSpring()
	 * @generated
	 */
	int SPRING = 0;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING__BEANS = 0;

	/**
	 * The number of structural features of the '<em>Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanImpl <em>Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getBean()
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
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN__INTERFACE = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_FEATURE_COUNT = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanVariantImpl <em>Bean Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanVariantImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getBeanVariant()
	 * @generated
	 */
	int BEAN_VARIANT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__NAME = DsamtypesPackage.GROUP_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__CLASSES = DsamtypesPackage.GROUP_CLASS__CLASSES;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__FRAGMENTS = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT__REFERENCES = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bean Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_VARIANT_FEATURE_COUNT = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanReferenceImpl <em>Bean Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanReferenceImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getBeanReference()
	 * @generated
	 */
	int BEAN_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE__NAME = DsamtypesPackage.INTRA_DEPENDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Dependences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE__DEPENDENCES = DsamtypesPackage.INTRA_DEPENDENCE__DEPENDENCES;

	/**
	 * The number of structural features of the '<em>Bean Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_REFERENCE_FEATURE_COUNT = DsamtypesPackage.INTRA_DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.InterfaceImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = DsamtypesPackage.GROUP_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CLASSES = DsamtypesPackage.GROUP_CLASS__CLASSES;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Spring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Spring
	 * @generated
	 */
	EClass getSpring();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Spring#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beans</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Spring#getBeans()
	 * @see #getSpring()
	 * @generated
	 */
	EReference getSpring_Beans();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Bean
	 * @generated
	 */
	EClass getBean();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Bean#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Bean#getVariants()
	 * @see #getBean()
	 * @generated
	 */
	EReference getBean_Variants();

	/**
	 * Returns the meta object for the containment reference '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Bean#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Bean#getInterface()
	 * @see #getBean()
	 * @generated
	 */
	EReference getBean_Interface();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant <em>Bean Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Variant</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant
	 * @generated
	 */
	EClass getBeanVariant();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant#getReferences()
	 * @see #getBeanVariant()
	 * @generated
	 */
	EReference getBeanVariant_References();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.BeanReference <em>Bean Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Reference</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.BeanReference
	 * @generated
	 */
	EClass getBeanReference();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpringFactory getSpringFactory();

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
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringImpl <em>Spring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getSpring()
		 * @generated
		 */
		EClass SPRING = eINSTANCE.getSpring();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING__BEANS = eINSTANCE.getSpring_Beans();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanImpl <em>Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getBean()
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
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN__INTERFACE = eINSTANCE.getBean_Interface();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanVariantImpl <em>Bean Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanVariantImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getBeanVariant()
		 * @generated
		 */
		EClass BEAN_VARIANT = eINSTANCE.getBeanVariant();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAN_VARIANT__REFERENCES = eINSTANCE.getBeanVariant_References();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanReferenceImpl <em>Bean Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanReferenceImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getBeanReference()
		 * @generated
		 */
		EClass BEAN_REFERENCE = eINSTANCE.getBeanReference();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.InterfaceImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

	}

} //SpringPackage
