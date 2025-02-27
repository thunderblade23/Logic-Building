// Given Code

class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
}

// The code here runs infinitely beacause of the decrement of "i" i.e. "i--". By changing it to increment i.e. "i++" the code can be to run a finite loop.