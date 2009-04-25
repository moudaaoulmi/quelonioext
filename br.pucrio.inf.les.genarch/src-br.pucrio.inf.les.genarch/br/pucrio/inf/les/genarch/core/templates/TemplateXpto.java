package br.pucrio.inf.les.genarch.core.templates;

import java.util.List;

import org.antlr.runtime.tree.Tree;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import br.pucrio.inf.les.genarch.core.plugin.DomainModelDescription;
import br.pucrio.inf.les.genarch.core.plugin.GenArchEMFPlugin;
import br.pucrio.inf.les.genarch.core.plugin.GenArchPluginFacade;

public class TemplateXpto {

	public void create() {
		List<DomainModelDescription> domainModelDescriptions = GenArchPluginFacade.Instance().getDomainModelDescriptions();

		for ( DomainModelDescription domainModelDescription : domainModelDescriptions ) {
			EPackage ePackage = domainModelDescription.getEPackageClass();
			EClass eClass = ePackage.eClass();

			TreeIterator<EObject> contents = eClass.eAllContents();

			while ( contents.hasNext() ) {
				EObject o = contents.next();
				for ( EAttribute attribute : (List<EAttribute>)o.eClass().getEAttributes() ) {
					GenArchEMFPlugin.INSTANCE.log(o.eGet(attribute));
				}				
				GenArchEMFPlugin.INSTANCE.log("----------------------------------------------------");
			}
		}
	}
}
