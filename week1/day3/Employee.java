import java.util.*;

class Employee
{
	private String name;
	private int age;
	private double income;
	public Employee(String name,int age,double income)
	{
		this.name=name;
		this.age=age;
		this.income=income;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public double getIncome()
	{
		return this.income;
	}
	public void setName(String name)
	{
		this.name=name;
	}	
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setIncome(double income)
	{
		this.income=income;
	}
}
