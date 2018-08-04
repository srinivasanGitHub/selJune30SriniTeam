package week1.day1.homework;

public class OddorEven {

	public static void main(String[] args) {


		int number = 923;

		if (number%2 == 0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}

		System.out.println("Prime Numbers are..");
		int count=0;
		for(int i = 1; i<= 100;i++)
		{
			for (int j=1;j<=i;j++)
			{
				if(i%j == 0)
				{
					count = count+1;
				}
			}
			if (count <= 2)
			{
				System.out.println(i);
			}

			count=0;
		}



	}

}
