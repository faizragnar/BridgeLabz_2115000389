import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter your years of service: ");
        double yearsOfService = input.nextDouble();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            
            System.out.printf(" bonus amount is: %f", bonus);
        } else {
			
            System.out.println("no bonus");
        }

    }
}