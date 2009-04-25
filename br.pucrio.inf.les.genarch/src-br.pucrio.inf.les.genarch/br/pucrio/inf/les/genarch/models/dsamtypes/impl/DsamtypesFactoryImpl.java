/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes.impl;

import br.pucrio.inf.les.genarch.models.dsamtypes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsamtypesFactoryImpl extends EFactoryImpl implements DsamtypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsamtypesFactory init() {
		try {
			DsamtypesFactory theDsamtypesFactory = (DsamtypesFactory)EPackage.Registry.INSTANCE.getEFactory("http:///DSAMElementTypes"); 
			if (theDsamtypesFactory != null) {
				return theDsamtypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DsamtypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsamtypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DsamtypesPackage.CLASS_DEPENDENCE: return createClassDependence();
			case DsamtypesPackage.ASPECT_DEPENDENCE: return createAspectDependence();
			case DsamtypesPackage.FILE_DEPENDENCE: return createFileDependence();
			case DsamtypesPackage.TEMPLATE_DEPENDENCE: return createTemplateDependence();
			case DsamtypesPackage.COMPONENT_DEPENDENCE: return createComponentDependence();
			case DsamtypesPackage.FOLDER_DEPENDENCE: return createFolderDependence();
			case DsamtypesPackage.FRAGMENT_DEPENDENCE: return createFragmentDependence();
			case DsamtypesPackage.VARIABLE_ELEMENT: return createVariableElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDependence createClassDependence() {
		ClassDependenceImpl classDependence = new ClassDependenceImpl();
		return classDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectDependence createAspectDependence() {
		AspectDependenceImpl aspectDependence = new AspectDependenceImpl();
		return aspectDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDependence createFileDependence() {
		FileDependenceImpl fileDependence = new FileDependenceImpl();
		return fileDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateDependence createTemplateDependence() {
		TemplateDependenceImpl templateDependence = new TemplateDependenceImpl();
		return templateDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDependence createComponentDependence() {
		ComponentDependenceImpl componentDependence = new ComponentDependenceImpl();
		return componentDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderDependence createFolderDependence() {
		FolderDependenceImpl folderDependence = new FolderDependenceImpl();
		return folderDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentDependence createFragmentDependence() {
		FragmentDependenceImpl fragmentDependence = new FragmentDependenceImpl();
		return fragmentDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableElement createVariableElement() {
		VariableElementImpl variableElement = new VariableElementImpl();
		return variableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsamtypesPackage getDsamtypesPackage() {
		return (DsamtypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DsamtypesPackage getPackage() {
		return DsamtypesPackage.eINSTANCE;
	}

} //DsamtypesFactoryImpl
