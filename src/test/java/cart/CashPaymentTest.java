package cart;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashPaymentTest {

    @Test
    public void pay() {
        CashPayment testCashPayment = new CashPayment();
        assertTrue(testCashPayment.pay(25d));
    }
}