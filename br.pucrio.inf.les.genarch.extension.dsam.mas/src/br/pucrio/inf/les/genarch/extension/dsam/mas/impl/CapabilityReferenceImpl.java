/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas.impl;

import br.pucrio.inf.les.genarch.extension.dsam.mas.CapabilityReference;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement;
import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFragmentsImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.CapabilityReferenceImpl#getDependences <em>Dependences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityReferenceImpl extends GroupFragmentsImpl implements CapabilityReference {
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
	protected CapabilityReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasPackage.Literals.CAPABILITY_REFERENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MasPackage.CAPABILITY_REFERENCE__DEPENDENCES, oldDependences, dependences));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MasPackage.CAPABILITY_REFERENCE__DEPENDENCES, oldDependences, dependences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MasPackage.CAPABILITY_REFERENCE__DEPENDENCES:
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
			case MasPackage.CAPABILITY_REFERENCE__DEPENDENCES:
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
			case MasPackage.CAPABILITY_REFERENCE__DEPENDENCES:
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
			case MasPackage.CAPABILITY_REFERENCE__DEPENDENCES:
				return dependences != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DependenceRelationship.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IntraDependence.class) {
			switch (derivedFeatureID) {
				case MasPackage.CAPABILITY_REFERENCE__DEPENDENCES: return DsamtypesPackage.INTRA_DEPENDENCE__DEPENDENCES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DependenceRelationship.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IntraDependence.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.INTRA_DEPENDENCE__DEPENDENCES: return MasPackage.CAPABILITY_REFERENCE__DEPENDENCES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityReferenceImpl
