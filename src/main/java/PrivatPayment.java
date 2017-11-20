public class PrivatPayment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        return true;
    }
}
