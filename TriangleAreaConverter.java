import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base of the triangle (in cm): ");
        double base = sc.nextDouble();
        
        System.out.print("Enter height of the triangle (in cm): ");
        double height = sc.nextDouble();
        
        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;
        
        // Convert area to square inches (1 cm² = 0.155 square inches)
        double areaInches = areaCm * 0.155;
        
        
        // Display the results
        System.out.println("The area of the triangle is " + areaCm + " in cm sq. or " + areaInches + " in inches sq..");
      
        
    }
}
