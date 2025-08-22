package interview.questions.concurrency.multi_threading.producer_consumer_problem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> queue;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        queue = new LinkedList<>();
        this.bufferSize = bufferSize;

    }

    public synchronized void produce(int item) {
        //If Buffer is full, wait for the consumer to consume items
        while (queue.size() == bufferSize) {
            System.out.println("Buffer is full, Producer is waiting for the consumer");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(item);
        notify();
    }

    public synchronized int consume() {
        while(queue.isEmpty()) {
            System.out.println("Queue is empty, Consumer is waiting on the producer");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int item = queue.poll();
        System.out.println("Consumed item : " + item);
        //Notify the Producer Thread that there is space in the Queue now
        return item;
    }
}
