package interview.questions.concurrency;

public class SynchronizationExplained {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}

/**
 * Synchronized block is a section of code enclosed within a synchronized statement.
 * It can be used to synchronize access to a specific code block,
 * allowing only 1 thread to execute it at a time.
 * Thread safety is maintained here for the increment() and getCount() methods are synchronized using a shared lock object.
 * This ensures that only one thread can increment the counter or access its value at any given time, maintaining thread safety.
 */
class Counter {
    private int count = 0;
    private Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}
