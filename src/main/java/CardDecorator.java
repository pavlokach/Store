abstract class CardDecorator extends Cart {
    private Cart decoratedCart;

    public Cart getDecoratedCart() {
        return decoratedCart;
    }

    public void setDecoratedCart(Cart decoratedCart) {
        this.decoratedCart = decoratedCart;
    }

    public CardDecorator(Cart decoratedCart) {
        this.decoratedCart = decoratedCart;
    }
}
