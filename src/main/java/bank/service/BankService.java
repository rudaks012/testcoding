package bank.service;

import bank.BankTransaction;
import bank.account.BankAccount;

public class BankService {

    public void performTransaction(BankAccount account, BankTransaction transaction, double amount) {
        transaction.execute(account, amount);
    }

}
