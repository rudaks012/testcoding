package bank.service;

import bank.BankTransaction;
import bank.account.BankAccount;
import bank.customer.Customer;
import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<String, Customer> customers;

    public BankService() {
        this.customers = new HashMap<>();
    }

    public void performTransaction(BankAccount account, BankTransaction transaction, double amount) {
        transaction.execute(account, amount);
    }

}
