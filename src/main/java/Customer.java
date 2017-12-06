import cart.Cart;

import java.util.Observable;

public class Customer extends User {
    public Cart cart;

    public Customer(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == cart) {
            System.out.println("You just added a new item: " + arg.toString());
        }
    }
}
