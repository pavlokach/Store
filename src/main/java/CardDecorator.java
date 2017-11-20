abstract class CardDecorator extends Cart {
    private Cart decoratedCart;

    public CardDecorator(Cart decoratedCart) {
        this.decoratedCart = decoratedCart;
    }

    public void setDecoratedCart(Cart inputCart) {
        this.decoratedCart = inputCart;
    }

    public Cart getDecoratedCart() {

        return decoratedCart;
    }


}
