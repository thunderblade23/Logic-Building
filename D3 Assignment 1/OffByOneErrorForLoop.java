public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
}

// The boundaries of the loop given in the code say "i <= 10" which means 10 inclusive. For the desired result change the condition to "i < 10".