/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas;

import br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.Capability#getGoals <em>Goals</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.Capability#getBelieves <em>Believes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.Capability#getPlans <em>Plans</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.Capability#getEvents <em>Events</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.Capability#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.Capability#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends VariableElement, GroupTemplates, GroupComponents, GroupFiles {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.mas.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#getCapability_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Believes</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.mas.Belief}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Believes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Believes</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#getCapability_Believes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Belief> getBelieves();

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.mas.Plan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#getCapability_Plans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plan> getPlans();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.mas.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#getCapability_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.mas.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#getCapability_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.mas.CapabilityReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage#getCapability_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityReference> getCapabilities();

} // Capability
