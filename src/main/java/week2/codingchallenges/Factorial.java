package week2.codingchallenges;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		int num=0,fact=1;
		
		System.out.println("Enter the number to find factorial:\n");
		
		Scanner objScr = new Scanner(System.in);
		num= objScr.nextInt();
		objScr.close();
		for(int i=1;i<=num;i++)
		{
			
			fact = fact*i;
		}
		System.out.println("Factorial of "+ num +" is = "+fact);
	}

}
