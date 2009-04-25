/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.configuration.util;

import br.pucrio.inf.les.genarch.models.configuration.*;

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
 * @see br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigurationPackage.eINSTANCE;
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
			case ConfigurationPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.MAPPING_RELATIONSHIPS: {
				MappingRelationships mappingRelationships = (MappingRelationships)theEObject;
				T result = caseMappingRelationships(mappingRelationships);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.MAPPING_ENTITY: {
				MappingEntity mappingEntity = (MappingEntity)theEObject;
				T result = caseMappingEntity(mappingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_CONTAINER: {
				ConfigurationContainer configurationContainer = (ConfigurationContainer)theEObject;
				T result = caseConfigurationContainer(configurationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_RESOURCES_CONTAINER: {
				ConfigurationResourcesContainer configurationResourcesContainer = (ConfigurationResourcesContainer)theEObject;
				T result = caseConfigurationResourcesContainer(configurationResourcesContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_FRAGMENT_CONTAINER: {
				ConfigurationFragmentContainer configurationFragmentContainer = (ConfigurationFragmentContainer)theEObject;
				T result = caseConfigurationFragmentContainer(configurationFragmentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_COMPONENT: {
				ConfigurationComponent configurationComponent = (ConfigurationComponent)theEObject;
				T result = caseConfigurationComponent(configurationComponent);
				if (result == null) result = caseMappingEntity(configurationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_CLASS: {
				ConfigurationClass configurationClass = (ConfigurationClass)theEObject;
				T result = caseConfigurationClass(configurationClass);
				if (result == null) result = caseMappingEntity(configurationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_ASPECT: {
				ConfigurationAspect configurationAspect = (ConfigurationAspect)theEObject;
				T result = caseConfigurationAspect(configurationAspect);
				if (result == null) result = caseMappingEntity(configurationAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_TEMPLATE: {
				ConfigurationTemplate configurationTemplate = (ConfigurationTemplate)theEObject;
				T result = caseConfigurationTemplate(configurationTemplate);
				if (result == null) result = caseMappingEntity(configurationTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_FILE: {
				ConfigurationFile configurationFile = (ConfigurationFile)theEObject;
				T result = caseConfigurationFile(configurationFile);
				if (result == null) result = caseMappingEntity(configurationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_FOLDER: {
				ConfigurationFolder configurationFolder = (ConfigurationFolder)theEObject;
				T result = caseConfigurationFolder(configurationFolder);
				if (result == null) result = caseMappingEntity(configurationFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CONFIGURATION_FRAGMENT: {
				ConfigurationFragment configurationFragment = (ConfigurationFragment)theEObject;
				T result = caseConfigurationFragment(configurationFragment);
				if (result == null) result = caseMappingEntity(configurationFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DSM_MAPPINGS: {
				DSMMappings dsmMappings = (DSMMappings)theEObject;
				T result = caseDSMMappings(dsmMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DSM: {
				DSM dsm = (DSM)theEObject;
				T result = caseDSM(dsm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DSM_ELEMENT: {
				DSMElement dsmElement = (DSMElement)theEObject;
				T result = caseDSMElement(dsmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.FEATURE_EXPRESSION: {
				FeatureExpression featureExpression = (FeatureExpression)theEObject;
				T result = caseFeatureExpression(featureExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Relationships</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Relationships</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingRelationships(MappingRelationships object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingEntity(MappingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationContainer(ConfigurationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationResourcesContainer(ConfigurationResourcesContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationFragmentContainer(ConfigurationFragmentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationComponent(ConfigurationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationClass(ConfigurationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationAspect(ConfigurationAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationTemplate(ConfigurationTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationFile(ConfigurationFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationFolder(ConfigurationFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationFragment(ConfigurationFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSM Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSM Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSMMappings(DSMMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSM(DSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSMElement(DSMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureExpression(FeatureExpression object) {
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

} //ConfigurationSwitch
