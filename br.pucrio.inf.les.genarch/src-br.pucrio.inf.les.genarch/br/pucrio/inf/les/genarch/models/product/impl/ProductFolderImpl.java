/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.ProductFile;
import br.pucrio.inf.les.genarch.models.product.ProductFolder;
import br.pucrio.inf.les.genarch.models.product.ProductPackage;
import br.pucrio.inf.les.genarch.models.product.ProductTemplate;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFolderImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductFolderImpl#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductFolderImpl extends ProductEntityImpl implements ProductFolder {
	/**
	 * The cached value of the '{@link #getSubFolders() <em>Sub Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductFolder> subFolders;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductFile> files;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductTemplate> templates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFolder> getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectContainmentEList<ProductFolder>(ProductFolder.class, this, ProductPackage.PRODUCT_FOLDER__SUB_FOLDERS);
		}
		return subFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<ProductFile>(ProductFile.class, this, ProductPackage.PRODUCT_FOLDER__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<ProductTemplate>(ProductTemplate.class, this, ProductPackage.PRODUCT_FOLDER__TEMPLATES);
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
			case ProductPackage.PRODUCT_FOLDER__SUB_FOLDERS:
				return ((InternalEList<?>)getSubFolders()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_FOLDER__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_FOLDER__TEMPLATES:
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
			case ProductPackage.PRODUCT_FOLDER__SUB_FOLDERS:
				return getSubFolders();
			case ProductPackage.PRODUCT_FOLDER__FILES:
				return getFiles();
			case ProductPackage.PRODUCT_FOLDER__TEMPLATES:
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
			case ProductPackage.PRODUCT_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				getSubFolders().addAll((Collection<? extends ProductFolder>)newValue);
				return;
			case ProductPackage.PRODUCT_FOLDER__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends ProductFile>)newValue);
				return;
			case ProductPackage.PRODUCT_FOLDER__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends ProductTemplate>)newValue);
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
			case ProductPackage.PRODUCT_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				return;
			case ProductPackage.PRODUCT_FOLDER__FILES:
				getFiles().clear();
				return;
			case ProductPackage.PRODUCT_FOLDER__TEMPLATES:
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
			case ProductPackage.PRODUCT_FOLDER__SUB_FOLDERS:
				return subFolders != null && !subFolders.isEmpty();
			case ProductPackage.PRODUCT_FOLDER__FILES:
				return files != null && !files.isEmpty();
			case ProductPackage.PRODUCT_FOLDER__TEMPLATES:
				return templates != null && !templates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductFolderImpl
