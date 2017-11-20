abstract class CardDecorator extends Cart{
    protected Cart decoratedCart;

    public CardDecorator(Cart decoratedCart) {
        this.decoratedCart = decoratedCart;
    }
}
