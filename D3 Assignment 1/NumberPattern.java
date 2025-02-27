class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { 
                System.out.print(i); // Printing the current row number
            }
            System.out.println(); // Move to the next line
        }
    }
}
