/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes.impl;

import br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement;
import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.ExtraDependence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.dsamtypes.impl.ExtraDependenceImpl#getDependences <em>Dependences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraDependenceImpl extends DependenceRelationshipImpl implements ExtraDependence {
	/**
	 * The cached value of the '{@link #getDependences() <em>Dependences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependences()
	 * @generated
	 * @ordered
	 */
	protected DomainElement dependences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraDependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsamtypesPackage.Literals.EXTRA_DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement getDependences() {
		if (dependences != null && dependences.eIsProxy()) {
			InternalEObject oldDependences = (InternalEObject)dependences;
			dependences = (DomainElement)eResolveProxy(oldDependences);
			if (dependences != oldDependences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsamtypesPackage.EXTRA_DEPENDENCE__DEPENDENCES, oldDependences, dependences));
			}
		}
		return dependences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement basicGetDependences() {
		return dependences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependences(DomainElement newDependences) {
		DomainElement oldDependences = dependences;
		dependences = newDependences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsamtypesPackage.EXTRA_DEPENDENCE__DEPENDENCES, oldDependences, dependences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsamtypesPackage.EXTRA_DEPENDENCE__DEPENDENCES:
				if (resolve) return getDependences();
				return basicGetDependences();
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
			case DsamtypesPackage.EXTRA_DEPENDENCE__DEPENDENCES:
				setDependences((DomainElement)newValue);
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
			case DsamtypesPackage.EXTRA_DEPENDENCE__DEPENDENCES:
				setDependences((DomainElement)null);
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
			case DsamtypesPackage.EXTRA_DEPENDENCE__DEPENDENCES:
				return dependences != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtraDependenceImpl
