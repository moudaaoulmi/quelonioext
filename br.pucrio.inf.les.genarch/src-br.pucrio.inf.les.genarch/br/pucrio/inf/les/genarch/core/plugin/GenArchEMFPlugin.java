/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.pucrio.inf.les.genarch.core.plugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the Architecture editor plugin.
 * @generated
 */
public final class GenArchEMFPlugin extends EMFPlugin {
    /**
     * Keep track of the singleton.
     * @generated
     */
    public static final GenArchEMFPlugin INSTANCE = new GenArchEMFPlugin();

    /**
     * Keep track of the singleton.
     * @generated
     */
    private static Implementation plugin;

    /**
     * Create the instance.
     * @generated
     */
    public GenArchEMFPlugin() {
	super(new ResourceLocator [] {});	
    }

    /**
     * Returns the singleton instance of the Eclipse plugin.
     * @return the singleton instance.
     * @generated
     */
    @Override
    public ResourceLocator getPluginResourceLocator() {
	return plugin;
    }       

    /**
     * Returns the singleton instance of the Eclipse plugin.
     * @return the singleton instance.
     * @generated
     */
    public static Implementation getPlugin() {	
	return plugin;
    }

    /**
     * The actual implementation of the Eclipse <b>Plugin</b>.
     */
    public static class Implementation extends EclipseUIPlugin {
	public Implementation() {
	    super();
	    plugin = this;
	}

	public void start(BundleContext context) throws Exception {
	    super.start(context);	  
	}
    }
}
