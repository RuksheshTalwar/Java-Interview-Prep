package interview.questions.concurrency.multi_threading;

public class ModernFunctionalWayOfCreatingThread {
    public static void main(String[] args) {
        Runnable objRunnable = () -> {
            System.out.println("Thread is running : "+ Thread.currentThread().getName());
        };

        Thread objThread =  new Thread(objRunnable, "Runnable Thread");
        objThread.start();
    }
}
