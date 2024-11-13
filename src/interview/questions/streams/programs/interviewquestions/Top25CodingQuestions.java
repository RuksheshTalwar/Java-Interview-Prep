package interview.questions.streams.programs.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class Top25CodingQuestions {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13, 55, 53);
        System.out.println("1) Given the list of integers, find the First element of the list using Stream API");
//        findFirstElementOfList(nums);
//        System.out.println("2) Given the list of integers, find the total number of elements present in the list using Stream API");
//        findTotal(nums);
//        System.out.println("3) Given the list of integers, find the even and odd numbers present in the list using Stream API");
//        findEvenOdd(nums);
        System.out.println("4) Given the list of integers, find out all the numbers starting with 5 using Stream functions");
    }

    static void findFirstElementOfList(List<Integer> nums) {
        nums
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
    }

    static void findTotal(List<Integer> nums) {
        System.out.println(nums
                .stream()
                .count());
    }

    static void findEvenOdd(List<Integer> nums) {
        //Even
        nums
                .stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
        //Odd
        nums
                .stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }

    static void findAllNumbersStartsWith5(List<Integer> nums) {
        nums
                .stream()
                .filter(num -> num.toString().startsWith("5"))
                .forEach(System.out::println);

    }
}
