import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAdd() {
        Main main = new Main();
        assertEquals(5, main.add(2, 3));
    }
}
