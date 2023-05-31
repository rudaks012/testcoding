package bank.service;

import static org.junit.jupiter.api.Assertions.*;

import bank.customer.Customer;
import java.security.Provider.Service;
import org.junit.jupiter.api.Test;

class BankServiceTest {

    @Test
    void testBankService() {
        BankService bankService = new BankService();
        Customer customer = new Customer("홍길동");

        bankService.addCustomer(customer);
        assertEquals(customer, bankService.getCustomer("홍길동"));
    }

}