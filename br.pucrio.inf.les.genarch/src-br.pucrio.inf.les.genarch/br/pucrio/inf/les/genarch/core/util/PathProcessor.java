package br.pucrio.inf.les.genarch.core.util;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class PathProcessor {
	
	public static String extractParentPath(String elementPath) {
		IPath pathAux = new Path(elementPath);
		return pathAux.removeLastSegments(1).toString();
	}
	
	public static String extractElementNameByPath(String elementPath) {
		IPath pathAux = new Path(elementPath);
		return pathAux.lastSegment();
	}
	
	public static String extractContainerName(String elementPath) {
		IPath pathAux = new Path(elementPath);
		return pathAux.segment(0).toString();
	}
	
	public static String extractFeatureParentPath(String featurePath) {
		return extractParentPath(featurePath);
	}
	
	public static String extractFeatuerParentName(String featurePath) {
		IPath pathAux = new Path(featurePath);
		return pathAux.removeLastSegments(1).lastSegment();
	}
	
	public static String extractFeatureNameFromPath(String elementPath) {
		IPath pathAux = new Path(elementPath);
		return pathAux.lastSegment();
	}
	
	public static String extractFragmentContainerName(String fragmentPath) {
		IPath pathAux = new Path(fragmentPath);
		return pathAux.segment(0).toString();
	}

}
