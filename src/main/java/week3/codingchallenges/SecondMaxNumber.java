package week3.codingchallenges;

public class SecondMaxNumber {

	public static void main(String[] args) 
	{
		int []numArray = {-21,-340,-15,-879,-92,-25,-474,-47,-200};
		int firstMax=Integer.MAX_VALUE,secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<=numArray.length-1;i++)
		{
			if(numArray[i] > firstMax )
			{	
				secondMax = firstMax;			
				firstMax =numArray[i];
				
			}
			else if(numArray[i]!= firstMax && secondMax < numArray[i]  )
			{
				secondMax = numArray[i];
			}
		}
		System.out.println(secondMax);
		}

}
//System.out.println(java.time.LocalTime.now().toString().replace(":","_").replace(".","_"));
