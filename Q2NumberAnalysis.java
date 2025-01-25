import java.util.Scanner;

public class Q2NumberAnalysis {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        int[] numbers = new int[5];
		

        System.out.println("Enter 5 numbers to analyze:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

      
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + (i + 1) + " (" + num + "): ");

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

       
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
		
        if (first == last) {
            System.out.println("The first and last numbers are equal");
        } else if (first > last) {
            System.out.println("The first number " + first + " is greater than the last number "+last);
        } else {
            System.out.println("The first number " + first + " is less than the last number "+ last);
        }

       
    }
}
