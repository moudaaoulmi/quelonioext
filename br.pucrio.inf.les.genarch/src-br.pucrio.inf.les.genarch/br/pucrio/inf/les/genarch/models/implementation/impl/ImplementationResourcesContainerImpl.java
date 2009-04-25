/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation.impl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

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
 * An implementation of the model object '<em><b>Resources Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl#getFolders <em>Folders</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationResourcesContainerImpl#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationResourcesContainerImpl extends EObjectImpl implements ImplementationResourcesContainer {
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
	 * The cached value of the '{@link #getFolders() <em>Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationFolder> folders;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationFile> files;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationTemplate> templates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationResourcesContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.IMPLEMENTATION_RESOURCES_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFolder> getFolders() {
		if (folders == null) {
			folders = new EObjectContainmentEList<ImplementationFolder>(ImplementationFolder.class, this, ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS);
		}
		return folders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<ImplementationFile>(ImplementationFile.class, this, ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<ImplementationTemplate>(ImplementationTemplate.class, this, ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS:
				return ((InternalEList<?>)getFolders()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
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
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__NAME:
				return getName();
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS:
				return getFolders();
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FILES:
				return getFiles();
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES:
				return getTemplates();
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
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS:
				getFolders().clear();
				getFolders().addAll((Collection<? extends ImplementationFolder>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends ImplementationFile>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends ImplementationTemplate>)newValue);
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
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS:
				getFolders().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FILES:
				getFiles().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES:
				getTemplates().clear();
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
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FOLDERS:
				return folders != null && !folders.isEmpty();
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__FILES:
				return files != null && !files.isEmpty();
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER__TEMPLATES:
				return templates != null && !templates.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ImplementationResourcesContainerImpl
