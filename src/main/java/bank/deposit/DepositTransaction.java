package bank.deposit;

import bank.account.BankAccount;
import bank.BankTransaction;

public class DepositTransaction implements BankTransaction {

    @Override
    public void execute(BankAccount account, double amount) {
        account.deposit(amount);
    }
}
