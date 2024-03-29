/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.spring.impl;

import br.pucrio.inf.les.genarch.extension.dsam.spring.BeanReference;
import br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant;
import br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupClassImpl;

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
 * An implementation of the model object '<em><b>Bean Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanVariantImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.spring.impl.BeanVariantImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanVariantImpl extends GroupClassImpl implements BeanVariant {
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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanReference> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeanVariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.BEAN_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<ImplementationFragment>(ImplementationFragment.class, this, SpringPackage.BEAN_VARIANT__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<BeanReference>(BeanReference.class, this, SpringPackage.BEAN_VARIANT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringPackage.BEAN_VARIANT__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case SpringPackage.BEAN_VARIANT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case SpringPackage.BEAN_VARIANT__FRAGMENTS:
				return getFragments();
			case SpringPackage.BEAN_VARIANT__REFERENCES:
				return getReferences();
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
			case SpringPackage.BEAN_VARIANT__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends ImplementationFragment>)newValue);
				return;
			case SpringPackage.BEAN_VARIANT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends BeanReference>)newValue);
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
			case SpringPackage.BEAN_VARIANT__FRAGMENTS:
				getFragments().clear();
				return;
			case SpringPackage.BEAN_VARIANT__REFERENCES:
				getReferences().clear();
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
			case SpringPackage.BEAN_VARIANT__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case SpringPackage.BEAN_VARIANT__REFERENCES:
				return references != null && !references.isEmpty();
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
		if (baseClass == GroupFragments.class) {
			switch (derivedFeatureID) {
				case SpringPackage.BEAN_VARIANT__FRAGMENTS: return DsamtypesPackage.GROUP_FRAGMENTS__FRAGMENTS;
				default: return -1;
			}
		}
		if (baseClass == VariableElement.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == GroupFragments.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.GROUP_FRAGMENTS__FRAGMENTS: return SpringPackage.BEAN_VARIANT__FRAGMENTS;
				default: return -1;
			}
		}
		if (baseClass == VariableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BeanVariantImpl
