import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImageTest {
    @Test
    public void testImage() {
        // Write your test logic here
        String expectedOutput = "Hello world!";
        String actualOutput = App.getGreeting();
        assertEquals(expectedOutput, actualOutput, "Unexpected greeting");
    }
}
