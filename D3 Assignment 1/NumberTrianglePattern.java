class NumberTrianglePattern {
    public static void main(String[] args) {
        int rows = 5; 
        int num = 1; 

        for (int i = 1; i <= rows; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(num + " ");
                num++; // Increment the number
            }
            System.out.println(); 
        }
    }
}
