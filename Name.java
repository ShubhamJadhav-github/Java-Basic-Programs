import java.util.*;
class Name
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your First Name: ");
		String FisrtName = sc.nextLine();

		System.out.print("Enter Your Middle Name: ");
		String MiddleName = sc.nextLine();

		System.out.print("Enter Your Last Name: ");
		String LastName = sc.nextLine();

		String FullName = FisrtName + MiddleName + LastName;
		System.out.print("FullName = "+FullName);
	}
}
