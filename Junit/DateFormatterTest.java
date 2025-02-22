import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    @Test
    void testValidDate() {
        assertEquals("15-02-2023", DateFormatter.formatDate("2023-02-15"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("15-02-2023");
        });
    }
}