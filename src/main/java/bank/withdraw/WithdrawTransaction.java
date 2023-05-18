package bank.withdraw;

import bank.account.BankAccount;
import bank.BankTransaction;

public class WithdrawTransaction implements BankTransaction {

    @Override
    //인출 거래를 위한 구체적인 클래스(OCP, LSP)
    public void execute(BankAccount account, double amount) {
        account.withdraw(amount);
    }
}
