package interview.questions.concurrency.multithreading.codingchallenge;

public class ThreadsUsingLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello world " + i);
            }
        });
        t1.start();
    }
}
