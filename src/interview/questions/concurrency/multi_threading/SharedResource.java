package interview.questions.concurrency.multi_threading;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized void addItem() {
        isItemAvailable = true;
        System.out.println("Producer Thread has produced the item");
        /**
         * Using notifyAll() method, we are saying that All the threads which are waiting on this
         * Object (SharedResource) wake up and use Monitor Lock to use this object
         */
        notifyAll();
    }

    public synchronized void consumeItem() {
        while(!isItemAvailable) {
            System.out.println("Consumer Thread is waiting for consuming the item");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumer Thread consumed the item");
        isItemAvailable = false;
    }
}
