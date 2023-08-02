package org.tnsif.instanceofdemo;

 class RBI {

	protected String ifscCode;
	
	
}
class SBI extends RBI
{
	public SBI() {
		super.ifscCode =("RBIqwert");
		String ifscCode=("SBIqwert");
		System.out.println(ifscCode);
	System.out.println(super.ifscCode);
	/*
	 * if parent class variable and child class variable are same ythen 
	 * in such case use super.variable name to nacess of parent class ionside the child class
	 * */
	}
	
}

public class InstanceofDemo {
	
	public static void main (String[] args)
	{
		SBI sc = new SBI();
		System.out.println(sc instanceof SBI);
		System.out.println(sc instanceof RBI);
	}
	 
}