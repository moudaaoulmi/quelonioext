package br.pucrio.inf.les.genarch.ui.editor;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.wizards.TypedElementSelectionValidator;
import org.eclipse.jdt.internal.ui.wizards.TypedViewerFilter;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.JavaElementSorter;
import org.eclipse.jdt.ui.StandardJavaElementContentProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.internal.UIPlugin;

import br.pucrio.inf.les.genarch.core.plugin.GenArchEMFPlugin;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class GenarchConfigEditorPage extends FormPage {

	private String architectureModelFileName = "";
	private String configurationModelFileName = "";
	private String featureModelFileName = "";

	private TableViewer domainModelTableViewer;

	private Set<String> sourceContainers = new TreeSet<String>();
	private Set<String> resourceContainers = new TreeSet<String>();
	private List<DomainModelFileDescription> domainModelsFiles = new ArrayList<DomainModelFileDescription>();

	private static final String[] columns = new String[] {"Name","Path"};
	private static final List PROPERTY_LIST = Arrays.asList(columns);

	public GenarchConfigEditorPage(FormEditor editor,String id,String title) {
		super(editor, id, title);
	}

	@Override
	protected void createFormContent(final IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Genarch Configuration");

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		form.getBody().setLayout(layout);

		Section section = toolkit.createSection(form.getBody(),	ExpandableComposite.TITLE_BAR);
		section.setActiveToggleColor(toolkit.getHyperlinkGroup().getActiveForeground());
		section.setToggleColor(toolkit.getColors().getColor(FormColors.SEPARATOR));

		Composite client = toolkit.createComposite(section, SWT.WRAP);

		layout = new GridLayout();
		layout.numColumns = 3;		
		client.setLayout(layout);

		Label label = toolkit.createLabel(client,"Architecture Model");
		label.setText("Architecture Model");

		final Text architectureText = toolkit.createText(client, null);
		architectureText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		architectureText.setEditable(false);
		architectureText.setText(this.architectureModelFileName);
		architectureText.addModifyListener(new MyModifyListener(MyModifyListener.ARCHITECTURE));

		Button button = toolkit.createButton(client,"Browser",SWT.PUSH);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				GenarchConfigEditorPage.this.handleBrowseModel(architectureText,"architecture");
			}
		});

		label = toolkit.createLabel(client,"Configuration Model");

		final Text configurationText = toolkit.createText(client, null);
		configurationText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		configurationText.setEditable(false);
		configurationText.setText(this.configurationModelFileName);
		configurationText.addModifyListener(new MyModifyListener(MyModifyListener.CONFIGURATION));

		button = toolkit.createButton(client,"Browser",SWT.PUSH);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				GenarchConfigEditorPage.this.handleBrowseModel(configurationText,"configuration");
			}
		});

		label = toolkit.createLabel(client,"Feature Model");

		final Text featureText = toolkit.createText(client, null);
		featureText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		featureText.setEditable(false);
		featureText.setText(this.featureModelFileName);
		featureText.addModifyListener(new MyModifyListener(MyModifyListener.FEATURE));

		button = toolkit.createButton(client,"Browser",SWT.PUSH);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				GenarchConfigEditorPage.this.handleBrowseModel(featureText,"fmp");
			}
		});

		toolkit.paintBordersFor(client);
		section.setText("Models");
		section.setClient(client);
		section.setExpanded(true);

		GridData gd = new GridData();
		gd.horizontalSpan = 3;

		gd = new GridData(GridData.FILL_BOTH);
		section.setLayoutData(gd);

		section = toolkit.createSection(form.getBody(),	ExpandableComposite.NO_TITLE);
		section.setActiveToggleColor(toolkit.getHyperlinkGroup().getActiveForeground());
		section.setToggleColor(toolkit.getColors().getColor(FormColors.SEPARATOR));

		client = toolkit.createComposite(section, SWT.WRAP);

		layout = new GridLayout();
		layout.numColumns = 3;
		client.setLayout(layout);

		toolkit.paintBordersFor(client);	
		section.setClient(client);
		section.setExpanded(true);		
		gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		section.setLayoutData(gd);

		//
		Section subSection = toolkit.createSection(client, ExpandableComposite.TITLE_BAR);
		subSection.setActiveToggleColor(toolkit.getHyperlinkGroup().getActiveForeground());
		subSection.setToggleColor(toolkit.getColors().getColor(FormColors.SEPARATOR));
		Composite subClient = toolkit.createComposite(subSection,SWT.WRAP);

		layout = new GridLayout();
		layout.numColumns = 2;
		subClient.setLayout(layout);

		final Table domainModelTable = toolkit.createTable(subClient, SWT.NULL);

		domainModelTableViewer = new TableViewer(domainModelTable);		
		TableLayout tableLayout = new TableLayout();

		domainModelTable.setLayoutData(new GridData(GridData.FILL_BOTH));
		domainModelTable.setLayout(tableLayout);
		domainModelTable.setHeaderVisible(true);


		TableColumn nameColumn = new TableColumn(domainModelTable, SWT.NONE);
		tableLayout.addColumnData(new ColumnWeightData(1,100,true));
		nameColumn.setText("Name");
		nameColumn.setResizable(true);

		TableColumn pathColumn = new TableColumn(domainModelTable, SWT.NONE);
		tableLayout.addColumnData(new ColumnWeightData(3,100,true));
		pathColumn.setText("Path");
		pathColumn.setResizable(true);

		domainModelTableViewer.setContentProvider(new TableContentProvider());
		domainModelTableViewer.setColumnProperties(columns);
		domainModelTableViewer.setLabelProvider(new TableLabelProvider());

		domainModelTableViewer.setCellModifier(new CellModifier());
		domainModelTableViewer.setCellEditors(new CellEditor[]{new TextCellEditor(domainModelTable),new TextCellEditor(domainModelTable)});
		addDomainModels(domainModelTable);
		
		domainModelTableViewer.setInput(new Hashtable());
		domainModelTableViewer.refresh();

		Composite buttonsComposite = toolkit.createComposite(subClient);
		layout = new GridLayout();
		layout.numColumns = 1;
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		buttonsComposite.setLayout(layout);
		buttonsComposite.setLayoutData(gd);

		button = toolkit.createButton(buttonsComposite, "Add...", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
		button.setLayoutData(gd);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GenarchConfigEditorPage.this.handleBrowseDomainModels(domainModelTable,null);
				if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
					GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
				}
			}
		});

		button = toolkit.createButton(buttonsComposite, "Remove", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		button.setLayoutData(gd);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = domainModelTable.getSelectionIndex();
				domainModelsFiles.remove(domainModelTable.getItem(i).getText(0));
				domainModelTable.remove(i);
				if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
					GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
				}
			}
		});

		toolkit.paintBordersFor(subClient);
		subSection.setText("Domain Model Files");
		subSection.setClient(subClient);
		subSection.setExpanded(true);
		gd = new GridData(GridData.FILL_BOTH);
		subSection.setLayoutData(gd);

		//
		subSection = toolkit.createSection(client, ExpandableComposite.TITLE_BAR);
		subSection.setActiveToggleColor(toolkit.getHyperlinkGroup().getActiveForeground());
		subSection.setToggleColor(toolkit.getColors().getColor(FormColors.SEPARATOR));
		subClient = toolkit.createComposite(subSection,SWT.WRAP);

		layout = new GridLayout();
		layout.numColumns = 2;
		subClient.setLayout(layout);

		final Table sourceTable = toolkit.createTable(subClient, SWT.NULL);
		sourceTable.setLayoutData(new GridData(GridData.FILL_BOTH));
		addSourceContainers(sourceTable);

		buttonsComposite = toolkit.createComposite(subClient);
		layout = new GridLayout();
		layout.numColumns = 1;
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		buttonsComposite.setLayout(layout);
		buttonsComposite.setLayoutData(gd);

		button = toolkit.createButton(buttonsComposite, "Add...", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
		button.setLayoutData(gd);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GenarchConfigEditorPage.this.handleBrowseSource(sourceTable);
				if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
					GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
				}
			}
		});

		button = toolkit.createButton(buttonsComposite, "Remove", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		button.setLayoutData(gd);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = sourceTable.getSelectionIndex();
				sourceTable.remove(i);
				sourceContainers.remove(i);
				if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
					GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
				}
			}
		});

		toolkit.paintBordersFor(subClient);
		subSection.setText("Source Containers");
		subSection.setClient(subClient);
		subSection.setExpanded(true);
		gd = new GridData(GridData.FILL_BOTH);
		subSection.setLayoutData(gd);

		//
		subSection = toolkit.createSection(client, ExpandableComposite.TITLE_BAR);
		subSection.setActiveToggleColor(toolkit.getHyperlinkGroup().getActiveForeground());
		subSection.setToggleColor(toolkit.getColors().getColor(FormColors.SEPARATOR));
		subClient = toolkit.createComposite(subSection,SWT.WRAP);

		layout = new GridLayout();
		layout.numColumns = 2;
		subClient.setLayout(layout);	

		final Table resourceTable = toolkit.createTable(subClient, SWT.NULL);
		resourceTable.setLayoutData(new GridData(GridData.FILL_BOTH));
		addResourceContainers(resourceTable);

		buttonsComposite = toolkit.createComposite(subClient);
		layout = new GridLayout();
		layout.numColumns = 1;
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		buttonsComposite.setLayout(layout);
		buttonsComposite.setLayoutData(gd);

		button = toolkit.createButton(buttonsComposite, "Add...", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
		button.setLayoutData(gd);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GenarchConfigEditorPage.this.handleBrowseResource(resourceTable);
				if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
					GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
				}
			}
		});

		button = toolkit.createButton(buttonsComposite, "Remove", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		button.setLayoutData(gd);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = resourceTable.getSelectionIndex();
				resourceTable.remove(i);
				resourceContainers.remove(i);
				if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
					GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
				}
			}
		});

		toolkit.paintBordersFor(subClient);
		subSection.setText("Resource Containers");
		subSection.setClient(subClient);
		subSection.setExpanded(true);
		gd = new GridData(GridData.FILL_BOTH);
		subSection.setLayoutData(gd);					
	}

	private void handleBrowseModel(Text textDialog,final String extension) {
		Shell shell = UIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();

		StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, labelProvider, provider);

		Class[] acceptedClasses = new Class[] { IFile.class };
		final TypedElementSelectionValidator validator = new TypedElementSelectionValidator(acceptedClasses, false) {
			@Override
			public boolean isSelectedValid(Object element) {
				if (element instanceof IFile) {
					IFile file = (IFile)element;

					if ( extension.equalsIgnoreCase(file.getFileExtension()) ) {
						return true;
					} else {
						return false;
					}
				}
				return false;
			}
		};

		acceptedClasses = new Class[] { IJavaModel.class, IJavaProject.class, IFolder.class, IFile.class };
		ViewerFilter filter = new TypedViewerFilter(acceptedClasses) {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof IFolder ) {					
				}
				if (element instanceof IFile) {
					return (((IFile)element).getFileExtension().equals(extension));					
				}
				return super.select(viewer, parent, element);
			}
		};

		dialog.setSorter(new JavaElementSorter());
		dialog.setTitle("");
		dialog.setMessage(""); 
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.addFilter(filter);
		dialog.setHelpAvailable(false);

		if (dialog.open() == Window.OK) {
			Object element= dialog.getFirstResult();
			if (element instanceof IFile) {
				IFile file = (IFile)element;
				textDialog.setText(file.getFullPath().makeRelative().removeFirstSegments(1).toString());
			}					
		}
	}

	private void handleBrowseSource(Table tableDialog) {
		Shell shell = UIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();

		StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, labelProvider, provider);

		Class[] acceptedClasses = new Class[] { IFolder.class };

		final TypedElementSelectionValidator validator = new TypedElementSelectionValidator(acceptedClasses, false) {
			@Override
			public boolean isSelectedValid(Object element) {
				try {
					if (element instanceof IJavaProject) {
						IJavaProject jproject = (IJavaProject)element;
						IPath path = jproject.getProject().getFullPath();				 
						return (jproject.findPackageFragmentRoot(path) != null);
					} else if (element instanceof IPackageFragmentRoot) {
						return (((IPackageFragmentRoot)element).getKind() == IPackageFragmentRoot.K_SOURCE);
					}
					return true;
				} catch (JavaModelException e) {
					JavaPlugin.log(e.getStatus());
				}
				return false;
			}					
		};

		acceptedClasses = acceptedClasses = new Class[] { IPackageFragmentRoot.class, IJavaProject.class };

		ViewerFilter filter = new TypedViewerFilter(acceptedClasses) {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if (element instanceof IPackageFragmentRoot) {
					try {
						return (((IPackageFragmentRoot)element).getKind() == IPackageFragmentRoot.K_SOURCE);
					} catch (JavaModelException e) {
						JavaPlugin.log(e.getStatus());
						return false;
					}
				}
				return super.select(viewer, parent, element);
			}
		};

		dialog.setSorter(new JavaElementSorter());
		dialog.setTitle("");
		dialog.setMessage(""); 
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.addFilter(filter);
		dialog.setHelpAvailable(false);

		if (dialog.open() == Window.OK) {
			Object element= dialog.getFirstResult();			
			if ( element instanceof IPackageFragmentRoot ) {
				IPackageFragmentRoot folder = (IPackageFragmentRoot)element;				
				TableItem item = new TableItem(tableDialog, SWT.NONE);
				item.setText(folder.getResource().getFullPath().makeRelative().removeFirstSegments(1).toString());
				final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL((URL)GenArchEMFPlugin.INSTANCE.getImage("full/obj16/ArchitectureContainer"));				
				item.setImage(imageDescriptor.createImage());

				sourceContainers.add(folder.getResource().getFullPath().makeRelative().removeFirstSegments(1).toString());				
			}
		}
	}

	private void handleBrowseResource(Table tableDialog) {
		Shell shell = UIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();

		StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, labelProvider, provider);

		Class[] acceptedClasses = acceptedClasses = new Class[] { IFolder.class };

		final TypedElementSelectionValidator validator = new TypedElementSelectionValidator(acceptedClasses, false) {
			@Override
			public boolean isSelectedValid(Object element) {
				try {
					if (element instanceof IJavaProject) {
						IJavaProject jproject = (IJavaProject)element;
						IPath path = jproject.getProject().getFullPath();				 
						return (jproject.findPackageFragmentRoot(path) != null);
					} else if (element instanceof IFolder ) {
						return true;
					}
				} catch (JavaModelException e) {
					JavaPlugin.log(e.getStatus());
				}
				return false;
			}					
		};

		acceptedClasses = acceptedClasses = new Class[] { IJavaProject.class, IFolder.class };

		ViewerFilter filter = new TypedViewerFilter(acceptedClasses) {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if ( element instanceof IJavaProject ) {
					//return ((IJavaProject)element).getProject().getName().equals(project.getName());
					return true;
				} else if (element instanceof IFolder ) {					
					return true;
				}
				return super.select(viewer, parent, element);
			}
		};

		dialog.setSorter(new JavaElementSorter());
		dialog.setTitle("");
		dialog.setMessage(""); 
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.addFilter(filter);
		dialog.setHelpAvailable(false);

		if (dialog.open() == Window.OK) {
			Object element= dialog.getFirstResult();			
			if ( element instanceof IFolder ) {
				IFolder folder = (IFolder)element;					
				TableItem item = new TableItem(tableDialog, SWT.NONE);
				item.setText(folder.getFullPath().makeRelative().removeFirstSegments(1).toString());
				final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL((URL)GenArchEMFPlugin.INSTANCE.getImage("full/obj16/ArchitectureResourcesContainer"));				
				item.setImage(imageDescriptor.createImage());

				resourceContainers.add(folder.getFullPath().makeRelative().removeFirstSegments(1).toString());
			}
		}
	}

	private void handleBrowseDomainModels(Table tableDialog,final String extension) {
		Shell shell = UIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();

		StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, labelProvider, provider);

		Class[] acceptedClasses = acceptedClasses = new Class[] { IFile.class };

		final TypedElementSelectionValidator validator = new TypedElementSelectionValidator(acceptedClasses, false) {
			@Override
			public boolean isSelectedValid(Object element) {

				if (element instanceof IJavaProject) {
					return true;
				} else if (element instanceof IFile ) {
					return true;
				}

				return false;
			}					
		};

		acceptedClasses = acceptedClasses = new Class[] { IJavaProject.class, IFolder.class, IFile.class };

		ViewerFilter filter = new TypedViewerFilter(acceptedClasses) {
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				if ( element instanceof IJavaProject ) {
					return true;
				} else if (element instanceof IFile ) {
					return true;
				}
				return super.select(viewer, parent, element);
			}
		};

		dialog.setSorter(new JavaElementSorter());
		dialog.setTitle("");
		dialog.setMessage(""); 
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.addFilter(filter);
		dialog.setHelpAvailable(false);

		if (dialog.open() == Window.OK) {
			Object element= dialog.getFirstResult();			
			if ( element instanceof IFile ) {
				IFile file = (IFile)element;
				/*TableItem item = new TableItem(tableDialog, SWT.NONE);
				item.setText(0, "model" + domainModelsFiles.size());
				item.setText(1,file.getFullPath().makeRelative().removeFirstSegments(1).toString());

				final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL((URL)GenArchEMFPlugin.INSTANCE.getImage("full/obj16/ArchitectureTemplate"));				
				item.setImage(imageDescriptor.createImage());*/

				DomainModelFileDescription domainModelFileDescription = new DomainModelFileDescription();
				domainModelFileDescription.name = "model" + domainModelsFiles.size();
				domainModelFileDescription.path = file.getFullPath().makeRelative().removeFirstSegments(1).toString(); 
				
				domainModelsFiles.add(domainModelFileDescription);
				
				domainModelTableViewer.refresh();
			}
		}
	}

	private class MyModifyListener implements ModifyListener {

		public static final String ARCHITECTURE = "architecture";
		public static final String CONFIGURATION = "configuration";
		public static final String FEATURE = "feature";

		private String name;

		public MyModifyListener(final String name) {
			this.name = name;
		}
		public void modifyText(final ModifyEvent e) {
			if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
				GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
			}

			String data = ((Text)e.getSource()).getText();

			if ( this.name.equals(ARCHITECTURE) ) {
				GenarchConfigEditorPage.this.architectureModelFileName = data;				
			} else if ( this.name.equals(CONFIGURATION) ) {
				GenarchConfigEditorPage.this.configurationModelFileName = data;				
			} else if ( this.name.equals(FEATURE) ) {
				GenarchConfigEditorPage.this.featureModelFileName = data;
			}
		}
	}

	private void addSourceContainers(Table sourceTable) {
		for ( String sourceContainer : sourceContainers ) {
			TableItem item = new TableItem(sourceTable, SWT.NONE);
			item.setText(sourceContainer);
			final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL((URL)GenArchEMFPlugin.INSTANCE.getImage("full/obj16/ArchitectureContainer"));				
			item.setImage(imageDescriptor.createImage());
		}
	}

	private void addResourceContainers(Table resourceTable) {
		for ( String resourceContainer : resourceContainers ) {
			TableItem item = new TableItem(resourceTable, SWT.NONE);
			item.setText(resourceContainer);
			final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL((URL)GenArchEMFPlugin.INSTANCE.getImage("full/obj16/ArchitectureContainer"));				
			item.setImage(imageDescriptor.createImage());
		}
	}

	private void addDomainModels(Table domainModelTable) {
		domainModelTableViewer.refresh();
		/*for ( DomainModelFileDescription domainModelFileDescription : domainModelsFiles ) {
			TableItem item = new TableItem(domainModelTable, SWT.NONE);
			item.setText(0,domainModelFileDescription.name);
			item.setText(1,domainModelFileDescription.path);
			final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL((URL)GenArchEMFPlugin.INSTANCE.getImage("full/obj16/ArchitectureTemplate"));				
			item.setImage(imageDescriptor.createImage());
		}*/
	}

	public String getArchitectureModelFileName() {
		return this.architectureModelFileName;
	}

	public void setArchitectureModelFileName(final String name) {
		if ( name != null) {
			this.architectureModelFileName = name;
		}
	}

	public String getConfigurationModelFileName() {
		return this.configurationModelFileName;
	}

	public void setConfigurationModelFileName(final String name) {
		if ( name != null ) {
			this.configurationModelFileName = name;
		}
	}

	public String getFeatureModelFileName() {
		return this.featureModelFileName;
	}

	public void setFeatureModelFileName(final String name) {
		if ( name != null ) {
			this.featureModelFileName = name;
		}
	}

	public Set<String> getSourceContainers() {
		return sourceContainers;
	}

	public Set<String> getResourceContainers() {
		return resourceContainers;
	}

	public Map<String,String> getDomainModelsFiles() {
		Map<String,String> aux = new HashMap<String, String>();
		
		for ( DomainModelFileDescription domainModelFileDescription : this.domainModelsFiles ) {
			aux.put(domainModelFileDescription.name, domainModelFileDescription.path);
		}
		return aux;
	}

	public void setSourceContainers(Set<String> sourceContainers) {
		this.sourceContainers = sourceContainers;
	}

	public void setResourceContainers(Set<String> resourceContainers) {
		this.resourceContainers = resourceContainers;
	}

	public void setDomainModelsFiles(Map<String,String> domainModelsFiles) {
		for ( String key : domainModelsFiles.keySet() ) {
			DomainModelFileDescription domainModelFileDescription = new DomainModelFileDescription();
			domainModelFileDescription.name = key;
			domainModelFileDescription.path = domainModelsFiles.get(key);
			this.domainModelsFiles.add(domainModelFileDescription);
		}				
	}

	private class CellModifier implements ICellModifier {

		public boolean canModify(Object element, String property) {
			return true;
		}

		public Object getValue(Object element, String property) {
			Object value = null;

			if (element instanceof DomainModelFileDescription) {
				DomainModelFileDescription agentDef = (DomainModelFileDescription) element;

				int fieldIndex = getFieldIndex(property);
				if (fieldIndex != -1) {
					value = agentDef.getProperty(fieldIndex);
				}
			}

			return value;

		}

		public void modify(Object element, String property, Object value) {
			if (element instanceof TableItem) {
				Object data = ((TableItem)element).getData();

				if (data instanceof DomainModelFileDescription) {
					int fieldIndex = getFieldIndex(property);
					DomainModelFileDescription domainModelFileDescription = (DomainModelFileDescription)data;

					if (fieldIndex != -1) {
						if (!domainModelFileDescription.getProperty(fieldIndex).equals(value)) { 
							domainModelFileDescription.setProperty(value,fieldIndex);							
							domainModelTableViewer.update(domainModelFileDescription, new String[]{property});
							if ( !GenarchConfigEditorPage.this.getEditor().isDirty() ) {
								GenarchConfigEditorPage.this.getEditor().editorDirtyStateChanged();				
							}
						}						
					}
				}
			}
		}

		private int getFieldIndex(String property) {
			return PROPERTY_LIST.indexOf(property);
		}	
	}

	private class TableContentProvider implements IStructuredContentProvider {

		public Object[] getElements(Object inputElement) {
			return (Object[])domainModelsFiles.toArray(new Object[domainModelsFiles.size()]);
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {

		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {			
			String value = ((DomainModelFileDescription)element).getProperty(columnIndex).toString();									
			return value; 
		}
	}

	private class DomainModelFileDescription {

		public String name;
		public String path;

		public Object getProperty(int index) {
			if ( index == 0 ) {
				return name;
			} else if ( index == 1 ) {
				return path;
			}

			return null;
		}

		public void setProperty(Object value,int index) {
			if ( index == 0 ) {
				name = (String)value;
			} else if ( index == 1 ) {
				path = (String)value;
			}
		}
	}
}
