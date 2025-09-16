//package interview.questions.streams.programs.interviewquestions;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class SetQuestions {
//
//    public static void main(String[] args) {
//        List<Integer> numsForDescending = List.of(2, 3, 4, 5, 5, 4);
//        List<Integer> numsFoAscending = Arrays.asList(5, 3, 2, 4, 3);
//        /**
//         * 1 -> Program to convert List to Sorted Unique Set in Descending order
//         */
//        convertListToSortedSetInDescending(numsForDescending);
//        /**
//         * 2 -> Program to convert List to Sorted Unique Set in Ascending order
//         */
//        convertListToSortedSetInAscending(numsFoAscending);
//    }
//
//    private static void convertListToSortedSetInDescending(List<Integer> nums) {
//        Set<Integer> descSorted = nums.stream()
//                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.reverseOrder())));
//        System.out.println(descSorted);
//    }
//
//    private static void convertListToSortedSetInAscending(List<Integer> nums) {
//        Set<Integer> sortedSet = nums.stream()
//                .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(sortedSet);
//    }
//}
