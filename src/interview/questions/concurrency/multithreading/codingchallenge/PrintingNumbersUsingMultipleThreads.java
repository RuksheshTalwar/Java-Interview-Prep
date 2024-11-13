package interview.questions.concurrency.multithreading.codingchallenge;

/**
 * Coding problem ->
 * Print numbers using multiple threads
 * Conditions ->
 * 1) even numbers are printed by Thread t1
 * 2) odd numbers are printed by Thread t2
 * 3) Multiples of 3 are not printed by any Thread
 */
public class PrintingNumbersUsingMultipleThreads {
    public static void main(String[] args) {
        Runnable oddPrinter = () -> printNumbers(1);  // Thread for odd numbers
        Runnable evenPrinter = () -> printNumbers(2); // Thread for even numbers

        Thread t1 = new Thread(oddPrinter); // Thread 1 prints odd numbers
        Thread t2 = new Thread(evenPrinter); // Thread 2 prints even numbers

        // Start the threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to print numbers based on the starting point
    public static void printNumbers(int start) {
        for (int i = start; i <= 30; i += 2) {
            if (i % 3 != 0) { // Skip multiples of 3
                System.out.println("Thread " + (start == 1 ? 1 : 2) + ": " + i);
            }
        }
    }


//        Thread t1 = new Thread(() -> {
//            for (int i = 1; i <= 30; i += 2) {
//                if (i % 3 != 0) { // Skip multiples of 3
//                    System.out.println("Thread 1: " + i);
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 2; i <= 30; i += 2) {
//                if (i % 3 != 0) { // Skip multiples of 3
//                    System.out.println("Thread 2: " + i);
//                }
//            }
//        });
//
//        // Start the threads
//        t1.start();
//        t2.start();
//
//        // Wait for both threads to finish
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
