package interview.questions.concurrency.multithreading.codingchallenge;

public class PrintingNumbersInOrder {
    public static void main(String[] args) {
        Thread previous = null;
        for (int i = 1; i <= 10; i++) {
            final int number = i;
            Thread t = new Thread(() -> {
                System.out.println("Thread " + number + " is printing number " + number);
            });
            try {
                if (previous != null) {
                    /**
                     * join() called on previous Thread means that wait for previous thread's execution to finish
                     * until then Pause the current thread
                     */
                    previous.join();
                }
            }catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            t.start();
            previous = t;
        }
    }
}
