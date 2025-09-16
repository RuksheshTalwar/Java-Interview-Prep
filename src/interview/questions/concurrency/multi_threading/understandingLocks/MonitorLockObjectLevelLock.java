package interview.questions.concurrency.multi_threading.understandingLocks;

public class MonitorLockObjectLevelLock {
    public static void main(String[] args) {
        MonitorLockObjectLevelLock obj1 = new MonitorLockObjectLevelLock();
        MonitorLockObjectLevelLock obj2 = new MonitorLockObjectLevelLock();
        Thread t1 = new Thread(() -> {
            obj1.synchronizedMeth();
        });
        Thread t2 = new Thread(obj1::synchronizedMeth);
        Thread t3 = new Thread(() -> {
            obj2.synchronizedMeth();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    public synchronized void synchronizedMeth() {
        System.out.println(Thread.currentThread().getName() + " is executing synchronizedMethod");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
