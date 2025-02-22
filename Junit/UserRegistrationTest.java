import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "john@example.com", "Secure123"));
    }

    @Test
    void testInvalidUserRegistration() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "john@example.com", "Secure123"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "johnexample.com", "Secure123"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "123"));
    }
}