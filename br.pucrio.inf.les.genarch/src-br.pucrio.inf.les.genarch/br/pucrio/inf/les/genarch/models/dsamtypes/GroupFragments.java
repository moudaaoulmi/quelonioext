/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Fragments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getGroupFragments()
 * @model abstract="true"
 * @generated
 */
public interface GroupFragments extends GroupRelationship {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getGroupFragments_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationFragment> getFragments();

} // GroupFragments
