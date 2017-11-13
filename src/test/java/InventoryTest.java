import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class InventoryTest {
    Inventory inventory;
    Phone phone = new Phone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);

    public InventoryTest() {
        this.inventory = new Inventory();
        inventory.addPhone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);
    }

    @Test
    public void addPhone() throws Exception {
        List lst = new LinkedList();
        lst.add(phone);
        assertTrue(lst.equals(inventory.phones));
    }

    @Test
    public void getPhone() throws Exception {
        assertEquals(inventory.getPhone("2568952"), phone);
    }
    @Test
    public void search() throws Exception {
        List lst = new LinkedList();
        lst.add(phone);
        List lst1 = inventory.search(phone);
        assertEquals(lst, lst1);
        
    }
}