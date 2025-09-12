package interview.questions.concurrency.interview_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        this.sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produceItem(Integer item) {
        // While buffer is full, Producer thread will wait for Consumer thread to consume the items
        while (sharedBuffer.size() == bufferSize) {
            System.out.println("Buffer is full, Producer is waiting to produce the items");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        sharedBuffer.add(item);
        System.out.println("Produced item -> " + item);
        notify();
    }

    public synchronized Integer consumeItem() {
        // While buffer is empty, call wait() on the Thread and release the Monitor Lock
        while (sharedBuffer.isEmpty()) {
            System.out.println("Buffer is empty, Consumer is waiting to consume the items");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Integer item = sharedBuffer.poll();
        System.out.println("Consumed item -> " + item);
        notify();
        return item;
    }
}
