// Snippet 25

// Given Code
/*
public class Switch { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}
*/

// Error -  Incompatible types: possible lossy conversion from double to int switch(score) {

// Reason - In Java, the "switch" statement supports only "byte", "short", "char", "int" & "String".

// Corrected Code
/*
public class Switch { 
    public static void main(String[] args) { 
        int score = 85; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}
*/

/*---------------------------------------------------------------------------------------------------------------*/

// Snippet 26

// Given Code
/*
public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}
*/

// Error - Duplicate case label

// Reason - The error occurs because a switch statement cannot have two identical case labels.

/*
What happens when you have two identical case labels in the same switch block? 
The switch statement evaluates the expression and compares it against the values in the case labels.

If the same case label appears more than once, the compiler cannot determine which case to execute because both cases correspond to the same value (5 in this case).

Duplicate case labels violate the rule that each case value must be unique within the switch block. This is why the compiler complains about duplicate case labels.
*/

// Corrected Code

public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 6: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}
