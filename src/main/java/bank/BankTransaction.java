package bank;

import bank.account.BankAccount;

public interface BankTransaction {

    void execute(BankAccount account, double amount);

}
