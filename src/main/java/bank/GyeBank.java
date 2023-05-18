package bank;

import bank.account.BankAccount;
import bank.deposit.DepositTransaction;
import bank.service.BankService;
import bank.withdraw.WithdrawTransaction;

public class GyeBank {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);
        BankService service = new BankService();

        service.performTransaction(account, new DepositTransaction(), 500);
        System.out.println(account.getBalance()); // 1500

        service.performTransaction(account, new WithdrawTransaction(), 200);
        System.out.println(account.getBalance()); // 1300
    }

}
