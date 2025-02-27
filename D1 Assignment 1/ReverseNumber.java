public class ReverseNumber 
{
public static void main(String[] args) 
	{

        int number = 12345; // The number to reverse (you can change this)
        int reversedNumber = 0;

        while (number != 0) 
		{
            	int lastDigit = number % 10;
            	reversedNumber = reversedNumber * 10 + lastDigit;
            	number = number / 10;
        	}

        System.out.println("Reversed Number of 12345 is " + reversedNumber);
    	}
}