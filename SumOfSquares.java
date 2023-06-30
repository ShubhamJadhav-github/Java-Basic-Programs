//Program to calculate the sum of square of all even numbers from 1 to n
class SumOfSquares
{
	int sum,num;
	void accept(int x)
	{
		num = x;
	}
	void calculate()
	{
		sum = 0;
		for(int i=2;i<=num;i=i+2)
		{
			sum = sum + (i*i);
		}
		System.out.print("Sum Of Squares of All Even numbers from 1 to "+num+" = "+sum);
	}
	public static void main(String args[])
	{
		SumOfSquares s = new SumOfSquares();
		s.accept(6);
		s.calculate();
	}
}
