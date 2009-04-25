package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractComponentParentPath;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractContainerName;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractElementNameByPath;
import static br.pucrio.inf.les.genarch.core.util.PathProcessor.extractFragmentContainerName;

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

import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationAspectBuilder.implementationAspect;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationClassBuilder.implementationClass;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationFileBuilder.implementationFile;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationTemplateBuilder.implementationTemplate;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationFolderBuilder.implementationFolder;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationComponentBuilder.implementationComponent;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationSourceContainerBuilder.implementationSourceContainer;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationResourcesContainerBuilder.implementationResourcesContainer;
import static br.pucrio.inf.les.genarch.core.models.dsl.implementation.ImplementationFragmentContainerBuilder.implementationFragmentContainer;

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
			ImplementationComponent parent = implementationModelHandle.get().component(extractComponentParentPath(implementationComponent.getPath()));

			if (parent == null) {
				parent = implementationComponent().name(extractElementNameByPath(extractComponentParentPath(implementationComponent.getPath())))
						.path(extractComponentParentPath(implementationComponent.getPath())).build();
				component(parent);

			}

			parent.getSubComponents().add(implementationComponent);
		}
		return this;
	}

	public ImplementationModelAddElement folder(ImplementationFolder implementationFolder) {
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
			ImplementationFolder parent = implementationModelHandle.get().folder(extractComponentParentPath(implementationFolder.getPath()));

			if (parent == null) {
				parent = implementationFolder().name(
								extractElementNameByPath(extractComponentParentPath(implementationFolder
										.getPath()))).path(
								extractComponentParentPath(implementationFolder
										.getPath())).build();
				folder(parent);

			}

			parent.getSubFolders().add(implementationFolder);
		}
		return this;
	}

	public ImplementationModelAddElement clazz(ImplementationClass implementationClass) {
		if (implementationModelHandle.get().clazz(implementationClass.getPath()) == null) {
			ImplementationComponent parent = implementationModelHandle.get()
					.component(
							extractComponentParentPath(implementationClass
									.getPath()));

			if (parent == null) {
				parent = implementationComponent()
						.name(
								extractElementNameByPath(extractComponentParentPath(implementationClass
										.getPath()))).path(
								extractComponentParentPath(implementationClass
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
							extractComponentParentPath(implementationAspect
									.getPath()));

			if (parent == null) {
				parent = implementationComponent()
						.name(
								extractElementNameByPath(extractComponentParentPath(implementationAspect
										.getPath()))).path(
								extractComponentParentPath(implementationAspect
										.getPath())).build();
				component(parent);
			}

			parent.getAspects().add(implementationAspect);
		}
		return this;
	}

	public ImplementationModelAddElement file(ImplementationFile implementationFile) {
		if (implementationModelHandle.get().file(implementationFile.getPath()) == null) {
			Path iPath = new Path(implementationFile.getPath());
			int segmentCount = iPath.segmentCount();

			if (segmentCount == 2) {
				ImplementationResourcesContainer container = implementationModelHandle
						.resourceContainer()
						.get(extractContainerName(implementationFile.getPath()));

				if (container != null) {
					container.getFiles().add(implementationFile);
				} else {
					this.implementationModelHandle
							.getImplementation()
							.getResourcesContainer()
							.add(implementationResourcesContainer()
								.name(extractContainerName(implementationFile.getPath())).build());
				}
			} else {
				ImplementationContainer sourceContainer = implementationModelHandle
						.get()
						.sourceContainer(
								extractContainerName(implementationFile.getPath()));

				if (sourceContainer != null) {
					ImplementationComponent parent = implementationModelHandle
							.get().component(
									extractComponentParentPath(implementationFile
											.getPath()));

					if (parent == null) {
						parent = implementationComponent()
								.name(extractElementNameByPath(extractComponentParentPath(implementationFile.getPath())))
								.path(extractComponentParentPath(implementationFile.getPath())).build();
						component(parent);
					}

					parent.getFiles().add(implementationFile);
				} else {
					ImplementationResourcesContainer resourcesContainer = implementationModelHandle
							.resourceContainer().get(extractContainerName(implementationFile.getPath()));

					if (resourcesContainer != null) {
						ImplementationFolder parent = implementationModelHandle
								.get()
								.folder(extractComponentParentPath(implementationFile.getPath()));

						if (parent == null) {
							parent = implementationFolder()
									.name(extractElementNameByPath(extractComponentParentPath(implementationFile.getPath())))
									.path(extractComponentParentPath(implementationFile.getPath())).build();
							folder(parent);

						}

						parent.getFiles().add(implementationFile);
					}
				}
			}
		}
		return this;
	}

	public ImplementationModelAddElement template(ImplementationTemplate implementationTemplate) {
		if ( implementationModelHandle.get().file(implementationTemplate.getPath()) == null ) {
			ImplementationComponent parent = implementationModelHandle.get().component(extractComponentParentPath(implementationTemplate.getPath()));

			if ( parent == null ) {
				parent = implementationComponent().name(extractElementNameByPath(extractComponentParentPath(implementationTemplate.getPath())))
				.path(extractComponentParentPath(implementationTemplate.getPath())).build();
				component(parent);
			}

			parent.getTemplates().add(implementationTemplate);
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
