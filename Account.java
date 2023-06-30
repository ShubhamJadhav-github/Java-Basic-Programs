import java.util.*;
class Account
{
	String name;
	int acno;
	float balance;


	//Parameterized Constructor
	Account(String n, int a, float b)
	{
		name = n;
		acno = a;
		balance = b;
	}

	//Member Function
	void display()
	{
		System.out.print("\nName= "+name);
		System.out.print("\nAccount Number= "+acno);
		System.out.print("\nBalance= "+balance);
	}

	//Main Function
	public static void main(String args[])
	{
		String name;
		int acno;
		float balance;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name, Account Number and Balance for Account 1: ");
		name = sc.nextLine();
		acno = sc.nextInt();
		balance = sc.nextFloat();
		Account A1 = new Account(name,acno,balance);

		//To FlushOut Buffer
		sc.nextLine();

		System.out.print("Enter Name, Account Number and Balance for Account 2: ");
		name = sc.nextLine();
		acno = sc.nextInt();
		balance = sc.nextFloat();
		Account A2 = new Account(name,acno,balance);

		System.out.print("\n\nAccount-1");
		A1.display();
		System.out.print("\n\nAccount-2");
		A2.display();
	}
}
