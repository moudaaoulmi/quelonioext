package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationComponentBuilder.implementationComponent;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationFolderBuilder.implementationFolder;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationFragmentContainerBuilder.implementationFragmentContainer;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationResourcesContainerBuilder.implementationResourcesContainer;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationSourceContainerBuilder.implementationSourceContainer;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractContainerName;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractElementNameByPath;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractFragmentContainerName;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractParentPath;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

public class ImplementationModelAddElement {

	private ImplementationModelHandle implementationModelHandle;

	public ImplementationModelAddElement(ImplementationModelHandle implementationModelHandle) {
		this.implementationModelHandle = implementationModelHandle;
	}

	public ImplementationModelAddElement sourceContainer(ImplementationContainer implementationContainer) {
		if ( implementationModelHandle.get().sourceContainer(implementationContainer.getName()) == null ) {
			implementationModelHandle.getImplementation().getContainers().add(implementationContainer);
		}
		return this;
	}

	public ImplementationModelAddElement resourcesContainer(ImplementationResourcesContainer implementationResourcesContainer) {
		if ( implementationModelHandle.get().resourceContainer(implementationResourcesContainer.getName()) == null ) {
			implementationModelHandle.getImplementation().getResourcesContainer().add(implementationResourcesContainer);
		}
		return this;
	}

	public ImplementationModelAddElement fragmentContainer(ImplementationFragmentContainer implementationFragmentContainer) {
		if ( implementationModelHandle.get().fragmentContainer(implementationFragmentContainer.getName()) == null ) {
			implementationModelHandle.getImplementation().getFragmentsContainer().add(implementationFragmentContainer);
		}
		return this;
	}

	public ImplementationModelAddElement component(ImplementationComponent implementationComponent) {
		if (implementationModelHandle.get().component(implementationComponent.getPath()) == null) {
			Path iPath = new Path(implementationComponent.getPath());
			int segmentCount = iPath.segmentCount();

			if (segmentCount == 2) {
				ImplementationContainer container = implementationModelHandle.get().sourceContainer(extractContainerName(implementationComponent.getPath()));

				if (container != null) {
					container.getComponents().add(implementationComponent);
				} else {
					this.implementationModelHandle
					.getImplementation()
					.getContainers()
					.add(implementationSourceContainer().name(extractContainerName(implementationComponent.getPath())).build());
				}
			} else {
				ImplementationComponent parent = implementationModelHandle.get().component(extractParentPath(implementationComponent.getPath()));

				if (parent == null) {
					parent = implementationComponent().name(extractElementNameByPath(extractParentPath(implementationComponent.getPath())))
					.path(extractParentPath(implementationComponent.getPath())).build();
					component(parent);

				}

				parent.getSubComponents().add(implementationComponent);
			}
		}
		return this;
	}

	public ImplementationModelAddElement folder(ImplementationFolder implementationFolder) {
		if (implementationModelHandle.get().folder(implementationFolder.getPath()) == null) {
			Path iPath = new Path(implementationFolder.getPath());
			int segmentCount = iPath.segmentCount();

			if (segmentCount == 2) {
				ImplementationResourcesContainer container = implementationModelHandle.resourceContainer().get(extractContainerName(implementationFolder.getPath()));

				if (container != null) {
					container.getFolders().add(implementationFolder);
				} else {
					this.implementationModelHandle.getImplementation().getResourcesContainer()
					.add(implementationResourcesContainer()
							.name(extractContainerName(implementationFolder.getPath())).build());
				}
			} else {
				ImplementationFolder parent = implementationModelHandle.get().folder(extractParentPath(implementationFolder.getPath()));

				if (parent == null) {
					parent = implementationFolder().name(
							extractElementNameByPath(extractParentPath(implementationFolder
									.getPath()))).path(
											extractParentPath(implementationFolder
													.getPath())).build();
					folder(parent);

				}

				parent.getSubFolders().add(implementationFolder);
			}
		}
		return this;
	}

	public ImplementationModelAddElement clazz(ImplementationClass implementationClass) {
		if (implementationModelHandle.get().clazz(implementationClass.getPath()) == null) {
			ImplementationComponent parent = implementationModelHandle.get()
			.component(
					extractParentPath(implementationClass
							.getPath()));

			if (parent == null) {
				parent = implementationComponent()
				.name(
						extractElementNameByPath(extractParentPath(implementationClass
								.getPath()))).path(
										extractParentPath(implementationClass
												.getPath())).build();
				component(parent);
			}

			parent.getClasses().add(implementationClass);
		}
		return this;
	}

