package br.pucrio.inf.les.genarch.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.provider.ImplementationItemProviderAdapterFactory;

public class CreateImplementationMappingWizardPage extends WizardPage {

	private IProject project;
		
	private Tree architectureModelTree;
	private TreeViewer architectureModelTreeViewer;

	public CreateImplementationMappingWizardPage(IFile modelFile,EObject element) {
		super("wizardPage");
		this.setTitle("GenArch");

		this.project = modelFile.getProject();
	}

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 1;
		
		container.setLayout(layout);
		
		Composite architectureModelContainer = new Composite(container,SWT.NULL);
						
		layout = new GridLayout();
		layout.numColumns = 1;
		architectureModelContainer.setLayout(layout);
		
		Label label = new Label(architectureModelContainer, SWT.NULL);
		label.setText("Architecture Model");
		
		this.architectureModelTree = new Tree(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		FillLayout fillLayout = new FillLayout();
		this.architectureModelTree.setLayout(fillLayout);
		this.architectureModelTree.setLayoutData(gd);
			
		this.architectureModelTreeViewer = new TreeViewer(this.architectureModelTree);
		
		TreeColumn column = new TreeColumn(this.architectureModelTree, SWT.LEFT);		
		column.setText("Architecture Model");
		column.setResizable(true);
		column.setWidth(500);
		
		List factories = new ArrayList();
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ImplementationItemProviderAdapterFactory());
																
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(factories);
						
		this.architectureModelTreeViewer.setColumnProperties(new String [] {"a"});
		this.architectureModelTreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		this.architectureModelTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
				
		GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(project);

		String architectureModelPath = genarchProjectConfigurationFile.getImplementationModelPath();
				
		IFile architectureModelFile = this.project.getFile(architectureModelPath);
		URI architectureFileURI = URI.createPlatformResourceURI(architectureModelFile.getFullPath().toString());

		ResourceSet architectureResourceSet = new ResourceSetImpl();
		Resource architectureResource = architectureResourceSet.getResource(architectureFileURI, true);

		this.architectureModelTreeViewer.setInput(architectureResource.getContents().get(0));		
		this.setControl(container);
	}
		
	private void updateStatus(String message) {
		this.setErrorMessage(message);
		this.setPageComplete(message == null);
	}

	public ImplementationEntity getSelection() {
		TreeItem selectedItem = architectureModelTree.getSelection()[0];
		Object selectionData = selectedItem.getData();
		return (ImplementationEntity)selectionData;	
	}
} 