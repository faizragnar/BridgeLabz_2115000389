import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        // Converting Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;
        
        // Printing the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        
       
    }
}