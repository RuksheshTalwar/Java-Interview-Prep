package interview.questions.streams.programs.interviewquestions.concurrentcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapDemo {
    private static final int NUM_THREADS = 5;
    private static final int NUM_INSERTIONS = 100;

    /**
     * As HashMap is not thread safe, so multiple writer threads writing at the same time can cause race conditions
     * So, better data structure to use in ConcurrentHashMap
     */
//    private static HashMap<String, Integer> hashMap = new HashMap<>();
    private static Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
        for (int i = 0; i < NUM_THREADS; i++) {
            executorService.execute(insertRecord());
        }

        executorService.shutdown();

        if(!executorService.isTerminated()) {
            Thread.sleep(1000);
        }

        System.out.println("Size of the HashMap : " + concurrentHashMap.size());
    }

    private static Runnable insertRecord() {
        return () -> {
            for (int i = 0; i < NUM_INSERTIONS; i++) {
                concurrentHashMap.put(i + Thread.currentThread().getName(), i);
            }
        };
    }
}
