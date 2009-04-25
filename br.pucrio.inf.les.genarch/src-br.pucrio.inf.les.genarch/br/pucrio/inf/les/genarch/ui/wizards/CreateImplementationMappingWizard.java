package br.pucrio.inf.les.genarch.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import br.pucrio.inf.les.genarch.core.plugin.GenArchEMFPlugin;
import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.Configuration;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;
import br.pucrio.inf.les.genarch.models.domain.editor.DomainModelEditor;
import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.implementation.impl.ImplementationFragmentImpl;

public class CreateImplementationMappingWizard extends Wizard implements INewWizard {

	private CreateImplementationMappingWizardPage page;
	private IProject project;
	private IFile modelFile;
	private DomainModelEditor editorPart;

	private EObject element = null;

	private MappingRelationships mappingRelationships;
	private Implementation implementation;
	private Configuration configuration;

	public CreateImplementationMappingWizard(DomainModelEditor editorPart,IFile modelFile,EObject element) {
		super();
		this.setNeedsProgressMonitor(true);
		this.project = modelFile.getProject();
		this.modelFile = modelFile;
		this.element = element;
		this.editorPart = editorPart;
	}

	public void addPages() {
		this.page = new CreateImplementationMappingWizardPage(modelFile,element);
		this.addPage(this.page);
	}

	public boolean performFinish() {
		final ImplementationEntity selectedEntity = this.page.getSelection();

		final IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(monitor,selectedEntity);
				} catch (CoreException e) {
					GenArchEMFPlugin.INSTANCE.log(e);
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};

		try {
			this.getContainer().run(true, false, op);
		} catch (final InterruptedException e) {
			GenArchEMFPlugin.INSTANCE.log(e);
			return false;
		} catch (final InvocationTargetException e) {
			GenArchEMFPlugin.INSTANCE.log(e);
			Throwable realException = e.getTargetException();
			MessageDialog.openError(this.getShell(), "Error", realException.getMessage());
			return false;
		}

