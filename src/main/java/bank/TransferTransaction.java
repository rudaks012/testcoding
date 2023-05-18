package bank;

import bank.account.BankAccount;

public class TransferTransaction implements BankTransaction {
    private BankAccount toAccount;

    public TransferTransaction(BankAccount toAccount) {
        this.toAccount = toAccount;
    }

    @Override
    public void execute(BankAccount fromAccount, double amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        } else {
            throw new IllegalArgumentException("자금 부족");
        }

    }
}
