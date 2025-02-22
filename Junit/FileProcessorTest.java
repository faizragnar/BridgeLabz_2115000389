import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class FileProcessorTest {
    static final String TEST_FILE = "testfile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Hello World");
        assertEquals("Hello World", FileProcessor.readFromFile(TEST_FILE));
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Hello World");
        assertTrue(new File(TEST_FILE).exists());
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }
}