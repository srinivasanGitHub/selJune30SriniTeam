package week6.codingchalleges;

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
		String text1,text2;
		Scanner objScr1= new Scanner(System.in);
		Scanner objScr2= new Scanner(System.in);
		System.out.println("Enter first string");
		text1 = objScr1.nextLine();
		
		
		System.out.println("Enter second string");
		text2 = objScr2.nextLine();
		
		objScr1.close();
		objScr2.close();
		
		int len1= text1.length();
		
		
		text1= text1+text2;
		text2=text1.substring(0, len1);
		text1 =text1.substring(len1);
		System.out.println("first string: "+text1);
		System.out.println("second string: "+text2);

	}

}
