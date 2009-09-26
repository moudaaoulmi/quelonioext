package br.pucrio.inf.les.genarch.models.core.validation;

import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

import br.pucrio.inf.les.genarch.core.logic.Logic;
import br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationModel;
import br.pucrio.inf.les.genarch.core.models.dsl.fmp.FeatureModel;
import br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationModelHandle;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragmentContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationResourcesContainer;
import br.pucrio.inf.les.genarch.models.configuration.FeatureExpression;
import br.pucrio.inf.les.genarch.models.configuration.MappingEntity;

public class ConfigurationModelValidator {

	private IProject project;

	public ConfigurationModelValidator(IProject project) {
		this.project = project;
	}

	public boolean validate() {

		ImplementationModelHandle implementationModel = ImplementationModelHandle.implementationModel(project);
		FeatureModel featureModel = FeatureModel.open(project);

		ConfigurationModel configurationModel = ConfigurationModel.open(project);
		IResource configurationModelResource = configurationModel.getResource();

		try {

			while ( configurationModel.iterator().hasNext() ) {
				EObject element = configurationModel.iterator().next();

				String resourcePath = "";

				if ( element instanceof ConfigurationContainer ) {
					ConfigurationContainer container = (ConfigurationContainer)element;
					resourcePath = container.getName();

					if ( resourcePath == null ) {
						IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,"Null entry at \"Path\" attribute on configuration model");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					} else {
						EObject resource = implementationModel.get().sourceContainer(resourcePath);

						if ( resource == null ) {
							IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
							marker.setAttribute(IMarker.MESSAGE,resourcePath + " does not exist.");
							marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						}
					}

				} else if ( element instanceof ConfigurationResourcesContainer ) {
					ConfigurationResourcesContainer resourceContainer = (ConfigurationResourcesContainer)element;
					resourcePath = resourceContainer.getName();

					if ( resourcePath == null ) {
						IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,"Null entry at \"Path\" attribute on configuration model");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					} else {

						EObject resource = implementationModel.get().resourceContainer(resourcePath);

						if ( resource == null ) {
							IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
							marker.setAttribute(IMarker.MESSAGE,resourcePath + " does not exist.");
							marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						}
					}										
				} else if ( element instanceof ConfigurationFragmentContainer ) {
					ConfigurationFragmentContainer fragmentContainer = (ConfigurationFragmentContainer)element;
					resourcePath = fragmentContainer.getName();
					
					if ( resourcePath == null ) {
						IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,"Null entry at \"Path\" attribute on configuration model");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					} else {

						EObject resource = implementationModel.get().fragmentContainer(resourcePath);

						if ( resource == null ) {
							IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
							marker.setAttribute(IMarker.MESSAGE,resourcePath + " does not exist.");
							marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						}
					}
				} else if ( element instanceof MappingEntity ) {
					MappingEntity entity = (MappingEntity)element;
					resourcePath = entity.getPath();

					String entityName = entity.getName();
					String lastSegmentPath = new Path(entity.getPath()).lastSegment();

					if ( entityName == null ) {
						IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,"Null entry at \"Name\" attribute on configuration model");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					} else if ( !entityName.equals(lastSegmentPath) ) {
						IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,entityName + " is not equals to its path last segment \"" + lastSegmentPath + "\"");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					}

					EObject resource = implementationModel.get().element(resourcePath);

					if ( resource == null ) {
						IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
						marker.setAttribute(IMarker.MESSAGE,resourcePath + " does not exist.");
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
					}
				}

				if ( element instanceof MappingEntity ) {
					MappingEntity entity = (MappingEntity)element;
					FeatureExpression featureExpression = entity.getFeatureExpression();

					if ( featureExpression != null ) { 
						List<String> features = Logic.toFeatures(featureExpression.getExpression());

						for ( String feature : features ) {
							if ( featureModel.get().feature(feature) == null ) {
								IMarker marker = configurationModelResource.createMarker("org.eclipse.core.resources.problemmarker");
								marker.setAttribute(IMarker.MESSAGE,"Feature " + feature + " does not exist.");
								marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
							}
						}
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
