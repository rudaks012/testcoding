package bank;

public interface BankTransaction {

    void execute(BankAccount account, double amount);

}
