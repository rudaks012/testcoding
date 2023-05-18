package bank;

public class BankAccount {

    private double balance;
    private final String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("자금 부족");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
