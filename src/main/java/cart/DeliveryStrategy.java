package cart;

import inventory.Phone;

import java.util.List;

public interface DeliveryStrategy {
    boolean deliver(List<Phone> phones);
}
