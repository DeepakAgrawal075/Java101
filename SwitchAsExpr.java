/**
 * The SwitchAsExpr class demonstrates the use of switch expressions in Java.
 * It contains a main method to test the dayType method with various inputs.
 */
public class SwitchAsExpr {

    /**
     * The main method to test the dayType method.
     * It prints the type of day for different day values.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(dayType(0));
        System.out.println(dayType(1));
        System.out.println(dayType(2));
        System.out.println(dayType(6));
        System.out.println(dayType(7));
    }

    /**
     * Determines the type of day based on the given day number.
     *
     * @param day The day number (1-7).
     * @return A string representing the type of day ("Weekday", "Weekend", or "Invalid day").
     */
    private static String dayType(int day) {
        return switch (day) { // Switch expression
            case 1, 2, 3, 4, 5 -> "Weekday"; // Multiple cases with the same result
            case 6 -> "Weekend";
            case 7 -> { // Multiple statements in a case block
                System.out.println("Day is 7");
                yield "Weekend"; // Return value for the case
            }
            default -> "Invalid day"; // Default case
        };
    }
}