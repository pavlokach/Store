import java.util.List;

public class BonusDecorator extends CardDecorator {
    public BonusDecorator(Cart cart) {
        super(cart);
    }

    public boolean ship() {
        Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, 5f, true);
        List<Phone> tempPhones = getPhones();
        tempPhones.add(bonusPhone);
        decoratedCart.setPhones(tempPhones);
        return decoratedCart.ship();
    }
}
