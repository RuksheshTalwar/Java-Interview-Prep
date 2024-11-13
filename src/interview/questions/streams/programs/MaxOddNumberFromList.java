package interview.questions.streams.programs;

import java.util.Iterator;
import java.util.List;

/**
 * Program to Find Maximum Odd Number in Array using Streams and non-functional programming in Java
 */
public class MaxOddNumberFromList {
    public static void main(String[] args) {
        List<Integer> li = List.of(11,43,56,82,51,29,10);
//        Iterator<Integer> it = li.iterator();
//        while(it.hasNext()) {
//            int num = it.next();
//
//        }
        maxOdd(li);
    }

    public static int maxOdd(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 2 != 0)
                .max(Integer::compare)
                .orElse(0);
    }
}