	public ImplementationModelAddElement aspect(
			ImplementationAspect implementationAspect) {
		if (implementationModelHandle.get().aspect(implementationAspect.getPath()) == null) {
			ImplementationComponent parent = implementationModelHandle.get()
			.component(
					extractParentPath(implementationAspect
							.getPath()));

			if (parent == null) {
				parent = implementationComponent()
				.name(
						extractElementNameByPath(extractParentPath(implementationAspect
								.getPath()))).path(
										extractParentPath(implementationAspect
												.getPath())).build();
				component(parent);
			}

			parent.getAspects().add(implementationAspect);
		}
		return this;
	}

	public ImplementationModelAddElement file(ImplementationFile implementationFile) {

		String containerName = extractContainerName(implementationFile.getPath());

		if ( implementationModelHandle.get().sourceContainer(containerName) != null ) {			
			ImplementationComponent parent = implementationModelHandle.get().component(extractParentPath(implementationFile.getPath()));

			if ( parent == null ) {
				parent = implementationComponent().name(extractElementNameByPath(extractParentPath(implementationFile.getPath()))).path(extractParentPath(implementationFile.getPath())).build();
				component(parent);
			}

			parent.getFiles().add(implementationFile);								
		} else if ( implementationModelHandle.get().resourceContainer(containerName) != null ) {

			IPath implementationFilePath = new Path(implementationFile.getPath());

			if ( implementationFilePath.segmentCount() == 2 ) {
				ImplementationResourcesContainer resourcesContainer = implementationModelHandle.get().resourceContainer(containerName);
				resourcesContainer.getFiles().add(implementationFile);
			} else {

				ImplementationFolder parent = implementationModelHandle.get().folder(extractParentPath(implementationFile.getPath()));

				if ( parent == null ) {
					parent = implementationFolder().name(extractElementNameByPath(extractParentPath(implementationFile.getPath()))).path(extractParentPath(implementationFile.getPath())).build();
					folder(parent);
				}

				parent.getFiles().add(implementationFile);
			}
		}

		return this;
	}

	public ImplementationModelAddElement template(ImplementationTemplate implementationTemplate) {

		String containerName = extractContainerName(implementationTemplate.getPath());

		if ( implementationModelHandle.get().sourceContainer(containerName) != null ) {
			String parentPath = extractParentPath(implementationTemplate.getPath());
			ImplementationComponent parent = implementationModelHandle.get().component(parentPath);

			if ( parent == null ) {
				parent = implementationComponent().name(extractElementNameByPath(extractParentPath(implementationTemplate.getPath()))).path(extractParentPath(implementationTemplate.getPath())).build();
				component(parent);
			}

			parent.getTemplates().add(implementationTemplate);								
		} else if ( implementationModelHandle.get().resourceContainer(containerName) != null ) {

			IPath implementationFilePath = new Path(implementationTemplate.getPath());

			if ( implementationFilePath.segmentCount() == 2 ) {
				ImplementationResourcesContainer resourcesContainer = implementationModelHandle.get().resourceContainer(containerName);
				resourcesContainer.getTemplates().add(implementationTemplate);
			} else {

				ImplementationFolder parent = implementationModelHandle.get().folder(extractParentPath(implementationTemplate.getPath()));

				if ( parent == null ) {
					parent = implementationFolder().name(extractElementNameByPath(extractParentPath(implementationTemplate.getPath()))).path(extractParentPath(implementationTemplate.getPath())).build();
					folder(parent);
				}

				parent.getTemplates().add(implementationTemplate);
			}
		}

		return this;
	}

	public ImplementationModelAddElement fragment(ImplementationFragment implementationFragment) {
		if ( implementationModelHandle.get().fragment(implementationFragment.getPath()) == null ) {
			ImplementationFragmentContainer fragmentContainer = implementationModelHandle.get().fragmentContainer(extractFragmentContainerName(implementationFragment.getPath()));

			if ( fragmentContainer == null ) {
				fragmentContainer = implementationFragmentContainer().name(extractFragmentContainerName(implementationFragment.getPath())).build();
				fragmentContainer(fragmentContainer);
			}

			fragmentContainer.getFragments().add(implementationFragment);
		}		
		return this;
	}
}
