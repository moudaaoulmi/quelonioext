/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage
 * @generated
 */
public interface DsamtypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsamtypesFactory eINSTANCE = br.pucrio.inf.les.genarch.models.dsamtypes.impl.DsamtypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Dependence</em>'.
	 * @generated
	 */
	ClassDependence createClassDependence();

	/**
	 * Returns a new object of class '<em>Aspect Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect Dependence</em>'.
	 * @generated
	 */
	AspectDependence createAspectDependence();

	/**
	 * Returns a new object of class '<em>File Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Dependence</em>'.
	 * @generated
	 */
	FileDependence createFileDependence();

	/**
	 * Returns a new object of class '<em>Template Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Dependence</em>'.
	 * @generated
	 */
	TemplateDependence createTemplateDependence();

	/**
	 * Returns a new object of class '<em>Component Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Dependence</em>'.
	 * @generated
	 */
	ComponentDependence createComponentDependence();

	/**
	 * Returns a new object of class '<em>Folder Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Dependence</em>'.
	 * @generated
	 */
	FolderDependence createFolderDependence();

	/**
	 * Returns a new object of class '<em>Fragment Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment Dependence</em>'.
	 * @generated
	 */
	FragmentDependence createFragmentDependence();

	/**
	 * Returns a new object of class '<em>Variable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Element</em>'.
	 * @generated
	 */
	VariableElement createVariableElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DsamtypesPackage getDsamtypesPackage();

} //DsamtypesFactory
