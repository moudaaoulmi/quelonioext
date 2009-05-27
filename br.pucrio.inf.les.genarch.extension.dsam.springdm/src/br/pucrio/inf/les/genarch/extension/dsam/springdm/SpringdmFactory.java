/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage
 * @generated
 */
public interface SpringdmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpringdmFactory eINSTANCE = br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.SpringdmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spring Dynamic Modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spring Dynamic Modules</em>'.
	 * @generated
	 */
	SpringDynamicModules createSpringDynamicModules();

	/**
	 * Returns a new object of class '<em>Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean</em>'.
	 * @generated
	 */
	Bean createBean();

	/**
	 * Returns a new object of class '<em>Bean Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Reference</em>'.
	 * @generated
	 */
	BeanReference createBeanReference();

	/**
	 * Returns a new object of class '<em>OS Gi Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Gi Reference</em>'.
	 * @generated
	 */
	OSGiReference createOSGiReference();

	/**
	 * Returns a new object of class '<em>Beans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beans</em>'.
	 * @generated
	 */
	Beans createBeans();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns a new object of class '<em>Bundle Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Contents</em>'.
	 * @generated
	 */
	BundleContents createBundleContents();

	/**
	 * Returns a new object of class '<em>Require Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require Bundle</em>'.
	 * @generated
	 */
	RequireBundle createRequireBundle();

	/**
	 * Returns a new object of class '<em>Bundle Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Req</em>'.
	 * @generated
	 */
	BundleReq createBundleReq();

	/**
	 * Returns a new object of class '<em>Bean Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Variant</em>'.
	 * @generated
	 */
	BeanVariant createBeanVariant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpringdmPackage getSpringdmPackage();

} //SpringdmFactory
