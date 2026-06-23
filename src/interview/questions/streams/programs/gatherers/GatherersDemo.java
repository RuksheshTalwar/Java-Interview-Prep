package interview.questions.streams.programs.gatherers;

import java.util.List;

public class GatherersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer sumOfAllIntegersInList = numbers
                .stream()
                .reduce(0, Integer::sum);
        System.out.println(sumOfAllIntegersInList);
    }
}
