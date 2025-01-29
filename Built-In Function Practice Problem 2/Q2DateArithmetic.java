import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q2DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter a date (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);

        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Modified Date: " + newDate.format(formatter));

        scanner.close();
    }
}
