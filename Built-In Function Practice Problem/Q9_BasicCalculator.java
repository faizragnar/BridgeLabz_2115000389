import java.util.Scanner;

public class Q9_BasicCalculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return b != 0 ? a / b : 0; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Choose operation (+, -, *, /):");
        char op = scanner.next().charAt(0);

        double result = switch (op) {
            case '+' -> add(num1, num2);
            case '-' -> subtract(num1, num2);
            case '*' -> multiply(num1, num2);
            case '/' -> divide(num1, num2);
            default -> Double.NaN;
        };

        System.out.println("Result: " + result);
        scanner.close();
    }
}