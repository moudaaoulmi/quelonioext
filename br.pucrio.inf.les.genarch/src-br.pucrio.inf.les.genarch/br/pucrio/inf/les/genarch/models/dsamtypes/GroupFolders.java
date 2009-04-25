/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Folders</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders#getFolders <em>Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getGroupFolders()
 * @model abstract="true"
 * @generated
 */
public interface GroupFolders extends GroupRelationship {
	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getGroupFolders_Folders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationFolder> getFolders();

} // GroupFolders
