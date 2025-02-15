import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000; 
        String text = "hello";
        String filePath = "large_file.txt"; 

        
        compareStringBuilderAndBuffer(iterations, text);

        
        compareFileReaders(filePath);
    }

    public static void compareStringBuilderAndBuffer(int iterations, String text) {
        
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long timeBuffer = System.nanoTime() - startTimeBuffer;

        
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long timeBuilder = System.nanoTime() - startTimeBuilder;

        
        System.out.println("\nString Concatenation Performance:");
        System.out.println("StringBuffer time: " + timeBuffer / 1_000_000 + " ms");
        System.out.println("StringBuilder time: " + timeBuilder / 1_000_000 + " ms");

        System.out.println("Faster method: " + (timeBuffer > timeBuilder ? "StringBuilder" : "StringBuffer"));
    }

    public static void compareFileReaders(String filePath) {
        
        long startTimeFileReader = System.nanoTime();
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        long timeFileReader = System.nanoTime() - startTimeFileReader;

        
        long startTimeInputStreamReader = System.nanoTime();
        int wordCountInputStreamReader = countWordsUsingInputStreamReader(filePath);
        long timeInputStreamReader = System.nanoTime() - startTimeInputStreamReader;

        
        System.out.println("\nFile Reading Performance:");
        System.out.println("FileReader word count: " + wordCountFileReader + ", Time: " + timeFileReader / 1_000_000 + " ms");
        System.out.println("InputStreamReader word count: " + wordCountInputStreamReader + ", Time: " + timeInputStreamReader / 1_000_000 + " ms");

        System.out.println("Faster method: " + (timeFileReader > timeInputStreamReader ? "InputStreamReader" : "FileReader"));
    }

    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        return wordCount;
    }
}
