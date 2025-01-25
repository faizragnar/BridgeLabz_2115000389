import java.util.Scanner;

public class Q10DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        
        int[] frequency = new int[10];
        
        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            int digit = digitChar - '0';
            frequency[digit]++;
        }
        
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        
    }
}
