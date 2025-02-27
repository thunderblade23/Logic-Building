// Snippet 1

// Given Code
/*
public class Main { 
    public void main(String[] args) {
        System.out.println("Hello, World!"); 
    } 
}
*/

// Error - Main method in class Main is not static. We have to define it as "public static void main".

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 2

// Given Code
/*
public class Main { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
*/

// Error - The issue with the code is that the main method is missing the "public" access modifier.

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

//Snippet 3

// Given Code
/*
public class Main { 
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    } 
}
*/

// Error - The main method must have a void return type, but here it is declared as int.

// Reason - Since the JVM expects void, it fails to recognize the method as the entry point and throws an error.

/* Why is void used in the main method? 
   "void" means that "main" does not return any value.
*/

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

//Snippet 4

// Given Code
/*
public class Main { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
}
*/

// Error - Main method not found in class Main. 

// Reason - The main method is missing the "String[] args" parameter. Since the JVM cannot find a valid main method, the program fails to run.

/* Why is String[] args needed?
   "String[] args" allows the program to accept inputs from the command line when executed.
*/

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 5

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
}
*/

// As there was no error in the CMD during compilation it is fair to say that there can be multiple main methods given that during the entry of the program Main method is defined with proper syntax.

// Observation - The progrma outputs "Main method with String[] args".

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 6

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
}
*/

// Error - Cannot find variable "y". 

// Reason - Data type of variable "y" is not declared as well as there is no value assigned to it.

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        int y = 5;
	int x = y + 10; 
        System.out.println(x); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

//Snippet 7

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int x = "Hello"; 
        System.out.println(x); 
    } 
}
*/

// Error - Interger "x" is decalred as a String "Hello".

//Types Safety is enfored by Java because to prevent errors before runtime to reduce chances of logical errors, bugs which become difficult to find after and making the intentions of code clear for ease of understanding.

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 8

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!" 
    } 
}
*/

// Error - The parenthesis ")" is missing for SOP, also the statement terminator ";" is missing. This causes compilation error

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 9

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
}
*/

// Error - "class" is a reserved keyword in Java and hence cannot be used to assign and declare othet datatypes.

// Reason - The keywords are safe guarded becaue if they are used explicitly it will cause a problem for both the compiler as well as the programmer.

// Correcteded Code
/*
public class Main { 
    public static void main(String[] args) { 
        int c = 10; 
        System.out.println(c); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 10

// Given Code
/*
public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 11

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 12

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
}
*/

// Output - The statement "Infinite Loop" will run for infinite times.

// Solution - To avoid it a termination condition is must.

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) {
            System.out.println("While Loop: " + count);
            count++;
        }
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 13

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
}
*/

// Error - Exception in thread "main" java.lang.NullPointerException

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 14

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
}
*/

// Error - "num" is called as double and assigned a value of string "Hello"

// Reason - Type safety, Memory Management

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        double num = 10.5; 
        System.out.println(num); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 15

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
}
*/

// Error - Incompatible types: possible lossy conversion from double to int

// Reasom - Type error since a int datatype is summed with double datatype

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; 
        System.out.println(result); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 16

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
    } 
}
*/

// Output - 2.0

/*
Reason - The expression num / 4 involves integer division because both num (10) and 4 are int values.
In Java, when both operands of a division are integers, the result is also an integer (truncating the decimal part).
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 17

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
}
*/

// Error - Iileagal start of Expression

// Java does not support "**"

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 18

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
}
*/

// Output - 20

// Reason - In Java operator precedence is "/" > "*" > "+" > "-".

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 19

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
}
*/

// Exception in thread "main" java.lang.ArithmeticException: / by zero

// Reason - In Java dividing and integer by zero is undefined.

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 20

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World") 
    } 
}
*/

//Error - ";" statement terminator is missing.

// Reason - Java does not know where the statement end hence it requires a statement terminator.

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World"); 
    } 
} 
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 21

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
}
*/

// Error - Reached end of file while parsing

// Reason - The compiler expects the block to be properly closed with a matching brace, but it reaches the end of the file and cannot find it. 

// Corrected Code
/*
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 22

// Given Code
/*
public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/