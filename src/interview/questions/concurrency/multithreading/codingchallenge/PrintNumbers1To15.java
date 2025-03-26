package interview.questions.concurrency.multithreading.codingchallenge;

public class PrintNumbers1To15 implements Runnable {
    private int startNumber;
    private int endNumber;
    private final Object lock;

    public PrintNumbers1To15(int startNumber, int endNumber, Object lock) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = startNumber; i <= endNumber; i++) {
            synchronized (lock) {
                System.out.println("Thread " + Thread.currentThread().getName() +
                        " printing: " + i);
                try {
                    // Add a small delay to make the output more readable
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a shared lock object for synchronization
        Object lock = new Object();

        // Create three threads to print numbers in ranges: 1-5, 6-10, and 11-15
        Thread thread1 = new Thread(new PrintNumbers1To15(1, 5, lock), "Thread-1");
        Thread thread2 = new Thread(new PrintNumbers1To15(6, 10, lock), "Thread-2");
        Thread thread3 = new Thread(new PrintNumbers1To15(11, 15, lock), "Thread-3");

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Wait for all threads to complete
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed execution!");
    }
}