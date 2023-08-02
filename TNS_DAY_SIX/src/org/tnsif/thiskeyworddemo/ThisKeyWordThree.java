package org.tnsif.thiskeyworddemo;

class Team {
	// calling to parameterized 
	int size;
	Team()
	{
		this(7);
		System.out.println("default constructor ");
		
	}
	Team(int size)
	{
		System.out.println("parameterized constructor " +size);
		
	}
}
public class ThisKeyWordThree {
	public static void main (String [] args) {
		Team t = new Team();
	}
	
}
