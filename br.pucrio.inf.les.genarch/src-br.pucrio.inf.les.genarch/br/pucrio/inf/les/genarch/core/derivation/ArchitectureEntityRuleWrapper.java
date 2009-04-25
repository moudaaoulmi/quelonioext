package br.pucrio.inf.les.genarch.core.derivation;


public class ArchitectureEntityRuleWrapper {
	
	private String name;
	private boolean selected = true;
	
	public ArchitectureEntityRuleWrapper(String name) {
		this.name = name;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSelected() {
		return selected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void removeImplementationMappings() {
		System.out.println("Work done - " + name);
	}	
}
