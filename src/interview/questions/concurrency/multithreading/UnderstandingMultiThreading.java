package interview.questions.concurrency.multithreading;

public class UnderstandingMultiThreading {

    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        t1.start();
        t2.start();
    }
}

class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}



