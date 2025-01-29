import java.util.Scanner;
import java.util.Random;

public class Q1_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;

        System.out.println("Think of a number between 1 and 100, and I'll guess it!");

        while (true) {
            guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = scanner.nextLine();

            if ("correct".equalsIgnoreCase(feedback)) {
                System.out.println("Yay! I guessed it!");
                break;
            } else if ("high".equalsIgnoreCase(feedback)) {
                high = guess - 1;
            } else if ("low".equalsIgnoreCase(feedback)) {
                low = guess + 1;
            }
        }
        scanner.close();
    }
}