class Factorial
{
public static void main(String args[])
	{
	int a = 5;
	long factorial = 1;
	for (int i = 1; i <= a; i++) 
		{
                factorial *= i;
		}
	System.out.println("The factorial of " + a + " is " + factorial + ".");
	}
}