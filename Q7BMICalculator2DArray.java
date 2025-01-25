import java.util.Scanner;
public class Q7BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            do {
                System.out.print("Enter height in meters (positive value): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please try again.");
                }
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter weight in kilograms (positive value): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please try again.");
                }
            } while (personData[i][1] <= 0);
        }
        
        for (int i = 0; i < numberOfPersons; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
      
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("Height: %.2f Weight: %.2f BMI: %.2f Status: %s",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}