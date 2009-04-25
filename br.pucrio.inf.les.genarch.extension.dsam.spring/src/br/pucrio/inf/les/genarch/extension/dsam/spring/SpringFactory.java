/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.spring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage
 * @generated
 */
public interface SpringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpringFactory eINSTANCE = br.pucrio.inf.les.genarch.extension.dsam.spring.impl.SpringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spring</em>'.
	 * @generated
	 */
	Spring createSpring();

	/**
	 * Returns a new object of class '<em>Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean</em>'.
	 * @generated
	 */
	Bean createBean();

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
	SpringPackage getSpringPackage();

} //SpringFactory
