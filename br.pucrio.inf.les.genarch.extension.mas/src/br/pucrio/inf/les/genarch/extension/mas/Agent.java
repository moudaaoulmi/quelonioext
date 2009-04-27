/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.mas;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurableElement;

import br.pucrio.inf.les.genarch.models.dsamtypes.TemplatesImpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getGoals <em>Goals</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getBelieves <em>Believes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getPlans <em>Plans</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getEvents <em>Events</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.mas.Agent#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.mas.MasPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends ConfigurableElement, TemplatesImpl {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.mas.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MasPackage#getAgent_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.mas.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MasPackage#getAgent_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Believes</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.mas.Belief}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Believes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Believes</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MasPackage#getAgent_Believes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Belief> getBelieves();

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.mas.Plan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MasPackage#getAgent_Plans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plan> getPlans();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.mas.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MasPackage#getAgent_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.mas.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.mas.MasPackage#getAgent_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // Agent
