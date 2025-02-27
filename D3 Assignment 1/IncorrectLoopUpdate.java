/*
public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2; // Error: This may cause unexpected results in output 
        } 
    } 
}
*/

// The output of the loop is "0 2 4". To have a desired output i.e. with increment of 1 the increment for the "while" loop should be written as "i++".

// Rectified Code

public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i ++; // Error: This may cause unexpected results in output 
        } 
    } 
}