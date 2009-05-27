/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.jade;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.JadePackage
 * @generated
 */
public interface JadeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JadeFactory eINSTANCE = br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Jade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jade</em>'.
	 * @generated
	 */
	Jade createJade();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior</em>'.
	 * @generated
	 */
	Behavior createBehavior();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JadePackage getJadePackage();

} //JadeFactory
