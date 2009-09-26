package br.pucrio.inf.les.genarch.ui.actions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSetSnapshot;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.DiffResourceSet;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.metamodel.MatchResourceSet;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.ui.editor.ModelCompareEditorInput;
import org.eclipse.emf.compare.ui.internal.VisualEngineSelector;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.core.project.navigation.ProjectNavigator;
import br.pucrio.inf.les.genarch.core.project.navigation.visitors.ConfigurationModelResourceVisitor;
import br.pucrio.inf.les.genarch.core.project.navigation.visitors.ImplementationModelResourceVisitor;
import br.pucrio.inf.les.genarch.models.configuration.Configuration;
import br.pucrio.inf.les.genarch.models.implementation.Implementation;

public class UpdateModelsAction implements IObjectActionDelegate {

	private ISelection fSelection;
	public UpdateModelsAction() {
		super();
	}

	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {		
	}

	public void run(final IAction action) {

		if(this.fSelection instanceof StructuredSelection) {
			Object element = ((StructuredSelection)this.fSelection).getFirstElement();
			if(element instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) element;
				IResource resource = (IResource) adaptable.getAdapter(IResource.class);
				if(resource != null) {					
					final IProject project = resource.getProject();
					
					final IPath folderPath = new Path("models");

					try {
						GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(project);

						List<String> containers = new ArrayList<String>();
						containers.addAll(genarchProjectConfigurationFile.getSourceContainers());
						containers.addAll(genarchProjectConfigurationFile.getResourceContainers());

						ImplementationModelResourceVisitor implementationClient = new ImplementationModelResourceVisitor();
						ConfigurationModelResourceVisitor configurationClient = new ConfigurationModelResourceVisitor();
						ProjectNavigator navigator = new ProjectNavigator(project,containers);
						navigator.addResourceVisitors(implementationClient);
						navigator.navigate();
											
						String newImplementationFileName = "NewArchitectureModel.implementation";
						IFile newImplementationModelFile = project.getFile(folderPath.append(newImplementationFileName));
						URI newImplementationFileURI = URI.createPlatformResourceURI(newImplementationModelFile.getFullPath().toString());
						final ResourceSet newImplementationResourceSet = new ResourceSetImpl();
						final Resource newImplemenationModelResource = newImplementationResourceSet.createResource(newImplementationFileURI);
						final Implementation newImplementationModel = implementationClient.getImplementationContent().getImplementation();
						
						newImplemenationModelResource.getContents().add(newImplementationModel);
						
						String oldImplementationFileName = genarchProjectConfigurationFile.getImplementationModelPath();
						IFile oldImplementationModelFile = project.getFile(oldImplementationFileName);
						URI oldImplementationFileURI = URI.createPlatformResourceURI(oldImplementationModelFile.getFullPath().toString());
						ResourceSet oldImplementationResourceSet = new ResourceSetImpl();
						Resource oldImplemenationModelResource = oldImplementationResourceSet.getResource(oldImplementationFileURI,true);
						
						Implementation oldImplemenationModel = (Implementation)oldImplemenationModelResource.getContents().get(0);
						
						MatchService.setMatchEngineSelector(new VisualEngineSelector());
						DiffService.setDiffEngineSelector(new VisualEngineSelector());
					
						final MatchResourceSet matchIM = MatchService.doResourceSetMatch(newImplementationResourceSet,oldImplementationResourceSet,Collections.<String,Object> emptyMap());
						final DiffResourceSet diffIM = DiffService.doDiff(matchIM,false);
						final List<DiffElement> differencesIM = new ArrayList<DiffElement>(diffIM.getResourceDiffs());
						MergeService.merge(differencesIM,false);

						final ComparisonResourceSetSnapshot snapshotIM = DiffFactory.eINSTANCE.createComparisonResourceSetSnapshot();
						snapshotIM.setDate(Calendar.getInstance().getTime());
						snapshotIM.setDiffResourceSet(diffIM);
						snapshotIM.setMatchResourceSet(matchIM);

						ModelCompareEditorInput inputIM = new ModelCompareEditorInput(snapshotIM);

						CompareConfiguration configurationIM = inputIM.getCompareConfiguration();
						configurationIM.setLeftLabel("Old Implementation Model");
						configurationIM.setRightLabel("New Implementation Model");
						configurationIM.setRightEditable(true);						

						CompareUI.openCompareEditor(inputIM);
						
						String newConfiguationModelFileName = "NewConfigurationModel.configuration";
						IFile newConfigurationModelFile = project.getFile(folderPath.append(newConfiguationModelFileName));
						URI newConfigurationFileURI = URI.createPlatformResourceURI(newConfigurationModelFile.getFullPath().toString());
						final ResourceSet newConfigurationResourceSet = new ResourceSetImpl();
						final Resource newConfigurationlModelResource = newConfigurationResourceSet.createResource(newConfigurationFileURI);
						final Configuration newConfigurationModel = configurationClient.getConfigurationContent().getConfiguration();
						
						newConfigurationlModelResource.getContents().add(newConfigurationModel);
						
						String oldConfigurationFileName = genarchProjectConfigurationFile.getConfigurationModelPath();
						IFile oldConfigurationModelFile = project.getFile(oldConfigurationFileName);
						URI oldConfigurationFileURI = URI.createPlatformResourceURI(oldConfigurationModelFile.getFullPath().toString());
						ResourceSet oldConfigurationResourceSet = new ResourceSetImpl();
						Resource oldConfigurationModelResource = oldConfigurationResourceSet.getResource(oldConfigurationFileURI,true);
						
						Configuration oldConfigurationModel = (Configuration)oldConfigurationModelResource.getContents().get(0);
						
						final MatchModel matchCM = MatchService.doMatch(newConfigurationModel.getMappingRelationships(),oldConfigurationModel.getMappingRelationships(),Collections.<String,Object> emptyMap());
						final DiffModel diffCM = DiffService.doDiff(matchCM,false);
						final List<DiffElement> differencesCM = new ArrayList<DiffElement>(diffCM.getOwnedElements());
						MergeService.merge(differencesCM,false);

						final ComparisonResourceSnapshot snapshotCM = DiffFactory.eINSTANCE.createComparisonResourceSnapshot();
						snapshotCM.setDate(Calendar.getInstance().getTime());
						snapshotCM.setDiff(diffCM);
						snapshotCM.setMatch(matchCM);

						ModelCompareEditorInput inputCM = new ModelCompareEditorInput(snapshotCM);

						CompareConfiguration configurationCM = inputCM.getCompareConfiguration();
						configurationCM.setLeftLabel("New Configuration Model");
						configurationCM.setRightLabel("Old Configuration Model");
						configurationCM.setRightEditable(true);

						CompareUI.openCompareEditor(inputCM);
						
					} catch (ConcurrentModificationException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}				
				}
			}
		}
	}



	public void selectionChanged(final IAction action, final ISelection selection) {
		this.fSelection = selection;
	}

	public void dispose() {

	}	
}
