import java.util.*;
import java.io.*;

public class EmployeeTest
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee name");
		String name=br.readLine();
		System.out.println("Enter employee gender");
		String gender=br.readLine();
		System.out.println("Enter employee age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter employee income");
		double income=Double.parseDouble(br.readLine());
		if(gender.equals("M"))
		{
			System.out.println(new MaleEmployee(name,age,income));
		}
		else
		{
			System.out.println(new FemaleEmployee(name,age,income));
		}
	}
}
