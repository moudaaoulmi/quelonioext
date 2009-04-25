/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation.impl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

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
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationComponentImpl#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationComponentImpl extends ImplementationEntityImpl implements ImplementationComponent {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationClass> classes;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationAspect> aspects;

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
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationFile> files;

	/**
	 * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationComponent> subComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.IMPLEMENTATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ImplementationClass>(ImplementationClass.class, this, ImplementationPackage.IMPLEMENTATION_COMPONENT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationAspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<ImplementationAspect>(ImplementationAspect.class, this, ImplementationPackage.IMPLEMENTATION_COMPONENT__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<ImplementationTemplate>(ImplementationTemplate.class, this, ImplementationPackage.IMPLEMENTATION_COMPONENT__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<ImplementationFile>(ImplementationFile.class, this, ImplementationPackage.IMPLEMENTATION_COMPONENT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationComponent> getSubComponents() {
		if (subComponents == null) {
			subComponents = new EObjectContainmentEList<ImplementationComponent>(ImplementationComponent.class, this, ImplementationPackage.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS);
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
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS:
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
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__CLASSES:
				return getClasses();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__ASPECTS:
				return getAspects();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__TEMPLATES:
				return getTemplates();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__FILES:
				return getFiles();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS:
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
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ImplementationClass>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends ImplementationAspect>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends ImplementationTemplate>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends ImplementationFile>)newValue);
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
				getSubComponents().addAll((Collection<? extends ImplementationComponent>)newValue);
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
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__CLASSES:
				getClasses().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__ASPECTS:
				getAspects().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__TEMPLATES:
				getTemplates().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__FILES:
				getFiles().clear();
				return;
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS:
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
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__CLASSES:
				return classes != null && !classes.isEmpty();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__FILES:
				return files != null && !files.isEmpty();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT__SUB_COMPONENTS:
				return subComponents != null && !subComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationComponentImpl
