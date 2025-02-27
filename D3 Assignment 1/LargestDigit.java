class LargestDigit {
    public static void main(String[] args) {
        int num = 4825;
        int maxDigit = 0;

        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            if (digit > maxDigit) {
                maxDigit = digit; // Update maxDigit if a larger digit is found
            }
            num /= 10; // Remove the last digit
        }

        System.out.println("Largest digit: " + maxDigit);
    }
}
