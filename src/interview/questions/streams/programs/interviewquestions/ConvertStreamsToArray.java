package interview.questions.streams.programs.interviewquestions;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStreamsToArray {
    public static void main(String[] args) {

        //For Primitive Type Arrays
        int[] arr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(System.out::println);

        //For Object Type Arrays
        Integer[] arrayInteger = {7,8,9};
        Stream<Integer> streamInteger = Stream.of(arrayInteger);
        streamInteger.forEach(System.out::println);

    }
}
