import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {
    @Test
    public void testAdd() {
        Add add = new Add();
        assertEquals(5, add.add(2, 3));
    }

    @Test
    public void testAdd2() {
        Add add = new Add();
        assertEquals(7, add.add(4, 3));
    }

    @Test
    public void testAdd3() {
        Add add = new Add();
        assertEquals(4, add.add(2, 1));
    }

    @Test
    public void testAdd4() {
        Add add = new Add();
        assertEquals(12, add.add(8, 4));
    }
}