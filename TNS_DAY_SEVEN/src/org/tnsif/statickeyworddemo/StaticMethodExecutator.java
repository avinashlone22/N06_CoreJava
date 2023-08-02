// demonstarte a program to stativc keyword 

package org.tnsif.statickeyworddemo;

public class StaticMethodExecutator {
	 
	static float percentage=76.89f;

	// static menthod 
	/*
	 * if any method outside the main functio  and if you want to access that method indsid ethe main
	 * function  make it as static 
	 * */
	
	
	 static void displayScore(int score)
	 {
		 
		 System.out.println( percentage);
		 System.out.println("score is "+score);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayScore(56);
		
	}

}
