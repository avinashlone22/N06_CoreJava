package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		int age =sc.nextInt();
		int weight =sc.nextInt();
		if (age>=12)
	
		{
			if (weight>=40)
			{
				System.out.println( "elligible ");
				if(weight>=110)
				{
					System.out.println("extra rope");
				}
			}
			else
			{
			System.out.println("not elligible");
			}
		}
		
	}

}
