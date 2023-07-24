package org.tnsif.decisionmaking;
import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age1 =sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		if (age1>age2 && age1>age3)
		{
			System.out.println("age 1 is greater ");
			
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("age 2 is greater ");
			
		}
		else
		{
			System.out.println("age 3 is greater");
		}
	}

}
