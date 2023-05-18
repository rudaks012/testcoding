package bank.service;

import bank.account.BankAccount;
import bank.BankTransaction;

public class BankService {

    public void performTransaction(BankAccount account, BankTransaction transaction, double amount) {
        transaction.execute(account, amount);
    }

}
