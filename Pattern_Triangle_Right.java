import java.util.*;
class Pattern_Triangle_Right
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows;
		
		System.out.print("Enter number of rows: ");
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(j <= (rows-i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}
