import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
        
        double inches = heightCm / 2.54; // Convert cm to inches
        int feet = (int) (inches / 12); // Get the number of feet
        double remainingInches = inches % 12; // Get the remaining inches
        
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feet, remainingInches);
        
       
    }
}
