class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
}

/*
Output - -4

Dry Run
"count" set to integer and assigned value 0
Interation 1 - 	i = 0						initial	final
		i++ -> used first then incremented i.e. 	1	2
		++i -> incremented first then incremented i.e. 	2	1
		count = count + i++ - ++i = 0 + 0 - 2 = -2
		i++ -> i=3
Interation 1 - 	i = 3						initial	final
		i++ -> used first then incremented i.e. 	3	4
		++i -> incremented first then incremented i.e. 	4	5
		count = count + i++ - ++i = -2 + 3 - 5 = -4
		i++ -> i=6
Exits loop since condition is i < 4
Prints -4
*/