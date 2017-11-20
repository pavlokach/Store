import java.util.List;

public class BonusDecorator extends CardDecorator {
    final float pr = 5f;

    public BonusDecorator(Cart cart) {
        super(cart);
    }

    public boolean ship() {

        Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, pr, true);
        List<Phone> tempPhones = getPhones();
        tempPhones.add(bonusPhone);
        getDecoratedCart().setPhones(tempPhones);
        return getDecoratedCart().ship();
    }
}
