package cart;


import inventory.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Cart extends Observable {
    private List<Phone> phones = new ArrayList<>();
    private PaymentStrategy paymentStrategy = new CashPayment();
    private DeliveryStrategy deliveryStrategy = new DeliveryNovaPoshta();


    public boolean ship() {
        System.out.println(phones);
        return deliveryStrategy.deliver(phones);
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> inputPhones) {
        this.phones = inputPhones;
    }

    public double computeTotalPrice() {
        double price = (double) 0;
        for (Phone checkPhone : phones
                ) {
            price += checkPhone.getPrice();
        }
        return price;
    }

    public void addPhone(Phone inputPhone) {
        phones.add(inputPhone);
        setChanged();
        notifyObservers(inputPhone);
    }
}
