/**
 * The TextBlocks class demonstrates the use of text blocks in Java.
 * It contains methods to print text blocks using both the old way and the new way.
 */
public class TextBlocks {

    /**
     * Prints a text block using the old way (concatenation of strings).
     *
     * @return A string representing the text block.
     */
    public static String printTextBlockOldWay() {
        return "This is a text block.\n" +
                "   It can contain \"multiple\" lines.\n";
    }

    /**
     * Prints a text block using the new text block feature in Java.
     *
     * @return A string representing the text block.
     */
    public static String printTextBlock() {
        // No need to escape double quotes or backslashes
        // Smart indentations are preserved
        return """
                This is a text block.
                   It can contain "multiple" lines. 
                """;
    }

    /**
     * The main method to test the text block methods.
     * It prints the results of both text block methods.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(printTextBlockOldWay());

        System.out.println("Text Blocks in Java:"); // Smart indentations
        System.out.println(printTextBlock());
    }
}