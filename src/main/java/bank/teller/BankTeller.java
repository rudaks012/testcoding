package bank.teller;

import bank.account.BankAccount;
import bank.customer.Customer;
import bank.employee.BankEmployee;
import bank.service.BankService;

public class BankTeller implements BankEmployee {

    @Override
    public void addCustomer(BankService service, Customer customer) {
        throw new addCustomerException();
    }

    @Override
    public void createAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
        System.out.println("번호가 있는 은행 계좌" + account.getAccountNumber() + "위해 만든" + customer.getName());
    }
}
