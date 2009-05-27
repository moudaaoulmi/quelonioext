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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringdmPackage
 * @generated
 */
public class SpringdmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpringdmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringdmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpringdmPackage.eINSTANCE;
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
	protected SpringdmSwitch<Adapter> modelSwitch =
		new SpringdmSwitch<Adapter>() {
			@Override
			public Adapter caseSpringDynamicModules(SpringDynamicModules object) {
				return createSpringDynamicModulesAdapter();
			}
			@Override
			public Adapter caseBean(Bean object) {
				return createBeanAdapter();
			}
			@Override
			public Adapter caseBeanReference(BeanReference object) {
				return createBeanReferenceAdapter();
			}
			@Override
			public Adapter caseOSGiReference(OSGiReference object) {
				return createOSGiReferenceAdapter();
			}
			@Override
			public Adapter caseBeans(Beans object) {
				return createBeansAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseBundleContents(BundleContents object) {
				return createBundleContentsAdapter();
			}
			@Override
			public Adapter caseRequireBundle(RequireBundle object) {
				return createRequireBundleAdapter();
			}
			@Override
			public Adapter caseBundleReq(BundleReq object) {
				return createBundleReqAdapter();
			}
			@Override
			public Adapter caseBeanVariant(BeanVariant object) {
				return createBeanVariantAdapter();
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
			public Adapter caseVariableElement(VariableElement object) {
				return createVariableElementAdapter();
			}
			@Override
			public Adapter caseDependenceRelationship(DependenceRelationship object) {
				return createDependenceRelationshipAdapter();
			}
			@Override
			public Adapter caseFolderDependence(FolderDependence object) {
				return createFolderDependenceAdapter();
			}
			@Override
			public Adapter caseComponentDependence(ComponentDependence object) {
				return createComponentDependenceAdapter();
			}
			@Override
			public Adapter caseFileDependence(FileDependence object) {
				return createFileDependenceAdapter();
			}
			@Override
			public Adapter caseGroupFragments(GroupFragments object) {
				return createGroupFragmentsAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules <em>Spring Dynamic Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.SpringDynamicModules
	 * @generated
	 */
	public Adapter createSpringDynamicModulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bean
	 * @generated
	 */
	public Adapter createBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference <em>Bean Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanReference
	 * @generated
	 */
	public Adapter createBeanReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference <em>OS Gi Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.OSGiReference
	 * @generated
	 */
	public Adapter createOSGiReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Beans
	 * @generated
	 */
	public Adapter createBeansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleContents <em>Bundle Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleContents
	 * @generated
	 */
	public Adapter createBundleContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle <em>Require Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.RequireBundle
	 * @generated
	 */
	public Adapter createRequireBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq <em>Bundle Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BundleReq
	 * @generated
	 */
	public Adapter createBundleReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant <em>Bean Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.extension.dsam.springdm.BeanVariant
	 * @generated
	 */
	public Adapter createBeanVariantAdapter() {
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
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement <em>Variable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement
	 * @generated
	 */
	public Adapter createVariableElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence <em>Folder Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence
	 * @generated
	 */
	public Adapter createFolderDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence <em>Component Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence
	 * @generated
	 */
	public Adapter createComponentDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence <em>File Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence
	 * @generated
	 */
	public Adapter createFileDependenceAdapter() {
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

} //SpringdmAdapterFactory
