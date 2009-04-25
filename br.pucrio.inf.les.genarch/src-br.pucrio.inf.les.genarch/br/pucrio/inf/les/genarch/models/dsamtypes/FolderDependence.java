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
 * A representation of the model object '<em><b>Folder Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence#getFolders <em>Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getFolderDependence()
 * @model
 * @generated
 */
public interface FolderDependence extends DependenceRelationship {
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
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getFolderDependence_Folders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationFolder> getFolders();

} // FolderDependence
