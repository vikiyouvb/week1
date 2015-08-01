import java.util.*;

class MaleEmployee extends Employee
{
	private static final int percent=10;
	public MaleEmployee(String name,int age,double income)
	{
		super(name,age,income);
	}
	public double calcTax()
	{
		return super.getIncome()*percent/100;
	}
	public String toString()
	{
		StringBuilder br=new StringBuilder();
		br.append(super.toString());
		br.append("|[M] | [");
		br.append(calcTax());
		br.append("]");		
		return br.toString();
	}
}
