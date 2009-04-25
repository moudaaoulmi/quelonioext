package br.pucrio.inf.les.genarch.ui.wizards;

import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import br.pucrio.inf.les.genarch.core.logic.Logic;
import br.pucrio.inf.les.genarch.core.plugin.GenArchEMFPlugin;
import br.pucrio.inf.les.genarch.core.project.GenarchProjectConfigurationFile;
import br.pucrio.inf.les.genarch.models.configuration.Configuration;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationComponent;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.configuration.DSMMappings;
import br.pucrio.inf.les.genarch.models.configuration.MappingEntity;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;
import br.pucrio.inf.les.genarch.models.configuration.impl.ConfigurationPackageImpl;
import br.pucrio.inf.les.genarch.models.dsamtypes.VariableElement;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FeatureGroup;
import ca.uwaterloo.gp.fmp.Node;
import ca.uwaterloo.gp.fmp.Project;
import ca.uwaterloo.gp.fmp.util.FmpExternalLoader;
import ca.uwaterloo.gp.fmp.util.FmpResourceImpl;

public class ConfigureElementWizardPage extends WizardPage {

	private IProject project;
	private IFile modelFile;
	private EObject element;
	
	private MappingRelationships mappingRelationships;
	private DSMMappings dsmMappings;

	private Table featuresTable;
	private Text featureExpressionText;

