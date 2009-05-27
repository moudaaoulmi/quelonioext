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
 * A representation of the model object '<em><b>Require Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle#getRequireBundle <em>Require Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getRequireBundle()
 * @model
 * @generated
 */
public interface RequireBundle extends EObject {
	/**
	 * Returns the value of the '<em><b>Require Bundle</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Bundle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Bundle</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getRequireBundle_RequireBundle()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleReq> getRequireBundle();

} // RequireBundle
