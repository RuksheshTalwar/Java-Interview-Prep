package interview.questions.streams.programs;

import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,4,5);
        int sum = li
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of all list elements -> " + sum);
    }
}
