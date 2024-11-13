package interview.questions.concurrency.multithreading;

import interview.questions.concurrency.multithreading.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };

        Thread t1 = new Thread(runnable, "Thread t1");
        Thread t2 = new Thread(runnable, "Thread t2");
    }
}
