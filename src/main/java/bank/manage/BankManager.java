package bank.manage;

import bank.account.BankAccount;
import bank.customer.Customer;
import bank.employee.BankEmployee;
import bank.service.BankService;

public class BankManager implements BankEmployee {

    @Override
    public void addCustomer(BankService service, Customer customer) {
        service.addCustomer(customer);
        System.out.println("고객 " + customer.getName() + " 은행 서비스에 추가 되었습니다.");
    }

    @Override
    public void createAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
        System.out.println("번호가 있는 은행 계좌" + account.getAccountNumber() + "위해 만든" + customer.getName());
    }
}
