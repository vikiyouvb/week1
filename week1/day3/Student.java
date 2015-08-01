import java.util.*;

class Student
{
	private int studentId;
	private String studentName;
	private boolean gender;
	private Subject subjects;
	
	//Setters
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public void setGender(boolean gender)

	{
		this.gender=gender;
	}
	public void setSubjects(Subject s)
	{
		this.subjects=s;
	}
	//getter
	public int getStudentId()
	{
		return this.studentId;
	}
	public String getStudentName()
	{
		return this.studentName;
	}
	public boolean getGender()
	{
		return this.gender;
	}
	public Subject getSubjects()
	{
		return this.subjects;
	}
}
