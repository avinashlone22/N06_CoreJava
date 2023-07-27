package org.tnsif.multilevelinheritance;

public class Partent extends GrandParent {
private String pname;
private long parentproperty;

public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public long getParentproperty() {
	return parentproperty;
}
public void setParentproperty(long parentproperty) {
	this.parentproperty = parentproperty;
}
public Partent(String surname, long property , String pname,long parentproperty ) {
	super(surname, property);
	
	this.pname=pname;
	this.parentproperty=parentproperty;
	
	
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Partent [pname=" + pname + ", parentproperty=" + parentproperty + ", toString()=" + super.toString() + "]";
}


}
