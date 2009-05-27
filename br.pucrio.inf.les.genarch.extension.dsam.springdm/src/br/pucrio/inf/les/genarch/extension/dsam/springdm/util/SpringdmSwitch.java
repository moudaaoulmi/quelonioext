/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.springdm.util;

import br.pucrio.inf.les.genarch.extension.dsam.springdm.*;

import br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement;
import br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;

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
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage
 * @generated
 */
public class SpringdmSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpringdmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringdmSwitch() {
		if (modelPackage == null) {
			modelPackage = SpringdmPackage.eINSTANCE;
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
			case SpringdmPackage.SPRING_DYNAMIC_MODULES: {
				SpringDynamicModules springDynamicModules = (SpringDynamicModules)theEObject;
				T result = caseSpringDynamicModules(springDynamicModules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.BEAN: {
				Bean bean = (Bean)theEObject;
				T result = caseBean(bean);
				if (result == null) result = caseGroupClass(bean);
				if (result == null) result = caseVariableElement(bean);
				if (result == null) result = caseGroupRelationship(bean);
				if (result == null) result = caseDomainElement(bean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.BEAN_REFERENCE: {
				BeanReference beanReference = (BeanReference)theEObject;
				T result = caseBeanReference(beanReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.OS_GI_REFERENCE: {
				OSGiReference osGiReference = (OSGiReference)theEObject;
				T result = caseOSGiReference(osGiReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.BEANS: {
				Beans beans = (Beans)theEObject;
				T result = caseBeans(beans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseVariableElement(bundle);
				if (result == null) result = caseDomainElement(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.BUNDLE_CONTENTS: {
				BundleContents bundleContents = (BundleContents)theEObject;
				T result = caseBundleContents(bundleContents);
				if (result == null) result = caseFolderDependence(bundleContents);
				if (result == null) result = caseComponentDependence(bundleContents);
				if (result == null) result = caseFileDependence(bundleContents);
				if (result == null) result = caseDependenceRelationship(bundleContents);
				if (result == null) result = caseDomainElement(bundleContents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.REQUIRE_BUNDLE: {
				RequireBundle requireBundle = (RequireBundle)theEObject;
				T result = caseRequireBundle(requireBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.BUNDLE_REQ: {
				BundleReq bundleReq = (BundleReq)theEObject;
				T result = caseBundleReq(bundleReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpringdmPackage.BEAN_VARIANT: {
				BeanVariant beanVariant = (BeanVariant)theEObject;
				T result = caseBeanVariant(beanVariant);
				if (result == null) result = caseGroupFragments(beanVariant);
				if (result == null) result = caseGroupClass(beanVariant);
				if (result == null) result = caseVariableElement(beanVariant);
				if (result == null) result = caseGroupRelationship(beanVariant);
				if (result == null) result = caseDomainElement(beanVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spring Dynamic Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spring Dynamic Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpringDynamicModules(SpringDynamicModules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBean(Bean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanReference(BeanReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Gi Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Gi Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSGiReference(OSGiReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeans(Beans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleContents(BundleContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequireBundle(RequireBundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleReq(BundleReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeanVariant(BeanVariant object) {
		return null;
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

} //SpringdmSwitch
