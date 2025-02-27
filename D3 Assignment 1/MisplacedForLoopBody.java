/*
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++)
            System.out.println(i); 
            System.out.println("Done");
    } 
}
*/

// When there are no curly braces for "for" loop the first statement is the only statement executed by the loop. When we want to include new statements inside curly braces.

// Rectified Code

public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) {
            System.out.println(i); 
            System.out.println("Done");
	}
    } 
}
