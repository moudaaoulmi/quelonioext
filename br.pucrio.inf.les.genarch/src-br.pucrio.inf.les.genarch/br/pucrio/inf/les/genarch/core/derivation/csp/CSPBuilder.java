package br.pucrio.inf.les.genarch.core.derivation.csp;

import static choco.Choco.eq;
import static choco.Choco.ifOnlyIf;
import static choco.Choco.makeIntVar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.TypeRelation;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import br.pucrio.inf.les.genarch.core.logic.Logic;
import br.pucrio.inf.les.genarch.core.logic.model.IExpression;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationFragmentContainer;
import br.pucrio.inf.les.genarch.models.configuration.ConfigurationResourcesContainer;
import br.pucrio.inf.les.genarch.models.configuration.DSM;
import br.pucrio.inf.les.genarch.models.configuration.DSMElement;
import br.pucrio.inf.les.genarch.models.configuration.MappingEntity;
import br.pucrio.inf.les.genarch.models.configuration.MappingRelationships;
import br.pucrio.inf.les.genarch.models.dsamtypes.AspectDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.ClassDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.ComponentDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.DomainElement;
import br.pucrio.inf.les.genarch.models.dsamtypes.DsamtypesPackage;
import br.pucrio.inf.les.genarch.models.dsamtypes.FileDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.FolderDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.FragmentDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupAspects;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupClass;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupComponents;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFiles;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFolders;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupFragments;
import br.pucrio.inf.les.genarch.models.dsamtypes.GroupTemplates;
import br.pucrio.inf.les.genarch.models.dsamtypes.IntraDependence;
import br.pucrio.inf.les.genarch.models.dsamtypes.TemplateDependence;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;
import br.pucrio.inf.les.genarch.models.product.ProductDomainModel;
import br.pucrio.inf.les.genarch.models.product.ProductEntity;
import br.pucrio.inf.les.genarch.models.product.ProductFeatureConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductFeaturesConfiguration;
import br.pucrio.inf.les.genarch.models.product.ProductImplementationElements;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.ContradictionException;
import choco.kernel.solver.Solver;
import choco.kernel.solver.variables.integer.IntDomainVar;

public class CSPBuilder {

	private static CSPBuilder cspBuilder = null;

	public static CSPBuilder csp() {
		if ( cspBuilder == null ) {
			cspBuilder = new CSPBuilder();
		}

		return cspBuilder;
	}

	private List<Constraint> featureModelConstraints = null;
	private List<Constraint> domainModelConstraints = null;

	private Map<String,IntegerVariable> featureModelVariables = null;
	private Map<String,IntegerVariable> architectureModelVariables = null;
	private Map<String,Map<String,IntegerVariable>> domainModelsVariables = null;

	private Model mFeatureModel = null;
	private Model mModels = null;
	private Map<String,Model> mDomainModels = null;

	private IntegerVariable sel = null;

	private CSPBuilder() {
		this.featureModelConstraints = new ArrayList<Constraint>();
		this.domainModelConstraints = new ArrayList<Constraint>();

		this.featureModelVariables = new HashMap<String, IntegerVariable>();
		this.architectureModelVariables = new HashMap<String, IntegerVariable>();
		this.domainModelsVariables = new HashMap<String,Map<String,IntegerVariable>>();

		this.mFeatureModel = new CPModel();	
		this.mModels = new CPModel();
		this.mDomainModels = new HashMap<String,Model>();

		this.sel = makeIntVar("Sel",1,1);
		this.mFeatureModel.addVariable(sel);
		this.mModels.addVariable(sel);
	}

	public void buildFeatureModelCSP(ProductFeaturesConfiguration root) {
		//Build Variables		
		TreeIterator configurationAC = root.eAllContents();

		while ( configurationAC.hasNext() ) {
			ProductFeatureConfiguration child = (ProductFeatureConfiguration)configurationAC.next();

			String name = child.getName();								
			int domain = child.isIsSelected() ? 1 : 0;

			IntegerVariable variable = makeIntVar(name,domain,domain);			
			mFeatureModel.addVariable(variable);
			mModels.addVariable(variable);
			featureModelVariables.put(name, variable);
		}

		//TODO Build Constraints
	}

