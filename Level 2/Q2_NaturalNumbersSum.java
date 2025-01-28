import java.util.Scanner;

public class Q2_NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number greater than 0.");
            return;
        }

        int sumRecursive = findSumRecursive(n);
        int sumFormula = findSumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a mismatch in computations.");
        }
    }

    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursive(n - 1);
    }

    public static int findSumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
