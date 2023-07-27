package org.tnsif.hierarchicalinheritance;

public class SnowCone extends Android{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnowCone(String brand, String slottype ,int version) {
		super(brand, slottype);
		// TODO Auto-generated constructor stub
		this.version=version;
	}

	public SnowCone(int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	

}
