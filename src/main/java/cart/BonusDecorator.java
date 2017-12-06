package cart;

import inventory.Phone;
import inventory.Type;


import java.util.List;

public class BonusDecorator extends CartDecorator {
    private static final float pr = 0f;

    public BonusDecorator(Cart cart) {
        super(cart);
    }


    @Override
    public boolean ship() {
        Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, pr, true);
        List<Phone> tempPhones = getPhones();
        tempPhones.add(bonusPhone);
        getDecoratedCart().setPhones(tempPhones);
        return getDecoratedCart().ship();
    }
}
