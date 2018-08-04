package week3.codingchallenges;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		
		int rowNum =0;
		int num =1;
		System.out.println("Enter the No of rows:");
		Scanner objScr =new Scanner(System.in);
		rowNum =objScr.nextInt();
		objScr.close();
		for (int i = 1;i<=rowNum;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num + " ");
				num =num+1;
			}
			System.out.println("");
		}

	}

}
