import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    ListManager manager;
    List<Integer> list;

    @BeforeEach
    void setup() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        manager.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        list.add(10);
        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        list.add(1);
        list.add(2);
        assertEquals(2, manager.getSize(list));
    }
}
