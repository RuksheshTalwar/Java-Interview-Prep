package interview.questions.concurrency.multi_threading;

public class MonitorLockReentrancyFeature {
    public synchronized void outerMethod() {
        System.out.println("Entered Outer method is called by -> " + Thread.currentThread().getName());
        innerMethod();
        System.out.println("Exited Outer method is called by -> " + Thread.currentThread().getName());
    }

    private synchronized void innerMethod() {
        System.out.println("Entered Inner method is called by -> " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Exited Inner method is called by -> " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MonitorLockReentrancyFeature obj = new MonitorLockReentrancyFeature();
        Thread t1 = new Thread(() -> obj.outerMethod());
        Thread t2 = new Thread(() -> obj.outerMethod());
        t1.start();
        t2.start();
    }
}
