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
 * A representation of the model object '<em><b>Domain Models</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductDomainModels#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductDomainModels()
 * @model
 * @generated
 */
public interface ProductDomainModels extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductDomainModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductDomainModels_DomainModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductDomainModel> getDomainModel();

} // ProductDomainModels
