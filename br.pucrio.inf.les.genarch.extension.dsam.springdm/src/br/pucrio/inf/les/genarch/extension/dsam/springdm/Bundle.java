/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getContents <em>Contents</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getRequireBundle <em>Require Bundle</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getBeans <em>Beans</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends VariableElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference.
	 * @see #setContents(BundleContents)
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBundle_Contents()
	 * @model containment="true"
	 * @generated
	 */
	BundleContents getContents();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getContents <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' containment reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(BundleContents value);

	/**
	 * Returns the value of the '<em><b>Require Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Bundle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Bundle</em>' containment reference.
	 * @see #setRequireBundle(RequireBundle)
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBundle_RequireBundle()
	 * @model containment="true"
	 * @generated
	 */
	RequireBundle getRequireBundle();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getRequireBundle <em>Require Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Bundle</em>' containment reference.
	 * @see #getRequireBundle()
	 * @generated
	 */
	void setRequireBundle(RequireBundle value);

	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference.
	 * @see #setBeans(Beans)
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBundle_Beans()
	 * @model containment="true"
	 * @generated
	 */
	Beans getBeans();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle#getBeans <em>Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beans</em>' containment reference.
	 * @see #getBeans()
	 * @generated
	 */
	void setBeans(Beans value);

} // Bundle
