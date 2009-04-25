/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl#getMax <em>Max</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl#isIsSelected <em>Is Selected</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFeatureConfigurationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductFeatureConfigurationImpl extends EObjectImpl implements ProductFeatureConfiguration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean isSelected = IS_SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductFeatureConfiguration> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_FEATURE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_FEATURE_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSelected() {
		return isSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelected(boolean newIsSelected) {
		boolean oldIsSelected = isSelected;
		isSelected = newIsSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED, oldIsSelected, isSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFeatureConfiguration> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<ProductFeatureConfiguration>(ProductFeatureConfiguration.class, this, ProductPackage.PRODUCT_FEATURE_CONFIGURATION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__NAME:
				return getName();
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE:
				return getAttribute();
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MAX:
				return new Integer(getMax());
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MIN:
				return new Integer(getMin());
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED:
				return isIsSelected() ? Boolean.TRUE : Boolean.FALSE;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__FEATURES:
				return getFeatures();
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
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MAX:
				setMax(((Integer)newValue).intValue());
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MIN:
				setMin(((Integer)newValue).intValue());
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED:
				setIsSelected(((Boolean)newValue).booleanValue());
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ProductFeatureConfiguration>)newValue);
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
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED:
				setIsSelected(IS_SELECTED_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__FEATURES:
				getFeatures().clear();
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
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MAX:
				return max != MAX_EDEFAULT;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__MIN:
				return min != MIN_EDEFAULT;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__IS_SELECTED:
				return isSelected != IS_SELECTED_EDEFAULT;
			case ProductPackage.PRODUCT_FEATURE_CONFIGURATION__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", max: ");
		result.append(max);
		result.append(", min: ");
		result.append(min);
		result.append(", isSelected: ");
		result.append(isSelected);
		result.append(')');
		return result.toString();
	}

} //ProductFeatureConfigurationImpl
