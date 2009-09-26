package br.pucrio.inf.les.genarch.core.models.dsl.configuration;

import static br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationComponentBuilder.configurationComponent;
import static br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationFolderBuilder.configurationFolder;
import static br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationResourcesContainerBuilder.configurationResourcesContainer;
import static br.pucrio.inf.les.genarch.core.models.dsl.configuration.ConfigurationSourceContainerBuilder.configurationSourceContainer;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractContainerName;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractElementNameByPath;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractFragmentContainerName;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractParentPath;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import br.pucrio.inf.les.genarch.models.configuration.ConfigurationAspect;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationClass;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFolder;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragment;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragmentContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationResourcesContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationTemplate;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;

public class ConfigurationModelAddElement {

	private ConfigurationModel configurationModelHandle;

	public ConfigurationModelAddElement(ConfigurationModel configurationModelHandle) {
		this.configurationModelHandle = configurationModelHandle;
	}

	public ConfigurationModelAddElement sourceContainer(ConfigurationContainer configurationContainer) {
		if ( configurationModelHandle.get().sourceContainer(configurationContainer.getName()) == null ) {
			configurationModelHandle.getMappingRelationships().getContainers().add(configurationContainer);
		}
		return this;
	}

	public ConfigurationModelAddElement resourcesContainer(ConfigurationResourcesContainer configurationResourcesContainer) {
		if ( configurationModelHandle.get().resourceContainer(configurationResourcesContainer.getName()) == null ) {
			configurationModelHandle.getMappingRelationships().getResourcesContainers().add(configurationResourcesContainer);
		}
		return this;
	}

	public ConfigurationModelAddElement fragmentContainer(ConfigurationFragmentContainer configurationFragmentContainer) {
		if ( configurationModelHandle.get().fragmentContainer(configurationFragmentContainer.getName()) == null ) {
			configurationModelHandle.getMappingRelationships().getFragmentsContainer().add(configurationFragmentContainer);
		}
		return this;
	}

	public ConfigurationModelAddElement domainModel(DSM dsModel) {
		if ( configurationModelHandle.get().domainModel(dsModel.getName()) == null ) {
			configurationModelHandle.add().domainModel(dsModel);
		}
		return this;
	}

	public ConfigurationModelAddElement domainModelElement(String domainModelName,DSMElement element) {
		if ( configurationModelHandle.get().domainModelElement(element.getName(),domainModelName) == null ) {
			configurationModelHandle.get().domainModel(domainModelName).getElements().add(element);
		}
		return this;
	}

	public ConfigurationModelAddElement component(ConfigurationComponent configurationComponent) {
		if (configurationModelHandle.get().component(configurationComponent.getPath()) == null )  {

			Path iPath = new Path(configurationComponent.getPath());
			int segmentCount = iPath.segmentCount();

			if (segmentCount == 2) {
				ConfigurationContainer container = configurationModelHandle.get().sourceContainer(extractContainerName(configurationComponent.getPath()));

				if (container != null) {
					container.getComponents().add(configurationComponent);
				} else {
					this.configurationModelHandle.add().sourceContainer(configurationSourceContainer().name(extractContainerName(configurationComponent.getPath())).build());
				}
			} else {
				ConfigurationComponent parent = configurationModelHandle.get().component(extractParentPath(configurationComponent.getPath()));

				if (parent == null) {
					parent = configurationComponent().name(extractElementNameByPath(extractParentPath(configurationComponent.getPath()))).path(extractParentPath(configurationComponent.getPath())).build();
					component(parent);

				}

				parent.getSubComponents().add(configurationComponent);
			}
		}
		return this;
	}

	public ConfigurationModelAddElement folder(ConfigurationFolder configurationFolder) {
		if (configurationModelHandle.get().folder(configurationFolder.getPath()) == null )  {
			Path iPath = new Path(configurationFolder.getPath());
			int segmentCount = iPath.segmentCount();

			if (segmentCount == 2) {
				ConfigurationResourcesContainer container = configurationModelHandle.get().resourceContainer(extractContainerName(configurationFolder.getPath()));

				if (container != null) {
					container.getFolders().add(configurationFolder);
				} else {
					this.configurationModelHandle.add().resourcesContainer(configurationResourcesContainer().name(extractContainerName(configurationFolder.getPath())).build());
				}
			} else {
				ConfigurationFolder parent = configurationModelHandle.get().folder(
						extractParentPath(configurationFolder.getPath()));

				if (parent == null) {
					parent = configurationFolder().name(extractElementNameByPath(extractParentPath(configurationFolder.getPath()))).path(extractParentPath(configurationFolder.getPath())).build();
					folder(parent);

				}

				parent.getSubFolders().add(configurationFolder);
			}
		}
		return this;
	}

