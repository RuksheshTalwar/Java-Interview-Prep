package interview.questions.concurrency.multithreading;

public class Test {
    public static void main(String[] args) {
//        World world = new World();
//        world.start();
        RunnableWayToCreateThread runnableWayToCreateThread = new RunnableWayToCreateThread();
        Thread t1 = new Thread(runnableWayToCreateThread);
        t1.start();

        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
