/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.jade.impl;

import br.pucrio.inf.les.genarch.extension.dsam.jade.Agent;
import br.pucrio.inf.les.genarch.extension.dsam.jade.Behavior;
import br.pucrio.inf.les.genarch.extension.dsam.jade.Jade;
import br.pucrio.inf.les.genarch.extension.dsam.jade.JadePackage;

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
 * An implementation of the model object '<em><b>Jade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadeImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadeImpl#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JadeImpl extends EObjectImpl implements Jade {
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
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JadePackage.Literals.JADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, JadePackage.JADE__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<Behavior>(Behavior.class, this, JadePackage.JADE__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JadePackage.JADE__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case JadePackage.JADE__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
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
			case JadePackage.JADE__AGENTS:
				return getAgents();
			case JadePackage.JADE__BEHAVIORS:
				return getBehaviors();
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
			case JadePackage.JADE__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case JadePackage.JADE__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
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
			case JadePackage.JADE__AGENTS:
				getAgents().clear();
				return;
			case JadePackage.JADE__BEHAVIORS:
				getBehaviors().clear();
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
			case JadePackage.JADE__AGENTS:
				return agents != null && !agents.isEmpty();
			case JadePackage.JADE__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JadeImpl
