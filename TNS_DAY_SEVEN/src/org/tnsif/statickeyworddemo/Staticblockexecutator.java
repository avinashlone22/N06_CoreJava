package org.tnsif.statickeyworddemo;

public class Staticblockexecutator {
	static String name;
	
	static {
		
	    name ="avi";
		System.out.println("name is :"+name);
		}
	

	public static void main (String [] args)
	{
		//	main method is static and hence its calls method wiyhout callimng anything 
	}
}