	public ConfigureElementWizardPage(IFile modelFile,EObject element) {
		super("wizardPage");
		this.setTitle("GenArch");

		this.project = modelFile.getProject();
		this.modelFile = modelFile;
		this.element = element;
	}

	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);

		Composite featureModelContainer = new Composite(container,SWT.NULL);

		layout = new GridLayout();
		layout.numColumns = 1;
		featureModelContainer.setLayout(layout);

		Label label = new Label(featureModelContainer, SWT.NULL);
		label.setText("Feature Model");

		this.featuresTable = new Table(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		this.featuresTable.setLinesVisible(true);

		TableColumn column = new TableColumn(this.featuresTable, SWT.LEFT);
		column.setWidth(400);

		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		this.featuresTable.setLayoutData(gd);

		this.addFeatureModel();

		Composite featureExpressionContainer = new Composite(container,SWT.NULL);

		layout = new GridLayout();
		layout.numColumns = 1;
		featureExpressionContainer.setLayout(layout);
		featureExpressionContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label featureExpressionLabel = new Label(featureExpressionContainer, SWT.NULL);
		featureExpressionLabel.setText("Feature Expression");

		this.featureExpressionText = new Text(featureExpressionContainer,SWT.BORDER);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;	
		this.featureExpressionText.setLayoutData(gd);

		this.featureExpressionText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String featureExpression = featureExpressionText.getText();
				boolean v = Logic.validate(featureExpression); 
				if ( v ) {
					updateStatus(null);
				} else {
					updateStatus("The feature expression is not valid.");
				}
			}	    
		});

		this.initialize();	
		this.setControl(container);
	}
	
	public void addFeatureModel() {
		GenarchProjectConfigurationFile genarchProjectConfigurationFile = GenarchProjectConfigurationFile.open(project);

		String featureModelName = genarchProjectConfigurationFile.getFeatureModelPath();
		String configurationModelName = genarchProjectConfigurationFile.getConfigurationModelPath();

		IFile fmpModelFile = this.project.getFile(new Path(featureModelName));

		ConfigurationPackageImpl.init();

		IFile configurationModelFile = this.project.getFile(configurationModelName);
		URI configurationFileURI = URI.createPlatformResourceURI(configurationModelFile.getFullPath().toString());

		ResourceSet configurationResourceSet = new ResourceSetImpl();
		Resource configurationResource = configurationResourceSet.getResource(configurationFileURI, true);

		Configuration configuration = (Configuration)configurationResource.getContents().get(0);
		this.mappingRelationships = configuration.getMappingRelationships();
		this.dsmMappings = configuration.getDsmMappings();
		
		String featureExpression = "";

		if ( element instanceof ImplementationEntity ) {
			String entityPath = ((ImplementationEntity)element).getPath();
			
			EObject configurationElement = findConfigurationElementByPath(entityPath);
			
			if ( configurationElement != null ) {
				if ( configurationElement instanceof MappingEntity ) {
					MappingEntity conf = (MappingEntity)configurationElement;
					if ( conf.getFeatureExpression() != null ) {
						featureExpression = conf.getFeatureExpression().getExpression();
					}		
				} else if ( configurationElement instanceof ConfigurationComponent ) {
					ConfigurationComponent conf = (ConfigurationComponent)configurationElement;
					if ( conf.getFeatureExpression() != null ) {
						featureExpression = conf.getFeatureExpression().getExpression();   
					}		
				}
			}
		} else if ( element instanceof VariableElement ) {
			String elementName = ((VariableElement)element).getName();
			DSMElement eElement = findConfigurableElementByName(elementName,genarchProjectConfigurationFile.getDomainModelsFiles());
			
			if ( eElement != null ) {
				featureExpression = eElement.getFeatureExpression().getExpression();
			}
		}
		
		Project fmpProject;

		if ( fmpModelFile.exists() ) {
			final FmpExternalLoader externalLoader = new FmpExternalLoader();
			externalLoader.load(fmpModelFile);
			final EList resourceList = externalLoader.getResources();
			final FmpResourceImpl fmpResource = (FmpResourceImpl)resourceList.get(0);
			fmpProject = (Project)fmpResource.getAllContents().next();

			EList children = fmpProject.getModel().getChildren();
			Feature childold = (Feature)children.get(0);

			createTable(childold,featureExpression);	    
		}
	}

	private void createTable(Node proj, String featureName) {
		EList c = proj.getChildren();
		Iterator tree = c.iterator();

		int selectedIndex = -1;
		int count = 0;

		while(tree.hasNext()) {
			Object o = tree.next();

			if ( o instanceof Feature ) {
				Feature child = (Feature)o;
				TableItem item = new TableItem(this.featuresTable, SWT.NONE);

				if ( child.getName().equals(featureName)) {
					selectedIndex = count;
				}

				item.setText(child.getName());				
				ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL((URL)GenArchEMFPlugin.INSTANCE.getImage("full/arrow_obj"));				
				item.setImage(imageDescriptor.createImage());

				if ( child.getChildren() != null && child.getChildren().size() > 0 ) {
					createTable(child,featureName);
				}
			} else if ( o instanceof FeatureGroup ) {
				FeatureGroup child = (FeatureGroup)o;

				if ( child.getChildren() != null && child.getChildren().size() > 0 ) {
					createTable(child,featureName);
				}
			}
		}
	}

	private EObject findConfigurationElementByPath(String path) {	
		TreeIterator configurationContents = mappingRelationships.eAllContents();

		while ( configurationContents.hasNext() ) {
			EObject o = (EObject)configurationContents.next();

			if ( o instanceof ImplementationComponent ) {
				ImplementationComponent component = (ImplementationComponent)o;

				if ( component.getPath().equals(path) ) {
					return component;
				}
			} else if ( o instanceof MappingEntity ) {
				MappingEntity entity = (MappingEntity)o;

				if ( entity.getPath().equals(path) ) {
					return entity;
				}
			}
		}

		return null;
	}
	
	private DSMElement findConfigurableElementByName(String name,Map<String,String> domainModelFiles) {
		String modelFilePath = modelFile.getProjectRelativePath().toString();
		
		for ( String key : domainModelFiles.keySet() ) {
			String path = domainModelFiles.get(key);
			
			if ( path.equals(modelFilePath) ) {
				EList domainModels = dsmMappings.getModels();
				
				for ( int x = 0; x < domainModels.size(); x++ ) {
					DSM domainModel = (DSM)domainModels.get(x);
					if ( domainModel.getName().equals(key) ) {
						EList elements = domainModel.getElements();
						
						for ( int y = 0; y < elements.size(); y++ ) {
							DSMElement eElement = (DSMElement)elements.get(y);
							
							if ( eElement.getName().equals(name) ) {
								return eElement;
							}
						}						
					}					
				}				
			}
		}
		
		return null;
	}

	private void updateStatus(String message) {
		this.setErrorMessage(message);
		this.setPageComplete(message == null);
	}

	public String getSelection() {
		TableItem[] itens = this.featuresTable.getSelection();
		StringBuilder builder = new StringBuilder();

		for ( int x = 0; x < itens.length-1; x++ ) {
			builder.append(itens[x].getText() + " and ");
		}

		builder.append(itens[itens.length-1].getText());

		return builder.toString();
	}
		
	private void initialize() {

	}
} 