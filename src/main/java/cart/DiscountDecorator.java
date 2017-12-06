package cart;

import inventory.Phone;

import java.util.List;

public class DiscountDecorator extends CartDecorator {
    private static final double discount = 0.9d;

    public DiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double computeTotalPrice() {
        double price = (double) 0;
        List<Phone> phones = this.getPhones();
        for (Phone checkPhone : phones
                ) {
            price += checkPhone.getPrice();
        }
        return price * discount;
    }
}
