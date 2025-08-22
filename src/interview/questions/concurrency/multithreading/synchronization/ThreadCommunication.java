package interview.questions.concurrency.multithreading.synchronization;

class SharedResource {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced value " + value);
        notify();
    }

    public synchronized int consume() {
        //If data is not there, then Consumer Thread has to wait
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed value " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
//        SharedResource sharedResource = new SharedResource();
//        Thread producerThread = new Thread(new ProducerTask(sharedResource));
//        Thread consumerThread = new Thread(new Consumer(sharedResource));
//        producerThread.start();
//        consumerThread.start();
    }
}
