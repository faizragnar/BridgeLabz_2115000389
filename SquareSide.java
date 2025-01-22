import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        
        // Calculate the side length
        double side = perimeter / 4;
        
        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
    }
}
