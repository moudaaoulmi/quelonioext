/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm.impl;

import br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.RequireBundleImpl#getRequireBundle <em>Require Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequireBundleImpl extends EObjectImpl implements RequireBundle {
	/**
	 * The cached value of the '{@link #getRequireBundle() <em>Require Bundle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireBundle()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleReq> requireBundle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequireBundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringdmPackage.Literals.REQUIRE_BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleReq> getRequireBundle() {
		if (requireBundle == null) {
			requireBundle = new EObjectContainmentEList<BundleReq>(BundleReq.class, this, SpringdmPackage.REQUIRE_BUNDLE__REQUIRE_BUNDLE);
		}
		return requireBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringdmPackage.REQUIRE_BUNDLE__REQUIRE_BUNDLE:
				return ((InternalEList<?>)getRequireBundle()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringdmPackage.REQUIRE_BUNDLE__REQUIRE_BUNDLE:
				return getRequireBundle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpringdmPackage.REQUIRE_BUNDLE__REQUIRE_BUNDLE:
				getRequireBundle().clear();
				getRequireBundle().addAll((Collection<? extends BundleReq>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpringdmPackage.REQUIRE_BUNDLE__REQUIRE_BUNDLE:
				getRequireBundle().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpringdmPackage.REQUIRE_BUNDLE__REQUIRE_BUNDLE:
				return requireBundle != null && !requireBundle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequireBundleImpl
