class DiamondRevPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the top half

        // Upper half (inverted pyramid)
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Printing leading spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Printing stars
            }
            System.out.println(); // Move to the next line
        }

        // Lower half (pyramid)
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Printing leading spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Printing stars
            }
            System.out.println(); // Move to the next line
        }
    }
}
