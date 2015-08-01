import java.io.*;
import java.util.*;

public class StudentDemo
{
	public static void storeStudentData(Student st) throws Exception
	{
		Subject s=new Subject();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter subject1 name");
		s.setSubject1(br.readLine());
		System.out.println("Enter mark1");
		s.setMark1(Float.parseFloat(br.readLine()));
		System.out.println("Enter subject2 name");
		s.setSubject2(br.readLine());
		System.out.println("Enter mark2");
		s.setMark2(Float.parseFloat(br.readLine()));
		System.out.println("Enter subject3 name");
		s.setSubject3(br.readLine());
		System.out.println("Enter mark3");
		s.setMark3(Float.parseFloat(br.readLine()));
		st.setSubjects(s);
	}
	public static void main(String args[]) throws Exception
	{
		StudentDemo sd=new StudentDemo();
		Student s=new Student();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter student id");
		s.setStudentId(Integer.parseInt(br.readLine()));
		System.out.println("Enter student name");
		s.setStudentName(br.readLine());
		System.out.println("Enter M for male and F for female");
		String gender=br.readLine();
		if(gender.equals("M"))
		{
			s.setGender(true);
		}
		else
		{
			s.setGender(false);
		}
		sd.storeStudentData(s);
		ResultGenerator.generateResult(s);
	}
}
