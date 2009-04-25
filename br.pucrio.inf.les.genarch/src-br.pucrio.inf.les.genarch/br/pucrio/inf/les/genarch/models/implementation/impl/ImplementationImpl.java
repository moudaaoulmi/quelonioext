/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation.impl;

import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;

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
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationImpl#getResourcesContainer <em>Resources Container</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationImpl#getFragmentsContainer <em>Fragments Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationImpl extends EObjectImpl implements Implementation {
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationContainer> containers;

	/**
	 * The cached value of the '{@link #getResourcesContainer() <em>Resources Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationResourcesContainer> resourcesContainer;

	/**
	 * The cached value of the '{@link #getFragmentsContainer() <em>Fragments Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentsContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationFragmentContainer> fragmentsContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<ImplementationContainer>(ImplementationContainer.class, this, ImplementationPackage.IMPLEMENTATION__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationResourcesContainer> getResourcesContainer() {
		if (resourcesContainer == null) {
			resourcesContainer = new EObjectContainmentEList<ImplementationResourcesContainer>(ImplementationResourcesContainer.class, this, ImplementationPackage.IMPLEMENTATION__RESOURCES_CONTAINER);
		}
		return resourcesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFragmentContainer> getFragmentsContainer() {
		if (fragmentsContainer == null) {
			fragmentsContainer = new EObjectContainmentEList<ImplementationFragmentContainer>(ImplementationFragmentContainer.class, this, ImplementationPackage.IMPLEMENTATION__FRAGMENTS_CONTAINER);
		}
		return fragmentsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImplementationPackage.IMPLEMENTATION__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION__RESOURCES_CONTAINER:
				return ((InternalEList<?>)getResourcesContainer()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION__FRAGMENTS_CONTAINER:
				return ((InternalEList<?>)getFragmentsContainer()).basicRemove(otherEnd, msgs);
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
			case ImplementationPackage.IMPLEMENTATION__CONTAINERS:
				return getContainers();
			case ImplementationPackage.IMPLEMENTATION__RESOURCES_CONTAINER:
				return getResourcesContainer();
			case ImplementationPackage.IMPLEMENTATION__FRAGMENTS_CONTAINER:
				return getFragmentsContainer();
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
			case ImplementationPackage.IMPLEMENTATION__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends ImplementationContainer>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION__RESOURCES_CONTAINER:
				getResourcesContainer().clear();
				getResourcesContainer().addAll((Collection<? extends ImplementationResourcesContainer>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION__FRAGMENTS_CONTAINER:
				getFragmentsContainer().clear();
				getFragmentsContainer().addAll((Collection<? extends ImplementationFragmentContainer>)newValue);
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
			case ImplementationPackage.IMPLEMENTATION__CONTAINERS:
				getContainers().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION__RESOURCES_CONTAINER:
				getResourcesContainer().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION__FRAGMENTS_CONTAINER:
				getFragmentsContainer().clear();
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
			case ImplementationPackage.IMPLEMENTATION__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case ImplementationPackage.IMPLEMENTATION__RESOURCES_CONTAINER:
				return resourcesContainer != null && !resourcesContainer.isEmpty();
			case ImplementationPackage.IMPLEMENTATION__FRAGMENTS_CONTAINER:
				return fragmentsContainer != null && !fragmentsContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationImpl
