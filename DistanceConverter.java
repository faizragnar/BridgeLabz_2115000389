import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        // Convert feet to yards and miles
        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceYards / 1760;
        
        // Display the result
        System.out.println("The distance in yards is " + distanceYards + " and in miles is " + distanceMiles);
        
      
    }
}
