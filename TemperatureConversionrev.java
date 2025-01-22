import java.util.Scanner;

public class TemperatureConversionrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        // Converting Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5/9;
        
        // Printing the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        
        
    }
}
