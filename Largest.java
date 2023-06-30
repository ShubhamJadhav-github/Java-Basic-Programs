class Largest
{
	public static void main(String args[])
	{
		int a=10,b=30,c=30;
		if(a>b && a>c)
		{
			System.out.print("Largest = "+a);
		}
		else if (b>a && b>c)
		{
			System.out.print("Largest = "+b);
		}
		else if(c>b && c>b)
		{
			System.out.print("Largest = "+c);
		}
		else
		{
			System.out.print("Largest numbers are equal");
		}
	}
}
