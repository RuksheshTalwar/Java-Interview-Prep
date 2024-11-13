package interview.questions.streams.programs;

import java.util.stream.IntStream;

/**
 * The chars() method is an instance method of the String class.
 * It returns an IntStream that consists of the code point values of the characters in the given string.
 * This method was added to the String class in Java 9.
 * Reference link -> https://www.educative.io/answers/what-is-the-stringchars-method-in-java
 */
public class StringCharsMethodPractice {
    public static void main(String[] args) {
        String string = "hello-world";

        // use the chars method to get a stream of char values
        IntStream codePointStream = string.chars();

        // convert the code points back to characters and print the output
        codePointStream.mapToObj(Character::toChars).forEach(System.out::println);
    }
}
