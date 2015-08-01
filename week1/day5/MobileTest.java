import java.util.*;

public class MobileTest
{
	public static void main(String args[])
	{
		Mobile samsung=new Mobile(){
			public void remainingCharge()
			{
				Random r=new Random();
				System.out.println("Remaining charge = "+(r.nextInt(99)+1));
			}
			public void name()
			{
				System.out.println("Samsung");
			}
		};
		Mobile apple=new Mobile(){
			public void remainingCharge()
			{
				Random r=new Random();
				System.out.println("Remaining charge = "+(r.nextInt(99)+1));
			}					
			public void name()
			{
				System.out.println("Apple");
			}
		};
		samsung.name();
		samsung.remainingCharge();
		apple.name();
		apple.remainingCharge();
	}
}
