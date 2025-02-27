/*
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
}
*/

// Causes a compilation error "'x' is not accessible here". This error is caused because the variable "x" is declared inside the "for" loop and when the loop ends "x" has no space assigned.To fix this intialize "x" outside the loop and assign a value to it.

// Rectifed Code

public class LoopVariableScope { 
    public static void main(String[] args) { 
	int x = 0;
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
}