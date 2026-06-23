package interview.questions.concurrency.multi_threading;

/**
 * Monitor locks are object level locks. Every object has its own monitor lock.
 * If 2 threads are working on the same resource like obj in this program,
 * then only Monitor lock comes in picture
 * Flow of this program:
 * t1 -> run() method has {obj.task1()} task1() is synchronized method; t1 acquires the monitor lock and since we have explicitly written t1 to sleep for 10 seconds,
 * so it goes in timed waiting state and DOES NOT RELEASE MONITOR LOCK
 * t2 -> run() method has {obj.task2()} task2() is non-synchronized method but
 * has synchronized on current object obj -> means Monitor lock on current object
 * so t2 has to acquire monitor lock on current object
 * so it waits for t1 Thread to release the monitor lock on obj Object
 * Thread t2 will wait, as monitor lock will ensure that only 1 thread
 * will go inside the critical section,
 * no matter if its different method as well like task1(), task2()
 * Thread t3 -> run() method has {obj.task3()} task3() is non-synchronized method,
 * so, it will print on console
 * Thread t1 comes in Running state again and then finishes execution, Thread t2
 * finishes execution after Thread t1 finishes and program is finished
 */
public class MonitorLockExample {

    public synchronized void task1() {
        System.out.println("inside task 1");
        try {
            Thread.sleep(10000);
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
