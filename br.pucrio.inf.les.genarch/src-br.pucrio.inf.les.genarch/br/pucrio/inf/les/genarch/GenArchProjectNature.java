package br.pucrio.inf.les.genarch;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class GenArchProjectNature implements IProjectNature {
	
	private IProject project;

	public void configure() throws CoreException {
		// TODO Auto-generated method stub		
	}

	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub		
	}

	public IProject getProject() {
		return this.project;
	}

	public void setProject(final IProject project) {
		this.project = project;
	}
}
