import java.util.List;

public class DiscountDecorator extends CardDecorator {
    private final double discount = 0.9d;

    public DiscountDecorator(Cart cart) {
        super(cart);
    }

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
