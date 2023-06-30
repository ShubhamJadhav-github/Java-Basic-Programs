import java.util.*;
class Employee
{
	String name;
	int id;
	float salary;

	//Parameterized Constructor
	Employee(String n, int i, float s)
	{
		name = n;
		id = i;
		salary = s;
	}

	//Member Function
	void display()
	{
		System.out.print("\nName = "+name);
		System.out.print("\nId = "+id);
		System.out.print("\nSalary = "+salary);
	}

	//Main Function
	public static void main(String args[])
	{
		String name;
		int id;
		float salary;

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Name, Id and Salary for Employee-1: ");
		name = sc.nextLine();
		id = sc.nextInt();
		salary = sc.nextFloat();
		Employee E1 = new Employee(name,id,salary);

		//To Clear Buffer
		sc.nextLine();

		System.out.print("\nEnter Name, Id and Salary for Employee-2: ");
		name = sc.nextLine();
		id = sc.nextInt();
		salary = sc.nextFloat();
		Employee E2 = new Employee(name,id,salary);

		System.out.print("\n\nEmployee-1");
		E1.display();
		System.out.print("\n\nEmployee-2");
		E2.display();
	}
}
