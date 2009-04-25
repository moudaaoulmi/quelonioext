/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getComponentDependence()
 * @model
 * @generated
 */
public interface ComponentDependence extends DependenceRelationship {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getComponentDependence_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationComponent> getComponents();

} // ComponentDependence
