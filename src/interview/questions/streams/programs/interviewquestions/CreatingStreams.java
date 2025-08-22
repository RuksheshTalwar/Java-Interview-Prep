package interview.questions.streams.programs.interviewquestions;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {

        /**
         * Ways to build Stream object
         * 1 -> blank Stream Object
         */
        // 1 -> blank Stream Object
        Stream<Object> empty = Stream.empty();

        // 2 -> with the help of array, object, collection
        String[] arr = {"Rukshesh", "is", "a", "smart", "guy"};
        Stream<String> streamString = Stream.of(arr);
        streamString.forEach(System.out::println);

        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        stream.forEach(System.out::println);
    }
}
