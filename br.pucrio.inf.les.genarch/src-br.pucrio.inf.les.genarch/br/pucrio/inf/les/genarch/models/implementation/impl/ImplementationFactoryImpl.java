/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.models.implementation.impl;

import br.pucrio.inf.les.genarch.models.implementation.*;

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
public class ImplementationFactoryImpl extends EFactoryImpl implements ImplementationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationFactory init() {
		try {
			ImplementationFactory theImplementationFactory = (ImplementationFactory)EPackage.Registry.INSTANCE.getEFactory("http:///ImplementationMetaModel.ecore"); 
			if (theImplementationFactory != null) {
				return theImplementationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImplementationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFactoryImpl() {
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
			case ImplementationPackage.IMPLEMENTATION: return createImplementation();
			case ImplementationPackage.IMPLEMENTATION_CONTAINER: return createImplementationContainer();
			case ImplementationPackage.IMPLEMENTATION_RESOURCES_CONTAINER: return createImplementationResourcesContainer();
			case ImplementationPackage.IMPLEMENTATION_FRAGMENT_CONTAINER: return createImplementationFragmentContainer();
			case ImplementationPackage.IMPLEMENTATION_ENTITY: return createImplementationEntity();
			case ImplementationPackage.IMPLEMENTATION_COMPONENT: return createImplementationComponent();
			case ImplementationPackage.IMPLEMENTATION_CLASS: return createImplementationClass();
			case ImplementationPackage.IMPLEMENTATION_ASPECT: return createImplementationAspect();
			case ImplementationPackage.IMPLEMENTATION_FILE: return createImplementationFile();
			case ImplementationPackage.IMPLEMENTATION_TEMPLATE: return createImplementationTemplate();
			case ImplementationPackage.IMPLEMENTATION_FOLDER: return createImplementationFolder();
			case ImplementationPackage.IMPLEMENTATION_FRAGMENT: return createImplementationFragment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationContainer createImplementationContainer() {
		ImplementationContainerImpl implementationContainer = new ImplementationContainerImpl();
		return implementationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationResourcesContainer createImplementationResourcesContainer() {
		ImplementationResourcesContainerImpl implementationResourcesContainer = new ImplementationResourcesContainerImpl();
		return implementationResourcesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFragmentContainer createImplementationFragmentContainer() {
		ImplementationFragmentContainerImpl implementationFragmentContainer = new ImplementationFragmentContainerImpl();
		return implementationFragmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationEntity createImplementationEntity() {
		ImplementationEntityImpl implementationEntity = new ImplementationEntityImpl();
		return implementationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationComponent createImplementationComponent() {
		ImplementationComponentImpl implementationComponent = new ImplementationComponentImpl();
		return implementationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationClass createImplementationClass() {
		ImplementationClassImpl implementationClass = new ImplementationClassImpl();
		return implementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationAspect createImplementationAspect() {
		ImplementationAspectImpl implementationAspect = new ImplementationAspectImpl();
		return implementationAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFile createImplementationFile() {
		ImplementationFileImpl implementationFile = new ImplementationFileImpl();
		return implementationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTemplate createImplementationTemplate() {
		ImplementationTemplateImpl implementationTemplate = new ImplementationTemplateImpl();
		return implementationTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFolder createImplementationFolder() {
		ImplementationFolderImpl implementationFolder = new ImplementationFolderImpl();
		return implementationFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationFragment createImplementationFragment() {
		ImplementationFragmentImpl implementationFragment = new ImplementationFragmentImpl();
		return implementationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationPackage getImplementationPackage() {
		return (ImplementationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImplementationPackage getPackage() {
		return ImplementationPackage.eINSTANCE;
	}

} //ImplementationFactoryImpl
