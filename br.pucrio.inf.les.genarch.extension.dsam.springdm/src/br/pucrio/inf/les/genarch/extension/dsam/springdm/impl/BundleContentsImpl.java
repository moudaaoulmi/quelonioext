/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm.impl;

import br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleContents;
import br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage;

import br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence;

import br.pucrio.inf.les.genarch.models.dsamtypes.impl.FolderDependenceImpl;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Contents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleContentsImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.impl.BundleContentsImpl#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleContentsImpl extends FolderDependenceImpl implements BundleContents {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationComponent> components;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleContentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringdmPackage.Literals.BUNDLE_CONTENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ImplementationComponent>(ImplementationComponent.class, this, SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationFile> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<ImplementationFile>(ImplementationFile.class, this, SpringdmPackage.BUNDLE_CONTENTS__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case SpringdmPackage.BUNDLE_CONTENTS__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
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
			case SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS:
				return getComponents();
			case SpringdmPackage.BUNDLE_CONTENTS__FILES:
				return getFiles();
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
			case SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ImplementationComponent>)newValue);
				return;
			case SpringdmPackage.BUNDLE_CONTENTS__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends ImplementationFile>)newValue);
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
			case SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS:
				getComponents().clear();
				return;
			case SpringdmPackage.BUNDLE_CONTENTS__FILES:
				getFiles().clear();
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
			case SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS:
				return components != null && !components.isEmpty();
			case SpringdmPackage.BUNDLE_CONTENTS__FILES:
				return files != null && !files.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ComponentDependence.class) {
			switch (derivedFeatureID) {
				case SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS: return DsamtypesPackage.COMPONENT_DEPENDENCE__COMPONENTS;
				default: return -1;
			}
		}
		if (baseClass == FileDependence.class) {
			switch (derivedFeatureID) {
				case SpringdmPackage.BUNDLE_CONTENTS__FILES: return DsamtypesPackage.FILE_DEPENDENCE__FILES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ComponentDependence.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.COMPONENT_DEPENDENCE__COMPONENTS: return SpringdmPackage.BUNDLE_CONTENTS__COMPONENTS;
				default: return -1;
			}
		}
		if (baseClass == FileDependence.class) {
			switch (baseFeatureID) {
				case DsamtypesPackage.FILE_DEPENDENCE__FILES: return SpringdmPackage.BUNDLE_CONTENTS__FILES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BundleContentsImpl
