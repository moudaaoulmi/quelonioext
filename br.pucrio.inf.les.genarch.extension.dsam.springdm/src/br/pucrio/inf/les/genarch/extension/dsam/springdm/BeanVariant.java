/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant#getOsgiRef <em>Osgi Ref</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant#getBeanRef <em>Bean Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBeanVariant()
 * @model
 * @generated
 */
public interface BeanVariant extends GroupFragments, GroupClass, VariableElement {
	/**
	 * Returns the value of the '<em><b>Osgi Ref</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osgi Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osgi Ref</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBeanVariant_OsgiRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<OSGiReference> getOsgiRef();

	/**
	 * Returns the value of the '<em><b>Bean Ref</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Ref</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBeanVariant_BeanRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<BeanReference> getBeanRef();

} // BeanVariant
