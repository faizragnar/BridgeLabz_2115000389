import java.io.*;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String targetWord = scanner.next();

        int count = countWordOccurrences(filePath, targetWord);
        if (count != -1) {
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");
        }

        scanner.close();
    }

    public static int countWordOccurrences(String filePath, String targetWord) {
        int count = 0;
        
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { 
                        count++;
                    }
                }
            }

            
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return -1; 
        }

        return count;
    }
}
