package main.java.string_coding_questions;

/**
 * Difference between String, StringBuilder and StringBuffer
 */
public class String_StringBuilder_StringBuffer_Examples {

    /**
     * In this method, we pass a string “Rukshesh” and perform “s1 = s1 + ”Talwar”.
     * The string passed from main() is not changed, this is due to the fact that String is immutable.
     * Altering the value of string creates another object and s1 in concat1() stores reference of the new string.
     * References s1 in main() and cocat1() refer to different strings.
     * @param s1
     */
    public static void concatString(String s1) {
        s1 = s1 + "Talwar";
    }

    public static void concatStringBuilderInstance(StringBuilder s2) {
        s2.append("Talwar");
    }

    public static void concatStringBufferInstance(StringBuffer s3) {
        s3.append("Talwar");
    }

    public static void main(String[] args) {
        String s1 = "Rukshesh";
        concatString(s1);

        // s1 is not changed
        System.out.println("String: " + s1);

        StringBuilder s2 = new StringBuilder("Rukshesh");

        concatStringBuilderInstance(s2);

        // s2 is changed
        System.out.println("StringBuilder: " + s2);

        // String s3
        StringBuffer s3 = new StringBuffer("Rukshesh");

        // Calling above defined method
        concatStringBufferInstance(s3);

        // s3 is changed
        System.out.println("StringBuffer: " + s3);
    }
}
