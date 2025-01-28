import java.util.Scanner;

public class Q10_BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3]; // [weight, height (cm), BMI]

        // Input data for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(personData);

        // Display results
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight: " + personData[i][0] + "kg, Height: " + personData[i][1] + "cm, BMI: " + personData[i][2] + ", Status: " + getBMIStatus(personData[i][2]));
        }
    }

    // Calculates BMI and populates the array
    static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }
    // Determines BMI status based on the calculated BMI
    static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
