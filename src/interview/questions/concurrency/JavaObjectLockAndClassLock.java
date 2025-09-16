package interview.questions.concurrency;

public class JavaObjectLockAndClassLock {
    public static void main(String[] args) {

    }

    public synchronized void m1() {
        System.out.println("in method M1() and Thread name is " + Thread.currentThread().getName());
    }

    public synchronized void m2() {
        System.out.println("in method M2() and Thread name is " + Thread.currentThread().getName());
    }
}
