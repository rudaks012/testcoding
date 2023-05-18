package bank;

public class BankService {

    public void performTransaction(BankAccount account, BankTransaction transaction, double amount) {
        transaction.execute(account, amount);
    }

}
