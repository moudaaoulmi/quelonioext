/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.Product;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModels;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImpl#getProductImplementationElements <em>Product Implementation Elements</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImpl#getProductFeatures <em>Product Features</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImpl#getDomainModels <em>Domain Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends EObjectImpl implements Product {
	/**
	 * The cached value of the '{@link #getProductImplementationElements() <em>Product Implementation Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductImplementationElements()
	 * @generated
	 * @ordered
	 */
	protected ProductImplementationElements productImplementationElements;

	/**
	 * The cached value of the '{@link #getProductFeatures() <em>Product Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatures()
	 * @generated
	 * @ordered
	 */
	protected ProductFeaturesConfiguration productFeatures;

	/**
	 * The cached value of the '{@link #getDomainModels() <em>Domain Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModels()
	 * @generated
	 * @ordered
	 */
	protected ProductDomainModels domainModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductImplementationElements getProductImplementationElements() {
		return productImplementationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductImplementationElements(ProductImplementationElements newProductImplementationElements, NotificationChain msgs) {
		ProductImplementationElements oldProductImplementationElements = productImplementationElements;
		productImplementationElements = newProductImplementationElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS, oldProductImplementationElements, newProductImplementationElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductImplementationElements(ProductImplementationElements newProductImplementationElements) {
		if (newProductImplementationElements != productImplementationElements) {
			NotificationChain msgs = null;
			if (productImplementationElements != null)
				msgs = ((InternalEObject)productImplementationElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS, null, msgs);
			if (newProductImplementationElements != null)
				msgs = ((InternalEObject)newProductImplementationElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS, null, msgs);
			msgs = basicSetProductImplementationElements(newProductImplementationElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS, newProductImplementationElements, newProductImplementationElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeaturesConfiguration getProductFeatures() {
		return productFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductFeatures(ProductFeaturesConfiguration newProductFeatures, NotificationChain msgs) {
		ProductFeaturesConfiguration oldProductFeatures = productFeatures;
		productFeatures = newProductFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_FEATURES, oldProductFeatures, newProductFeatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductFeatures(ProductFeaturesConfiguration newProductFeatures) {
		if (newProductFeatures != productFeatures) {
			NotificationChain msgs = null;
			if (productFeatures != null)
				msgs = ((InternalEObject)productFeatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__PRODUCT_FEATURES, null, msgs);
			if (newProductFeatures != null)
				msgs = ((InternalEObject)newProductFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__PRODUCT_FEATURES, null, msgs);
			msgs = basicSetProductFeatures(newProductFeatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_FEATURES, newProductFeatures, newProductFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDomainModels getDomainModels() {
		return domainModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModels(ProductDomainModels newDomainModels, NotificationChain msgs) {
		ProductDomainModels oldDomainModels = domainModels;
		domainModels = newDomainModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DOMAIN_MODELS, oldDomainModels, newDomainModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModels(ProductDomainModels newDomainModels) {
		if (newDomainModels != domainModels) {
			NotificationChain msgs = null;
			if (domainModels != null)
				msgs = ((InternalEObject)domainModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__DOMAIN_MODELS, null, msgs);
			if (newDomainModels != null)
				msgs = ((InternalEObject)newDomainModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__DOMAIN_MODELS, null, msgs);
			msgs = basicSetDomainModels(newDomainModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DOMAIN_MODELS, newDomainModels, newDomainModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS:
				return basicSetProductImplementationElements(null, msgs);
			case ProductPackage.PRODUCT__PRODUCT_FEATURES:
				return basicSetProductFeatures(null, msgs);
			case ProductPackage.PRODUCT__DOMAIN_MODELS:
				return basicSetDomainModels(null, msgs);
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
			case ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS:
				return getProductImplementationElements();
			case ProductPackage.PRODUCT__PRODUCT_FEATURES:
				return getProductFeatures();
			case ProductPackage.PRODUCT__DOMAIN_MODELS:
				return getDomainModels();
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
			case ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS:
				setProductImplementationElements((ProductImplementationElements)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_FEATURES:
				setProductFeatures((ProductFeaturesConfiguration)newValue);
				return;
			case ProductPackage.PRODUCT__DOMAIN_MODELS:
				setDomainModels((ProductDomainModels)newValue);
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
			case ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS:
				setProductImplementationElements((ProductImplementationElements)null);
				return;
			case ProductPackage.PRODUCT__PRODUCT_FEATURES:
				setProductFeatures((ProductFeaturesConfiguration)null);
				return;
			case ProductPackage.PRODUCT__DOMAIN_MODELS:
				setDomainModels((ProductDomainModels)null);
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
			case ProductPackage.PRODUCT__PRODUCT_IMPLEMENTATION_ELEMENTS:
				return productImplementationElements != null;
			case ProductPackage.PRODUCT__PRODUCT_FEATURES:
				return productFeatures != null;
			case ProductPackage.PRODUCT__DOMAIN_MODELS:
				return domainModels != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
