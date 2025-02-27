class ConditionalLoopOutput { 
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
}

/*
Output - 3

Dry Run
Set num to interger and assign value 1
Iterartion 1 - For i = 1
	       Condition i <= 4 satistfied
	       1 % 2 == 1 hence condition not satisfied
	       Executes num = num - i i.e. num = 1 - 1 = 0
Iterartion 2 - For i = 2
	       Condition i <= 4 satistfied
	       2 % 2 == 0 hence condition satisfied
	       Executes num = num + i i.e. num = 0 + 2 = 2
Iterartion 3 - For i = 3
	       Condition i <= 4 satistfied
	       3 % 2 == 1 hence condition not satisfied
	       Executes num = num - i i.e. num = 2 - 3 = -1
Iterartion 4 - For i = 4
	       Condition i <= 4 satistfied
	       4 % 2 == 0 hence conditoin is satisfied
	       Executes num = num - i i.e. num = -1 + 4 = 3
i = 5, 5 !=0 condition not satified hence loop terminates
Prints 3
*/