import java.util.*;

public class MyOwnAutoShop
{
	public static void main(String args[])
	{
		Car s=new Sedan(180,2000000,"Blue",15);
		Car f=new Ford(150,1500000,"Black",2008,10000);
		Car c=new Car(100,700000,"Yellow");
		System.out.println("Sedan sale price = "+s.getSalePrice());
		System.out.println("Ford sale price = "+f.getSalePrice());
		System.out.println("Car sale price = "+c.getSalePrice());
	}
}
