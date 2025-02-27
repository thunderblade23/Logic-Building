class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
}

/*
Output - 49

Dry Run
a & b are set as integers and assigned values 10 & 5 respectively
An integer "result" is expressed as "++a * b-- - --a + b++"
					initial	final
"++a" - Preincrement in value of a; 	10	11
"b--" - Post decrement in value of b; 	5	4
"--a" - Predecrement in value of a;	11	10
"b++" - Post increment in value of b;	4	5

Therefore result = 11 * 5 - 10 + 4 = 49
*/