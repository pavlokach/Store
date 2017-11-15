import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {


    private List phones;

    Inventory() {
        this.phones = new LinkedList();
    }

    void addPhone(String model, String serialNumber, Type type, float price, boolean used) {
        Phone phone = new Phone(model, serialNumber, type, price, used);
        phones.add(phone);
    }

    Phone getPhone(String serialNumber) {
        for (Iterator phone1 = phones.iterator(); phone1.hasNext(); ) {
            Phone phone = (Phone) phone1.next();
            if (phone.getSerialNumber().equals(serialNumber)) {
                return phone;
            }
        }
        return null;
    }

    public List search(Phone searchPhone) {
        List matchingPhones = new LinkedList();
        for (Iterator phone1 = phones.iterator(); phone1.hasNext(); ) {
            Phone phone = (Phone) phone1.next();
            if (phone.getSpec().sameAs(searchPhone.getSpec())) {
                continue;
            }
            matchingPhones.add(phone);
        }
        return matchingPhones;
    }

    List getPhones() {
        return phones;
    }
}
