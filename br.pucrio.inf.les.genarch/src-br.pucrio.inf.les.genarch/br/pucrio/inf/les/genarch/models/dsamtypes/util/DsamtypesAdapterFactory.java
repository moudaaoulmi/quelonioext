/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.dsamtypes.util;

import br.pucrio.inf.les.genarch.models.dsamtypes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage
 * @generated
 */
public class DsamtypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DsamtypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsamtypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DsamtypesPackage.eINSTANCE;
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
	protected DsamtypesSwitch<Adapter> modelSwitch =
		new DsamtypesSwitch<Adapter>() {
			@Override
			public Adapter caseDomainElement(DomainElement object) {
				return createDomainElementAdapter();
			}
			@Override
			public Adapter caseGroupRelationship(GroupRelationship object) {
				return createGroupRelationshipAdapter();
			}
			@Override
			public Adapter caseDependenceRelationship(DependenceRelationship object) {
				return createDependenceRelationshipAdapter();
			}
			@Override
			public Adapter caseGroupClass(GroupClass object) {
				return createGroupClassAdapter();
			}
			@Override
			public Adapter caseGroupAspects(GroupAspects object) {
				return createGroupAspectsAdapter();
			}
			@Override
			public Adapter caseGroupFiles(GroupFiles object) {
				return createGroupFilesAdapter();
			}
			@Override
			public Adapter caseGroupTemplates(GroupTemplates object) {
				return createGroupTemplatesAdapter();
			}
			@Override
			public Adapter caseGroupComponents(GroupComponents object) {
				return createGroupComponentsAdapter();
			}
			@Override
			public Adapter caseGroupFolders(GroupFolders object) {
				return createGroupFoldersAdapter();
			}
			@Override
			public Adapter caseGroupFragments(GroupFragments object) {
				return createGroupFragmentsAdapter();
			}
			@Override
			public Adapter caseClassDependence(ClassDependence object) {
				return createClassDependenceAdapter();
			}
			@Override
			public Adapter caseAspectDependence(AspectDependence object) {
				return createAspectDependenceAdapter();
			}
			@Override
			public Adapter caseFileDependence(FileDependence object) {
				return createFileDependenceAdapter();
			}
			@Override
			public Adapter caseTemplateDependence(TemplateDependence object) {
				return createTemplateDependenceAdapter();
			}
			@Override
			public Adapter caseComponentDependence(ComponentDependence object) {
				return createComponentDependenceAdapter();
			}
			@Override
			public Adapter caseFolderDependence(FolderDependence object) {
				return createFolderDependenceAdapter();
			}
			@Override
			public Adapter caseFragmentDependence(FragmentDependence object) {
				return createFragmentDependenceAdapter();
			}
			@Override
			public Adapter caseVariableElement(VariableElement object) {
				return createVariableElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects <em>Group Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects
	 * @generated
	 */
	public Adapter createGroupAspectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles <em>Group Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles
	 * @generated
	 */
	public Adapter createGroupFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates <em>Group Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates
	 * @generated
	 */
	public Adapter createGroupTemplatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents <em>Group Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents
	 * @generated
	 */
	public Adapter createGroupComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders <em>Group Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders
	 * @generated
	 */
	public Adapter createGroupFoldersAdapter() {
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
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence <em>Class Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence
	 * @generated
	 */
	public Adapter createClassDependenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence <em>Aspect Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence
	 * @generated
	 */
	public Adapter createAspectDependenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence <em>Template Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence
	 * @generated
	 */
	public Adapter createTemplateDependenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence <em>Fragment Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence
	 * @generated
	 */
	public Adapter createFragmentDependenceAdapter() {
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

} //DsamtypesAdapterFactory
