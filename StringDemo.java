class StringDemo
{
	//Static Data Members (By using Static Keyword, we allow the access of that DataMembers through main function
	static char ch[]={'a','b','c','d','\0'};
	static String st= "ABC";
	static byte arr[]={65,66,67,68,69,70};

	//Main Function
	public static void main(String args[])
	{

		//Strings In Java
		//To store multiple characters we can use array of characters 
		//Also there is an another way to handle with the set of characters And that way is using a String class
		//String classes can be used with the help of 2 methods
		//1. By using Literals
		String str1= "This is First String Created by using Literals";
		System.out.println("str1 = "+str1);

		//2. By using new keyword
		String str2;
		str2 = new String("This is Second String Created by using new keyword");
		System.out.println("str2 = "+str2);

		//There Are 2 ways to create string objects as follows:
		
		//(A) By Using Default Constructor for String Class
			String s1 = new String();	//s1 is a null string
			System.out.println("S1 = "+s1);	//Prints Null String

		//(B) By Using Parameterized Constructors for String Class
			//(i) String str = new String(char args[])
			String s2 = new String(ch);
			System.out.println("S2 = "+s2);

			//(ii) String str = new String(char args[], int StartIndex, int NumberofCharacters);
			String s3 = new String(ch, 1, 3);
			System.out.println("S3 = "+s3);

			//(iii) String str = new String(String st);
			String s4 = new String(st);
			System.out.println("S4 = "+s4);

			//(iv) String str = new String(byte args[]);
			String s5 = new String(arr);
			System.out.println("S5 = "+s5);

			//(v) String str = new String(byte args[], int StartIndex, int NumberofCharacters);
			String s6 = new String(arr, 1, 4);
			System.out.print("S6 = "+s6);
	}
}
