package week3.codingchallenges;

import java.util.Scanner;

public class LeapYearorNot {

	public static void main(String[] args) {

		int givenYear =0;

		System.out.println("Enter the year to check LeapYear or not...");
		Scanner objScr =new Scanner(System.in);
		givenYear = objScr.nextInt();
		objScr.close();
		if ((givenYear % 400)==0)
		{
			System.out.println(givenYear +" is LeapYear");

		}else if ((givenYear % 4)==0 && (givenYear % 400)==0)
		{
			System.out.println(givenYear +" is LeapYear");
		}
		else
		{
			System.out.println(givenYear +" is not LeapYear");
		}
	}

}
