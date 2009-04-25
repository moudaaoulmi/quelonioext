/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation.impl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationTemplateImpl#getGenerationPath <em>Generation Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationTemplateImpl extends ImplementationEntityImpl implements ImplementationTemplate {
	/**
	 * The default value of the '{@link #getGenerationPath() <em>Generation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationPath()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationPath() <em>Generation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationPath()
	 * @generated
	 * @ordered
	 */
	protected String generationPath = GENERATION_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.IMPLEMENTATION_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationPath() {
		return generationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationPath(String newGenerationPath) {
		String oldGenerationPath = generationPath;
		generationPath = newGenerationPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.IMPLEMENTATION_TEMPLATE__GENERATION_PATH, oldGenerationPath, generationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.IMPLEMENTATION_TEMPLATE__GENERATION_PATH:
				return getGenerationPath();
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
			case ImplementationPackage.IMPLEMENTATION_TEMPLATE__GENERATION_PATH:
				setGenerationPath((String)newValue);
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
			case ImplementationPackage.IMPLEMENTATION_TEMPLATE__GENERATION_PATH:
				setGenerationPath(GENERATION_PATH_EDEFAULT);
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
			case ImplementationPackage.IMPLEMENTATION_TEMPLATE__GENERATION_PATH:
				return GENERATION_PATH_EDEFAULT == null ? generationPath != null : !GENERATION_PATH_EDEFAULT.equals(generationPath);
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
		result.append(" (generationPath: ");
		result.append(generationPath);
		result.append(')');
		return result.toString();
	}

} //ImplementationTemplateImpl
