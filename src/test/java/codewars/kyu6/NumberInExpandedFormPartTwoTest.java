package codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberInExpandedFormPartTwoTest {
    @Test
    public void testSomething() {
        assertEquals("40000 + 3000 + 200 + 10", NumberInExpandedFormPartTwo.expandedForm(43210));
        assertEquals("1 + 2/10 + 4/100", NumberInExpandedFormPartTwo.expandedForm(1.24));
        assertEquals("4 + 2/10 + 8/100", NumberInExpandedFormPartTwo.expandedForm(4.28));
        assertEquals("7 + 3/10 + 4/1000", NumberInExpandedFormPartTwo.expandedForm(7.304));
        assertEquals("5/10 + 1/1000", NumberInExpandedFormPartTwo.expandedForm(0.501));
        assertEquals("4/1000", NumberInExpandedFormPartTwo.expandedForm(.004));
        assertEquals("80 + 8 + 3/10 + 5/100 + 3/1000 + 8/10000 + 2/100000 + 4/1000000", NumberInExpandedFormPartTwo.expandedForm(88.353824));
    }
}
