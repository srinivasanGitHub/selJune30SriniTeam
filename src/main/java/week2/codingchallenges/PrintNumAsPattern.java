package week2.codingchallenges;

import java.util.*;

public class PrintNumAsPattern {

	public static void main(String[] args) {
		
		int startingNum=0,endingNum =0,i;
		
		Scanner objScr= new Scanner(System.in);
		
		System.out.println("Enter starting number");
		startingNum=objScr.nextInt();
		System.out.println("Enter ending number");
		endingNum=objScr.nextInt();
		objScr.close();
		for(i=startingNum;i<=endingNum;i++)
		{
			if(((i%3)==0) && ((i%5)==0))
			{
				System.out.print("FIZZBUZZ"+" ");
			}
			else if(((i%5)==0))
			{
				System.out.print("BUZZ"+" ");
			}
			else if ((i%3)==0)
			{
				System.out.print("FIZZ"+" ");
			}
			else
			{
				System.out.print(i+" ");
			}
		}
		

	}

}
