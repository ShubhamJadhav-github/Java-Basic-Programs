import java.util.*;
class rectangle
{
	//Private Data Members
	private int length, breadth, area, rectno;

	//Static Data Member
	static int temp=0;

	//Creating Object for Public class Scanner
	Scanner sc = new Scanner(System.in);

	//Constructor to initialize Data Members length and breadth
	rectangle()
	{
		temp++;
		rectno=temp;

		System.out.print("\nRectangle- "+rectno);
		System.out.print("\nEnter Length: ");
		length = sc.nextInt();
		System.out.print("Enter Breadth: ");
		breadth = sc.nextInt();
	}

	//Member Function (Private i.e. accessible from this class only)
	private void display()
	{
		System.out.print("\n\nRectangle- "+rectno);
		System.out.print("\nLength = "+length);
		System.out.print("\nBreadth = "+breadth);
		System.out.print("\nArea = "+area);
	}

	//Member Function (Accessible form any class)
	void calculate()
	{
		area = length*breadth;
		display();
	}
}

class ScopeDemo
{
	//Main Function
	public static void main(String args[])
	{
		rectangle r1,r2,r3;
		r1 = new rectangle();
		r2 = new rectangle();
		r3 = new rectangle();

		//r3.length = 20;	//This will give an error because data members of class rectangle are private

		r1.calculate();
		r2.calculate();
		r3.calculate();
	}
}
