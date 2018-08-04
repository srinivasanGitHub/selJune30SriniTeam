package week1.day1.homework;

public class AccessingArithmeticOperations {

	public static void main(String[] args) {

		AritmaticOperations objAritmaticOperations =new AritmaticOperations();
		
		objAritmaticOperations.addition();
		System.out.println("Subtraction Result :" + objAritmaticOperations.subtract());
		System.out.println("Multiplication Result :" + objAritmaticOperations.multiply());
		objAritmaticOperations.multiplyNumberOneByTwo();
		System.out.println("Division Result :" + objAritmaticOperations.divideNumberTwo(5));


	}

}
