package interview.questions.streams.programs.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");
        List<String> wordsInUppercase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        wordsInUppercase.forEach(System.out::println);


        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}