	public void buildArchitectureModelCSP(ProductImplementationElements pie, MappingRelationships mr) {
		//Build Implementation Model Variables
		TreeIterator architectureAC = pie.eAllContents();

		while ( architectureAC.hasNext() ) {
			EObject o = (EObject)architectureAC.next();

			if ( o instanceof ProductEntity ) {
				ProductEntity pEChild = (ProductEntity)o;

				String name = pEChild.getName();
				//int bePart = pEChild.isBePart() ? 1 : 0;

				IntegerVariable variable = makeIntVar(name,0,1);
				mModels.addVariable(variable);
				architectureModelVariables.put(name,variable);
			}
		}

		//Build Implementation Model Constraints (Configuration Model Mapping Relationships)
		List<ConfigurationContainer> containers = mr.getContainers();

		for ( ConfigurationContainer container : containers ) {
			TreeIterator cAC = container.eAllContents();

			while ( cAC.hasNext() ) {
				EObject cACO = (EObject)cAC.next();
				if ( cACO instanceof MappingEntity ) {
					MappingEntity meChild = (MappingEntity)cACO;				

					if ( meChild.getFeatureExpression() != null ) {
						String featureExpression = meChild.getFeatureExpression().getExpression(); 

						IExpression expression;
						try {
							expression = Logic.parseExpression(featureExpression);
							Constraint ls = expression.accept(new CSPIExpressionVisitor(featureModelVariables,sel));
							Constraint rs = eq(architectureModelVariables.get(meChild.getName()),sel);					
							Constraint implConstraint = ifOnlyIf(ls,rs);
							mModels.addConstraint(implConstraint);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

		List<ConfigurationResourcesContainer> resourceContainers = mr.getResourcesContainers();

		for ( ConfigurationResourcesContainer resourceContainer : resourceContainers ) {
			TreeIterator cAC = resourceContainer.eAllContents();

			while ( cAC.hasNext() ) {
				EObject cACO = (EObject)cAC.next();
				if ( cACO instanceof MappingEntity ) {
					MappingEntity meChild = (MappingEntity)cACO;

					if ( meChild.getFeatureExpression() != null ) {			
						String featureExpression = meChild.getFeatureExpression().getExpression();

						IExpression expression;
						try {
							expression = Logic.parseExpression(featureExpression);
							Constraint ls = expression.accept(new CSPIExpressionVisitor(featureModelVariables,sel));
							Constraint rs = eq(architectureModelVariables.get(meChild.getName()),sel);
							Constraint implConstraint = ifOnlyIf(ls,rs);
							mModels.addConstraint(implConstraint);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

		List<ConfigurationFragmentContainer> fragmentContainers = mr.getFragmentsContainer();

		for ( ConfigurationFragmentContainer fragmentContainer : fragmentContainers ) {
			TreeIterator cAC = fragmentContainer.eAllContents();

			while ( cAC.hasNext() ) {
				EObject cACO = (EObject)cAC.next();
				if ( cACO instanceof MappingEntity ) {
					MappingEntity meChild = (MappingEntity)cACO;

					if ( meChild.getFeatureExpression() != null ) {
						String featureExpression = meChild.getFeatureExpression().getExpression();

						IExpression expression;
						try {
							expression = Logic.parseExpression(featureExpression);
							Constraint ls = expression.accept(new CSPIExpressionVisitor(featureModelVariables,sel));
							Constraint rs = eq(architectureModelVariables.get(meChild.getName()),sel);					
							Constraint implConstraint = ifOnlyIf(ls,rs);
							mModels.addConstraint(implConstraint);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public void bulidDomainModelCSP(ProductDomainModel dm,EObject domainModel,DSM dsm) {		
		//Build Domain Model Variables
		Map<String,EObject> domainModelAC = dm.getElements();
		Set<String> domainModelACKeys = domainModelAC.keySet();

		Map<String,IntegerVariable> domainModelVariables = new HashMap<String,IntegerVariable>();		

		for ( String key : domainModelACKeys ) {
			DomainElement pde = (DomainElement)domainModelAC.get(key);

			String name = pde.getName();
			//int bePart = pde.isBePart() ? 1 : 0;

			IntegerVariable variable = makeIntVar(name,0,1);
			mModels.addVariable(variable);
			domainModelVariables.put(name,variable);
		}

		this.domainModelsVariables.put(dm.getName(), domainModelVariables);

		//Build Domain Model Constraints 

		//Configuration Model Mapping Relationships
		EList elements = dsm.getElements();

		for ( int x = 0; x < elements.size(); x++ ) {
			DSMElement dsmElement = (DSMElement)elements.get(x);			
			String featureExpression = dsmElement.getFeatureExpression().getExpression();

			IExpression expression;
			try {
				expression = Logic.parseExpression(featureExpression);
				Constraint ls = expression.accept(new CSPIExpressionVisitor(featureModelVariables,sel));
				Constraint rs = eq(domainModelVariables.get(dsmElement.getName()),sel);					
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		domainModelsVariables.put(dm.getName(),domainModelVariables);

		//Architecture Elements Mapping Relationships
		Iterator<?> i = findElementsByType(DsamtypesPackage.eINSTANCE.getGroupClass(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			GroupClass classesImplElement = (GroupClass)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationClass> associatedClasses = classesImplElement.getClasses();

			for ( ImplementationClass associatedClass : associatedClasses ) {			
				Constraint ls = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint rs = eq(architectureModelVariables.get(associatedClass.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getGroupAspects(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			GroupAspects aspectImplElement = (GroupAspects)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationAspect> associatedAspects = aspectImplElement.getAspects();

			for ( ImplementationAspect associatedAspect : associatedAspects ) {
				Constraint ls = eq(domainModelVariables.get(domainElement.getName()),sel);
				Constraint rs = eq(architectureModelVariables.get(associatedAspect.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getGroupFiles(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			GroupFiles fileImplElement = (GroupFiles)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationFile> associatedFiles = fileImplElement.getFiles();

			for ( ImplementationFile associatedFile : associatedFiles ) {
				Constraint ls = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint rs = eq(architectureModelVariables.get(associatedFile.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getGroupTemplates(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			GroupTemplates templateImplElement = (GroupTemplates)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationTemplate> associatedTemplates = templateImplElement.getTemplates();

			for ( ImplementationTemplate associatedTemplate : associatedTemplates ) {
				Constraint ls = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint rs = eq(architectureModelVariables.get(associatedTemplate.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getGroupFragments(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			GroupFragments fragmentsImplElement = (GroupFragments)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationFragment> associatedFragments = fragmentsImplElement.getFragments();

			for ( ImplementationFragment associatedFragment : associatedFragments ) {
				Constraint ls = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint rs = eq(architectureModelVariables.get(associatedFragment.getName()),sel);
				Constraint implConstraint =  ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getGroupFolders(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			GroupFolders folderImplElement = (GroupFolders)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationFolder> associatedFolders = folderImplElement.getFolders();

			for ( ImplementationFolder associatedFolder : associatedFolders ) {
				Constraint ls = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint rs = eq(architectureModelVariables.get(associatedFolder.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getGroupComponents(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			GroupComponents componentImplElement = (GroupComponents)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationComponent> associatedComponents = componentImplElement.getComponents();

			for ( ImplementationComponent associatedComponent : associatedComponents ) {
				Constraint ls = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint rs = eq(architectureModelVariables.get(associatedComponent.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		//Dependence

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getClassDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			ClassDependence classesImplElement = (ClassDependence)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationClass> associatedClasses = classesImplElement.getClasses();

			for ( ImplementationClass associatedClass : associatedClasses ) {
				Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint ls = eq(architectureModelVariables.get(associatedClass.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getAspectDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			AspectDependence aspectImplElement = (AspectDependence)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationAspect> associatedAspects = aspectImplElement.getAspects();

			for ( ImplementationAspect associatedAspect : associatedAspects ) {
				Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint ls = eq(architectureModelVariables.get(associatedAspect.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getFileDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			FileDependence fileImplElement = (FileDependence)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationFile> associatedFiles = fileImplElement.getFiles();

			for ( ImplementationFile associatedFile : associatedFiles ) {
				Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint ls = eq(architectureModelVariables.get(associatedFile.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getTemplateDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			TemplateDependence templateImplElement = (TemplateDependence)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationTemplate> associatedTemplates = templateImplElement.getTemplates();

			for ( ImplementationTemplate associatedTemplate : associatedTemplates ) {
				Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint ls = eq(architectureModelVariables.get(associatedTemplate.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getFragmentDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			FragmentDependence fragmentsImplElement = (FragmentDependence)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationFragment> associatedFragments = fragmentsImplElement.getFragments();

			for ( ImplementationFragment associatedFragment : associatedFragments ) {
				Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint ls = eq(architectureModelVariables.get(associatedFragment.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getFolderDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			FolderDependence folderImplElement = (FolderDependence)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationFolder> associatedFolders = folderImplElement.getFolders();

			for ( ImplementationFolder associatedFolder : associatedFolders ) {
				Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint ls = eq(architectureModelVariables.get(associatedFolder.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getComponentDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			ComponentDependence componentImplElement = (ComponentDependence)o;
			DomainElement domainElement = (DomainElement)o;

			List<ImplementationComponent> associatedComponents = componentImplElement.getComponents();

			for ( ImplementationComponent associatedComponent : associatedComponents ) {
				Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
				Constraint ls = eq(architectureModelVariables.get(associatedComponent.getName()),sel);
				Constraint implConstraint = ifOnlyIf(ls,rs);
				mModels.addConstraint(implConstraint);
			}
		}

		i = findElementsByType(DsamtypesPackage.eINSTANCE.getIntraDependence(),domainModel.eContents());

		while ( i.hasNext() ) {
			EObject o = (EObject)i.next();
			IntraDependence intraDependenceElement = (IntraDependence)o;
			DomainElement domainElement = (DomainElement)o;

			DomainElement associatedElement = intraDependenceElement.getDependences();
			Constraint rs = eq(domainModelVariables.get(domainElement.getName()),sel);					
			Constraint ls = eq(domainModelVariables.get(associatedElement.getName()),sel);
			Constraint implConstraint = ifOnlyIf(ls,rs);
			mModels.addConstraint(implConstraint);
		}
	}

	public void solve(ProductImplementationElements pie,List<ProductDomainModel> productDomainModels) {
		Solver solverArchitectureModel = new CPSolver();
		solverArchitectureModel.read(mModels);

		try {
			solverArchitectureModel.propagate();
		} catch (ContradictionException e) {			
			System.out.println("Without solution.");					
		}

		for ( String key : this.architectureModelVariables.keySet() ) {
			IntDomainVar variable = solverArchitectureModel.getVar(this.architectureModelVariables.get(key)); 
			int value = variable.getVal();

			if ( value != 1 && value != 0 ) {
				try {
					variable.setMin(1);
					variable.setMax(1);
				} catch (ContradictionException e) {
					e.printStackTrace();
				}				
			}
			System.out.println(key + " : " + variable.getVal());
		}

		for ( String key : this.domainModelsVariables.keySet() ) {
			for ( String sKey : this.domainModelsVariables.get(key).keySet() ) {
				IntDomainVar variable = solverArchitectureModel.getVar(this.domainModelsVariables.get(key).get(sKey)); 
				int value = variable.getVal();

				if ( value != 1 && value != 0 ) {
					try {
						variable.setMin(1);
						variable.setMax(1);
					} catch (ContradictionException e) {
						e.printStackTrace();
					}				
				}
				System.out.println(sKey + " : " + variable.getVal());				
			}
		}

		TreeIterator architectureAC = pie.eAllContents();
		ArrayList tmpArchitectureAC = new ArrayList();

		while ( architectureAC.hasNext() ) {
			EObject o = (EObject)architectureAC.next();

			if ( o instanceof ProductEntity ) {
				tmpArchitectureAC.add(o);				
			}
		}

		for ( int x = 0; x < tmpArchitectureAC.size(); x++ ) {
			ProductEntity pEChild = (ProductEntity)tmpArchitectureAC.get(x);
			String name = pEChild.getName();

			IntDomainVar variable = solverArchitectureModel.getVar(this.architectureModelVariables.get(name));

			if ( variable.getVal() == 0 ) {
				EcoreUtil.remove(pEChild);
			}
		}

		for ( ProductDomainModel productDomainModel : productDomainModels ) {
			Map<String,EObject> domainModelAC = productDomainModel.getElements();
			Set<String> domainModelACKeys = domainModelAC.keySet();

			Map<String,IntegerVariable> domainModelVariable = domainModelsVariables.get(productDomainModel.getName());

			for ( String key : domainModelACKeys ) {
				DomainElement pde = (DomainElement)domainModelAC.get(key);
				String name = pde.getName();

				IntDomainVar variable = solverArchitectureModel.getVar(domainModelVariable.get(name));

				if ( variable.getVal() == 0 ) {
					EcoreUtil.remove(pde);
				}
			}
		}
	}

	private Iterator findElementsByType(EClass eClass,EList content) {
		EObjectTypeRelationCondition typeCondition = new EObjectTypeRelationCondition(eClass,TypeRelation.RELATED_TYPE_LITERAL);			
		SELECT statement = new SELECT(new FROM(content),new WHERE(typeCondition));
		IQueryResult result = statement.execute();
		Set<?> objects = result.getEObjects();
		return objects.iterator();
	}
}