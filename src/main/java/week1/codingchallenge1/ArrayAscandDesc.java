package week1.codingchallenge1;

import java.util.*;

public class ArrayAscandDesc {

	public static void main(String[] args) {

		// Array Sorting Ascending and Descending 
		
		ArrayList<Integer> numArray =new ArrayList<Integer>(8);
		System.out.println("Enter the numbers to sort");

		Scanner objScr = new Scanner(System.in);
	
		for(int i=0;i<=7;i++)
		{
			numArray.add(objScr.nextInt());
		}
		objScr.close();
		System.out.println("Given numbers:\n" + numArray);

		System.out.println("Ascending Order:\n");
		Collections.sort(numArray);
		
		for(int n: numArray)
		{
			System.out.println(n);
		}
		
		System.out.println("Decending Order:\n");
		Collections.sort(numArray, Collections.reverseOrder());
		
		for(int n: numArray)
		{
			System.out.println(n);
		}


	}

}
