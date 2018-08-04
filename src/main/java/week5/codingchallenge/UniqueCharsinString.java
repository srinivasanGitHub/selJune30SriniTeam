package week5.codingchallenge;

import java.util.Scanner;



public class UniqueCharsinString {

	public static void main(String[] args) {

		Scanner objScr= new Scanner(System.in);
		System.out.println("Enter any string");
		String input= objScr.next();
		objScr.close();
		 char iCh='\u0000',jCh='\u0000';
		System.out.println(input.length());
		int count=0;

		for(int i=0;i<input.length();i++)
		{
			for(int j=input.length()-1;j>=i;j--)
			{
				iCh=input.charAt(i);
			    jCh=input.charAt(j);
			    //System.out.println(iCh);
			    //System.out.println(jCh);
				if(Character.toLowerCase(iCh) == Character.toLowerCase(jCh))
				{
					count++;
				}
				
			}
			if(count==1|| count==0)
			{
				System.out.print(iCh);
			}
			count=0;

		}
		
	}

}
