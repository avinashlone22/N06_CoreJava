package org.tnsif.superkeyword;

class Met{
	String ownerName ="Shefali";
	void displayName()
	
	{
		System.out.println( "owner ids "+ownerName);
		
	}
}
// cjidl class

class Bkc extends Met{
	String ownerName="Shefali";
	void displayName()
	{
		super.displayName();
		System.out.println( "owner is "+ownerName);
		
	}
	
}
// driver class 
public class Superkeywordwithmethod {
	public static void main (String [] args)
	{
		Bkc b = new Bkc();
		b.displayName();
	}
}
