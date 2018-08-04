package week1.codingchallenge1;

import java.util.Scanner;

public class SecondSmallestNum {

	
	public static void main(String[] args) {

		int numberArray[] =new int[3];
		int smallest =0,secondSmallest=0;
		System.out.println("Enter first number:");
		Scanner objScr =new Scanner(System.in);
		numberArray[0]= objScr.nextInt();

		System.out.println(" \nEnter Second number:");
		numberArray[1]= objScr.nextInt();

		System.out.println("\nEnter Third number:");
		numberArray[2]= objScr.nextInt();
		objScr.close();
		for(int i=0;i<=2;i++)
		{
			if(numberArray[i] > smallest)
			{
				secondSmallest=smallest;
				smallest =numberArray[i];
			}
			else if(secondSmallest < numberArray[i])
				{
					secondSmallest=numberArray[i];
				}

		}
		System.out.println(secondSmallest);
	}
}

