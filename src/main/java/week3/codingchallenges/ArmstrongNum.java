package week3.codingchallenges;

public class ArmstrongNum {

	public static void main(String[] args) 
	{
		
		
		for (int i = 100;i<=1000;i++)
		{
			int num =i;
			int armSum =0;
			
			while (num!=0)
			{
				int remainder = num%10;
				armSum = armSum + (remainder * remainder* remainder);
				num = num/10;
			}
			if(armSum == i)
			{
				System.out.println(i + " is the ArmStrong Number");
			}
		}

	}

}
