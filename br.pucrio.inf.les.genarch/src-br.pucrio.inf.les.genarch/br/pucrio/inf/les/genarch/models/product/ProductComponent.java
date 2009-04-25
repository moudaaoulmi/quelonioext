/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getAspects <em>Aspects</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getFiles <em>Files</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getTemplates <em>Templates</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductComponent#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductComponent()
 * @model
 * @generated
 */
public interface ProductComponent extends ProductEntity {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductComponent_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductComponent_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductAspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductComponent_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductFile> getFiles();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductComponent_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductTemplate> getTemplates();

	/**
	 * Returns the value of the '<em><b>Sub Components</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.product.ProductComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Components</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductComponent_SubComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductComponent> getSubComponents();

} // ProductComponent
