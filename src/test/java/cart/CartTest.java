package cart;

import inventory.Phone;
import inventory.Type;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CartTest {
    Cart cart;
    private Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, 25d, true);

    @Before
    public void setUp() throws Exception {
        cart = new Cart();
        cart.addPhone(bonusPhone);

    }


    @Test
    public void ship() {

    }

    @Test
    public void getPhones() {
        List<Phone> phones = new ArrayList<>();
        phones.add(bonusPhone);
        assertEquals(cart.getPhones(), phones);
    }

    @Test
    public void setPhones() {
        List<Phone> phones = new ArrayList<>();
        phones.add(bonusPhone);
        cart.setPhones(phones);
        assertEquals(cart.getPhones(), phones);
    }

    @Test
    public void computeTotalPrice() {
        double price = cart.computeTotalPrice();
        assertEquals(bonusPhone.getPrice(), price, 0.0000000000001d);
    }

    @Test
    public void addPhone() {
        assertEquals(cart.getPhones().get(cart.getPhones().size() - 1), bonusPhone);
    }
}