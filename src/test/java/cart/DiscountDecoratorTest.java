package cart;

import inventory.Phone;
import inventory.Type;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountDecoratorTest {
    private Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, 25d, true);
    private Cart cart = new DiscountDecorator(new Cart());

    @Test
    public void getDISCOUNT() {
        assertEquals(0.9d, DiscountDecorator.getDISCOUNT(), 0.00000001d);
    }

    @Test
    public void computeTotalPrice() {
        System.out.println(cart.getPhones());
        cart.addPhone(bonusPhone);
        System.out.println(cart.getPhones());
        double actualPrice = cart.computeTotalPrice();
        double correctPrice = bonusPhone.getPrice() * DiscountDecorator.getDISCOUNT();
        assertEquals(correctPrice, actualPrice, 0.0000001d);
    }
}