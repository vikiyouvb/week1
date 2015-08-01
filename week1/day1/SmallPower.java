import java.util.*;

public class SmallPower
{
	public static void smallpow(int base,int num)
	{
		int count=1;
		int temp=base;
		while(temp<=num)
		{
			temp*=temp;
			count++;
		}
		System.out.printf("Small power of %d larger than %d is %d\n",base,num,count);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the base and the number");
		int base=in.nextInt();
		int num=in.nextInt();
		smallpow(base,num);
	}
}
