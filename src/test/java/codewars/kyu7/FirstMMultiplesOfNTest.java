package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FirstMMultiplesOfNTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {5, 10, 15}, FirstMMultiplesOfN.multiples(3, 5));
    }
}