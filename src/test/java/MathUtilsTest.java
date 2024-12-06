import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {
    @Test
    public void testFactorial_PositiveNumber() {
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    public void testFactorial_Zero() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_NegativeNumber() {
        MathUtils.factorial(-1);
    }
}