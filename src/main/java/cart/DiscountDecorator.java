package cart;


public class DiscountDecorator extends CartDecorator {
    private static final double DISCOUNT = 0.9d;

    public DiscountDecorator(Cart cart) {
        super(cart);
    }

    public static double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double computeTotalPrice() {
        double price = super.computeTotalPrice();
        return price * getDISCOUNT();
    }
}
