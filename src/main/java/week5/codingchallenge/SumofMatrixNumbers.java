package week5.codingchallenge;

public class SumofMatrixNumbers {

	public static void main(String[] args) {
		int num=1,lowerSum=0,upperSum=0;
		for (int i = 1; i <=4; i++) 
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(num+" ");

				if(((i+j)!= 5) && ((i+j)< 5) )
				{
					lowerSum =lowerSum+num;
				}
				if(((i+j)!= 5) && ((i+j)> 5))
				{
					upperSum =upperSum+num;
				}
				num++;
			}
			System.out.println(" ");
		}
		System.out.println("UpperDiagonalSum "+lowerSum);
		System.out.println("LowerDiagonalSum "+upperSum);
		if(lowerSum<upperSum)
		{
			int upperNum=1;
			for (int i = 1; i <=4; i++) 
			{
				for(int j=1;j<=4;j++)
				{
					if(((i+j)> 5))
					{
						System.out.print(upperNum+" ");
					}
					upperNum++;
				}
			}
		}
		if(lowerSum>upperSum)
		{
			int lowernum=1;
			for (int i = 1; i <=4; i++) 
			{
				for(int j=1;j<=4;j++)
				{
					if(((i+j)< 5))
					{
						System.out.print(lowernum+" ");
					}
					lowernum++;
				}
			}
		}
	}
}



