import java.util.Scanner;

public class Q7OddEvenArrays {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        int[] EvenArr = new int[number / 2 + 1];
        int[] OddArr = new int[number / 2 + 1];

        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                EvenArr[evenIndex++] = i;
            } else {
                OddArr[oddIndex++] = i;
            }
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(EvenArr[i] + " ");
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(OddArr[i] + " ");
        }

    }
}
