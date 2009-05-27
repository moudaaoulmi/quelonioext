/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm;

import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBean()
 * @model
 * @generated
 */
public interface Bean extends GroupClass, VariableElement {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage#getBean_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<BeanVariant> getVariants();

} // Bean
