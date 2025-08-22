package interview.questions.concurrency.multi_threading;

public class ProduceTask implements Runnable{
    SharedResource sharedResourceObj;

    ProduceTask(SharedResource sharedResourceObj) {
        this.sharedResourceObj = sharedResourceObj;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedResourceObj.addItem();
    }
}
