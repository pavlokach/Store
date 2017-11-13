import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneSpecTest {
    PhoneSpec phoneSpec;

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
        assertEquals(true, phoneSpec.used);
    }

    @Test
    public void equals() throws Exception {
        PhoneSpec phoneSpec1 = new PhoneSpec(Type.SLIDER, "GRTY", false);
        PhoneSpec phoneSpec2 = new PhoneSpec(Type.SLIDER, "GRTY", true);
        assertNotEquals(phoneSpec1, phoneSpec);
        assertTrue(phoneSpec.equals(phoneSpec2));

    }
}