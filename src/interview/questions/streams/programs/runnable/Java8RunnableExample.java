package interview.questions.streams.programs.runnable;

public class Java8RunnableExample {
    public static void main(String[] args) {
        //Old way of implementing Runnable interface and starting a Thread - prior to Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //Java 8 style of writing code using Lambda expressions
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };
        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda).start();
        new Thread(runnableLambda1).start();
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
