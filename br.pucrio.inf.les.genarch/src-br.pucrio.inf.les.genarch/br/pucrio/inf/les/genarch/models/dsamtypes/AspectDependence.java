/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getAspectDependence()
 * @model
 * @generated
 */
public interface AspectDependence extends DependenceRelationship {
	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage#getAspectDependence_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationAspect> getAspects();

} // AspectDependence
