package cart;

public interface PaymentStrategy {
    boolean pay(double price);
}
