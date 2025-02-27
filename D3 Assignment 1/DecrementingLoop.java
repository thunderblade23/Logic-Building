class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
}

/*
Output - 11

Dry Run
Iteration 1 - Enter loop for i = 5
	      total = total + i which is 5
	      i not equal to 3 hence skip continue
	      total = total - 1 which is 4
	      Print total [4]
Iteration 2 - Enter loop for i = 4
	      total = total + i which is 8
	      i not equal to 3 hence skip continue
	      total = total - 1 which is 7
	      Print total [7]
Iteration 3 - Enter loop for i = 3
	      total = total + i which is 10
	      i equal to 3 hence continue
	      skip total = total - 1
	      Print total [10]
Iteration 4 - Enter loop for i = 2
	      total = total + i which is 12
	      i not equal to 3 hence skip continue
	      total = total - 1 which is 11
	      Print total [11]
Iteration 5 - Enter loop for i = 1
	      total = total + i which is 12
	      i not equal to 3 hence skip continue
	      total = total - 1 which is 11
	      Print total [11]
*/