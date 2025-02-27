/*
public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
}
*/

// The loop prints 0, 2 & 4. Since i is initailized from 0 and end condition given is "< 5" with an increment of 2. To print with increment of 1 just update i++

// Rectified Code

public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i ++) { 
            System.out.println(i); 
        } 
    } 
}