/*
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}
*/

// "=" is an assignment operator. In "while" loop the condition must return a boolean but instead it returns it assigns the value to the interger "num". Hence the code won't compile, so it does not exceutes.

// Rectified Code

public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num == 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}