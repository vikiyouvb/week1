import java.util.*;

class Truck extends Car
{
	private int weight;
	public Truck(int speed,double regularPrice,String color,int weight)
	{
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	public double getSalePrice()
	{
		double discount;
		if(this.weight>2000)
		{
			discount=10.0;
		}
		else
		{
			discount=20.0;
		}
		return super.getSalePrice()-super.getSalePrice()*discount/100;
	}
}
