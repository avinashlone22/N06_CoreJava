/*
 * in each step a certain number of people are skipped and the next person executing .
 * the elimintion proceeds around the circle around parenthesis which is becoming smaller and smALLER as ex
 * excuted people are removed,
 * untill only the last persomn remains who is given freedom 
 * soln 
 * total number of person = n 
 * and a number k which indicateds that k-1 person are skipped and the kyth person is killed in a circle 
 * the task is to choose a perion in the iniotial circle that sirvives 
 * 
 * 
 */
package org.tnsif.dayforchallenge;
import java.util.Scanner;

public class CircleSurviveChallange {
	
	static int survive (int n ,int k )
	{
		if (n==1)
			return 1;
		else 
			return (survive(n-1,k)+k-1)%n+1;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cs = new Scanner (System.in);
		System.out.println("value of n and k");
		int n =cs.nextInt();
		int k =cs.nextInt();
		System.out.println(survive(n,k));
		

				
	}

}
