class IncrementDecrement { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 
        System.out.println(y); 
    } 
}

/*
Output - 8

Dry Run
x set as an integer and assigned value 5.
y set as an interger and assigned an expression.
"++x" i.e. the value x = 5 is incremented before and then used; therfore x = 6
"x--" i.e. the value x = 6 is first used then decremented to 5
"--x" i.e. the value x = 5 is first decremented then used; therefore x = 4
"x++" i.e. the value x = 4 is first used then incremented to 5
Thefore y = 6 - 6 + 4 + 4 = 8
*/