import java.util.*;
import java.io.*;

public class Animal
{
	private String name;
	private int legs;
	private static int no_of_animals;
	public Animal(String name,int legs)
	{
		this.name=name;
		this.legs=legs;
		no_of_animals++;
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter your choice\n 1.Create animal\n 2.Display total objects \n Other numbers to quit");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: System.out.println("Enter the animal name");
					String name=br.readLine();
					System.out.println("Enter the number of legs");
					int legs=Integer.parseInt(br.readLine());
					Animal a=new Animal(name,legs);
					break;
				case 2:	System.out.println("Total number of animals is "+Animal.no_of_animals);break;
				default: return;
			}
		}
	}
}
