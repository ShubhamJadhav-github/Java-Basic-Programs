import java.util.*;
class Pattern_Triangle_Numbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows;
		
		System.out.print("Enter number of rows: ");
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
