package bank.account;

import bank.deposit.DepositTransaction;
import bank.service.BankService;
import bank.withdraw.WithdrawTransaction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testBankAccount() {
        BankAccount account = new BankAccount("123456", 500);
        assertEquals("123456", account.getAccountNumber());
        assertEquals(500, account.getBalance());
    }

    @DisplayName("새로운 BankAccount가 주어지면 입금시 500 잔고는 500")
    @Test
    public void testBankAccountDeposit() {
        // Given
        BankAccount account = new BankAccount("123456", 0);
        // When
        account.deposit(500);
        // Then
        assertEquals(500, account.getBalance());
    }

    @DisplayName("잔고가 500인 BankAccount가 주어졌을 때 출금 시 200 잔고는 300")
    @Test
    public void testBankAccountWithdraw() {
        // Given
        BankAccount account = new BankAccount("123456", 500);
        // When
        account.withdraw(200);
        // Then
        assertEquals(300, account.getBalance());
    }

    @DisplayName("잔액이 500인 BankAccount에 600을 인출할 때 Exception 발생")
    @Test
    public void testBankAccountWithdrawInsufficientFunds() {
        // Given
        BankAccount account = new BankAccount("123456", 500);
        // When & Then
        assertThrows(lackOfFundsException.class, () -> {
            account.withdraw(600);
        });
    }

    @DisplayName("BankService 제공 예금 거래를 수행할 때 계정 잔액을 업데이트합니다.")
    @Test
    void testBankServiceDeposit() {
        BankService service = new BankService();
        BankAccount account = new BankAccount("123456", 500);

        service.performTransaction(new DepositTransaction(), account, 200);
        assertEquals(700, account.getBalance());
    }

    @DisplayName("BankService 제공 출금 거래를 수행할 때 계정 잔액을 업데이트합니다.")
    @Test
    void testBankServiceWithdraw() {
        BankService service = new BankService();
        BankAccount account =new BankAccount("123456", 500);

        service.performTransaction(new WithdrawTransaction(), account, 200);

        assertEquals(300, account.getBalance());
    }

}