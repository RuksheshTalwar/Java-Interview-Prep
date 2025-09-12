package interview.questions.concurrency.interview_questions;

public class ProducerConsumerUnderstanding {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(5);

        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produceItem(i);
                }
            } catch (Exception e) {
                //handle exception here
            }
        });
        Thread consumeThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consumeItem();
                }
            } catch (Exception e) {
                //handle exception here
            }

        });

        producerThread.start();
        consumeThread.start();
    }

}
