package interview.questions.concurrency.multithreading;

/**
 * This class is used to check Thread states and join method
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        Thread t1 = new Thread(myThread);
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(1000);
        System.out.println(t1.getState());
        //main thread will wait for t1 Thread to finish its execution
        // and get Terminated, then only it will move ahead with its execution
        t1.join();
        System.out.println(t1.getState());
    }
}
