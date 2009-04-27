/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas.impl;

import br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Plan;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.VariableElementImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.PlanImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.PlanImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanImpl extends VariableElementImpl implements Plan {
	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationFragment> fragments;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationClass> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasPackage.Literals.PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<ImplementationFragment>(ImplementationFragment.class, this, MasPackage.PLAN__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ImplementationClass>(ImplementationClass.class, this, MasPackage.PLAN__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MasPackage.PLAN__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case MasPackage.PLAN__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case MasPackage.PLAN__FRAGMENTS:
				return getFragments();
			case MasPackage.PLAN__CLASSES:
				return getClasses();
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
			case MasPackage.PLAN__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends ImplementationFragment>)newValue);
				return;
			case MasPackage.PLAN__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ImplementationClass>)newValue);
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
			case MasPackage.PLAN__FRAGMENTS:
				getFragments().clear();
				return;
			case MasPackage.PLAN__CLASSES:
				getClasses().clear();
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
			case MasPackage.PLAN__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case MasPackage.PLAN__CLASSES:
				return classes != null && !classes.isEmpty();
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
		if (baseClass == GroupRelationship.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GroupFragments.class) {
			switch (derivedFeatureID) {
				case MasPackage.PLAN__FRAGMENTS: return DsamtypesPackage.GROUP_FRAGMENTS__FRAGMENTS;
				default: return -1;
			}
		}
		if (baseClass == GroupClass.class) {
			switch (derivedFeatureID) {
				case MasPackage.PLAN__CLASSES: return DsamtypesPackage.GROUP_CLASS__CLASSES;
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
		if (baseClass == GroupRelationship.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GroupFragments.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.GROUP_FRAGMENTS__FRAGMENTS: return MasPackage.PLAN__FRAGMENTS;
				default: return -1;
			}
		}
		if (baseClass == GroupClass.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.GROUP_CLASS__CLASSES: return MasPackage.PLAN__CLASSES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PlanImpl