		return true;
	}


	private void doFinish(IProgressMonitor monitor,ImplementationEntity selection) throws CoreException {
		monitor.beginTask("Mapping element", 1);

		EList<EClass> superTypes = element.eClass().getEAllSuperTypes();

		int selectionType = -1;
		
		GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(project);

		String architectureModelPath = genarchProjectConfigurationFile.getImplementationModelPath();
				
		IFile architectureModelFile = this.project.getFile(architectureModelPath);
		URI architectureFileURI = URI.createPlatformResourceURI(architectureModelFile.getFullPath().toString());

		ResourceSet architectureResourceSet = new ResourceSetImpl();
		Resource architectureResource = architectureResourceSet.getResource(architectureFileURI, true);

		if ( selection instanceof ImplementationClass ) {
			selectionType = 0;
			EClass eclass = (EClass)getSuperType(DsamtypesPackage.GROUP_CLASS,superTypes);
			if ( eclass != null ) {
				GroupClass classesImpl = (GroupClass)element;				
				//classesImpl.getAssociatedClasses().add((ImplementationClass)selection);
				AddCommand command = new AddCommand(editorPart.getEditingDomain(),element,DsamtypesPackage.eINSTANCE.getGroupClass_Classes(),selection);
				if ( command.canExecute() ) {
					command.execute();
				}
			}
		} else if ( selection instanceof ImplementationAspect ) {
			selectionType = 1;
			EClass eclass = (EClass)getSuperType(DsamtypesPackage.GROUP_ASPECTS,superTypes);
			if ( eclass != null ) {
				GroupAspects aspectsImpl = (GroupAspects)element;
				aspectsImpl.getAspects().add((ImplementationAspect)selection);
			}
		} else if ( selection instanceof ImplementationTemplate ) {			
			selectionType = 2;
			EClass eclass = (EClass)getSuperType(DsamtypesPackage.GROUP_TEMPLATES,superTypes);
			if ( eclass != null ) {
				GroupTemplates templatesImpl = (GroupTemplates)element;
				templatesImpl.getTemplates().add((ImplementationTemplate)selection);
			}
		} else if ( selection instanceof ImplementationFile ) {
			selectionType = 3;
			EClass eclass = (EClass)getSuperType(DsamtypesPackage.GROUP_FILES,superTypes);
			if ( eclass != null ) {
				GroupFiles filesImpl = (GroupFiles)element;
				filesImpl.getFiles().add((ImplementationFile)selection);
			}
		} else if ( selection instanceof ImplementationFragmentImpl ) {
			selectionType = 4;
			EClass eclass = (EClass)getSuperType(DsamtypesPackage.GROUP_FRAGMENTS,superTypes);
			if ( eclass != null ) {
				GroupFragments fragmentsImpl = (GroupFragments)element;
				fragmentsImpl.getFragments().add((ImplementationFragment)selection);
			}
		} else if ( selection instanceof ImplementationFolder ) {
			selectionType = 5;
			EClass eclass = (EClass)getSuperType(DsamtypesPackage.GROUP_FOLDERS,superTypes);
			if ( eclass != null ) {
				GroupFolders foldersImpl= (GroupFolders)element;
				foldersImpl.getFolders().add((ImplementationFolder)selection);
			}
		} else if ( selection instanceof ImplementationComponent ) {
			selectionType = 6;
			EClass eclass = (EClass)getSuperType(DsamtypesPackage.GROUP_COMPONENTS,superTypes);
			if ( eclass != null ) {
				GroupComponents componentesImpl = (GroupComponents)element;
				//componentesImpl.getAssociatedComponents().add((ImplementationComponent)selection);
				//componentesImpl.getAssociatedComponents().add((ImplementationComponent)selection);
				AddCommand command = new AddCommand(editorPart.getEditingDomain(),element,DsamtypesPackage.eINSTANCE.getGroupComponents_Components(),selection);
				if ( command.canExecute() ) {
					command.execute();
				}				
			}
		}			

		/*for ( int x = 0; x < crossReferences.size(); x++ ) {
			EObject o = (EObject)crossReferences.get(x);
			if ( o instanceof EReference ) {
				EReference ref = (EReference)o;
				EClass refValueType = ref.getEReferenceType();
				
				if ( refValueType.getName().equals("ImplementationClass") && selectionType == 0 ) {
					ImplementationClass implementationClass = (ImplementationClass)selection;
					EStructuralFeature structuralFeature = element.eClass().getEStructuralFeature(ref.getFeatureID()); 
					element.eSet(structuralFeature,implementationClass);
					this.editorPart.setDirty();
				} else if ( refValueType.getName().equals("ImplementationAspect") && selectionType == 1 ) {
					ImplementationAspect implementationAspect = (ImplementationAspect)selection;
					EStructuralFeature structuralFeature = element.eClass().getEStructuralFeature(ref.getFeatureID()); 
					element.eSet(structuralFeature,implementationAspect);
					this.editorPart.setDirty();
				} else if ( refValueType.getName().equals("ImplementationTemplate") && selectionType == 2 ) {
					ImplementationTemplate implementationTemplate = (ImplementationTemplate)selection;
					EStructuralFeature structuralFeature = element.eClass().getEStructuralFeature(ref.getFeatureID()); 
					element.eSet(structuralFeature,implementationTemplate);
					this.editorPart.setDirty();
				} else if ( refValueType.getName().equals("ImplementationFile") && selectionType == 3 ) {
					ImplementationFile implementationFile = (ImplementationFile)selection;
					EStructuralFeature structuralFeature = element.eClass().getEStructuralFeature(ref.getFeatureID()); 
					element.eSet(structuralFeature,implementationFile);
					this.editorPart.setDirty();
				} else if ( refValueType.getName().equals("ImplementationFragment") && selectionType == 4 ) {
					ImplementationFragment implementationFragment = (ImplementationFragment)selection;
					int featureID = ref.getFeatureID();
					EStructuralFeature structuralFeature = element.eClass().getEStructuralFeature(featureID); 
					element.eSet(structuralFeature,implementationFragment);
					this.editorPart.setDirty();
				} else if ( refValueType.getName().equals("ImplementationFolder") && selectionType == 5 ) {
					ImplementationFolder implementationFolder = (ImplementationFolder)selection;
					EStructuralFeature structuralFeature = element.eClass().getEStructuralFeature(ref.getFeatureID()); 
					element.eSet(structuralFeature,implementationFolder);
					this.editorPart.setDirty();
				} else if ( refValueType.getName().equals("ImplementationComponent") && selectionType == 6 ) {
					ImplementationComponent implementationComponent = (ImplementationComponent)selection;
					EStructuralFeature structuralFeature = element.eClass().getEStructuralFeature(ref.getFeatureID()); 
					element.eSet(structuralFeature,implementationComponent);
					this.editorPart.setDirty();
				}
			}
		}*/
					
		monitor.worked(1);
	}
	
	private EObject getSuperType(int type, EList<EClass> superType) {
		for (EClass eclass : superType) {
			if (eclass.getClassifierID() == type) {
				return eclass;
			}
		}
		
		return null;
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) { }
}