package week3.codingchallenges;

public class DuplicateNumbersinArray {

	public static void main(String[] args) {
		int numArray[]  = {13,65,15,67,88,65,13,99,67,13,65,87,13};
		int dupArray[] = new int[numArray.length];
		int count =0,temp;
		boolean duplicate =false;
		for (int i =0;i<=numArray.length-1;i++)
		{		
			for (int d =0; d<= dupArray.length-1;d++)
			{
				if (numArray[i] == dupArray[d])
				{
					duplicate = true;
				}
			}
			if(duplicate ==false)
			{
				temp = numArray[i];
				for(int j = numArray.length - 1;j>i;j--)
				{
					if (temp == numArray[j] && (i !=j))
					{
						count++;
					}
				}
				if (count >= 1)
				{
					dupArray[i] =numArray[i];
					System.out.println(numArray[i]+ " is Repeated in "+ count+ " times. ");
				}
				count=0;

			}
			duplicate=false;
		}


	}

}
