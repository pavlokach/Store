package cart;

import inventory.Phone;
import inventory.Type;


import java.util.List;

public class BonusDecorator extends CartDecorator {
    private static final double PRICE = 0d;

    public BonusDecorator(Cart cart) {
        super(cart);
    }

    public static double getPRICE() {
        return PRICE;
    }

    @Override
    public boolean ship() {
        Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, PRICE, true);
        List<Phone> tempPhones = getPhones();
        tempPhones.add(bonusPhone);
        getDecoratedCart().setPhones(tempPhones);
        return getDecoratedCart().ship();
    }
}
