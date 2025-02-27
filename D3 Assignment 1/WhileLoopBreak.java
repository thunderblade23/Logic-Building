class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
}

/*
Output - 0 1 2 3

Dry Run
"count" variable set to integer and assigned value 0
Iteration 1 - When count = 0
	      "while" condition satisfied (0 < 5)
	      Prints 0
	      Increment to 1 from 0
	      Check if statement - 1 not equal to 3 hence "break" not executed
Iteration 2 - When count = 1
	      "while" condition satisfied (1 < 5)
	      Prints 1
	      Increment to 2 from 1
	      Check if statement - 2 not equal to 3 hence "break" not executed
Iteration 3 - When count = 2
	      "while" condition satisfied (2 < 5)
	      Prints 2
	      Increment to 3 from 2
	      Check if statement - 3 equal to 3 hence "break" executed
"while" terminated and then prints 3
*/