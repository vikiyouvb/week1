import java.util.*;

public class Subject
{
	private String[] subjects;
	private float[] marks;
	public Subject()
	{
		subjects=new String[3];
		marks=new float[3];
	}
	public void setSubject1(String name)
	{
		subjects[0]=name;
	}
	public void setSubject2(String name)
	{
		subjects[1]=name;
	}
	public void setSubject3(String name)
	{
		subjects[2]=name;
	}
	public void setMark1(float mark)
	{
		marks[0]=mark;
	}
	public void setMark2(float mark)
	{
		marks[1]=mark;
	}
	public void setMark3(float mark)
	{
		marks[2]=mark;
	}
	public String[] getSubjects()
	{
		return subjects;
	}
	public float[] getMarks()
	{
		return marks;
	}
}
