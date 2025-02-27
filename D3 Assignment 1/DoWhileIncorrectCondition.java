public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 0); 
    } 
}

// Here the loop executes infinitely. For it to execute once just change the condition of while to "<".