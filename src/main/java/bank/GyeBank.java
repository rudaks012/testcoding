package bank;

import bank.account.BankAccount;
import bank.customer.Customer;
import bank.deposit.DepositTransaction;
import bank.manage.BankManager;
import bank.service.BankService;
import bank.teller.BankTeller;
import bank.withdraw.WithdrawTransaction;

public class GyeBank {

    public static void main(String[] args) {
        BankService service = new BankService();

        BankManager manager = new BankManager();
        BankTeller teller = new BankTeller();

        Customer john = new Customer("John");
        manager.addCustomer(service, john);

        BankAccount johnAccount = new BankAccount("123456", 1000);
        teller.createAccount(john, johnAccount);

        // Add another customer
        Customer jane = new Customer("Jane");
        manager.addCustomer(service, jane);

        BankAccount janeAccount = new BankAccount("654321", 500);
        teller.createAccount(jane, janeAccount);

        // Now John can perform transactions
        service.performTransaction(new DepositTransaction(), johnAccount, 500);

        // John can also withdraw money
        service.performTransaction(new WithdrawTransaction(), johnAccount, 200);

        // John can transfer money to Jane
        service.performTransfer(johnAccount, janeAccount, 300);
    }
}

