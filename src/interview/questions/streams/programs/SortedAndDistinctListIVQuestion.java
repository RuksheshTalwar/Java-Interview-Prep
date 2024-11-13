package interview.questions.streams.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Input List given -> [1,3,2,4,3,1,2]
 * Output List should be -> [4,3,2,1]
 */
public class SortedAndDistinctListIVQuestion {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,3,2,4,3,1,2);
        List<Integer> outputList = li.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        outputList.forEach(System.out::println);
    }
}
