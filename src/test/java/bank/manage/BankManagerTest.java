package bank.manage;

import static org.junit.jupiter.api.Assertions.*;

import bank.customer.Customer;
import bank.service.BankService;
import org.junit.jupiter.api.Test;

class BankManagerTest {

    @Test
    void testBankManager() {
        BankManager bankManager = new BankManager();
        BankService service = new BankService();
        Customer customer = new Customer("홍길동");
        bankManager.addCustomer(service, customer);
        assertEquals(customer, service.getCustomer("홍길동"));
    }

}