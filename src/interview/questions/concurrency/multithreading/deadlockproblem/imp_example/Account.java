package interview.questions.concurrency.multithreading.deadlockproblem.imp_example;

public class Account {
    private final String accountId;
    private double balance;
    private final Object lock = new Object();

    public Account(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public Object getLock() {
        return lock;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
