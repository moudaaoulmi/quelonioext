/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.spring;

import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Bean#getVariants <em>Variants</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Bean#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage#getBean()
 * @model
 * @generated
 */
public interface Bean extends GroupClass, VariableElement {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage#getBean_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<BeanVariant> getVariants();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(Interface)
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage#getBean_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Bean#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Bean
