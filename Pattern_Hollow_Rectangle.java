import java.util.*;
class Pattern_Hollow_Rectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int cols, rows;
		
		System.out.print("Enter number of rows: ");
		rows = sc.nextInt();
		
		System.out.print("Enter number of cols: ");
		cols = sc.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if(i==1 || j==1 || i==rows || j==cols)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
