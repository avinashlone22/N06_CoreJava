package org.tnsif.operator;
import java.util.*;
public class ArethmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Enter two Numbers: ");
		n1=s.nextInt();
		n2=s.nextInt();
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
	}

}
