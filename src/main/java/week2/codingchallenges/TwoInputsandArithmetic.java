package week2.codingchallenges;

import java.util.*;

public class TwoInputsandArithmetic {

	public static void main(String[] args) {
		int num1=0,num2 =0;
		String arithOperation;

		System.out.println("Enter any two numbers and tell which arithmetic operation should perform:");
		System.out.println(" Addition,\n Subtraction,\n Multiplication,\n Division\n");

		Scanner objScr = new Scanner(System.in);
		num1 = objScr.nextInt();
		num2 =objScr.nextInt();
		arithOperation =objScr.next();
		objScr.close();
		//String upperOperation =arithOperation.toUpperCase();

		switch(arithOperation.toUpperCase())
		{
		case"ADDITION":
			int addResult =num1+num2;
			System.out.println("Additon : "+ addResult);
			break;
		case"SUBTRACTION":
			int subResult =num1-num2;
			System.out.println("Subtraction : "+ subResult);
			break;
		case"MULTIPLICATION":
			System.out.println("Multiplication : "+ num1 * num2);
			break;
		case"DIVISION":
			System.out.println("Division : "+ num1 / num2);	
			break;
		 default:
		System.out.println("Enter valid values");
				
		}

	}

}
