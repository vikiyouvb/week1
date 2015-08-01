import java.util.*;

public class TestClass
{
	private ArrayList<Animal> animals;
	public TestClass()
	{
		animals=new ArrayList<Animal>();
	}
	public void addAnimal(Animal s)
	{
		this.animals.add(s);
	}
	public void displayAnimals()
	{
		for(Animal a:animals)
		{
			System.out.println(a);
		}		
	}
	public void displayFly()
	{
		for(Animal a:animals)
		{
			if(a instanceof Fly)
			{
				System.out.println(a);
			}
		}
	}
	public void displayHerbivores()
	{
		for(Animal a:animals)
		{
			if(a instanceof Herbivores)
			{
				System.out.println(a);
			}
		}
	}
	public static void main(String args[])	
	{
		Bat b=new Bat();
		Dog d=new Dog();
		Cow c=new Cow();
		Ostrich o=new Ostrich();
		Parrot p=new Parrot();
		TestClass t=new TestClass();
		t.addAnimal(b);
		t.addAnimal(d);
		t.addAnimal(c);
		t.addAnimal(o);
		t.addAnimal(p);
		System.out.println("All animals");
		t.displayAnimals();
		System.out.println();
		System.out.println("All herbivores");
		t.displayHerbivores();
		System.out.println();
		System.out.println("All animals that fly");
		t.displayFly();
	}
}
