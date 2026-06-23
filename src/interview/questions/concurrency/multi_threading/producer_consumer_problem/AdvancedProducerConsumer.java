package interview.questions.concurrency.multi_threading.producer_consumer_problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AdvancedProducerConsumer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;
    // Fair lock
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public void produce(int item) throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == capacity) {
                // Wait if full
                notFull.await();
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            // Signal consumers
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public int consume() throws InterruptedException {
        lock.lock();
        try {
            while (buffer.isEmpty()) {
                // Wait if empty
                notEmpty.await();
            }
            int item = buffer.poll();
            System.out.println("Consumed: " + item);
            // Signal producers
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }
    }
}
