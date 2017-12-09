package cart;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrivatPaymentTest {

    @Test
    public void pay() {
        PrivatPayment testPay = new PrivatPayment();
        assertTrue(testPay.pay(25d));
    }
}