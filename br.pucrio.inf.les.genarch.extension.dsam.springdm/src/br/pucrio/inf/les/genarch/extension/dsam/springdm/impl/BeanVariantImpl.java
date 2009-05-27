/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm.impl;

import br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.GroupFragmentsImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;

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
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanVariantImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanVariantImpl#getOsgiRef <em>Osgi Ref</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BeanVariantImpl#getBeanRef <em>Bean Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanVariantImpl extends GroupFragmentsImpl implements BeanVariant {
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
	 * The cached value of the '{@link #getOsgiRef() <em>Osgi Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsgiRef()
	 * @generated
	 * @ordered
	 */
	protected EList<OSGiReference> osgiRef;

	/**
	 * The cached value of the '{@link #getBeanRef() <em>Bean Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanRef()
	 * @generated
	 * @ordered
	 */
	protected EList<BeanReference> beanRef;

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
		return SpringdmPackage.Literals.BEAN_VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ImplementationClass>(ImplementationClass.class, this, SpringdmPackage.BEAN_VARIANT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSGiReference> getOsgiRef() {
		if (osgiRef == null) {
			osgiRef = new EObjectContainmentEList<OSGiReference>(OSGiReference.class, this, SpringdmPackage.BEAN_VARIANT__OSGI_REF);
		}
		return osgiRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanReference> getBeanRef() {
		if (beanRef == null) {
			beanRef = new EObjectContainmentEList<BeanReference>(BeanReference.class, this, SpringdmPackage.BEAN_VARIANT__BEAN_REF);
		}
		return beanRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringdmPackage.BEAN_VARIANT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case SpringdmPackage.BEAN_VARIANT__OSGI_REF:
				return ((InternalEList<?>)getOsgiRef()).basicRemove(otherEnd, msgs);
			case SpringdmPackage.BEAN_VARIANT__BEAN_REF:
				return ((InternalEList<?>)getBeanRef()).basicRemove(otherEnd, msgs);
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
			case SpringdmPackage.BEAN_VARIANT__CLASSES:
				return getClasses();
			case SpringdmPackage.BEAN_VARIANT__OSGI_REF:
				return getOsgiRef();
			case SpringdmPackage.BEAN_VARIANT__BEAN_REF:
				return getBeanRef();
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
			case SpringdmPackage.BEAN_VARIANT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ImplementationClass>)newValue);
				return;
			case SpringdmPackage.BEAN_VARIANT__OSGI_REF:
				getOsgiRef().clear();
				getOsgiRef().addAll((Collection<? extends OSGiReference>)newValue);
				return;
			case SpringdmPackage.BEAN_VARIANT__BEAN_REF:
				getBeanRef().clear();
				getBeanRef().addAll((Collection<? extends BeanReference>)newValue);
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
			case SpringdmPackage.BEAN_VARIANT__CLASSES:
				getClasses().clear();
				return;
			case SpringdmPackage.BEAN_VARIANT__OSGI_REF:
				getOsgiRef().clear();
				return;
			case SpringdmPackage.BEAN_VARIANT__BEAN_REF:
				getBeanRef().clear();
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
			case SpringdmPackage.BEAN_VARIANT__CLASSES:
				return classes != null && !classes.isEmpty();
			case SpringdmPackage.BEAN_VARIANT__OSGI_REF:
				return osgiRef != null && !osgiRef.isEmpty();
			case SpringdmPackage.BEAN_VARIANT__BEAN_REF:
				return beanRef != null && !beanRef.isEmpty();
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
		if (baseClass == GroupClass.class) {
			switch (derivedFeatureID) {
				case SpringdmPackage.BEAN_VARIANT__CLASSES: return DsamtypesPackage.GROUP_CLASS__CLASSES;
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
		if (baseClass == GroupClass.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.GROUP_CLASS__CLASSES: return SpringdmPackage.BEAN_VARIANT__CLASSES;
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
