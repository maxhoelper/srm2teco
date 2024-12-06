import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {
    @Test
    public void testAdd() {
        Add add = new Add();
        assertEquals(5, add.add(2, 3));
    }
}