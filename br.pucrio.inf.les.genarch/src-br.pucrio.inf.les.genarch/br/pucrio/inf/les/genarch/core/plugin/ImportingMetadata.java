package br.pucrio.inf.les.genarch.core.plugin;

public class ImportingMetadata {

	public static int XML = 0;
	public static int ANNOTATION = 0;
	
	private String metaProp;
	private String metaAttr;
	private String elementType;
	private int type;
	
	public String getMetaProp() {
		return metaProp;
	}
	
	public void setMetaProp(String metaProp) {
		this.metaProp = metaProp;
	}
	
	public String getElementType() {
		return elementType;
	}
	
	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getMetaAttr() {
		return metaAttr;
	}

	public void setMetaAttr(String metaAttr) {
		this.metaAttr = metaAttr;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
