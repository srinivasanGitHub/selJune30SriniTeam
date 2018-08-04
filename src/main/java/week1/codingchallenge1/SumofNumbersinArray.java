package week1.codingchallenge1;

import java.util.Scanner;

public class SumofNumbersinArray {

	public static void main(String[] args) {
		
		int numberArray[] =new int[10];
		int sum=0;
		System.out.println("Enter any 10 numbers");
		Scanner objScr =new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			numberArray[i]= objScr.nextInt();
		}
		objScr.close();
		
		for(int i=0;i<10;i++)
		{
			sum= sum+ numberArray[i];
		}

		System.out.print("Sum Of Given numbers:" + sum);
	}

}
