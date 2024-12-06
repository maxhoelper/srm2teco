import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverse_NormalString() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    public void testReverse_EmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    public void testReverse_NullString() {
        assertNull(StringUtils.reverse(null));
    }
}