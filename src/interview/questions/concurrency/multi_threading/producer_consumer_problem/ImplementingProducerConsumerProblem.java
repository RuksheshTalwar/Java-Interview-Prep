package interview.questions.concurrency.multi_threading.producer_consumer_problem;

/**
 * Even though they are different threads, they are working on the Same Object (SharedResource)
 * Suppose, Consumer Thread is started first, there will be no data items present in the Queue,
 * so, it will wait() and release its Monitor Lock. Now, Producer thread will get the lock
 * and add an item onto the Queue as its empty and call notify() and any thread which is in
 * waiting state will be awake.
 *
 */
public class ImplementingProducerConsumerProblem {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(10);

        /**
         * By creating a class which implements Runnable
         */
        Thread producerThread = new Thread(new ProduceTask(sharedResource));

        /**
         * Using Lambda Expression
         */
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 6; i++) {
                    sharedResource.consume();
                }
            } catch (Exception e) {
                //handle exception here
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}
