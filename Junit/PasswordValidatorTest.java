import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Strong1A"));
    }

    @Test
    void testInvalidPasswordShort() {
        assertFalse(PasswordValidator.isValid("S1"));
    }

    @Test
    void testInvalidPasswordNoUpperCase() {
        assertFalse(PasswordValidator.isValid("password1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
    }
}