package week1.codingchallenge1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int firstNumber =0,secondNumber=0;
		
		Scanner objScr = new Scanner(System.in);
		
	 System.out.println("Enter number to print multipliaton table:\n");
	 firstNumber =objScr.nextInt();	
	 System.out.println("Enter number for nth number of the multiplication table:\n");
	 secondNumber =objScr.nextInt();	
	 System.out.println("The Multiplication Table for number "+ firstNumber +" is:\n");
		objScr.close();
	 for(int i=1;i <= secondNumber;i++) 
	 {
		 System.out.println(i+" * "+ firstNumber+" = "+ i*firstNumber);
	 }
	}

}
