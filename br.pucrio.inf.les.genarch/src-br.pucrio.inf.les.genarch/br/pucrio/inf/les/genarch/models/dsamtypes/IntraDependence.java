/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intra Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence#getDependences <em>Dependences</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getIntraDependence()
 * @model
 * @generated
 */
public interface IntraDependence extends DependenceRelationship {
	/**
	 * Returns the value of the '<em><b>Dependences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependences</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependences</em>' reference.
	 * @see #setDependences(DomainElement)
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getIntraDependence_Dependences()
	 * @model
	 * @generated
	 */
	DomainElement getDependences();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence#getDependences <em>Dependences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependences</em>' reference.
	 * @see #getDependences()
	 * @generated
	 */
	void setDependences(DomainElement value);

} // IntraDependence
