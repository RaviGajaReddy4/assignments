package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testSomething() {
        int [] numbers = {5,6,3,9,4,7};
        assertEquals(9,Main.getMaxNumberFromArray(numbers));
        assertEquals(3,Main.getMinNumberFromArray(numbers));
        assertEquals(0,Main.getFactorial(0));
    }
}

