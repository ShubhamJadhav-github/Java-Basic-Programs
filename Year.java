class Year
{
	int yr;
	void accept(int x)
	{
		yr = x;
	}
	void calculate()
	{
		if(yr%4 == 0)
		{
			System.out.print("\n"+yr+" is a Leap year");
		}
		else
		{
			System.out.print("\n"+yr+" is not a Leap year");
		}
	}
	public static void main(String abc[])
	{
		Year y1 = new Year();
		Year y2 = new Year();
		y1.accept(100);
		y2.accept(400);
		y1.calculate();
		y2.calculate();
	}
}
