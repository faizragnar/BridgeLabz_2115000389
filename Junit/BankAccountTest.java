import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100);
    }

    @Test
    void testDeposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        assertTrue(account.withdraw(50));
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawFailure() {
        assertFalse(account.withdraw(200));
        assertEquals(100, account.getBalance());
    }
}