import java.util.*;
class Student
{
	//Data Members
	String sname;
	int rollno;
	long contact;

	Scanner sc = new Scanner(System.in);

	//Constructor
	Student()
	{
		System.out.print("Enter Student Name: ");
		sname = sc.nextLine();
		System.out.print("Enter Student RollNo: ");
		rollno = sc.nextInt();
		System.out.print("Enter Student Contact: ");
		contact = sc.nextLong();
	}

	//Member Function
	void Display()
	{
		System.out.println("\n\nStudent Name: "+sname);
		System.out.println("Roll Number: "+rollno);
		System.out.print("Contact :"+contact);
	}
}
class Program
{
	public static void main(String args[])
	{
		Student st[] = new Student[5];

		//Constructing 5 objcts
		for(int i=0;i<5;i++)
		{
			st[i] = new Student();
		}

		//Displaying 5 objects
		for(int i=0;i<5;i++)
		{
			st[i].Display();
		}
	}
}
