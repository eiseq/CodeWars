package codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnoughSpaceTest  {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, EnoughSpace.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, EnoughSpace.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, EnoughSpace.enough(20, 5, 5));
    }
}
