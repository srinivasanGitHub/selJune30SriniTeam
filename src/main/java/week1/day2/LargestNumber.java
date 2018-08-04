package week1.day2;

public class LargestNumber {

	public static void main(String[] args) {
		int[] numbers = {22,32,42,62,9};
		int maxNumber=0;
		int largest =0;
		for(int i =0;i<numbers.length;i++)
		{
			if(maxNumber > numbers[i])
			{
				largest= numbers[i];
				maxNumber=largest;
			}
			else
			{
				maxNumber=numbers[i];
			}
			if(maxNumber > largest)
			{
				largest=maxNumber;
			}

		}
		System.out.println("Largest Value using ForLoop: "+ largest);


		for(int i :numbers)
		{
			if(maxNumber < i)
			{
				largest= i;
				maxNumber=largest;
			}
		}
		System.out.println("Largest Value using ForEach: "+ largest);
	}

}
