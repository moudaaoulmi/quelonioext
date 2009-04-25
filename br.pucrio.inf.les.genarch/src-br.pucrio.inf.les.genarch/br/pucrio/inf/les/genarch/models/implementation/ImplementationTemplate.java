/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate#getGenerationPath <em>Generation Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage#getImplementationTemplate()
 * @model
 * @generated
 */
public interface ImplementationTemplate extends ImplementationEntity {
	/**
	 * Returns the value of the '<em><b>Generation Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Path</em>' attribute.
	 * @see #setGenerationPath(String)
	 * @see br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage#getImplementationTemplate_GenerationPath()
	 * @model
	 * @generated
	 */
	String getGenerationPath();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate#getGenerationPath <em>Generation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Path</em>' attribute.
	 * @see #getGenerationPath()
	 * @generated
	 */
	void setGenerationPath(String value);

} // ImplementationTemplate
