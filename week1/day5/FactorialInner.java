import java.util.*;
import java.io.*;

public class FactorialInner implements Iterable<Integer>
{
	private int lowerLimit;
	private int upperLimit;
	public FactorialInner(int lowerLimit,int upperLimit)
	{
		this.lowerLimit=lowerLimit;
		this.upperLimit=upperLimit;
	}
	private class FactorialIterator implements Iterator<Integer>
	{
		private int lower=lowerLimit;
		private int upper=upperLimit;
		private int curfact=lower;
		public boolean hasNext()
		{
			return lower<=upper;
		}
		public Integer next()
		{
			int temp=curfact;
			lower++;
			curfact*=lower;
			return temp;
		}
		public void remove()
		{
		
		}
	}
	public Iterator<Integer> iterator()
	{
		return new FactorialIterator();
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lower limit");
		int lower=Integer.parseInt(br.readLine());
		System.out.println("Enter the upper limit");
		int higher=Integer.parseInt(br.readLine());
		System.out.printf("Factorial from %d to %d is\n",lower,higher);
		FactorialInner f=new FactorialInner(lower,higher);
		for(Integer i:f)
		{
			System.out.println(i);
		}
	}
}
