/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.mas.impl;

import br.pucrio.inf.les.genarch.extension.dsam.mas.Agent;
import br.pucrio.inf.les.genarch.extension.dsam.mas.Capability;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MAS;
import br.pucrio.inf.les.genarch.extension.dsam.mas.MasPackage;

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
 * An implementation of the model object '<em><b>MAS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.MASImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.mas.impl.MASImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MASImpl extends EObjectImpl implements MAS {
	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasPackage.Literals.MAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, MasPackage.MAS__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, MasPackage.MAS__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MasPackage.MAS__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case MasPackage.MAS__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case MasPackage.MAS__AGENTS:
				return getAgents();
			case MasPackage.MAS__CAPABILITIES:
				return getCapabilities();
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
			case MasPackage.MAS__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case MasPackage.MAS__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
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
			case MasPackage.MAS__AGENTS:
				getAgents().clear();
				return;
			case MasPackage.MAS__CAPABILITIES:
				getCapabilities().clear();
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
			case MasPackage.MAS__AGENTS:
				return agents != null && !agents.isEmpty();
			case MasPackage.MAS__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MASImpl
