package br.pucrio.inf.les.genarch.core.synchronization.listeners;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;

import br.pucrio.inf.les.genarch.core.models.dsl.ImplementationModelUtil;
import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFactory;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;

public class ResourceChangeToArchitecture {

	private Map<String,ImplementationModelUtil> implementationModelsChanged = new HashMap<String,ImplementationModelUtil>();
	//private Map<String,ConfigurationModelUtil> configurationModelChanged = new HashMap<String,ConfigurationModelUtil>();

	public void resourceChanged(ResourcesEventData eventData, int eventType) { 
		IResource res = eventData.getResource();
		
		if ( eventData.getEventType() == IResourceDelta.ADDED ) {
			ImplementationEntity element = createImplementationEntity(res);
			getImplementationModelUtil(res).addElement(element);					
		}
		
		for ( ImplementationModelUtil implementationModelUtil : implementationModelsChanged.values() ) {
			if ( eventType != IResourceChangeEvent.POST_BUILD ) {
				implementationModelUtil.saveModel();		   
			}
		}

		implementationModelsChanged.clear();

		/*if ( eventData.getEventType() == IResourceDelta.ADDED ) {
			ImplementationEntity element = createImplementationEntity(res);
			getImplementationModelUtil(res).addElement(element);  	   
		} else if ( eventData.getEventType() == IResourceDelta.REMOVED ) {
			String resourcePath = res.getProjectRelativePath().toString();
			getImplementationModelUtil(res).removeElement(resourcePath);

			if ( eventData.getFlags() != IResourceDelta.MOVED_FROM ) {
				getConfigurationModelUtil(res).removeMappingElement(resourcePath);
			}
		}

		if ( eventData.getFlags() == IResourceDelta.MOVED_FROM ) {	    	    
			MappingEntity oldMappingEntity = getConfigurationModelUtil(res).mappingElement(eventData.getFromPath());
			if ( oldMappingEntity != null ) {
				MappingEntity newMappingEntity = createMappingEntity(res, oldMappingEntity);			
				getConfigurationModelUtil(res).addMappingElement(newMappingEntity);
				getConfigurationModelUtil(res).removeMappingElement(oldMappingEntity.getPath());
			}

		} else if ( eventData.getFlags() == IResourceDelta.COPIED_FROM ) {
			ImplementationEntity element = createImplementationEntity(res);
			getImplementationModelUtil(res).addElement(element);		    
		}

		for ( ImplementationModelUtil implementationModelUtil : implementationModelsChanged.values() ) {
			if ( eventType != IResourceChangeEvent.POST_BUILD ) {
				implementationModelUtil.saveModel();		   
			}
		}

		implementationModelsChanged.clear();

		for ( ConfigurationModelUtil configurationModelUtil : configurationModelChanged.values() ) {
			if ( eventType != IResourceChangeEvent.POST_BUILD ) {
				configurationModelUtil.saveModel();
			}
		}

		configurationModelChanged.clear(); */

	}

	private ImplementationModelUtil getImplementationModelUtil(IResource res) {
		ImplementationModelUtil implementationModelUtil = implementationModelsChanged.get(res.getProject().getName());

		if ( implementationModelUtil == null ) {
			GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(res.getProject());

			String implementationModelPath = genarchProjectConfigurationFile.getImplementationModelPath();
			implementationModelUtil = new ImplementationModelUtil(res.getProject());
			implementationModelsChanged.put(res.getProject().getName(), implementationModelUtil);		    
		}

		return implementationModelUtil;
	}

	/*private ConfigurationModelUtil getConfigurationModelUtil(IResource res) {
		ConfigurationModelUtil configurationModelUtil = configurationModelChanged.get(res.getProject().getName());

		if ( configurationModelUtil == null ) {
			GenarchConfigurationHelper helper = new GenarchConfigurationHelper(res.getProject());
			GenarchConfiguration genarchConfiguration = helper.getGenarchConfiguration();

			String configurationModelPath = genarchConfiguration.getConfigurationModelPath();
			configurationModelUtil = new ConfigurationModelUtil(res.getProject());
			configurationModelChanged.put(res.getProject().getName(), configurationModelUtil);
		}

		return configurationModelUtil;
	}*/

	/*private MappingEntity createMappingEntity(IResource res,MappingEntity oldMappingEntity) {
		ConfigurationFactory configurationFactory = ConfigurationPackageImpl.eINSTANCE.getConfigurationFactory();	
		MappingEntity entity;

		if ( res.getType() == IResource.FOLDER ) {
			String containerName = res.getProjectRelativePath().segment(0);	    
			if ( JavaCore.create(containerName) instanceof IPackageFragmentRoot ) {
				entity = configurationFactory.createConfigurationComponent();
			} else {
				entity = configurationFactory.createConfigurationFolder();
			}
		} else if ( "java".equals(res.getFileExtension()) ) {
			entity = configurationFactory.createConfigurationClass();
		} else if ( "aj".equals(res.getFileExtension()) ) {
			entity = configurationFactory.createConfigurationAspect();
		} else if ( "xpt".equals(res.getFileExtension()) ) {
			entity = configurationFactory.createConfigurationTemplate();
		} else {
			entity = configurationFactory.createConfigurationFile();
		}

		entity.setName(res.getName());
		entity.setPath(res.getProjectRelativePath().toString());
		entity.setFeatureExpression(oldMappingEntity.getFeatureExpression());

		return entity;
	}*/

	private ImplementationEntity createImplementationEntity(IResource res) {
		ImplementationFactory implementationFactory = ImplementationPackage.eINSTANCE.getImplementationFactory();
		ImplementationEntity entity;
		if ( res.getType() == IResource.FOLDER ) {
			String containerName = res.getProjectRelativePath().segment(0);
			IResource resou = res.getProject().findMember(new Path(containerName));
			IJavaElement container = JavaCore.create(resou);
			if ( container instanceof IPackageFragmentRoot ) {
				entity = implementationFactory.createImplementationComponent();
			} else {
				entity = implementationFactory.createImplementationFolder();
			}
		} else if ( "java".equals(res.getFileExtension()) ) {
			entity = implementationFactory.createImplementationClass();
		} else if ( "aj".equals(res.getFileExtension()) ) {
			entity = implementationFactory.createImplementationAspect();
		} else if ( "xpt".equals(res.getFileExtension()) ) {
			entity = implementationFactory.createImplementationTemplate();
		} else {
			entity = implementationFactory.createImplementationFile();
		}

		entity.setName(res.getName());
		entity.setPath(res.getProjectRelativePath().toString());

		return entity;
	}
}
