package week1.day1;

class CatClass
{
	void cat()
	{
		System.out.println("constructor for cat class\n");
	}
	void sound()
	{
		System.out.println("cats mew\n"); 
	}
}

class TigerClass
{
	void tiger()
	{
		System.out.println("constructor for Tiger class\n");
	}
	void roar()
	{
		System.out.println("Tiger Roar\n");
	}


}

public class ConstructorExample
{
	public static void main(String[] args)
	{
		CatClass cc= new CatClass();
		TigerClass tc =new TigerClass();
		cc.sound();
		tc.roar();
	}
}
