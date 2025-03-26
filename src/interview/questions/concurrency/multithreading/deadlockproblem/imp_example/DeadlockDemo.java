package interview.questions.concurrency.multithreading.deadlockproblem.imp_example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {
    // Demonstrates deadlock-prone transfer
    public static void transferDeadlockProne(Account fromAccount, Account toAccount, double amount) {
        synchronized (fromAccount.getLock()) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on " + fromAccount.getAccountId());

            try {
                Thread.sleep(100); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (toAccount.getLock()) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on " + toAccount.getAccountId());
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
            }
        }
    }

    // Demonstrates deadlock-free transfer using account ordering
    public static void transferDeadlockFree(Account fromAccount, Account toAccount, double amount) {
        Account firstLock, secondLock;

        // Order locks based on account ID to prevent circular wait
        if (fromAccount.getAccountId().compareTo(toAccount.getAccountId()) < 0) {
            firstLock = fromAccount;
            secondLock = toAccount;
        } else {
            firstLock = toAccount;
            secondLock = fromAccount;
        }

        synchronized (firstLock.getLock()) {
            System.out.println(Thread.currentThread().getName() + " acquired first lock on " + firstLock.getAccountId());

            synchronized (secondLock.getLock()) {
                System.out.println(Thread.currentThread().getName() + " acquired second lock on " + secondLock.getAccountId());

                if (firstLock == fromAccount) {
                    fromAccount.withdraw(amount);
                    toAccount.deposit(amount);
                } else {
                    toAccount.deposit(amount);
                    fromAccount.withdraw(amount);
                }
            }
        }
    }

    // Demonstrates deadlock-free transfer using tryLock with timeout
    public static boolean transferWithTimeout(Account fromAccount, Account toAccount, double amount) {
        ReentrantLock lockFrom = new ReentrantLock();
        ReentrantLock lockTo = new ReentrantLock();

        try {
            // Try to acquire both locks with timeout
            if (lockFrom.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    if (lockTo.tryLock(1, TimeUnit.SECONDS)) {
                        try {
                            fromAccount.withdraw(amount);
                            toAccount.deposit(amount);
                            return true;
                        } finally {
                            lockTo.unlock();
                        }
                    }
                } finally {
                    lockFrom.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        // Create two accounts
        Account account1 = new Account("ACC1", 1000);
        Account account2 = new Account("ACC2", 1000);

        // Demonstrate deadlock-prone transfers
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                transferDeadlockProne(account1, account2, 10);
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                transferDeadlockProne(account2, account1, 10);
            }
        }, "Thread-2");

        // Start threads (likely to deadlock)
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balances (should remain same as initial if all transfers completed):");
        System.out.println("Account 1: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getBalance());
    }
}