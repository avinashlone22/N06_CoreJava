package org.tnsif.superkeyword;

// program to demonstrate super keyword with variable
class Building
{
	int floor =23;
	String name ="Sai_Nivas ";
}
class Flat extends Building{
	String name ="Avinash lone ";
	
	void print()
	{
		/*
		 * if parent class and child class variable are name 
		 * and if youn want to access parent class variable inside chi;d class 
		 * then ewe use supere key word 
		 * */
		System.out.println(super.name);
		System.out.println( name);
	}
	}
public class Superkeyworddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flat f = new Flat();
		f.print();
	}

}
