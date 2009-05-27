/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Dynamic Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getSpringDynamicModules()
 * @model
 * @generated
 */
public interface SpringDynamicModules extends EObject {
	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getSpringDynamicModules_Bundles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Bundle> getBundles();

} // SpringDynamicModules
