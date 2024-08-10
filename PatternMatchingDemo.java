/**
 * A demonstration of pattern matching in Java.
 */
public class PatternMatchingDemo {
    /**
     * The main method to test the pattern matching methods.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println(callBefore(1));       // Test with an Integer
        System.out.println(callBefore("Hello")); // Test with a String
        System.out.println(callAfter(1));        // Test with an Integer using pattern matching
        System.out.println(callAfter("Hello"));  // Test with a String using pattern matching
    }
    /**
     * Method to demonstrate type checking before pattern matching.
     * @param obj The object to be checked and processed
     * @return A string describing the type and value of the object
     */
    private static String callBefore(Object obj) {
        if (obj instanceof Integer) {
            return "Integer: " + obj;
        } else if (obj instanceof String) {
            int length = ((String) obj).length(); // Cast to String
            return "String: " + obj + ", length: " + length;
        } else {
            return "Unknown type";
        }
    }
    /**
     * Method to demonstrate type checking using pattern matching.
     * @param obj The object to be checked and processed
     * @return A string describing the type and value of the object
     */
    private static String callAfter(Object obj) {
        if (obj instanceof Integer) {
            return "Integer: " + obj;
        } else if (obj instanceof String str) { // Pattern matching
            int length = str.length();
            return "String: " + obj + ", length: " + length;
        } else {
            return "Unknown type";
        }
    }
}