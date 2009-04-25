/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.Configuration#getMappingRelationships <em>Mapping Relationships</em>}</li>
 *   <li>{@link br.pucrio.inf.les.genarch.models.configuration.Configuration#getDsmMappings <em>Dsm Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Relationships</em>' containment reference.
	 * @see #setMappingRelationships(MappingRelationships)
	 * @see br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage#getConfiguration_MappingRelationships()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MappingRelationships getMappingRelationships();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.configuration.Configuration#getMappingRelationships <em>Mapping Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Relationships</em>' containment reference.
	 * @see #getMappingRelationships()
	 * @generated
	 */
	void setMappingRelationships(MappingRelationships value);

	/**
	 * Returns the value of the '<em><b>Dsm Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsm Mappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsm Mappings</em>' containment reference.
	 * @see #setDsmMappings(DSMMappings)
	 * @see br.pucrio.inf.les.genarch.models.configuration.ConfigurationPackage#getConfiguration_DsmMappings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DSMMappings getDsmMappings();

	/**
	 * Sets the value of the '{@link br.pucrio.inf.les.genarch.models.configuration.Configuration#getDsmMappings <em>Dsm Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsm Mappings</em>' containment reference.
	 * @see #getDsmMappings()
	 * @generated
	 */
	void setDsmMappings(DSMMappings value);

} // Configuration
