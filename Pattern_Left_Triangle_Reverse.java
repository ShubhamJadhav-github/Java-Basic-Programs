import java.util.*;
class Pattern_Left_Triangle_Reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows;
		
		System.out.print("Enter number of rows: ");
		rows = sc.nextInt();
		
		for(int i=rows; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
