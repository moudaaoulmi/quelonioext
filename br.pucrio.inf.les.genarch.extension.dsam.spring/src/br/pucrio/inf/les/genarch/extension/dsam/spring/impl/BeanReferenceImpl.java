/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.spring.impl;

import br.pucrio.inf.les.genarch.extension.dsam.spring.BeanReference;
import br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.IntraDependenceImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BeanReferenceImpl extends IntraDependenceImpl implements BeanReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeanReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.BEAN_REFERENCE;
	}

} //BeanReferenceImpl
