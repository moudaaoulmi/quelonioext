package br.pucrio.inf.les.genarch.core.project.navigation.visitors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;

import br.pucrio.inf.les.genarch.core.models.ImplementationModelContent;
import br.pucrio.inf.les.genarch.core.project.navigation.NavigationUtil;
import br.pucrio.inf.les.genarch.core.project.navigation.ResourceClient;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;

public class ImplementationModelResourceVisitor implements ResourceClient {

	private ImplementationModelContent architectureContent;	

	public ImplementationModelResourceVisitor() {
		this.architectureContent = new ImplementationModelContent();
	}

	public void visit(IResource resource) {
		String resourceName = resource.getName();
		String resourcePath = resource.getProjectRelativePath().removeFirstSegments(1).toString();
		String resourcePhysicalPath = resource.getProjectRelativePath().toString();

		if ( resource.getProjectRelativePath().segmentCount() == 1 ) {	    
			if ( JavaCore.create(resource) instanceof IPackageFragmentRoot ) {
				this.architectureContent.addContainer(resource.getName());
			} else if ( resource instanceof IFolder ) {
				this.architectureContent.addResourceContainer(resource.getName());
			}
		} else if ( resource.getType() == IResource.FOLDER ) {
			IFolder component = (IFolder)resource;
			String parentPath = NavigationUtil.getParentByPath(component.getProjectRelativePath().toString());
			EObject parent = this.architectureContent.getElementByPath(parentPath);

			if ( parent instanceof ImplementationContainer ) {		
				this.architectureContent.addComponent(resource.getName(),(ImplementationContainer)parent,resourcePhysicalPath);	    	
			} else if ( parent instanceof ImplementationComponent ){
				this.architectureContent.addSubComponent(resourceName,resourcePhysicalPath,(ImplementationComponent)parent);
			} else if ( parent instanceof ImplementationResourcesContainer ) {
				this.architectureContent.addFolder(resourceName,resourcePhysicalPath,(ImplementationResourcesContainer)parent);
			} else if ( parent instanceof ImplementationFolder ) {
				this.architectureContent.addSubFolder(resourceName,resourcePhysicalPath,(ImplementationFolder)parent);
			}
		} else if ( resource.getType() == IResource.FILE ) {
			IFile file = (IFile)resource;
			String componentParentPath = NavigationUtil.getParentByPath(file.getProjectRelativePath().toString());
			EObject parent = architectureContent.getElementByPath(componentParentPath);

			if ( file.getFileExtension().equals("java") ) {
				this.architectureContent.addClass(resourceName,resourcePhysicalPath,(ImplementationComponent)parent);
			} else if ( file.getFileExtension().equals("aj") ) {
				this.architectureContent.addAspect(resourceName,resourcePhysicalPath,(ImplementationComponent)parent);
			} else if ( resource.getFileExtension().equals("xpt") ) {
				String genPath = resource.getProjectRelativePath().removeLastSegments(1).toString();
				if ( parent instanceof ImplementationComponent ) {
					this.architectureContent.addTemplate(resourceName,resourcePhysicalPath,genPath,(ImplementationComponent)parent);
				} else if ( parent instanceof ImplementationFolder ) {
					this.architectureContent.addTemplate(resourceName,resourcePhysicalPath,genPath,(ImplementationFolder)parent);
				}			
			} else if ( resource.getFileExtension().equals("mvel") ) {
				String toPath = resource.getProjectRelativePath().removeLastSegments(1).toString();
				this.architectureContent.addTemplate(resourceName,resourcePhysicalPath,toPath,(ImplementationComponent)parent);
			} else {
				if ( parent instanceof ImplementationResourcesContainer ) {
					this.architectureContent.addFile(resourceName,resourcePhysicalPath,(ImplementationResourcesContainer)parent);
				} else if ( parent instanceof ImplementationComponent ) {
					this.architectureContent.addFile(resourceName,resourcePhysicalPath,(ImplementationComponent)parent);
				} else if ( parent instanceof ImplementationFolder ) {
					this.architectureContent.addFile(resourceName,resourcePhysicalPath,(ImplementationFolder)parent);
				}

			}
		}
	}

	public ImplementationModelContent getImplementationContent() {
		return this.architectureContent;
	}	
}
