import inventory.Inventory;
import inventory.Phone;
import inventory.Type;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {
    private Inventory inventory;
    private Phone phone;

    @Before
    public void setUp() throws Exception {
        inventory = new Inventory();
        phone = new Phone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);
        inventory.addPhone("GRTH", "2568952", Type.SLIDER, (float) 25.5, false);
    }

    @After
    public void tearDown() throws Exception {
        inventory = new Inventory();
    }

    @Test
    public void addPhone() throws Exception {
        Phone checkPhone = (Phone) inventory.getPhones().get(inventory.getPhones().size() - 1);
        assertEquals(checkPhone.getSpec().getModel(), phone.getSpec().getModel());
        assertEquals(checkPhone.getSpec().getType(), phone.getSpec().getType());
        assertEquals(checkPhone.getSpec().isUsed(), phone.getSpec().isUsed());
    }

    @Test
    public void getPhone() throws Exception {
        Phone checkPhone = inventory.getPhone("2568952");
        assertEquals(checkPhone.getSpec().getModel(), phone.getSpec().getModel());
        assertEquals(checkPhone.getSpec().getType(), phone.getSpec().getType());
        assertEquals(checkPhone.getSpec().isUsed(), phone.getSpec().isUsed());
    }

    @Test
    public void search() throws Exception {
        Phone checkPhone = (Phone) inventory.getPhones().get(0);
        assertEquals(checkPhone.getSpec().getModel(), phone.getSpec().getModel());
        assertEquals(checkPhone.getSpec().getType(), phone.getSpec().getType());
        assertEquals(checkPhone.getSpec().isUsed(), phone.getSpec().isUsed());
    }

    @Test
    public void getPhones() throws Exception {
        Phone checkPhone = (Phone) inventory.getPhones().get(0);
        assertEquals(checkPhone.getSpec().getModel(), phone.getSpec().getModel());
        assertEquals(checkPhone.getSpec().getType(), phone.getSpec().getType());
        assertEquals(checkPhone.getSpec().isUsed(), phone.getSpec().isUsed());
    }
}