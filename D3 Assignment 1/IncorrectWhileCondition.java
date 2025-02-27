public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count == 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}

// In the condition of the "while" loop, the conditional operator is not "==" which results in error.