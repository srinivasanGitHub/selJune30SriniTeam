package week4.codingchallenges;

public class SumofMultiplies {

	public static void main(String[] args) 
	{
	
	int sum=0;
	 for(int i = 1;i < 100;i++)
	 {
		 if(i%3==0 || i%5==0)
		 {
			 System.out.println(i);
			 sum=sum+i;
		 }
	 }
	 System.out.println("Sum of multiples of 3 or 5 for the given number :" +sum );

	}

}
