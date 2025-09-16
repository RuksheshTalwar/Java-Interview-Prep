package interview.questions.streams.programs.interviewquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Program to find the Word that has the Highest Length in the sentence
 */
public class LongestWordFinder {
    public static void main(String[] args) {
        String str = "Find a word that has highest length in sentence using java streams";

//        String longestWord = Arrays.stream(str.split(" "))
//                .max(Comparator.comparingInt(String::length))
//                .orElse("");
//
//        System.out.println("Longest word: " + longestWord);
//
//        /**
//         * Program to find the second-highest word in a given sentence
//         */
//        String secondHighestWord = Arrays.stream(str.split(" "))
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .skip(1).findFirst().get();
//        System.out.println(secondHighestWord);
//
//        /**
//         * Program to find the length of the second-highest word in a given sentence
//         */
//        Integer length = Arrays.stream(str.split(" "))
//                .map(i -> i.length())
//                .sorted(Comparator.reverseOrder())
//                .skip(1).findFirst().get();
//        System.out.println(length);

        /**
         * Program to find the occurrence of each word in a given sentence
         */
        Map<String, Long> occurrencesOfEachWordMap = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrencesOfEachWordMap);
    }
}
