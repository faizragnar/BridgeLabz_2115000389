import java.util.Scanner;

public class Q8FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }

    }
}
