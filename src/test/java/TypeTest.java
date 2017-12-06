import inventory.Type;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeTest {
    @Test
    public void getString() throws Exception {
        Type testObject = Type.BAR;
        assertEquals(testObject.getString(), Type.BAR.getString());
        testObject = Type.FLIP;
        assertEquals(testObject.getString(), Type.FLIP.getString());
        testObject = Type.SLIDER;
        assertEquals(testObject.getString(), Type.SLIDER.getString());
        testObject = Type.SMARTPHONE;
        assertEquals(testObject.getString(), Type.SMARTPHONE.getString());
    }
}