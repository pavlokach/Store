package cart;

import inventory.Phone;
import inventory.Type;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusDecoratorTest {
    private Cart cart = new BonusDecorator(new Cart());
    private BonusDecorator testBonusDecorator = new BonusDecorator(cart);

    @Test
    public void ship() {
        Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, BonusDecorator.getPRICE(), true);
        cart.ship();
        Phone checkPhone = cart.getPhones().get(0);
        assertTrue(checkPhone.getPrice() == bonusPhone.getPrice());
        assertTrue(checkPhone.getSerialNumber() == bonusPhone.getSerialNumber());
        assertTrue(bonusPhone.getSpec().sameAs(checkPhone.getSpec()));
    }

    @Test
    public void getPRICE() {
        assertEquals(0d, BonusDecorator.getPRICE(), 0.0001d);
    }
}