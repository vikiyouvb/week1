import java.util.*;


/* Print the pattern for the given value of n
Ex: n=4
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
*/

public class PrintPattern
{
	/* Adds spaces
		Ex .sp.sp.sp.sp.sp.sp.1*/
	public static void printSpace(int n)
	{
		while(n>0)
		{
			System.out.print("  ");
			n--;
		}
	}
	/* Prints the reverse of the sequence
		Ex n=3
		3 2 1*/

	public static void printRev(int n)
	{
		while(n>0)
		{
			System.out.printf("%d ",n);
			n--;
		}
	}
	
	//Prints the complete pattern
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			printSpace(n-i);
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%d ",j);
			}
			printRev(i-1);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
		printPattern(n);
	}
}
