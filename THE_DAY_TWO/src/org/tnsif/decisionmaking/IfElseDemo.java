package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseDemo {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int age=sc.nextInt();
		
		int weight = sc.nextInt();
		
		if (age>18 && weight>50)
			
		{
			System.out.println("elligible");
		}
		else
		{
			System.out.println("not elligible ");
		}
		

	}

}
