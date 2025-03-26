package interview.questions.concurrency.multithreading.codingchallenge;

public class EvenOddPrinter {
    private final int maxNumber;
    private int currentNumber;
    private final Object lock;
    private boolean isOddTurn;

    public EvenOddPrinter(int maxNumber) {
        this.maxNumber = maxNumber;
        this.currentNumber = 1;
        this.lock = new Object();
        this.isOddTurn = true;  // Start with odd numbers
    }

    // Thread class for printing odd numbers
    class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (currentNumber <= maxNumber) {
                synchronized (lock) {
                    try {
                        // Wait while it's not odd number's turn
                        while (!isOddTurn && currentNumber <= maxNumber) {
                            lock.wait();
                        }

                        if (currentNumber <= maxNumber) {
                            System.out.println("Odd Thread: " + currentNumber);
                            currentNumber++;
                            isOddTurn = false;
                            lock.notify();  // Notify even thread to proceed
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    // Thread class for printing even numbers
    class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (currentNumber <= maxNumber) {
                synchronized (lock) {
                    try {
                        // Wait while it's not even number's turn
                        while (isOddTurn && currentNumber <= maxNumber) {
                            lock.wait();
                        }

                        if (currentNumber <= maxNumber) {
                            System.out.println("Even Thread: " + currentNumber);
                            currentNumber++;
                            isOddTurn = true;
                            lock.notify();  // Notify odd thread to proceed
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void printNumbers() {
        Thread oddThread = new Thread(new OddPrinter(), "OddThread");
        Thread evenThread = new Thread(new EvenPrinter(), "EvenThread");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter(10);
        printer.printNumbers();
    }
}
