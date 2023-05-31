package bank.customer;

import bank.account.BankAccount;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private Map<String, BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        this.accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount getAccount(String accountNumber) {
        return this.accounts.get(accountNumber);
    }

    public String getName() {
        return name;
    }
}
