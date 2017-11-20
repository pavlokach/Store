public class CashPayment implements PaymentStrategy{

    @Override
    public boolean pay(double price) {
        return true;
    }
}
