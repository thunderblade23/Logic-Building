// Snippet 24

// Given Code
/*
public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}
*/

// level 1 is for the case of case 1. The "break" statement is used to terminate the switch statement after a case block has been executed.

// Correected Code

public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
		break;
            case 2: 
                System.out.println("Level 2"); 
		break;
            case 3: 
                System.out.println("Level 3"); 
		break;
            default: 
                System.out.println("Unknown level"); 
		break;
        } 
    } 
}