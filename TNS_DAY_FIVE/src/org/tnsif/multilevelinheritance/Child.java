package org.tnsif.multilevelinheritance;

public class Child extends Partent {
	private String cname;
	private long childproperty;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getChildproperty() {
		return childproperty;
	}
	public void setChildproperty(long childproperty) {
		this.childproperty = childproperty;
	}
	public Child(String surname, long property, String pname, long parentproperty,String cname,long childproperty) {
		super(surname, property, pname, parentproperty);
		// TODO Auto-generated constructor stub
	}
	
	
}
