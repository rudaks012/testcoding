package bank.account;

public class lackOfFundsException extends RuntimeException {

    public static final String LACK_OF_FUNDS = "자금이 부족합니다";

    public lackOfFundsException() {
        super(LACK_OF_FUNDS);
    }
}
