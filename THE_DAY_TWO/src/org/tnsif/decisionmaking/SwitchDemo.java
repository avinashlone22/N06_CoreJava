package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" select choice");
		int songno = sc.nextInt();
		switch(songno)
		{
		
		case 1:
				System.out.println("waka waka ");
				break;
		
		case 2:
			
			System.out.println("fadesd ");
			break;
			
		case 3:
			
			System.out.println("shri ");
			break;
		case 4:
	
			System.out.println(" no away ");
			break;
	
		default:
			System.out.println( "wrong choice");
		

	
	
	}
		
	}

}
