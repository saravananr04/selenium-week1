package week1.day1;

public class student 
{
	public static void main(String[] args) 
	{
		
		student std = new student();
		System.out.println("Student Name:" + std.name);
		std.collegeName("lashmi ammal engeeneering college");
		std.collegeaddress("chennai");
		std.collegedept("BE");
		std.collegeName("Engeeneering college");

	}

	String name = "saravanan";
	int rollNo = 2345;
	
public void collegeName(String collegeName) 
{
	
	System.out.println("collegeName:" +collegeName);
	
}
public void collegeaddress(String address) 
{
	
	System.out.println("collegeaddress:" +address);
	
}
public void collegedept(String dept) 
{
	
	System.out.println("collegeaddress:" +dept);
	
}
	
}
