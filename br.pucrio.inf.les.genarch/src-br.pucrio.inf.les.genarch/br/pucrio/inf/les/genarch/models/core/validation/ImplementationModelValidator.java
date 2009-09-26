package br.pucrio.inf.les.genarch.models.core.validation;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationModelHandle;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;

public class ImplementationModelValidator {

	private IProject project;

	public ImplementationModelValidator(IProject project) {
		this.project = project;
	}

	public boolean validate() {

		ImplementationModelHandle implementationModel = ImplementationModelHandle.implementationModel(project);
		IResource implementationModelResource = implementationModel.getResource();

		try {

			while ( implementationModel.iterator().hasNext() ) {
				EObject element = implementationModel.iterator().next();

				String resourcePath = "";

				if ( (element instanceof ImplementationContainer )) {
					ImplementationContainer container = (ImplementationContainer)element;
					resourcePath = container.getName();
				} else if ( (element instanceof ImplementationResourcesContainer) ) {
					ImplementationResourcesContainer resourceContainer = (ImplementationResourcesContainer)element;
					resourcePath = resourceContainer.getName();
				} else 	if ( !(element instanceof ImplementationFragment) && !(element instanceof ImplementationFragmentContainer) ) {
					ImplementationEntity entity = (ImplementationEntity)element;
					resourcePath = entity.getPath();

					String entityName = entity.getName();
					String lastSegmentPath = new Path(entity.getPath()).lastSegment();

					if ( entityName == null ) {
						IMarker marker = implementationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,"Null entry at \"Name\" attribute on architecture model");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					} else if ( !entityName.equals(lastSegmentPath) ) {
						IMarker marker = implementationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,entityName + " is not equals to its path last segment \"" + lastSegmentPath + "\"");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					}
				}

				if ( resourcePath == null ) {
					IMarker marker = implementationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
					marker.setAttribute(IMarker.MESSAGE,"Null entry at \"Path\" attribute on architecture model");
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				} else {

					IResource resource = project.findMember(new Path(resourcePath));

					if ( resource == null ) {
						IMarker marker = implementationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,resourcePath + " does not exist.");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
