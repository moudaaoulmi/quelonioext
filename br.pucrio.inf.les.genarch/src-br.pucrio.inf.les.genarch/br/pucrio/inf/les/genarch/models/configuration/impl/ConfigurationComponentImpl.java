/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.configuration.impl;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationAspect;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationClass;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;

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
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationComponentImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationComponentImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationComponentImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationComponentImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationComponentImpl#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationComponentImpl extends MappingEntityImpl implements ConfigurationComponent {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationClass> classes;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationAspect> aspects;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationTemplate> templates;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationFile> files;

	/**
	 * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationComponent> subComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ConfigurationClass>(ConfigurationClass.class, this, ConfigurationPackage.CONFIGURATION_COMPONENT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationAspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<ConfigurationAspect>(ConfigurationAspect.class, this, ConfigurationPackage.CONFIGURATION_COMPONENT__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<ConfigurationTemplate>(ConfigurationTemplate.class, this, ConfigurationPackage.CONFIGURATION_COMPONENT__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<ConfigurationFile>(ConfigurationFile.class, this, ConfigurationPackage.CONFIGURATION_COMPONENT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationComponent> getSubComponents() {
		if (subComponents == null) {
			subComponents = new EObjectContainmentEList<ConfigurationComponent>(ConfigurationComponent.class, this, ConfigurationPackage.CONFIGURATION_COMPONENT__SUB_COMPONENTS);
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
			case ConfigurationPackage.CONFIGURATION_COMPONENT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION_COMPONENT__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION_COMPONENT__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION_COMPONENT__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION_COMPONENT__SUB_COMPONENTS:
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
			case ConfigurationPackage.CONFIGURATION_COMPONENT__CLASSES:
				return getClasses();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__ASPECTS:
				return getAspects();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__TEMPLATES:
				return getTemplates();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__FILES:
				return getFiles();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__SUB_COMPONENTS:
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
			case ConfigurationPackage.CONFIGURATION_COMPONENT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ConfigurationClass>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends ConfigurationAspect>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends ConfigurationTemplate>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends ConfigurationFile>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__SUB_COMPONENTS:
				getSubComponents().clear();
				getSubComponents().addAll((Collection<? extends ConfigurationComponent>)newValue);
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
			case ConfigurationPackage.CONFIGURATION_COMPONENT__CLASSES:
				getClasses().clear();
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__ASPECTS:
				getAspects().clear();
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__TEMPLATES:
				getTemplates().clear();
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__FILES:
				getFiles().clear();
				return;
			case ConfigurationPackage.CONFIGURATION_COMPONENT__SUB_COMPONENTS:
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
			case ConfigurationPackage.CONFIGURATION_COMPONENT__CLASSES:
				return classes != null && !classes.isEmpty();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__FILES:
				return files != null && !files.isEmpty();
			case ConfigurationPackage.CONFIGURATION_COMPONENT__SUB_COMPONENTS:
				return subComponents != null && !subComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationComponentImpl
