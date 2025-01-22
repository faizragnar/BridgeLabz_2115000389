import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();
        
        // Calculating perimeter
        double perimeter = side1 + side2 + side3;
        
        // Distance to complete
        double distanceToComplete = 5000;
        
        // number of rounds
        double rounds = distanceToComplete / perimeter;
        
        // Printing the result
        System.out.println("The total number of rounds the athlete will run " + Math.ceil(rounds) + "rounds to complete 5 km");
        
        
    }
}
