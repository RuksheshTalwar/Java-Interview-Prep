package interview.questions.concurrency.multi_threading.producer_consumer_problem;

import interview.questions.concurrency.multi_threading.producer_consumer_problem.SharedResource;

public class ProduceTask implements Runnable {

    SharedResource sharedResource;

    ProduceTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 6; i++) {
                sharedResource.produce(i);
            }
        } catch (Exception ex) {
            //handle exception here
        }
    }
}
