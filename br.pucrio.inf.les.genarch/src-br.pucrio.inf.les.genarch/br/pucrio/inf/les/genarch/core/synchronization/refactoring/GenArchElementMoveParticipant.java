package br.pucrio.inf.les.genarch.core.synchronization.refactoring;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;

public class GenArchElementMoveParticipant extends MoveParticipant {

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor arg0,CheckConditionsContext arg1) throws OperationCanceledException {
		return new RefactoringStatus();
	}

	@Override
	public Change createChange(IProgressMonitor arg0) throws CoreException,OperationCanceledException {
		CompositeChange changes = new CompositeChange("");		
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	protected boolean initialize(Object arg0) {
		return false;
	}

}