	public ConfigurationModelAddElement clazz(ConfigurationClass configurationClass) {
		if (configurationModelHandle.get().clazz(configurationClass.getPath()) == null) {
			ConfigurationComponent parent = configurationModelHandle.get().component(extractParentPath(configurationClass.getPath()));

			if (parent == null) {
				parent = configurationComponent().name(extractElementNameByPath(extractParentPath(configurationClass.getPath()))).path(extractParentPath(configurationClass.getPath())).build();
				component(parent);
			}

			parent.getClasses().add(configurationClass);
		}
		return this;
	}

	public ConfigurationModelAddElement aspect(ConfigurationAspect configurationAspect) {
		if (configurationModelHandle.get().aspect(configurationAspect.getPath()) == null) {
			ConfigurationComponent parent = configurationModelHandle.get().component(extractParentPath(configurationAspect.getPath()));

			if (parent == null) {
				parent = configurationComponent().name(extractElementNameByPath(extractParentPath(configurationAspect.getPath()))).path(extractParentPath(configurationAspect.getPath())).build();
				component(parent);
			}

			parent.getAspects().add(configurationAspect);
		}
		return this;
	}

	public ConfigurationModelAddElement file(final ConfigurationFile configurationFile) {

		String containerName = extractContainerName(configurationFile.getPath());

		if ( configurationModelHandle.get().sourceContainer(containerName) != null ) {			
			ConfigurationComponent parent = configurationModelHandle.get().component(extractParentPath(configurationFile.getPath()));

			if ( parent == null ) {
				parent = configurationComponent().name(extractElementNameByPath(extractParentPath(configurationFile.getPath()))).path(extractParentPath(configurationFile.getPath())).build();
				component(parent);
			}

			parent.getFiles().add(configurationFile);								
		} else if ( configurationModelHandle.get().resourceContainer(containerName) != null ) {

			IPath configurationFilePath = new Path(configurationFile.getPath());

			if ( configurationFilePath.segmentCount() == 2 ) {
				ConfigurationResourcesContainer resourcesContainer = configurationModelHandle.get().resourceContainer(containerName);
				resourcesContainer.getFiles().add(configurationFile);
			} else {

				ConfigurationFolder parent = configurationModelHandle.get().folder(extractParentPath(configurationFile.getPath()));

				if ( parent == null ) {
					parent = configurationFolder().name(extractElementNameByPath(extractParentPath(configurationFile.getPath()))).path(extractParentPath(configurationFile.getPath())).build();
					folder(parent);
				}

				parent.getFiles().add(configurationFile);
			}
		}

		return this;
	}

	public ConfigurationModelAddElement template(ConfigurationTemplate configurationTemplate) {

		String containerName = extractContainerName(configurationTemplate.getPath());

		if ( configurationModelHandle.get().sourceContainer(containerName) != null ) {			
			ConfigurationComponent parent = configurationModelHandle.get().component(extractParentPath(configurationTemplate.getPath()));

			if ( parent == null ) {
				parent = configurationComponent().name(extractElementNameByPath(extractParentPath(configurationTemplate.getPath()))).path(extractParentPath(configurationTemplate.getPath())).build();
				component(parent);
			}

			parent.getTemplates().add(configurationTemplate);								
		} else if ( configurationModelHandle.get().resourceContainer(containerName) != null ) {

			IPath configurationFilePath = new Path(configurationTemplate.getPath());

			if ( configurationFilePath.segmentCount() == 2 ) {
				ConfigurationResourcesContainer resourcesContainer = configurationModelHandle.get().resourceContainer(containerName);
				resourcesContainer.getTemplates().add(configurationTemplate);
			} else {

				ConfigurationFolder parent = configurationModelHandle.get().folder(extractParentPath(configurationTemplate.getPath()));

				if ( parent == null ) {
					parent = configurationFolder().name(extractElementNameByPath(extractParentPath(configurationTemplate.getPath()))).path(extractParentPath(configurationTemplate.getPath())).build();
					folder(parent);
				}

				parent.getTemplates().add(configurationTemplate);
			}
		}

		return this;
	}

	public ConfigurationModelAddElement fragment(ConfigurationFragment configurationFragment) {
		if ( configurationModelHandle.get().fragment(configurationFragment.getPath()) == null ) {
			ConfigurationFragmentContainer fragmentContainer = configurationModelHandle.get().fragmentContainer(extractFragmentContainerName(configurationFragment.getPath()));

			if ( fragmentContainer == null ) {
				fragmentContainer = ConfigurationFragmentContainerBuilder.configurationFragmentContainer().name(extractFragmentContainerName(configurationFragment.getPath())).build();
				fragmentContainer(fragmentContainer);
			}

			fragmentContainer.getFragments().add(configurationFragment);
		}		
		return this;
	}
}
