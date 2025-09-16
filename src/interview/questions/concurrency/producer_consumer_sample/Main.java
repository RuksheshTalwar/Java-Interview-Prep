package interview.questions.concurrency.producer_consumer_sample;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(() -> {
        /**
         * To make sure that producer thread is not invoked first in multi-threaded environment, we call sleep.
         * Because if producer thread is invoked first, consumeThread is not able to consume item present in a queue
         */
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();
        });
        Thread consumerThread = new Thread(() -> {
            sharedResource.consumeItem();
        });
        producerThread.start();
        consumerThread.start();
    }
}
