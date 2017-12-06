package cart;

import inventory.Phone;

import java.util.List;

abstract class CartDecorator extends Cart {
    private Cart decoratedCart;

    public CartDecorator(Cart decoratedCart) {
        this.decoratedCart = decoratedCart;
    }

    public void setDecoratedCart(Cart inputCart) {
        this.decoratedCart = inputCart;
    }


    public Cart getDecoratedCart() {
        return decoratedCart;
    }

    @Override
    public void setPhones(List<Phone> inputPhones) {
        getDecoratedCart().setPhones(inputPhones);
    }

    @Override
    public double computeTotalPrice() {
        return getDecoratedCart().computeTotalPrice();
    }

    @Override
    public void addPhone(Phone inputPhone) {
        getDecoratedCart().addPhone(inputPhone);
    }
}
