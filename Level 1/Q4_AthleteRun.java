import java.util.Scanner;

public class Q4_AthleteRun {

    public static int calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km = 5000 meters
        return (int) Math.ceil(distanceToRun / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        int rounds = calculateRounds(perimeter);

        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");

    }
}
