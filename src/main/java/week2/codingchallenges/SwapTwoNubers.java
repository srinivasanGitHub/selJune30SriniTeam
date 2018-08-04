package week2.codingchallenges;

import java.util.Scanner;

public class SwapTwoNubers {

	public static void main(String[] args) {
		int num1=0,num2 =0;

		Scanner objScr= new Scanner(System.in);

		System.out.println("Enter first number");
		num1=objScr.nextInt();
		System.out.println("Enter second number");
		num2=objScr.nextInt();
		System.out.println("Before Swapping: FirstNum="+ num1 + " SecondNum="+ num2);
		num1= num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		objScr.close();
		System.out.println("After Swapping: FirstNum="+ num1 + " SecondNum="+ num2);
		
	}

}
