import java.util.*;

class FemaleEmployee extends Employee
{
	private static final int percent=7;
	public FemaleEmployee(String name,int age,double income)
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
		br.append("|[F] | [");
		br.append(calcTax());
		br.append("]");
		return br.toString();
	}
}
