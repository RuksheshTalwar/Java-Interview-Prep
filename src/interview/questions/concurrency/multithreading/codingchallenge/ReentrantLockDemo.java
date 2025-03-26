package interview.questions.concurrency.multithreading.codingchallenge;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock is one of the many implementations of Lock interface in Java.
 * It allows a thread to acquire the same lock multiple times without causing any deadlocks.
 * It means that a thread which holds the lock can acquire it again without blocking itself if the lock is Reentrant.
 * Here, it looks as if the lock is acquired twice, once in methodA() and second tie in methodB(), but under the hood it is acquired only once.
 */
public class ReentrantLockDemo {
    private final ReentrantLock lock = new ReentrantLock();
    private int sharedData = 0;

    public void methodA() {
        lock.lock();
        try {
            //Critical Section
            sharedData++;
            System.out.println("Method A: sharedData -> " + sharedData);
            methodB();
        } finally {
            lock.unlock();
        }
    }

    private void methodB() {
        lock.lock();
        try {
            //Critical Section
            sharedData--;
            System.out.println("Method B: sharedData -> " + sharedData);
            System.out.println(lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo example = new ReentrantLockDemo();
        for (int i = 0; i < 5; i++) {
            new Thread(example::methodA).start();
        }
    }
}
