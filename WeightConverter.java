import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        
        // Converting pounds to kilograms
        double weightInKg = weightInPounds / 2.2;
        
        // Printing the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
        
        
    }
}
