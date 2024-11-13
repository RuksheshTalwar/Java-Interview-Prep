package interview.questions.streams.programs;

import java.util.Comparator;

public class Java8ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 o1==o2
                                        // 1 o1 > o2
                                        // -1 o1 < o2
            }
        };

        System.out.println("Result of the comparator is -> " + comparator.compare(3,2));

        //Java 8 style using Lambda expressions
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator Lambda is -> " + comparatorLambda.compare(3,2));
        Comparator<Integer> comparatorLambda1 = (a,b) -> a.compareTo(b);
        System.out.println("Result of the comparator Lambda is -> " + comparatorLambda1.compare(3,2));
    }
}
