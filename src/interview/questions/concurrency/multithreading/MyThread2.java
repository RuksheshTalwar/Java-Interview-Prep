package interview.questions.concurrency.multithreading;

/**
 * Daemon threads are threads which run in the background and JVM does not wait for it to finish its execution
 * User threads
 */
public class MyThread2 extends Thread{

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " is running...");
//            Thread.yield();
//        }
        while(true) {
            System.out.println("Hello World");
        }
//        try {
//            Thread.sleep(1000);
//            System.out.println("Thread is running...");
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted -> " + e);
//        }

//        for (int i = 0; i< 5; i++) {
//            String a = "";
//            for(int j = 0; j< 1000000; j++) {
//                a += "a";
//            };
//            System.out.println(Thread.currentThread().getName() + " - Priority: "
//                    + Thread.currentThread().getPriority() + " - count: " + i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2("myThread2");
        myThread2.setDaemon(true);
        MyThread2 t1 = new MyThread2("t1");
        t1.start();
        myThread2.start();
        System.out.println("Main done");
//        MyThread2 t1 = new MyThread2("t1");
//        MyThread2 t2 = new MyThread2("t2");
//        t1.start();
//        t2.start();
//        MyThread2 t1 = new MyThread2();
//        t1.start();
//        t1.interrupt();
//        MyThread2 t1 = new MyThread2("Low Priority Thread");
//        MyThread2 t2 = new MyThread2("Medium Priority Thread");
//        MyThread2 t3 = new MyThread2("High Priority Thread");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
    }
}
