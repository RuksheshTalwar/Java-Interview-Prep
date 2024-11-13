package interview.questions.streams.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class UniqueElementsFromListsUsingJava8 {
        public static void main(String[] args) {
            uniqueElementsFrom2Lists();
//            String str = "JavaJava";
//            Map<Character, Long> m = str
//                    .chars()
//                    .mapToObj(c -> (char) c)
//                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//            m.forEach((k,v) -> {
//                if (v>1) {
//                }
//            });


            // create ArrayList list1
//            ArrayList<String>
//                    list1 = new ArrayList<String>();
//
//            // Add values in ArrayList
//            list1.add("Hii");
//            list1.add("Geeks");
//            list1.add("for");
//            list1.add("Geeks");
//
//            // print list 1
//            System.out.println("List1: "
//                    + list1);
//
//            // Create ArrayList list2
//            ArrayList<String>
//                    list2 = new ArrayList<String>();
//
//            // Add values in ArrayList
//            list2.add("Hii");
//            list2.add("Geeks");
//            list2.add("Gaurav");
//
//            // print list 2
//            System.out.println("List2: "
//                    + list2);
//
//            // Find common elements
//            System.out.print("Common elements: ");
//            System.out.println(list1.stream()
//                    .filter(list2::contains)
//                    .collect(Collectors
//                            .toList()));
        }

    static void uniqueElementsFrom2Lists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
//
//        // Combine both lists and remove duplicates
//        Set<Integer> uniqueElements = Stream.concat(list1.stream(), list2.stream())
//                .collect(Collectors.toSet());
////        uniqueElements.stream().forEach(i -> System.out.println(i));
//
//        // Convert the set back to a list if needed
//        List<Integer> uniqueList = uniqueElements.stream().collect(Collectors.toList());
//
//        System.out.println("Unique elements: " + uniqueList);

        // Combine both lists and count occurrences of each element
        Set<Integer> uniqueElements = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
        uniqueElements.stream().forEach(i -> System.out.println(i));
    }
}
