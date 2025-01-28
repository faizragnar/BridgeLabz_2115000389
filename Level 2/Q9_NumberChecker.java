import java.util.Scanner;

public class Q9_NumberChecker {

    public static String isPositiveOrNegative(int num) {
        return num >= 0 ? "Positive" : "Negative";
    }

    public static String isEvenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            String positivity = isPositiveOrNegative(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + positivity);

            if (positivity.equals("Positive")) {
                String evenOrOdd = isEvenOrOdd(numbers[i]);
                System.out.println(" and it is " + evenOrOdd);
            } else {
                System.out.println();
            }
        }

        int result = compareNumbers(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }
}
