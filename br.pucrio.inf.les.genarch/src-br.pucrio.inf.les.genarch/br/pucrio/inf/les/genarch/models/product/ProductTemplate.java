/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.ProductTemplate#getGenerateToPath <em>Generate To Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductTemplate()
 * @model
 * @generated
 */
public interface ProductTemplate extends ProductEntity {
	/**
	 * Returns the value of the '<em><b>Generate To Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate To Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate To Path</em>' attribute.
	 * @see #setGenerateToPath(String)
	 * @see br.pucrio.inf.les.genarch.models.product.ProductPackage#getProductTemplate_GenerateToPath()
	 * @model
	 * @generated
	 */
	String getGenerateToPath();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.product.ProductTemplate#getGenerateToPath <em>Generate To Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate To Path</em>' attribute.
	 * @see #getGenerateToPath()
	 * @generated
	 */
	void setGenerateToPath(String value);

} // ProductTemplate
