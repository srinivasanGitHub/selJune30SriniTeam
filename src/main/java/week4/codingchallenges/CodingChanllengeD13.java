package week4.codingchallenges;


import java.util.Scanner;

public class CodingChanllengeD13 {

	public static void main(String[] args) {
		int inputOne =0,inputTwo=0;
		boolean isValidNum =false;
		Scanner objScr =new Scanner(System.in);
		System.out.println("Enter first number");
		inputOne =objScr.nextInt();

		System.out.println("Enter a single digit");
		inputTwo =objScr.nextInt();
		objScr.close();

		for(int i=inputOne-1;i>=0;i--)
		{
			int currentNum =i;
			int num =i;
			isValidNum =true;
			while(num != 0)
			{	int remainder = num%10;
					if (remainder == inputTwo)
					{
						isValidNum =false;
						num = num/10;
						break;
					}
					else
					{
						num = num/10;
					}
					
			}
			
			if(isValidNum)
			{
				System.out.println("LargestNumber which is not has givendigit is= "+currentNum);
				return;
			}
			
		}
	}

}
