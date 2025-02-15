import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        String filePath = "user_input.txt"; 

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(filePath, true); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter text to save to file (type 'exit' to stop):");

            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            inputStreamReader.close();

            System.out.println("User input has been saved to " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
