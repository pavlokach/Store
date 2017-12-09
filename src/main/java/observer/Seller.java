package observer;

import cart.Cart;

import java.util.Observable;

public class Seller extends User {
    private Cart cart = null;


    @Override
    public void update(Observable o, Object arg) {
        if (o.getClass() == Cart.class) {
            System.out.println("New item to sell: " + arg.toString());
        }
    }
}
