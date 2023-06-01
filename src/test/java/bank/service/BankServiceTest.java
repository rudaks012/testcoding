package bank.service;

import static org.junit.jupiter.api.Assertions.*;

import bank.customer.Customer;
import java.security.Provider.Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankServiceTest {

    @Test
    void testBankService() {
        BankService bankService = new BankService();
        Customer customer = new Customer("홍길동");

        bankService.addCustomer(customer);
        assertEquals(customer, bankService.getCustomer("홍길동"));
    }

    @DisplayName("주어진 BankService 새 고객을 추가할 때 그런 다음 추가된 고객을 가져옵니다.")
    @Test
    void testBankServiceAddCustomer() {
        BankService service = new BankService();
        Customer customer = new Customer("홍길동");

        service.addCustomer(customer);
        assertEquals(customer, service.getCustomer("홍길동"));

    }


}