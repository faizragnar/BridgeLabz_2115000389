import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        
        // Performing double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        // Printing the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        
    }
}
