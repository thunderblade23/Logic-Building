class CheckLargest
{
public 	static void main(String arg[])
	{
	int a = 12;
	int b = 45;
	int c = 22;
	int largest;

	if (a >= b && a >= c)
		{
		largest = a;
		}
	else if (b >= a && b >= c)
		{
		largest = b;
		}
	else
		{
		largest = c;
		}
	
	System.out.println("The largest number is " + largest);
	}
}