package Arrays;

import junit.framework.TestCase;
import org.junit.Test;

public class SumOfDigitsTest extends TestCase {
    @Test
    public void test() {
        var sum = new SumOfDigits();
        assertEquals(10, sum.recursiveSumDigits(1234));
    }

}