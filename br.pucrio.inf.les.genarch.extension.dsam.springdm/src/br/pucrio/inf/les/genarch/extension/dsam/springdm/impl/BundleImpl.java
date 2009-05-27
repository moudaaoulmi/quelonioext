/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm.impl;

import br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleContents;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.VariableElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleImpl#getRequireBundle <em>Require Bundle</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleImpl#getBeans <em>Beans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends VariableElementImpl implements Bundle {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected BundleContents contents;

	/**
	 * The cached value of the '{@link #getRequireBundle() <em>Require Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireBundle()
	 * @generated
	 * @ordered
	 */
	protected RequireBundle requireBundle;

	/**
	 * The cached value of the '{@link #getBeans() <em>Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeans()
	 * @generated
	 * @ordered
	 */
	protected Beans beans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringdmPackage.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleContents getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContents(BundleContents newContents, NotificationChain msgs) {
		BundleContents oldContents = contents;
		contents = newContents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringdmPackage.BUNDLE__CONTENTS, oldContents, newContents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContents(BundleContents newContents) {
		if (newContents != contents) {
			NotificationChain msgs = null;
			if (contents != null)
				msgs = ((InternalEObject)contents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringdmPackage.BUNDLE__CONTENTS, null, msgs);
			if (newContents != null)
				msgs = ((InternalEObject)newContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringdmPackage.BUNDLE__CONTENTS, null, msgs);
			msgs = basicSetContents(newContents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringdmPackage.BUNDLE__CONTENTS, newContents, newContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequireBundle getRequireBundle() {
		return requireBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequireBundle(RequireBundle newRequireBundle, NotificationChain msgs) {
		RequireBundle oldRequireBundle = requireBundle;
		requireBundle = newRequireBundle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringdmPackage.BUNDLE__REQUIRE_BUNDLE, oldRequireBundle, newRequireBundle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireBundle(RequireBundle newRequireBundle) {
		if (newRequireBundle != requireBundle) {
			NotificationChain msgs = null;
			if (requireBundle != null)
				msgs = ((InternalEObject)requireBundle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringdmPackage.BUNDLE__REQUIRE_BUNDLE, null, msgs);
			if (newRequireBundle != null)
				msgs = ((InternalEObject)newRequireBundle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringdmPackage.BUNDLE__REQUIRE_BUNDLE, null, msgs);
			msgs = basicSetRequireBundle(newRequireBundle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringdmPackage.BUNDLE__REQUIRE_BUNDLE, newRequireBundle, newRequireBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beans getBeans() {
		return beans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeans(Beans newBeans, NotificationChain msgs) {
		Beans oldBeans = beans;
		beans = newBeans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringdmPackage.BUNDLE__BEANS, oldBeans, newBeans);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeans(Beans newBeans) {
		if (newBeans != beans) {
			NotificationChain msgs = null;
			if (beans != null)
				msgs = ((InternalEObject)beans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringdmPackage.BUNDLE__BEANS, null, msgs);
			if (newBeans != null)
				msgs = ((InternalEObject)newBeans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringdmPackage.BUNDLE__BEANS, null, msgs);
			msgs = basicSetBeans(newBeans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringdmPackage.BUNDLE__BEANS, newBeans, newBeans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringdmPackage.BUNDLE__CONTENTS:
				return basicSetContents(null, msgs);
			case SpringdmPackage.BUNDLE__REQUIRE_BUNDLE:
				return basicSetRequireBundle(null, msgs);
			case SpringdmPackage.BUNDLE__BEANS:
				return basicSetBeans(null, msgs);
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
			case SpringdmPackage.BUNDLE__CONTENTS:
				return getContents();
			case SpringdmPackage.BUNDLE__REQUIRE_BUNDLE:
				return getRequireBundle();
			case SpringdmPackage.BUNDLE__BEANS:
				return getBeans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpringdmPackage.BUNDLE__CONTENTS:
				setContents((BundleContents)newValue);
				return;
			case SpringdmPackage.BUNDLE__REQUIRE_BUNDLE:
				setRequireBundle((RequireBundle)newValue);
				return;
			case SpringdmPackage.BUNDLE__BEANS:
				setBeans((Beans)newValue);
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
			case SpringdmPackage.BUNDLE__CONTENTS:
				setContents((BundleContents)null);
				return;
			case SpringdmPackage.BUNDLE__REQUIRE_BUNDLE:
				setRequireBundle((RequireBundle)null);
				return;
			case SpringdmPackage.BUNDLE__BEANS:
				setBeans((Beans)null);
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
			case SpringdmPackage.BUNDLE__CONTENTS:
				return contents != null;
			case SpringdmPackage.BUNDLE__REQUIRE_BUNDLE:
				return requireBundle != null;
			case SpringdmPackage.BUNDLE__BEANS:
				return beans != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleImpl
