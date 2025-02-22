import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, calculator.multiply(4, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
