package week4.codingchallenges;


 class VehicleClass {
	
	public  VehicleClass()
	{
		System.out.println("This is from VehicleClass Constructor and this is SuperClass ");
	}

}
 class CarClass extends VehicleClass {

	public CarClass()
	{
		System.out.println("This is from CarClass Constructor inherited from VehicleClass");
	}

}
public class AudiClass extends CarClass {

	public AudiClass()
	{
		System.out.println("This is from AudiClass Constructor inherited from CarClass");
		System.out.println("This is a example for multilevel inheritance ");
	}
	public static void main(String[] args) 
	{
		new AudiClass();
	}
}
