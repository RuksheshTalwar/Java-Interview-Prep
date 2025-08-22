package interview.questions.concurrency.multi_threading;

public class MonitorLockExample {

    public synchronized void task1() {
        System.out.println("inside task 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("task 1 completed");
    }

    public void task2() {
        System.out.println("task2, but before synchronized");
        synchronized (this) {
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3() {
        System.out.println("task 3");
    }
}
