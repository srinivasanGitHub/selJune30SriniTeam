package week5.codingchallenge;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DigitsinAscWithOutDups {

	public static void main(String[] args) {
		ArrayList<Integer> numArray =new ArrayList<Integer>();
		Scanner objScr= new Scanner(System.in);
		System.out.println("Enter any numbers");
		int inputNum= objScr.nextInt();
		objScr.close();
		int  temp;
	
		
		while(inputNum>0)
		{
			temp=inputNum%10;
			if(!numArray.contains(temp))
			{
			numArray.add(temp);
			}
			inputNum = inputNum/10;
					
		}
		Collections.sort(numArray);
		for (int n : numArray) {
			System.out.print(n);
		}

	}

}
