package interview.questions.concurrency.multithreading.synchronization;

public class BankAccountWithSynchronizedDeposit {
    private double balance;

    // Without synchronized - could lead to race conditions
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    // With synchronized - thread-safe
    public synchronized void depositSafe(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }
}
