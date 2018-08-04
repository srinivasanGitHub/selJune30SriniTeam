package week1.day1.homework;

public class AritmaticOperations 
{
	int numberOne = 25;
	int numberTwo = 20;

	public void addition()
	{
		System.out.println("Addition Result :"+ (numberOne + numberTwo));
	}

	public int subtract()
	{
		int subtractresult = numberOne - numberTwo;
		return subtractresult;
	}
	public int multiply()
	{
		int multiplyresult = numberOne * numberTwo;
		return multiplyresult;
	}
	public void multiplyNumberOneByTwo()
	{
		System.out.println("MultiplyNumberOneByTwo Result :" + numberOne *2);
	}
	public int divideNumberTwo(int divident)
	{
		int dividentresult = numberTwo / divident;
		return dividentresult;
	}


}
