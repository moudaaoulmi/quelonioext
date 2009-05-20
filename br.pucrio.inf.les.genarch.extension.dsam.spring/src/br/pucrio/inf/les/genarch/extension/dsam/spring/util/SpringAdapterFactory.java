/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.extension.dsam.spring.util;

import br.pucrio.inf.les.genarch.extension.dsam.spring.*;

import br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship;
import br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.SpringPackage
 * @generated
 */
public class SpringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpringPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringSwitch<Adapter> modelSwitch =
		new SpringSwitch<Adapter>() {
			@Override
			public Adapter caseSpring(Spring object) {
				return createSpringAdapter();
			}
			@Override
			public Adapter caseBean(Bean object) {
				return createBeanAdapter();
			}
			@Override
			public Adapter caseBeanVariant(BeanVariant object) {
				return createBeanVariantAdapter();
			}
			@Override
			public Adapter caseBeanReference(BeanReference object) {
				return createBeanReferenceAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseDomainElement(DomainElement object) {
				return createDomainElementAdapter();
			}
			@Override
			public Adapter caseGroupRelationship(GroupRelationship object) {
				return createGroupRelationshipAdapter();
			}
			@Override
			public Adapter caseGroupClass(GroupClass object) {
				return createGroupClassAdapter();
			}
			@Override
			public Adapter caseGroupFragments(GroupFragments object) {
				return createGroupFragmentsAdapter();
			}
			@Override
			public Adapter caseDependenceRelationship(DependenceRelationship object) {
				return createDependenceRelationshipAdapter();
			}
			@Override
			public Adapter caseIntraDependence(IntraDependence object) {
				return createIntraDependenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Spring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Spring
	 * @generated
	 */
	public Adapter createSpringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Bean
	 * @generated
	 */
	public Adapter createBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant <em>Bean Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.BeanVariant
	 * @generated
	 */
	public Adapter createBeanVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.BeanReference <em>Bean Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.BeanReference
	 * @generated
	 */
	public Adapter createBeanReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.spring.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.spring.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement
	 * @generated
	 */
	public Adapter createDomainElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship <em>Group Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupRelationship
	 * @generated
	 */
	public Adapter createGroupRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass <em>Group Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass
	 * @generated
	 */
	public Adapter createGroupClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments <em>Group Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments
	 * @generated
	 */
	public Adapter createGroupFragmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship <em>Dependence Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DependenceRelationship
	 * @generated
	 */
	public Adapter createDependenceRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence <em>Intra Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence
	 * @generated
	 */
	public Adapter createIntraDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpringAdapterFactory
