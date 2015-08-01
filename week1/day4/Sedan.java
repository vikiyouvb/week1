import java.util.*;

class Sedan extends Car
{
	private int length;
	public Sedan(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color);
		this.length=length;
	}
	public double getSalePrice()
	{
		double discount;
		if(this.length>20)
		{
			discount=5.0;
		}
		else
		{
			discount=10.0;
		}
		return super.getSalePrice()-super.getSalePrice()*discount/100;
	}
}
