import java.io.*;

class FileProcessor {
    static void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }

    static String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
    }
}