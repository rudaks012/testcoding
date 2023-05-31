package bank.teller;

public class addCustomerException extends RuntimeException {

    public static final String CANNOT_ADD_CUSTOMERS = "은행원은 고객을 추가할 수 없습니다.";

    public addCustomerException() {
        super(CANNOT_ADD_CUSTOMERS);
    }
}
