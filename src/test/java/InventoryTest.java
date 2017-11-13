import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class InventoryTest {
    Inventory inventory;
    Phone phone;

    public InventoryTest() {
        this.inventory = new Inventory();
    }

    @Test
    public void addPhone() throws Exception {

        inventory.addPhone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);
        inventory.phones.get(0);
        phone = new Phone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);
        List lst = new LinkedList();
        lst.add(phone);
        assertEquals(lst.get(0), inventory.phones.get(0));
    }

    @Test
    public void getPhone() throws Exception {
        assertEquals(inventory.getPhone("2568952"), phone);
    }
    @Test
    public void search() throws Exception {
        List lst = new LinkedList();
        lst.add(phone);
        assertTrue(inventory.search(phone).equals(lst));
    }
}