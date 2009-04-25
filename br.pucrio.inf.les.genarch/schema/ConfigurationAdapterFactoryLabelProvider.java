package br.pucrio.inf.les.genarch.models.configuration.provider;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import br.pucrio.inf.les.genarch.models.configuration.EElement;

public class ConfigurationAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider {

	public ConfigurationAdapterFactoryLabelProvider(AdapterFactory arg0) {
		super(arg0);
	}

	public String getColumnText(Object element, int columnIndex) {
		String result = "";
		EElement entity = (EElement) element;
		switch (columnIndex) {
		case 0:  // COMPLETED_COLUMN
			result = entity.getName();
			break;
		case 1 :
			result = entity.getFeatureExpression().getExpression();
			break;	
		default :
			break; 	
		}
		return result;
	}

	public Image getColumnImage(Object element, int columnIndex) {
		Image result = null;
		EElement entity = (EElement) element;
		switch (columnIndex) {
		case 0: 			
			try {
					String baseURL = "file:/C:/eclipse3GenArchSDM/workspace/br.pucrio.inf.les.genarch.extension.springdm/";
					
					URL url = new URL(baseURL + "icons/" + "full/obj16/Bundle" + ".gif");
					InputStream inputStream = url.openStream(); 
					inputStream.close();		    
					ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(url);	
					result = imageDescriptor.createImage();
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			break;
		case 1 :			
			IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(entity.getFeatureExpression(), IItemLabelProvider.class);			
			result = ExtendedImageRegistry.getInstance().getImage(itemLabelProvider.getImage(entity.getFeatureExpression()));
			break;	
		default :
			break; 	
		}
		return result;
	}

}
