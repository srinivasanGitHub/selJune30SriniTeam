package week2.codingchallenges;
import java.util.Scanner;

public class PrimeNumbers {

	int number;
	int reminder;
	boolean isPrime=true;
	public static int primeArr[]= new int[100];
	public static int n=0, j=0;
	String s = null;

	public void countInput()
	{
		System.out.println("Please type the count of prime numbers required : \n");
		Scanner scr = new Scanner(System.in);
		number = scr.nextInt();
		scr.close();
	}



	public void primeNumber()
	{
		for(int i=2;i<=number;i++)
		{
			reminder=number%i;

			if(reminder==0)
			{
				primeArr[j]= i;
				j++;

			}
		}

	}

	public static void main(String[] args) 
	{


		PrimeNumbers PN = new PrimeNumbers();
		PN.countInput();
		PN.primeNumber();
		for(j=0;j<=primeArr.length-1;j++)
		{
			if(primeArr[j]!= 0)
			{
				System.out.println(primeArr[j]);
			}
		}


	}

}
