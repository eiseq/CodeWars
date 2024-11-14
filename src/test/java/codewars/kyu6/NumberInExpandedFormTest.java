package codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberInExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", NumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", NumberInExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", NumberInExpandedForm.expandedForm(70304));
    }
}
