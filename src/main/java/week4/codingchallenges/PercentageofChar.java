package week4.codingchallenges;

import java.util.Scanner;

public class PercentageofChar {

	public static void main(String[] args) {

		String givenInput;
		double upperCaseCount=0,lowerCaseCount=0,digitsCount=0,otherCount=0;

		System.out.println("Enter any string with special char,numbers and letters");
		Scanner objScr = new Scanner(System.in);
		givenInput = objScr.nextLine();
		objScr.close();
		char ch;

		for(int i =0;i<=givenInput.length()-1;i++)
		{
			ch= givenInput.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				
				if(Character.isUpperCase(ch))
				{
					upperCaseCount ++;
				}else if(Character.isLowerCase(ch))
				{
					lowerCaseCount++;
				}
			}
			else if(Character.isDigit(ch))
			{
				digitsCount++;
			}else if(!Character.isLetterOrDigit(ch))
			{
				otherCount++;
			}
		}
		
		int totalLength = givenInput.length();
		System.out.println(totalLength);
		System.out.println("Number of UpperCase Letters is "+ upperCaseCount +
				" and Percentage is "+ Math.round((upperCaseCount/totalLength)*100)+"%");
		
		System.out.println("Number of LowerCase Letters is "+ lowerCaseCount +
				" and Percentage is "+ Math.round((lowerCaseCount/totalLength)*100)+"%");
		
		System.out.println("Number of Digits Letters is "+ digitsCount +
				" and Percentage is "+ Math.round((digitsCount/totalLength)*100)+"%");
		
		System.out.println("Number of OtherCase Letters is "+ otherCount +
				" and Percentage is "+ Math.round((otherCount/totalLength)*100)+"%");

	}
	
	

}
