/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.ProductContainer;
import br.pucrio.inf.les.genarch.models.product.ProductFragmentContainer;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer;

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
 * An implementation of the model object '<em><b>Implementation Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImplementationElementsImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImplementationElementsImpl#getFragmentContainers <em>Fragment Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductImplementationElementsImpl#getResourceContainers <em>Resource Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImplementationElementsImpl extends EObjectImpl implements ProductImplementationElements {
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductContainer> containers;

	/**
	 * The cached value of the '{@link #getFragmentContainers() <em>Fragment Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductFragmentContainer> fragmentContainers;

	/**
	 * The cached value of the '{@link #getResourceContainers() <em>Resource Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductResourcesContainer> resourceContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImplementationElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_IMPLEMENTATION_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<ProductContainer>(ProductContainer.class, this, ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFragmentContainer> getFragmentContainers() {
		if (fragmentContainers == null) {
			fragmentContainers = new EObjectContainmentEList<ProductFragmentContainer>(ProductFragmentContainer.class, this, ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS);
		}
		return fragmentContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductResourcesContainer> getResourceContainers() {
		if (resourceContainers == null) {
			resourceContainers = new EObjectContainmentEList<ProductResourcesContainer>(ProductResourcesContainer.class, this, ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS);
		}
		return resourceContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS:
				return ((InternalEList<?>)getFragmentContainers()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS:
				return ((InternalEList<?>)getResourceContainers()).basicRemove(otherEnd, msgs);
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
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS:
				return getContainers();
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS:
				return getFragmentContainers();
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS:
				return getResourceContainers();
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
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends ProductContainer>)newValue);
				return;
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS:
				getFragmentContainers().clear();
				getFragmentContainers().addAll((Collection<? extends ProductFragmentContainer>)newValue);
				return;
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS:
				getResourceContainers().clear();
				getResourceContainers().addAll((Collection<? extends ProductResourcesContainer>)newValue);
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
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS:
				getContainers().clear();
				return;
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS:
				getFragmentContainers().clear();
				return;
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS:
				getResourceContainers().clear();
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
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__FRAGMENT_CONTAINERS:
				return fragmentContainers != null && !fragmentContainers.isEmpty();
			case ProductPackage.PRODUCT_IMPLEMENTATION_ELEMENTS__RESOURCE_CONTAINERS:
				return resourceContainers != null && !resourceContainers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImplementationElementsImpl
