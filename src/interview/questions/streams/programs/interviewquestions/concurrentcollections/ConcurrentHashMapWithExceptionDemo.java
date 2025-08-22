package interview.questions.streams.programs.interviewquestions.concurrentcollections;

import java.util.*;

/**
 * Occurrence of ConcurrentModificationException examples in Single and Multi-threaded environments
 */
public class ConcurrentHashMapWithExceptionDemo {
    public static void main(String[] args) {
        singleThreadedCaseException();
        multiThreadedCaseException();
    }

    private static void singleThreadedCaseException() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 2);
        /**
         * So, in case of a HashMap when we are trying to iterate over a HashMap
         * and modifying the HashMap at the same time,
         * then ConcurrentModificationException exception occurs
         * That is to say, when there are multiple threads trying to iterate
         * and write at the same time in a HashMap, then ConcurrentModificationException
         * exception occurs.
         */
        /**
         * In this case we are getting ConcurrentModificationException exception because
         * Iterators in HashMap are fail fast iterators
         */
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("two")) {
                map.put("four", 4); //This will throw ConcurrentModificationException
            }
        }
        System.out.println(map);
    }

    private static void multiThreadedCaseException() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        new Thread(() -> {
            for (String s : list) {
                System.out.println(s);
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        }).start();

        new Thread(() -> {
            list.add("C"); // Modifying while other thread is iterating
        }).start();

    }
}
