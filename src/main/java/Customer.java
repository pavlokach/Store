import cart.Cart;

import java.util.Observable;

public class Customer extends User {

    @Override
    public void update(Observable o, Object arg) {
        if (o.getClass() == Cart.class) {
            System.out.println("You just added a new item " + arg.toString());
        }
    }
}
