/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.jade;

import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.JadeFactory
 * @model kind="package"
 * @generated
 */
public interface JadePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jade";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///JadeDSAM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.pucrio.inf.les.genarch.extension.dsam.jade.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JadePackage eINSTANCE = br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl.init();

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadeImpl <em>Jade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadeImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl#getJade()
	 * @generated
	 */
	int JADE = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JADE__AGENTS = 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JADE__BEHAVIORS = 1;

	/**
	 * The number of structural features of the '<em>Jade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JADE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.AgentImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = DsamtypesPackage.GROUP_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CLASSES = DsamtypesPackage.GROUP_CLASS__CLASSES;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__BEHAVIORS = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.BehaviorImpl
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = DsamtypesPackage.GROUP_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CLASSES = DsamtypesPackage.GROUP_CLASS__CLASSES;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = DsamtypesPackage.GROUP_CLASS_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Jade <em>Jade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jade</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.Jade
	 * @generated
	 */
	EClass getJade();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Jade#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.Jade#getAgents()
	 * @see #getJade()
	 * @generated
	 */
	EReference getJade_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Jade#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.Jade#getBehaviors()
	 * @see #getJade()
	 * @generated
	 */
	EReference getJade_Behaviors();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Agent#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.Agent#getBehaviors()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Behaviors();

	/**
	 * Returns the meta object for class '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JadeFactory getJadeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadeImpl <em>Jade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadeImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl#getJade()
		 * @generated
		 */
		EClass JADE = eINSTANCE.getJade();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JADE__AGENTS = eINSTANCE.getJade_Agents();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JADE__BEHAVIORS = eINSTANCE.getJade_Behaviors();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.AgentImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__BEHAVIORS = eINSTANCE.getAgent_Behaviors();

		/**
		 * The meta object literal for the '{@link br.pucrio.inf.les.genarch.extension.dsam.jade.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.BehaviorImpl
		 * @see br.pucrio.inf.les.genarch.extension.dsam.jade.impl.JadePackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

	}

} //JadePackage
