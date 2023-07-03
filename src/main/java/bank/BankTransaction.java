package bank;

import bank.account.BankAccount;

public interface BankTransaction {

    //설명
    //BankTransaction 인터페이스는 execute 메소드를 가지고 있습니다.
    //execute 메소드는 BankAccount 객체와 double 타입의 amount를 인자로 받습니다.

    void execute(BankAccount account, double amount);

}
