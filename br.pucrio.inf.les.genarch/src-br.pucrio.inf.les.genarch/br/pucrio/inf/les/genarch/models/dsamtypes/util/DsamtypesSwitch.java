/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes.util;

import br.pucrio.inf.les.genarch.models.dsamtypes.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage
 * @generated
 */
public class DsamtypesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DsamtypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsamtypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DsamtypesPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DsamtypesPackage.DOMAIN_ELEMENT: {
				DomainElement domainElement = (DomainElement)theEObject;
				T result = caseDomainElement(domainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_RELATIONSHIP: {
				GroupRelationship groupRelationship = (GroupRelationship)theEObject;
				T result = caseGroupRelationship(groupRelationship);
				if (result == null) result = caseDomainElement(groupRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.DEPENDENCE_RELATIONSHIP: {
				DependenceRelationship dependenceRelationship = (DependenceRelationship)theEObject;
				T result = caseDependenceRelationship(dependenceRelationship);
				if (result == null) result = caseDomainElement(dependenceRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_CLASS: {
				GroupClass groupClass = (GroupClass)theEObject;
				T result = caseGroupClass(groupClass);
				if (result == null) result = caseGroupRelationship(groupClass);
				if (result == null) result = caseDomainElement(groupClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_ASPECTS: {
				GroupAspects groupAspects = (GroupAspects)theEObject;
				T result = caseGroupAspects(groupAspects);
				if (result == null) result = caseGroupRelationship(groupAspects);
				if (result == null) result = caseDomainElement(groupAspects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_FILES: {
				GroupFiles groupFiles = (GroupFiles)theEObject;
				T result = caseGroupFiles(groupFiles);
				if (result == null) result = caseGroupRelationship(groupFiles);
				if (result == null) result = caseDomainElement(groupFiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_TEMPLATES: {
				GroupTemplates groupTemplates = (GroupTemplates)theEObject;
				T result = caseGroupTemplates(groupTemplates);
				if (result == null) result = caseGroupRelationship(groupTemplates);
				if (result == null) result = caseDomainElement(groupTemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_COMPONENTS: {
				GroupComponents groupComponents = (GroupComponents)theEObject;
				T result = caseGroupComponents(groupComponents);
				if (result == null) result = caseGroupRelationship(groupComponents);
				if (result == null) result = caseDomainElement(groupComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_FOLDERS: {
				GroupFolders groupFolders = (GroupFolders)theEObject;
				T result = caseGroupFolders(groupFolders);
				if (result == null) result = caseGroupRelationship(groupFolders);
				if (result == null) result = caseDomainElement(groupFolders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.GROUP_FRAGMENTS: {
				GroupFragments groupFragments = (GroupFragments)theEObject;
				T result = caseGroupFragments(groupFragments);
				if (result == null) result = caseGroupRelationship(groupFragments);
				if (result == null) result = caseDomainElement(groupFragments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.CLASS_DEPENDENCE: {
				ClassDependence classDependence = (ClassDependence)theEObject;
				T result = caseClassDependence(classDependence);
				if (result == null) result = caseDependenceRelationship(classDependence);
				if (result == null) result = caseDomainElement(classDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.ASPECT_DEPENDENCE: {
				AspectDependence aspectDependence = (AspectDependence)theEObject;
				T result = caseAspectDependence(aspectDependence);
				if (result == null) result = caseDependenceRelationship(aspectDependence);
				if (result == null) result = caseDomainElement(aspectDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.FILE_DEPENDENCE: {
				FileDependence fileDependence = (FileDependence)theEObject;
				T result = caseFileDependence(fileDependence);
				if (result == null) result = caseDependenceRelationship(fileDependence);
				if (result == null) result = caseDomainElement(fileDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.TEMPLATE_DEPENDENCE: {
				TemplateDependence templateDependence = (TemplateDependence)theEObject;
				T result = caseTemplateDependence(templateDependence);
				if (result == null) result = caseDependenceRelationship(templateDependence);
				if (result == null) result = caseDomainElement(templateDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.COMPONENT_DEPENDENCE: {
				ComponentDependence componentDependence = (ComponentDependence)theEObject;
				T result = caseComponentDependence(componentDependence);
				if (result == null) result = caseDependenceRelationship(componentDependence);
				if (result == null) result = caseDomainElement(componentDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.FOLDER_DEPENDENCE: {
				FolderDependence folderDependence = (FolderDependence)theEObject;
				T result = caseFolderDependence(folderDependence);
				if (result == null) result = caseDependenceRelationship(folderDependence);
				if (result == null) result = caseDomainElement(folderDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.FRAGMENT_DEPENDENCE: {
				FragmentDependence fragmentDependence = (FragmentDependence)theEObject;
				T result = caseFragmentDependence(fragmentDependence);
				if (result == null) result = caseDependenceRelationship(fragmentDependence);
				if (result == null) result = caseDomainElement(fragmentDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.INTRA_DEPENDENCE: {
				IntraDependence intraDependence = (IntraDependence)theEObject;
				T result = caseIntraDependence(intraDependence);
				if (result == null) result = caseDependenceRelationship(intraDependence);
				if (result == null) result = caseDomainElement(intraDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.EXTRA_DEPENDENCE: {
				ExtraDependence extraDependence = (ExtraDependence)theEObject;
				T result = caseExtraDependence(extraDependence);
				if (result == null) result = caseDependenceRelationship(extraDependence);
				if (result == null) result = caseDomainElement(extraDependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsamtypesPackage.VARIABLE_ELEMENT: {
				VariableElement variableElement = (VariableElement)theEObject;
				T result = caseVariableElement(variableElement);
				if (result == null) result = caseDomainElement(variableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainElement(DomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupRelationship(GroupRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependence Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependence Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependenceRelationship(DependenceRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupClass(GroupClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Aspects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Aspects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupAspects(GroupAspects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Files</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Files</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupFiles(GroupFiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Templates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Templates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupTemplates(GroupTemplates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupComponents(GroupComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Folders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Folders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupFolders(GroupFolders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Fragments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Fragments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupFragments(GroupFragments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDependence(ClassDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectDependence(AspectDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDependence(FileDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateDependence(TemplateDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDependence(ComponentDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderDependence(FolderDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentDependence(FragmentDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intra Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intra Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntraDependence(IntraDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraDependence(ExtraDependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableElement(VariableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DsamtypesSwitch
