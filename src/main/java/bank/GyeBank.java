package bank;

import bank.account.BankAccount;
import bank.customer.Customer;
import bank.deposit.DepositTransaction;
import bank.service.BankService;
import bank.withdraw.WithdrawTransaction;

public class GyeBank {

    public static void main(String[] args) {
        BankService service = new BankService();
        Customer john = new Customer("John");

        BankAccount johnAccount1 = new BankAccount("123456", 1000);
        BankAccount johnAccount2 = new BankAccount("789101", 500);

        john.addAccount(johnAccount1);
        john.addAccount(johnAccount2);
        service.addCustomer(john);
        service.performTransaction(new DepositTransaction(), service.getCustomer("John").getAccount("123456"), 500);
        System.out.println(service.getCustomer("John").getAccount("123456").getBalance()); // 1500

        service.performTransaction(new WithdrawTransaction(), service.getCustomer("John").getAccount("123456"), 200);
        System.out.println(service.getCustomer("John").getAccount("123456").getBalance()); // 1300

        service.performTransfer(service.getCustomer("John").getAccount("123456"), service.getCustomer("John").getAccount("789101"), 300);
        System.out.println(service.getCustomer("John").getAccount("123456").getBalance()); // 1000
        System.out.println(service.getCustomer("John").getAccount("789101").getBalance()); // 800
    }

}
