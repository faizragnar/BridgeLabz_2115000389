import java.util.Random;

public class Q11_ZaraBonusCalculator {

    public static void main(String[] args) {
        double[][] employeeDetails = generateEmployeeData(10);
        double[][] updatedDetails = calculateBonus(employeeDetails);
        displayResults(updatedDetails);
    }

    // Method to generate random salary and years of service for each employee
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = random.nextInt(50000) + 10000; // Generate salary between 10000 and 59999
            data[i][1] = random.nextInt(10) + 1; // Generate years of service between 1 and 10
        }
        return data;
    }

    // Method to calculate bonus based on years of service
    public static double[][] calculateBonus(double[][] employeeDetails) {
        double[][] updatedDetails = new double[employeeDetails.length][3];
        for (int i = 0; i < employeeDetails.length; i++) {
            double salary = employeeDetails[i][0];
            double yearsOfService = employeeDetails[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;
            updatedDetails[i][0] = salary;
            updatedDetails[i][1] = bonusAmount;
            updatedDetails[i][2] = newSalary;
        }
        return updatedDetails;
    }

    // Method to display results in a tabular format
    public static void displayResults(double[][] updatedDetails) {
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        for (int i = 0; i < updatedDetails.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", i + 1, updatedDetails[i][0], updatedDetails[i][1], updatedDetails[i][2]);
        }
    }
}