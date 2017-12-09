package inventory;

import inventory.PhoneSpec;
import inventory.Type;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneSpecTest {
    private PhoneSpec phoneSpec;

    public PhoneSpecTest() {
        this.phoneSpec = new PhoneSpec(Type.SLIDER, "GRTY", true);
    }

    @Test
    public void getType() throws Exception {
        assertEquals(Type.SLIDER, phoneSpec.getType());
    }

    @Test
    public void getModel() throws Exception {
        assertEquals("GRTY", phoneSpec.getModel());
    }

    @Test
    public void isUsed() throws Exception {
        assertEquals(true, phoneSpec.isUsed());
    }

    @Test
    public void sameAs() throws Exception {
        PhoneSpec phoneSpec2 = new PhoneSpec(Type.SLIDER, "GRTY", true);
        assertTrue(phoneSpec.sameAs(phoneSpec2));
    }
}