/*
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
}
*/

// For the loop to run in intended order, the increment should be changed to decrement.

// Rectified Code

public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--){
            System.out.println(i); 
        } 
    } 
}