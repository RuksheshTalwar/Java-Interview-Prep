package interview.questions.concurrency.multithreading;

public class RunnableWayToCreateThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
