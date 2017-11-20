import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {
    private Phone phone;

    public PhoneTest() {
        this.phone = new Phone("GRTH", "2568952", Type.SLIDER, 25.5, false);
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(25.5, phone.getPrice(), 0.1);
    }

    @Test
    public void setPrice() throws Exception {
        phone.setPrice(35.5);
        assertEquals(35.5, phone.getPrice(), 0.1);
    }

    @Test
    public void getSpec() throws Exception {
        assertEquals(phone.getSpec(), phone.getSpec());
    }

    @Test
    public void getSerialNumber() throws Exception {
        assertEquals("2568952", phone.getSerialNumber());
    }
}