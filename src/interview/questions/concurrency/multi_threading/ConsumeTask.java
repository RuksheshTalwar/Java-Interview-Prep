package interview.questions.concurrency.multi_threading;

public class ConsumeTask implements Runnable{
    SharedResource sharedResourceObj;

    ConsumeTask(SharedResource sharedResourceObj) {
        this.sharedResourceObj = sharedResourceObj;
    }

    @Override
    public void run() {
        System.out.println("Consumer Thread: " + Thread.currentThread().getName());
        sharedResourceObj.consumeItem();
    }
}
