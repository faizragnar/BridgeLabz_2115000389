import java.util.Scanner;

public class Q6_FactorialRecursion {
    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial: " + factorial(num));
        scanner.close();
    }
}