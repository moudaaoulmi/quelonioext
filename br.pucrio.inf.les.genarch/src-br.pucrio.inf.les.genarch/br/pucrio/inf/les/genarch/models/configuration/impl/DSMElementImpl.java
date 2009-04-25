/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.configuration.impl;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.configuration.FeatureExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSM Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.DSMElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.DSMElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.DSMElementImpl#getImageURI <em>Image URI</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.DSMElementImpl#getFeatureExpression <em>Feature Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSMElementImpl extends EObjectImpl implements DSMElement {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageURI() <em>Image URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageURI() <em>Image URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageURI()
	 * @generated
	 * @ordered
	 */
	protected String imageURI = IMAGE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureExpression() <em>Feature Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureExpression()
	 * @generated
	 * @ordered
	 */
	protected FeatureExpression featureExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSMElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.DSM_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DSM_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DSM_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageURI() {
		return imageURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageURI(String newImageURI) {
		String oldImageURI = imageURI;
		imageURI = newImageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DSM_ELEMENT__IMAGE_URI, oldImageURI, imageURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureExpression getFeatureExpression() {
		return featureExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureExpression(FeatureExpression newFeatureExpression, NotificationChain msgs) {
		FeatureExpression oldFeatureExpression = featureExpression;
		featureExpression = newFeatureExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION, oldFeatureExpression, newFeatureExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureExpression(FeatureExpression newFeatureExpression) {
		if (newFeatureExpression != featureExpression) {
			NotificationChain msgs = null;
			if (featureExpression != null)
				msgs = ((InternalEObject)featureExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION, null, msgs);
			if (newFeatureExpression != null)
				msgs = ((InternalEObject)newFeatureExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION, null, msgs);
			msgs = basicSetFeatureExpression(newFeatureExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION, newFeatureExpression, newFeatureExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION:
				return basicSetFeatureExpression(null, msgs);
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
			case ConfigurationPackage.DSM_ELEMENT__NAME:
				return getName();
			case ConfigurationPackage.DSM_ELEMENT__TYPE:
				return getType();
			case ConfigurationPackage.DSM_ELEMENT__IMAGE_URI:
				return getImageURI();
			case ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION:
				return getFeatureExpression();
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
			case ConfigurationPackage.DSM_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.DSM_ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case ConfigurationPackage.DSM_ELEMENT__IMAGE_URI:
				setImageURI((String)newValue);
				return;
			case ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION:
				setFeatureExpression((FeatureExpression)newValue);
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
			case ConfigurationPackage.DSM_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.DSM_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ConfigurationPackage.DSM_ELEMENT__IMAGE_URI:
				setImageURI(IMAGE_URI_EDEFAULT);
				return;
			case ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION:
				setFeatureExpression((FeatureExpression)null);
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
			case ConfigurationPackage.DSM_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.DSM_ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ConfigurationPackage.DSM_ELEMENT__IMAGE_URI:
				return IMAGE_URI_EDEFAULT == null ? imageURI != null : !IMAGE_URI_EDEFAULT.equals(imageURI);
			case ConfigurationPackage.DSM_ELEMENT__FEATURE_EXPRESSION:
				return featureExpression != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", imageURI: ");
		result.append(imageURI);
		result.append(')');
		return result.toString();
	}

} //DSMElementImpl
