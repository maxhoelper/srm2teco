import static org.junit.Assert.*;
import org.junit.Test;

public class MaxUtilsTest {
    @Test
    public void testFindMax_NormalArray() {
        assertEquals(9, MaxUtils.findMax(new int[]{1, 5, 9, 3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMax_EmptyArray() {
        MaxUtils.findMax(new int[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMax_NullArray() {
        MaxUtils.findMax(null);
    }
}