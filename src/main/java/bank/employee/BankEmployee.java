package bank.employee;

import bank.account.BankAccount;
import bank.customer.Customer;
import bank.service.BankService;

public interface BankEmployee {

    void addCustomer(BankService service, Customer customer);
    void createAccount(Customer customer, BankAccount account);

}
