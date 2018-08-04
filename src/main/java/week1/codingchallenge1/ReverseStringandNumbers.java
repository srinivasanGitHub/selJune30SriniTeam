package week1.codingchallenge1;

import java.util.Scanner;

public class ReverseStringandNumbers {

	public  static int revDigit;
	public static String revStr="";
	public static void main(String[] args) {
		// Reverse numbers
		int number=0;


		Scanner objScr = new Scanner(System.in);

		System.out.println("Enter the number to be reversed:\n");
		number = objScr.nextInt();
		System.out.println("Reversed Number:\n");
		System.out.println(reverseNumber(number));


		// Reverse String value
		String strValue="";

		StringBuffer strBuff =new StringBuffer();
		System.out.println("Enter the word to be reversed:\n");
		strValue = objScr.next();

		strBuff.append(strValue);
		System.out.println("Reversed Word:\n");
		System.out.println(strBuff.reverse());
		objScr.close();
	}

	public static int reverseNumber(int num)
	{
		if(num!=0)
		{			
			int revNum  = num %10;
			revDigit=(revDigit *10)+revNum;
			reverseNumber(num /10);			
		}
		return revDigit;
	}
	
	public static String reverseString(String strValue)
	{
		int strLen = strValue.length();
		while(strLen!= 0)
		{			
			//revStr.valueOf(i)
			reverseString(revStr);
						
		}
		return revStr;
	}
}
