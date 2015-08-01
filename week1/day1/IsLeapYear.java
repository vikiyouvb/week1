import java.util.*;

public class IsLeapYear
{
	public static boolean isLeapYear(int year)
	{
		if((year%4==0 && year%100!=0) || year%400==0))
		{
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int year=in.nextInt();
		if(isLeapYear(year))
		{
			System.out.printf("%d is Leap year\n",year);
		}
		else
		{
			System.out.printf("%d is not a Leap year\n",year);
		}
	}
}

