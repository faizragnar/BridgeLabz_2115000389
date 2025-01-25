import java.util.Scanner;

public class Q3MultiplicationTable {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to create its multiplication table: ");
        int number = sc.nextInt();

        int[] multiplicationTable = new int[10];

        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        
    }
}
