/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.configuration.impl;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragmentContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationResourcesContainer;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;

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
 * An implementation of the model object '<em><b>Mapping Relationships</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.MappingRelationshipsImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.MappingRelationshipsImpl#getResourcesContainers <em>Resources Containers</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.MappingRelationshipsImpl#getFragmentsContainer <em>Fragments Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingRelationshipsImpl extends EObjectImpl implements MappingRelationships {
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationContainer> containers;

	/**
	 * The cached value of the '{@link #getResourcesContainers() <em>Resources Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationResourcesContainer> resourcesContainers;

	/**
	 * The cached value of the '{@link #getFragmentsContainer() <em>Fragments Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentsContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationFragmentContainer> fragmentsContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRelationshipsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.MAPPING_RELATIONSHIPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<ConfigurationContainer>(ConfigurationContainer.class, this, ConfigurationPackage.MAPPING_RELATIONSHIPS__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationResourcesContainer> getResourcesContainers() {
		if (resourcesContainers == null) {
			resourcesContainers = new EObjectContainmentEList<ConfigurationResourcesContainer>(ConfigurationResourcesContainer.class, this, ConfigurationPackage.MAPPING_RELATIONSHIPS__RESOURCES_CONTAINERS);
		}
		return resourcesContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationFragmentContainer> getFragmentsContainer() {
		if (fragmentsContainer == null) {
			fragmentsContainer = new EObjectContainmentEList<ConfigurationFragmentContainer>(ConfigurationFragmentContainer.class, this, ConfigurationPackage.MAPPING_RELATIONSHIPS__FRAGMENTS_CONTAINER);
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
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__RESOURCES_CONTAINERS:
				return ((InternalEList<?>)getResourcesContainers()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__FRAGMENTS_CONTAINER:
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
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__CONTAINERS:
				return getContainers();
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__RESOURCES_CONTAINERS:
				return getResourcesContainers();
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__FRAGMENTS_CONTAINER:
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
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends ConfigurationContainer>)newValue);
				return;
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__RESOURCES_CONTAINERS:
				getResourcesContainers().clear();
				getResourcesContainers().addAll((Collection<? extends ConfigurationResourcesContainer>)newValue);
				return;
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__FRAGMENTS_CONTAINER:
				getFragmentsContainer().clear();
				getFragmentsContainer().addAll((Collection<? extends ConfigurationFragmentContainer>)newValue);
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
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__CONTAINERS:
				getContainers().clear();
				return;
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__RESOURCES_CONTAINERS:
				getResourcesContainers().clear();
				return;
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__FRAGMENTS_CONTAINER:
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
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__RESOURCES_CONTAINERS:
				return resourcesContainers != null && !resourcesContainers.isEmpty();
			case ConfigurationPackage.MAPPING_RELATIONSHIPS__FRAGMENTS_CONTAINER:
				return fragmentsContainer != null && !fragmentsContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingRelationshipsImpl
