package br.pucrio.inf.les.genarch.core.synchronization.refactoring;

import org.eclipse.ajdt.core.text.CoreMessages;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;

import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;

public class GenArchElementRenameParticipant extends RenameParticipant {
	
	private IFile element;
	
	public GenArchElementRenameParticipant() {
		
	}
	
	@Override
	public RefactoringStatus checkConditions(IProgressMonitor arg0,CheckConditionsContext arg1) throws OperationCanceledException {
		RefactoringStatus rs = new RefactoringStatus();
		return rs;
	}

	@Override
	public Change createChange(IProgressMonitor arg0) throws CoreException,OperationCanceledException {
		CompositeChange changes = new CompositeChange(CoreMessages.renameTypeReferences);
		IProject project = element.getProject();
		final String oldName = element.getName();
		final String newName = getArguments().getNewName();
		
		GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(project);
		
		//TODO Verificar se o elemento existe no modelo de arquitetura
		GenArchElementChange genArchElementChangeInArchitectureModel = new GenArchElementChange();		
		genArchElementChangeInArchitectureModel.setEnabled(true);
		genArchElementChangeInArchitectureModel.setModifiedElement(project.getFile(genarchProjectConfigurationFile.getImplementationModelPath()));
		genArchElementChangeInArchitectureModel.setName("Rename implementation element '" + oldName + "' to '" + newName + "' in architecture model.");
		changes.add(genArchElementChangeInArchitectureModel);
		
		//TODO Verificar se o elemento existe no modelo de configuracao
		GenArchElementChange genArchElementChangeInConfigurationModel = new GenArchElementChange();
		genArchElementChangeInConfigurationModel.setEnabled(true);
		genArchElementChangeInConfigurationModel.setModifiedElement(project.getFile(genarchProjectConfigurationFile.getImplementationModelPath()));
		genArchElementChangeInConfigurationModel.setName("Rename implementation element '" + oldName + "' to '" + newName + "' in configuration model.");
		changes.add(genArchElementChangeInConfigurationModel);
															    					
		return changes;
	}

	@Override
	public String getName() {
		return "renameParticipant";
	}
	
	protected boolean initialize(Object arg0) {
		if ( arg0 instanceof IFile ) {
			element = (IFile)arg0;
		}
		return true;
	}

}
