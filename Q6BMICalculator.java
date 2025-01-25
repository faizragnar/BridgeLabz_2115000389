import java.util.Scanner;

public class Q6BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight in kilograms: ");
            weights[i] = sc.nextDouble();
        }

        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

   
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf(" height : %d | weight : %.2f | BMI : %.2f | Status %s%n", i + 1, heights[i], weights[i], bmis[i], statuses[i]);
        }

    }
}
