package br.pucrio.inf.les.genarch;

import java.security.Permission;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openarchitectureware.emf.EcoreUtil2;
import org.osgi.framework.BundleContext;

import br.pucrio.inf.les.genarch.core.extension.IDomainModelExtractor;
import br.pucrio.inf.les.genarch.core.extension.IPostProcessor;
import br.pucrio.inf.les.genarch.core.extension.IPreProcessor;
import br.pucrio.inf.les.genarch.core.plugin.DomainModelDescription;
import br.pucrio.inf.les.genarch.core.plugin.GenArchEMFPlugin;
import br.pucrio.inf.les.genarch.core.plugin.GenArchPluginFacade;
import br.pucrio.inf.les.genarch.core.plugin.IGenArchExtensionPointProcessor;
import br.pucrio.inf.les.genarch.core.plugin.ImportingMetadata;

public class GenArchPlugin extends Plugin {

	public static final GenArchPlugin INSTANCE = new GenArchPlugin();

	public static final String PLUGIN_ID = "br.pucrio.inf.les.genarch";

	public static final String GENARCH_NATURE = PLUGIN_ID + ".genarchnature";

	public static final String GENARCH_CONTAINER = PLUGIN_ID + ".GENARCH_CONTAINER";
	
	public GenArchPlugin() {
		super();
	}

	public ResourceLocator getPluginResourceLocator() {
		return GenArchEMFPlugin.INSTANCE.getPluginResourceLocator();
	}

	public void start(BundleContext context) throws Exception {	
		super.start(context);

		processExtensionPoint("br.pucrio.inf.les.genarch.domainModel",new DomainModelExtensionPointProcessor());
		processExtensionPoint("br.pucrio.inf.les.genarch.domainModelExtractor",new DomainModelExtractorExtensionPointProcessor());
		processExtensionPoint("br.pucrio.inf.les.genarch.domainModelProcessors",new DomainModelProcessorsExtensionPointProcessor());

		/*Thread currentThread = Thread.currentThread();
		ClassLoader currentLoader = currentThread.getContextClassLoader();

		System.setSecurityManager(new MySecurityManager());


		try	{
			currentThread.setContextClassLoader(GenArchPlugin.class.getClassLoader());
		}
		finally	{
			currentThread.setContextClassLoader(currentLoader);
		}


		genArchServiceImpl = new GenArchServiceImpl();
		GenArchService genArchService = (GenArchService)UnicastRemoteObject.exportObject(genArchServiceImpl,0);		
		Registry registry = LocateRegistry.createRegistry(9696);
		registry.rebind("GenArchSerivce",genArchService);*/
	}

	public void processExtensionPoint(String name,IGenArchExtensionPointProcessor processor) {
		IExtensionPoint extensionPoints = Platform.getExtensionRegistry().getExtensionPoint(name);
		IExtension[] installedExtensions = extensionPoints.getExtensions();

		for (IExtension extension : installedExtensions) {
			IConfigurationElement[] configElements = extension.getConfigurationElements();
			for (IConfigurationElement configElement : configElements) {
				processor.process(configElement);
			}
		}
	}

	class DomainModelExtensionPointProcessor implements IGenArchExtensionPointProcessor {
		public void process(IConfigurationElement configElement) {
			try {
				DomainModelDescription domainModelDescription = new DomainModelDescription();
				String ePackageClass = configElement.getAttribute("ePackageClass");

				EPackage ePackage = EcoreUtil2.getEPackageByClassName(ePackageClass);

				domainModelDescription.setEPackageClass(ePackage);
				domainModelDescription.setName(configElement.getAttribute("name"));
				domainModelDescription.setReferenceName(configElement.getAttribute("referenceName"));

				TreeIterator i = ePackage.eAllContents();

				while ( i.hasNext() ) {					
					Object o = (Object)i.next();
					if ( o instanceof EClass ) {
						EClass eClass = (EClass)o;					
						EList<EAnnotation> annotations = eClass.getEAnnotations();
						for ( EAnnotation eAnnotation : annotations ) {
							if ( eAnnotation.getSource().equalsIgnoreCase("XML") ) {
								ImportingMetadata importingMetadata = new ImportingMetadata();
								importingMetadata.setType(ImportingMetadata.XML);
								importingMetadata.setElementType(((EClass)eAnnotation.eContainer()).getName());
								importingMetadata.setMetaProp(eAnnotation.getDetails().get("prop"));
								importingMetadata.setMetaAttr(eAnnotation.getDetails().get("attr"));
								domainModelDescription.getImportingMetadas().add(importingMetadata);
							} else if ( eAnnotation.getSource().equalsIgnoreCase("ANNOTATION") ) {
								ImportingMetadata importingMetadata = new ImportingMetadata();
								importingMetadata.setType(ImportingMetadata.ANNOTATION);
								importingMetadata.setElementType(eAnnotation.getEModelElement().eClass().getName());
								importingMetadata.setMetaProp(eAnnotation.getDetails().get("prop"));
								importingMetadata.setMetaAttr(eAnnotation.getDetails().get("attr"));
								domainModelDescription.getImportingMetadas().add(importingMetadata);
							}
						}
					}
				}

				try {
					domainModelDescription.setItemProviderAdapertFactory((AdapterFactory)configElement.createExecutableExtension("itemProviderAdapterFactory"));
				} catch (CoreException e) {
					e.printStackTrace();
				}

				GenArchPluginFacade.Instance().addDomainModel(domainModelDescription);
			} catch (InvalidRegistryObjectException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}

	class DomainModelExtractorExtensionPointProcessor implements IGenArchExtensionPointProcessor {
		public void process(IConfigurationElement configElement) {
			try {
				IDomainModelExtractor domainModelExtractor = (IDomainModelExtractor)configElement.createExecutableExtension("class");
				GenArchPluginFacade.Instance().addDomainModelExtractor(domainModelExtractor);
			} catch (CoreException e) {
				GenArchEMFPlugin.INSTANCE.log(e.getStatus());
			}
		}		
	}

	class DomainModelProcessorsExtensionPointProcessor implements IGenArchExtensionPointProcessor {
		public void process(IConfigurationElement configElement) {
			try {
				Object processor = configElement.createExecutableExtension("class");

				if ( processor instanceof IPreProcessor ) {
					IPreProcessor preProcessor = (IPreProcessor)processor;
					GenArchPluginFacade.Instance().addPreProcessor(preProcessor);
				} else if ( processor instanceof IPostProcessor ) {
					IPostProcessor postProcessor = (IPostProcessor)processor;
					GenArchPluginFacade.Instance().addPostProcessor(postProcessor);
				}
			} catch (CoreException e) {
				GenArchEMFPlugin.INSTANCE.log(e.getStatus());
			}
		}
	}

	class MySecurityManager extends SecurityManager {

		public MySecurityManager() {
		}
		public void checkPermission() {
		}
		public void checkPermission(Permission perm) {
		}
		public void checkPermission(Permission perm, Object context) {
		} 

	}
}
