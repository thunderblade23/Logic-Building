class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
}

/*
Output - 1 2 3 4 5

Dry Run
Set i to integer and assign value 1
Iteration 1 - Prints "1 "
	      Increment from 1 to 2
	      "while" condition satisfied (2 < 5) hence loop continues
Iteration 2 - Prints "2 "
	      Increment from 2 to 3
	      "while" condition satisfied (3 < 5) hence loop continues
Iteration 3 - Prints "3 "
	      Increment from 3 to 4
	      "while" condition satisfied (4 < 5) hence loop continues
Iteration 4 - Prints "4 "
	      Increment from 4 to 5
	      "while" condition not satisfied (5 = 5) hence comes out of loop
Prints 5
*/