import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the salary in INR: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter the bonus in INR: ");
        double bonus = sc.nextDouble();
        
        // Calculating total income
        double totalIncome = salary + bonus;
        
        // Printing the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        
       
    }
}
