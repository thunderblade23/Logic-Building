class NumberRevRowRepeatStarPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j);
                if (j > 6 - i) { 
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
