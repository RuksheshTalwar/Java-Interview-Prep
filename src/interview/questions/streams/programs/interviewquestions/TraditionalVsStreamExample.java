package interview.questions.streams.programs.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class TraditionalVsStreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
//        Thread

        //Find sum of squares of even numbers
        int sumOfSquares = 0;
        for (int number : list) {
            if (number % 2 == 0) {
                int square = number * number;
                sumOfSquares += square;
            }
        }
        System.out.println("Sum of squares of even numbers is : " + sumOfSquares);


        int sumOfSquaresUsingStream = list.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * number)
                .sum();
        System.out.println("Sum of squares of even numbers using Streams is : " + sumOfSquaresUsingStream);
    }
}
