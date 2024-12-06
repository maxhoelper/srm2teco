import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayUtilsTest {
    @Test
    public void testSortArray_NormalArray() {
        assertArrayEquals(new int[]{1, 2, 3}, ArrayUtils.sortArray(new int[]{3, 1, 2}));
    }

    @Test
    public void testSortArray_EmptyArray() {
        assertArrayEquals(new int[]{}, ArrayUtils.sortArray(new int[]{}));
    }

    @Test
    public void testSortArray_NullArray() {
        assertNull(ArrayUtils.sortArray(null));
    }
}