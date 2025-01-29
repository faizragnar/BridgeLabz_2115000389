import java.util.Scanner;

public class Q5_PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println(str + " is " + (isPalindrome(str) ? "a palindrome." : "not a palindrome."));
        scanner.close();
    }
}