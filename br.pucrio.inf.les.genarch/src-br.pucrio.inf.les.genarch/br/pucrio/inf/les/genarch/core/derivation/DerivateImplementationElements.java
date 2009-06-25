package br.pucrio.inf.les.genarch.core.derivation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;

import br.pucrio.inf.les.genarch.core.extension.IPostProcessor;
import br.pucrio.inf.les.genarch.core.resources.dsl.AspectAnnotationUtil;
import br.pucrio.inf.les.genarch.core.resources.dsl.JavaAnnotationUtil;
import br.pucrio.inf.les.genarch.models.product.Product;
import br.pucrio.inf.les.genarch.models.product.ProductAspect;
import br.pucrio.inf.les.genarch.models.product.ProductClass;
import br.pucrio.inf.les.genarch.models.product.ProductComponent;
import br.pucrio.inf.les.genarch.models.product.ProductContainer;
import br.pucrio.inf.les.genarch.models.product.ProductEntity;
import br.pucrio.inf.les.genarch.models.product.ProductFile;
import br.pucrio.inf.les.genarch.models.product.ProductFolder;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import br.pucrio.inf.les.genarch.models.product.ProductResourcesContainer;

public class DerivateImplementationElements implements IPostProcessor {

	private IProgressMonitor monitor;
	private IProject project;
	private IProject derivationProject;

	public void process(IProject project, IProject derivationProject,Product productModel, IProgressMonitor monitor) {
		this.monitor = monitor;
		this.project = project;
		this.derivationProject = derivationProject;

		ProductImplementationElements implementationElements = productModel.getProductImplementationElements();

		EList containers = implementationElements.getContainers();

		for ( int y = 0; y < containers.size(); y++ ) {
			ProductContainer container = (ProductContainer)containers.get(y);			
			EList components = container.getComponents();

			for (int x = 0; x < components.size(); x++) {
				ProductComponent component = (ProductComponent)components.get(x);
				derivateComponent(component);  
			}			
		}

		EList resourcesContainers = implementationElements.getResourceContainers();

		for ( int y = 0; y < resourcesContainers.size(); y++ ) {
			ProductResourcesContainer container = (ProductResourcesContainer)resourcesContainers.get(y);

			EList folders = container.getFolders();

			for (int x = 0; x < folders.size(); x++) {
				ProductFolder folder = (ProductFolder)folders.get(x);	    
				derivateFolder(folder);						
			}

			EList files = container.getFiles();

			for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
				ProductFile file = (ProductFile)files.get(filesCount);
				derivateElement(file);
			}	
		}	
	}

	private void derivateComponent(ProductComponent component) {
		buildFolder(component.getPath(), monitor);
		
		EList classes = component.getClasses();

		for ( int classesCount = 0; classesCount < classes.size(); classesCount++ ) {
			ProductClass clazz = (ProductClass)classes.get(classesCount);
			derivateElement(clazz);
		}

		EList aspects = component.getAspects();

		for ( int aspectsCount = 0; aspectsCount < aspects.size(); aspectsCount++ ) {
			ProductAspect aspect = (ProductAspect)aspects.get(aspectsCount);
			derivateElement(aspect);
		}

		EList files = component.getFiles();

		for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
			ProductFile file = (ProductFile)files.get(filesCount);
			derivateElement(file);
		}

		EList subComponents = component.getSubComponents();

		for ( int subComponentCount = 0; subComponentCount < subComponents.size(); subComponentCount++ ) {
			ProductComponent subComponent = (ProductComponent)subComponents.get(subComponentCount);
			derivateComponent(subComponent);
		}
	}

	private void derivateFolder(ProductFolder folder) {
		buildFolder(folder.getPath(), monitor);
		
		EList files = folder.getFiles();

		for ( int filesCount = 0; filesCount < files.size(); filesCount++ ) {
			ProductFile file = (ProductFile)files.get(filesCount);
			derivateElement(file);
		}

		EList subFolders = folder.getSubFolders();

		for ( int subFoldersCount = 0; subFoldersCount < subFolders.size(); subFoldersCount++ ) {
			ProductFolder subFolder = (ProductFolder)subFolders.get(subFoldersCount);
			derivateFolder(subFolder);			
		}
	}

	private void derivateElement(ProductEntity element) {
		monitor.subTask("Coping File \"" + element.getPath() + "\"");

		String filePath = element.getPath();

		IResource entityResource = this.project.getFile(filePath);

		IPath instProjectPath = this.derivationProject.getFullPath();
		IPath resourcePath = entityResource.getProjectRelativePath();

		try {
			entityResource.copy(instProjectPath.append(resourcePath), true, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		if ( entityResource instanceof IFile ) {
			IFile newEntityFile = this.derivationProject.getFile(element.getPath());

			if ( "java".equals(newEntityFile.getFileExtension()) ) {
				System.out.println(newEntityFile.getFullPath().toString());
				JavaAnnotationUtil.removeFeatureAnnotations(newEntityFile);
				JavaAnnotationUtil.removeVariabilityAnnotation(newEntityFile);				
			} else if ( "aj".equals(newEntityFile.getFileExtension())) {
				AspectAnnotationUtil.removeFeaturesAnnotation(newEntityFile);
				AspectAnnotationUtil.removeVariabilityAnnotation(newEntityFile);
			}				
		}

		monitor.worked(1);		
	}

	private IFolder buildFolder(String folderPath,IProgressMonitor monitor) {
		monitor.subTask("Creating Folder \"" + folderPath + "\"");
		IFolder subComponentFolder = this.derivationProject.getFolder(new Path(folderPath));

		if ( !subComponentFolder.exists() ) {
			try {
				subComponentFolder.create(false, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		monitor.worked(1);

		return subComponentFolder;
	}
}
