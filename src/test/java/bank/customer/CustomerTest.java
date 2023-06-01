package bank.customer;

import static org.junit.jupiter.api.Assertions.*;

import bank.account.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void testCustomer() {
        Customer customer = new Customer("홍길동");
        BankAccount account = new BankAccount("123456", 500);
        customer.addAccount(account);
        assertEquals("홍길동", customer.getName());
        assertEquals(account, customer.getAccount("123456"));
    }

    @DisplayName("새로운 고객이 주어졌을 때 은행 계좌를 추가할 때 추가된 계좌를 가져옵니다.")
    @Test
    void testCustomerAddAccount() {
        Customer customer = new Customer("홍길동");
        BankAccount account = new BankAccount("123456", 500);

        customer.addAccount(account);
        assertEquals(account, customer.getAccount("123456"));
    }


}