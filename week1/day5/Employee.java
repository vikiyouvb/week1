import java.util.*;

class EmpSortByName implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}
class EmpSortBySalary implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		if(e1.getSalary()<e2.getSalary())
		{
			return -1;
		}
		else if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
class EmpSortByAge implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		if(e1.getAge()<e2.getAge())
		{
			return -1;
		}
		else if(e1.getAge()>e2.getAge())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
public class Employee
{
	private String name;
	private double salary;
	private int age;
	public Employee(String name,double salary,int age)
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	public String getName()
	{
		return this.name;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public int getAge()
	{
		return this.age;
	}
	public String toString()
	{
		return String.format("%s %f %d",this.name,this.salary,this.age);
	}
	public static void display(Employee e[])
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Employee e1=new Employee("Vignesh",35000,21);
		Employee e2=new Employee("Ram",50000,22);
		Employee e[]=new Employee[2];
		e[0]=e1;
		e[1]=e2;
		System.out.println("Sorting employee by name");
		Arrays.sort(e,new EmpSortByName());
		display(e);
		System.out.println("Sorting employee by salary");
		Arrays.sort(e,new EmpSortBySalary());
		display(e);
		System.out.println("Sorting employee by age");
		Arrays.sort(e,new Comparator<Employee>(){
			public int compare(Employee e1,Employee e2)
			{
				if(e1.getAge()<e2.getAge())
				{
					return -1;
				}
				else if(e1.getAge()>e2.getAge())
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
               });
		display(e);
	}
}
