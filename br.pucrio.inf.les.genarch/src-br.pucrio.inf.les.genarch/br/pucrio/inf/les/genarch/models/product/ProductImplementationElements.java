/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getContainers <em>Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getFragmentContainers <em>Fragment Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductImplementationElements#getResourceContainers <em>Resource Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductImplementationElements()
 * @model
 * @generated
 */
public interface ProductImplementationElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductImplementationElements_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductContainer> getContainers();

	/**
	 * Returns the value of the '<em><b>Fragment Containers</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment Containers</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductImplementationElements_FragmentContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductFragmentContainer> getFragmentContainers();

	/**
	 * Returns the value of the '<em><b>Resource Containers</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Containers</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductImplementationElements_ResourceContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductResourcesContainer> getResourceContainers();

} // ProductImplementationElements
