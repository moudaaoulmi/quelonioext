/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.jade;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Jade#getAgents <em>Agents</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Jade#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.JadePackage#getJade()
 * @model
 * @generated
 */
public interface Jade extends EObject {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.jade.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.JadePackage#getJade_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.jade.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.JadePackage#getJade_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

} // Jade
