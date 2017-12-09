import cart.Cart;
import inventory.Phone;
import inventory.Type;

public class Main {
    public static void main(String[] args) {
//        cart.Cart cardSample = new cart.Cart();
//        cart.Cart cardSample = new cart.BonusDecorator(
//                new cart.DiscountDecorator(new cart.Cart()));
//        observer.Seller seller = new observer.Seller();
//        observer.Customer customer = new observer.Customer();
//        cardSample.addObserver(customer);
//        cardSample.addObserver(seller);
//        inventory.Phone bonusPhone = new inventory.Phone("mhyt",
//                "56374TY", inventory.Type.BAR, 10f, true);
//        inventory.Phone bonusPhone1 = new inventory.Phone("mryt",
//                "56374TY", inventory.Type.BAR, 10f, true);
//        cardSample.addPhone(bonusPhone);
//        cardSample.addPhone(bonusPhone1);
        Phone bonusPhone = new Phone("mhyt", "56374TY", Type.BAR, 25d, true);
        Cart cart = new Cart();
        cart.addPhone(bonusPhone);
        System.out.println(cart.getPhones());
        System.out.println(cart.computeTotalPrice());
    }
}
