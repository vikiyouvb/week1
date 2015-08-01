import java.util.*;
import java.io.*;

class ResultGenerator
{
	public static void generateResult(Student s)
	{
		System.out.println("Report Card");
		System.out.println("-----------");
		System.out.printf("Student Id=%d\n",s.getStudentId());
		System.out.printf("Student Name=%s\n",s.getStudentName());
		System.out.printf("Subject Name \t\t Marks\n");
		Subject t=s.getSubjects();
		String subjects[]=t.getSubjects();
		float marks[]=t.getMarks();
		float total=0;
		for(int i=0;i<subjects.length;i++)
		{
			System.out.printf("%s\t\t%f\n",subjects[i],marks[i]);
			total+=marks[i];
		}
		System.out.printf("Total marks=%f\n",total);
		System.out.printf("Avg marks=%.2f\n",total/3.0);
	}	
}
