public class Main {
    public static void main(String[] args) {
        cart.Cart cardSample = new cart.Cart();
//        cart.Cart cardSample = new cart.BonusDecorator(new cart.DiscountDecorator(new cart.Cart()));
        Seller seller = new Seller(cardSample);
        Customer customer = new Customer(cardSample);
        cardSample.addObserver(seller);
        cardSample.addObserver(customer);
        inventory.Phone bonusPhone = new inventory.Phone("mhyt", "56374TY", inventory.Type.BAR, 10f, true);
        inventory.Phone bonusPhone1 = new inventory.Phone("mryt", "56374TY", inventory.Type.BAR, 10f, true);
        cardSample.addPhone(bonusPhone);
        cardSample.deleteObserver(customer);
        cardSample.addPhone(bonusPhone1);

        // System.out.println(cardSample.computeTotalPrice());
        //   System.out.println(cardSample.ship());
    }
}
