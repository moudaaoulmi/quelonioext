/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.product.impl;

import br.pucrio.inf.les.genarch.models.product.ProductAspect;
import br.pucrio.inf.les.genarch.models.product.ProductClass;
import br.pucrio.inf.les.genarch.models.product.ProductComponent;
import br.pucrio.inf.les.genarch.models.product.ProductFile;
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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.product.impl.ProductComponentImpl#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductComponentImpl extends ProductEntityImpl implements ProductComponent {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductClass> classes;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductAspect> aspects;

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
	 * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductComponent> subComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ProductClass>(ProductClass.class, this, ProductPackage.PRODUCT_COMPONENT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductAspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<ProductAspect>(ProductAspect.class, this, ProductPackage.PRODUCT_COMPONENT__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<ProductFile>(ProductFile.class, this, ProductPackage.PRODUCT_COMPONENT__FILES);
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
			templates = new EObjectContainmentEList<ProductTemplate>(ProductTemplate.class, this, ProductPackage.PRODUCT_COMPONENT__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductComponent> getSubComponents() {
		if (subComponents == null) {
			subComponents = new EObjectContainmentEList<ProductComponent>(ProductComponent.class, this, ProductPackage.PRODUCT_COMPONENT__SUB_COMPONENTS);
		}
		return subComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT_COMPONENT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_COMPONENT__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_COMPONENT__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_COMPONENT__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case ProductPackage.PRODUCT_COMPONENT__SUB_COMPONENTS:
				return ((InternalEList<?>)getSubComponents()).basicRemove(otherEnd, msgs);
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
			case ProductPackage.PRODUCT_COMPONENT__CLASSES:
				return getClasses();
			case ProductPackage.PRODUCT_COMPONENT__ASPECTS:
				return getAspects();
			case ProductPackage.PRODUCT_COMPONENT__FILES:
				return getFiles();
			case ProductPackage.PRODUCT_COMPONENT__TEMPLATES:
				return getTemplates();
			case ProductPackage.PRODUCT_COMPONENT__SUB_COMPONENTS:
				return getSubComponents();
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
			case ProductPackage.PRODUCT_COMPONENT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ProductClass>)newValue);
				return;
			case ProductPackage.PRODUCT_COMPONENT__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends ProductAspect>)newValue);
				return;
			case ProductPackage.PRODUCT_COMPONENT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends ProductFile>)newValue);
				return;
			case ProductPackage.PRODUCT_COMPONENT__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends ProductTemplate>)newValue);
				return;
			case ProductPackage.PRODUCT_COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
				getSubComponents().addAll((Collection<? extends ProductComponent>)newValue);
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
			case ProductPackage.PRODUCT_COMPONENT__CLASSES:
				getClasses().clear();
				return;
			case ProductPackage.PRODUCT_COMPONENT__ASPECTS:
				getAspects().clear();
				return;
			case ProductPackage.PRODUCT_COMPONENT__FILES:
				getFiles().clear();
				return;
			case ProductPackage.PRODUCT_COMPONENT__TEMPLATES:
				getTemplates().clear();
				return;
			case ProductPackage.PRODUCT_COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
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
			case ProductPackage.PRODUCT_COMPONENT__CLASSES:
				return classes != null && !classes.isEmpty();
			case ProductPackage.PRODUCT_COMPONENT__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case ProductPackage.PRODUCT_COMPONENT__FILES:
				return files != null && !files.isEmpty();
			case ProductPackage.PRODUCT_COMPONENT__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case ProductPackage.PRODUCT_COMPONENT__SUB_COMPONENTS:
				return subComponents != null && !subComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductComponentImpl
