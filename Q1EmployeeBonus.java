import java.util.Scanner;

public class Q1EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];
        
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            
            while (true) {
                System.out.print("Enter salary : ");
                if (sc.hasNextDouble()) {
                    salaries[i] = sc.nextDouble();
                    if (salaries[i] >= 0) break;
                } else {
                    sc.next();
                }
                System.out.println("Invalid input. Please enter a valid positive number.");
            }
            
            while (true) {
                System.out.print("Enter years of service : ");
                if (sc.hasNextDouble()) {
                    yearsOfService[i] = sc.nextDouble();
                    if (yearsOfService[i] >= 0) break;
                } else {
                    sc.next();
                }
                System.out.println("Invalid input");
            }
        }
        
        
        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee %d: Old Salary = $%.2f, Bonus = $%.2f, New Salary = $%.2f%n", 
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }
        
        System.out.printf("\nTotal Bonus Payout: $%.2f%n", totalBonus);
        System.out.printf("Total Old Salary: $%.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: $%.2f%n", totalNewSalary);
        
       
    }
}
