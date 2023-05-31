package bank.customer;

import static org.junit.jupiter.api.Assertions.*;

import bank.account.BankAccount;
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

}