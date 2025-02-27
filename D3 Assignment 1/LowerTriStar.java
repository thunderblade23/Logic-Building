class LowerTriStar {
	public static void main (String args[]){

        int[] rows = {1, 2, 3, 5, 6, 9}; // Number of stars in each row

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
	
        