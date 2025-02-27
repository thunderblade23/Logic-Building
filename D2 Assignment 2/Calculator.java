class Calculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 0;
        char operator = '/';

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) { // Nested if-else to check division by zero
                    System.out.println("Error: Division by zero is not allowed!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}
