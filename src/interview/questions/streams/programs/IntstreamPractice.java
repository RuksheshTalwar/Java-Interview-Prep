package interview.questions.streams.programs;

import java.util.stream.IntStream;

/**
 * Implementation of IntStream range (int startInclusive, int endExclusive)
 *
 */
public class IntstreamPractice {
    public static void main(String[] args) {
        // Creating an IntStream
        IntStream stream = IntStream.range(6, 10);

        /**
         * Displaying the elements in range
         * including the lower bound but
         * excluding the upper bound
         */
        stream.forEach(System.out::println);
    }
}
