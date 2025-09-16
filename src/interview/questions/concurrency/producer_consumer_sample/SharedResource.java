package interview.questions.concurrency.producer_consumer_sample;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem() {
        System.out.println("Producer Thread accessing addItem() -> " + Thread.currentThread().getName());
        isItemPresent = true;
        System.out.println("Producer Thread calling notifyAll() method");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consumer Thread inside consumeItem() -> " + Thread.currentThread().getName());
        while(!isItemPresent) {
            try {
                System.out.println("Consumer Thread is waiting");
                wait(); //release the monitor lock on wait()
            } catch (Exception ex) {

            }
        }
        isItemPresent = false;
    }
}
