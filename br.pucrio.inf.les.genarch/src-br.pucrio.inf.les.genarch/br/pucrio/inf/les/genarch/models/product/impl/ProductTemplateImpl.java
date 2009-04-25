/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import br.pucrio.inf.les.genarch.models.product.ProductTemplate;

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
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductTemplateImpl#getGenerateToPath <em>Generate To Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductTemplateImpl extends ProductEntityImpl implements ProductTemplate {
	/**
	 * The default value of the '{@link #getGenerateToPath() <em>Generate To Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateToPath()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATE_TO_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerateToPath() <em>Generate To Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateToPath()
	 * @generated
	 * @ordered
	 */
	protected String generateToPath = GENERATE_TO_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerateToPath() {
		return generateToPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateToPath(String newGenerateToPath) {
		String oldGenerateToPath = generateToPath;
		generateToPath = newGenerateToPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_TEMPLATE__GENERATE_TO_PATH, oldGenerateToPath, generateToPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_TEMPLATE__GENERATE_TO_PATH:
				return getGenerateToPath();
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
			case ProductPackage.PRODUCT_TEMPLATE__GENERATE_TO_PATH:
				setGenerateToPath((String)newValue);
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
			case ProductPackage.PRODUCT_TEMPLATE__GENERATE_TO_PATH:
				setGenerateToPath(GENERATE_TO_PATH_EDEFAULT);
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
			case ProductPackage.PRODUCT_TEMPLATE__GENERATE_TO_PATH:
				return GENERATE_TO_PATH_EDEFAULT == null ? generateToPath != null : !GENERATE_TO_PATH_EDEFAULT.equals(generateToPath);
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
		result.append(" (generateToPath: ");
		result.append(generateToPath);
		result.append(')');
		return result.toString();
	}

} //ProductTemplateImpl
