import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final App app = new App();

    @Test
    void testSayHello() {
        assertEquals("Hello CI/CD", app.sayHello());
    }
}
