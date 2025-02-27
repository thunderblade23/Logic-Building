class Prime
{
public static void main (String args[])
	{
	int a = 17;
	boolean isPrime = true;
	
	for (int i = 2; i <= a / 2; i++) 
		{
           	 if (a % i == 0) 
			{
                	isPrime = false;
                break;
            	}
        }
        
        if (isPrime && a > 1) 
		{
            	System.out.println("The number " + a + " is Prime.");
       		 } 
	else 
		{
            	System.out.println("The number " + a + " is not Prime.");
       		}
	}
}