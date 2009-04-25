/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.Product#getProductImplementationElements <em>Product Implementation Elements</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.Product#getProductFeatures <em>Product Features</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.Product#getDomainModels <em>Domain Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Implementation Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Implementation Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Implementation Elements</em>' containment reference.
	 * @see #setProductImplementationElements(ProductImplementationElements)
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProduct_ProductImplementationElements()
	 * @model containment="true"
	 * @generated
	 */
	ProductImplementationElements getProductImplementationElements();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.product.Product#getProductImplementationElements <em>Product Implementation Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Implementation Elements</em>' containment reference.
	 * @see #getProductImplementationElements()
	 * @generated
	 */
	void setProductImplementationElements(ProductImplementationElements value);

	/**
	 * Returns the value of the '<em><b>Product Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Features</em>' containment reference.
	 * @see #setProductFeatures(ProductFeaturesConfiguration)
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProduct_ProductFeatures()
	 * @model containment="true"
	 * @generated
	 */
	ProductFeaturesConfiguration getProductFeatures();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.product.Product#getProductFeatures <em>Product Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Features</em>' containment reference.
	 * @see #getProductFeatures()
	 * @generated
	 */
	void setProductFeatures(ProductFeaturesConfiguration value);

	/**
	 * Returns the value of the '<em><b>Domain Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Models</em>' containment reference.
	 * @see #setDomainModels(ProductDomainModels)
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProduct_DomainModels()
	 * @model containment="true"
	 * @generated
	 */
	ProductDomainModels getDomainModels();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.product.Product#getDomainModels <em>Domain Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Models</em>' containment reference.
	 * @see #getDomainModels()
	 * @generated
	 */
	void setDomainModels(ProductDomainModels value);

} // Product
