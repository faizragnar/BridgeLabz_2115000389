import java.util.Scanner;

public class Q4ArrayAndSum {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers. Enter 0 or a negative number to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("Numbers Entered -");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal Sum: " + total);

       
    }
}
