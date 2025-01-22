import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        
        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        // Printing the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);
        
        
    }
}
