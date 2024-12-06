import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeUtilsTest {
    @Test
    public void testIsPrime_PrimeNumber() {
        assertTrue(PrimeUtils.isPrime(13));
    }

    @Test
    public void testIsPrime_NotPrimeNumber() {
        assertFalse(PrimeUtils.isPrime(12));
    }

    @Test
    public void testIsPrime_NegativeNumber() {
        assertFalse(PrimeUtils.isPrime(-5));
    }

    @Test
    public void testIsPrime_One() {
        assertFalse(PrimeUtils.isPrime(1));
    }
}