package cart;

import inventory.Phone;

import java.util.List;

abstract class CartDecorator extends Cart {
    private Cart decoratedCart;

    public CartDecorator(Cart inputDecoratedCart) {
        this.decoratedCart = inputDecoratedCart;
    }


    public Cart getDecoratedCart() {
        return decoratedCart;
    }

    @Override
    public void setPhones(List<Phone> inputPhones) {
        getDecoratedCart().setPhones(inputPhones);
    }


    @Override
    public void addPhone(Phone inputPhone) {
        getDecoratedCart().addPhone(inputPhone);
    }
}
