/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.Implementation#getContainers <em>Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.Implementation#getResourcesContainer <em>Resources Container</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.Implementation#getFragmentsContainer <em>Fragments Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage#getImplementation_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationContainer> getContainers();

	/**
	 * Returns the value of the '<em><b>Resources Container</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources Container</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage#getImplementation_ResourcesContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationResourcesContainer> getResourcesContainer();

	/**
	 * Returns the value of the '<em><b>Fragments Container</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments Container</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage#getImplementation_FragmentsContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationFragmentContainer> getFragmentsContainer();

} // Implementation
