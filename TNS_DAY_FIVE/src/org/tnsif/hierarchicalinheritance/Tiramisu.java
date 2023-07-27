package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends Android
{
	private int version;
	// parameterized constructor 

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Tiramisu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	public Tiramisu(String brand, String slottype,int version) {
		super(brand, slottype);
		// TODO Auto-generated constructor stub
		this.version=version;
	}
	
}
