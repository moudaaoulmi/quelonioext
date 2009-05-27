/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans#getBeans <em>Beans</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBeans()
 * @model
 * @generated
 */
public interface Beans extends EObject {
	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBeans_Beans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bean> getBeans();

} // Beans
