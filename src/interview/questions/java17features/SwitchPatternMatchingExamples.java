package interview.questions.java17features;

public class SwitchPatternMatchingExamples {
    public static void main(String[] args) {
        System.out.println(classify(-5));   // Negative Integer
        System.out.println(classify(0));    // Zero
        System.out.println(classify(42));   // Positive Integer
        System.out.println(classify("Hi")); // Other type
    }

    static String classify(Object obj) {
        return switch (obj) {
            case Integer i when i < 0 -> "Negative Integer";
            case Integer i when i == 0 -> "Zero";
            case Integer i -> "Positive Integer";
            default -> "Other type";
        };
    }
}