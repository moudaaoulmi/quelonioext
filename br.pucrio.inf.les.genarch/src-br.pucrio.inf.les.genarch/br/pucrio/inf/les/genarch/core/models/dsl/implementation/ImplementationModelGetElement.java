package br.pucrio.inf.les.genarch.core.models.dsl.implementation;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.eclipse.emf.query.conditions.strings.StringValue;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import br.pucrio.inf.les.genarch.models.implementation.ImplementationAspect;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationClass;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationComponent;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationEntity;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFile;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFolder;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragment;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationFragmentContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationPackage;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationResourcesContainer;
import br.pucrio.inf.les.genarch.models.implementation.ImplementationTemplate;

public class ImplementationModelGetElement {

	private ImplementationModelHandle implementationModelHandle;

	public ImplementationModelGetElement(ImplementationModelHandle architectureModelHandle) {
		this.implementationModelHandle = architectureModelHandle;
	}
	
	public ImplementationComponent component(String path) {
		return (ImplementationComponent)element(path);
	}
	
	public ImplementationFolder folder(String path) {
		return (ImplementationFolder)element(path);
	}
	
	public ImplementationClass clazz(String path) {
		return (ImplementationClass)element(path);
	}
	
	public ImplementationAspect aspect(String path) {
		return (ImplementationAspect)element(path);
	}
	
	public ImplementationFile file(String path) {
		return (ImplementationFile)element(path);
	}
	
	public ImplementationTemplate template(String path) {
		return (ImplementationTemplate)element(path);
	}
	
	public ImplementationFragment fragment(String path) {
		return (ImplementationFragment)element(path);
	}
	
	public ImplementationContainer sourceContainer(String name) {
		return (ImplementationContainer)container(name,ImplementationPackage.eINSTANCE.getImplementationContainer_Name());
	}
			
	public ImplementationResourcesContainer resourceContainer(String name) {
		return (ImplementationResourcesContainer)container(name,ImplementationPackage.eINSTANCE.getImplementationResourcesContainer_Name());
	}
	
	public ImplementationFragmentContainer fragmentContainer(String name) {
		return (ImplementationFragmentContainer)container(name,ImplementationPackage.eINSTANCE.getImplementationFragmentContainer_Name());
	}

	public ImplementationEntity element(String path) {
		IQueryResult result = new SELECT(
				new FROM(this.implementationModelHandle.getImplementation()),
				new WHERE(new EObjectAttributeValueCondition(ImplementationPackage.eINSTANCE.getImplementationEntity_Path(),new StringValue(path)))).execute();
		
		Iterator<EObject> i = result.getEObjects().iterator();
		
		if ( !result.isEmpty() ) {
			return (ImplementationEntity)i.next();
		}
		
		return null;
	}
	
	private EObject container(String name,EAttribute attribute) {
		IQueryResult result = new SELECT(
				new FROM(this.implementationModelHandle.getImplementation()),
				new WHERE(new EObjectAttributeValueCondition(attribute, new StringValue(name)))).execute();
		
		Iterator<EObject> i = result.getEObjects().iterator();
		
		if ( !result.isEmpty() ) {
			return i.next();
		}
		
		return null;
	}
}