import cart.Cart;

import java.util.Observable;

public class Seller extends User {
    private Cart cart = null;

    public Seller(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == cart) {
            System.out.println("new item to sell: " + arg.toString());
        }
    }
}
