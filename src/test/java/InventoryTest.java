import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class InventoryTest {
    Inventory inventory;

    public InventoryTest() {
        this.inventory = new Inventory();
    }

    @Test
    public void addPhone() throws Exception {

        inventory.addPhone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);
        Phone phone = new Phone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);
        List lst = new LinkedList();
        lst.add(phone);
        assertEquals(lst, inventory.phones);
    }
}