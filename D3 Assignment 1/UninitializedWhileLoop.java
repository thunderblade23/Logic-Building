/*
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
         while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}
*/

// The variable count has not been assigned a value causing the error in the conditions of "while" loop.

// Rectified Code

public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count=0;
         while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}