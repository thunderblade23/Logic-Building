class NestedLoopOutput { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 2; j++) { 
                System.out.print(i + " " + j + " "); 
            } 
            System.out.println(); 
        } 
    } 
}

/*
Output - 1 1 1 2
	 2 1 2 2
	 3 1 3 2

Dry Run
Iterarion 1 - Enters outer loop, i = 1
	      Enters inner loop, j = 1
	      Prints "1 1"
	      Continues inner loop, j = 2
	      Prints "1 2"
	      Exits inner loop
	      Goes to next line
Iteration 2 - Continues outer loop, i = 2
	      Enters inner loop, j = 1
	      Prints "2 1"
	      Continues inner loop, j = 2
	      Prints "2 2"
	      Exits inner loop
	      Goes to next line
Iteration 3 - Continues outer loop, j = 3
	      Enters inner loop, j = 1
	      Prints "3 1"
	      Continues inner loop, j = 2
	      Prints "3 2"
	      Exits inner loop
	      Goes to next line
*/