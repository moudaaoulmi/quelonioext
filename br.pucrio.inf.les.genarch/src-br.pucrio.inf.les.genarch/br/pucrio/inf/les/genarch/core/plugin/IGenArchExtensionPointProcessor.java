package br.pucrio.inf.les.genarch.core.plugin;

import org.eclipse.core.runtime.IConfigurationElement;

public interface IGenArchExtensionPointProcessor {
	
	public void process(IConfigurationElement configElement);

}
