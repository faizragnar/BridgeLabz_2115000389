import java.util.Scanner;

public class SimpleInterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter the Time period (in years): ");
        double time = sc.nextDouble();
        
        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Printing the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        
    }
}
