/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Gi Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getName <em>Name</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getBundle <em>Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getOSGiReference()
 * @model
 * @generated
 */
public interface OSGiReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getOSGiReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' attribute.
	 * @see #setBundle(String)
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getOSGiReference_Bundle()
	 * @model
	 * @generated
	 */
	String getBundle();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference#getBundle <em>Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' attribute.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(String value);

} // OSGiReference
