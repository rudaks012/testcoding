package bank;

public class DepositTransaction implements BankTransaction{

    @Override
    public void execute(BankAccount account, double amount) {
        account.deposit(amount);
    }
}
