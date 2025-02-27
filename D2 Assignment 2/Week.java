public class Week{
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                switchCategory("Weekday");
                break;
            case 2:
                System.out.println("Tuesday");
                switchCategory("Weekday");
                break;
            case 3:
                System.out.println("Wednesday");
                switchCategory("Weekday");
                break;
            case 4:
                System.out.println("Thursday");
                switchCategory("Weekday");
                break;
            case 5:
                System.out.println("Friday");
                switchCategory("Weekday");
                break;
            case 6:
                System.out.println("Saturday");
                switchCategory("Weekend");
                break;
            case 7:
                System.out.println("Sunday");
                switchCategory("Weekend");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }

    // Nested switch to determine if it's a weekday or weekend
    public static void switchCategory(String category) {
        switch (category) {
            case "Weekday":
                System.out.println("It is a weekday.");
                break;
            case "Weekend":
                System.out.println("It is the weekend.");
                break;
        }
    }
}
