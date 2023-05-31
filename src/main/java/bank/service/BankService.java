package bank.service;

import bank.BankTransaction;
import bank.TransferTransaction;
import bank.account.BankAccount;
import bank.customer.Customer;
import java.util.HashMap;
import java.util.Map;

public class BankService {

    private Map<String, Customer> customers;

    public BankService() {
        this.customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        this.customers.put(customer.getName(), customer);
    }

    public void performTransaction(BankTransaction transaction, BankAccount account, double amount) {
        transaction.execute(account, amount);
    }

    public void performTransfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        performTransaction(new TransferTransaction(toAccount), fromAccount, amount);
    }

    public Customer getCustomer(String name) {
        return this.customers.get(name);
    }

}
