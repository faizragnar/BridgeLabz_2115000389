import java.util.Scanner;

public class Q8_TemperatureConverter {
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.println("Converted to Celsius: " + toCelsius(temp));
        System.out.println("Converted to Fahrenheit: " + toFahrenheit(temp));
        scanner.close();
    }
}