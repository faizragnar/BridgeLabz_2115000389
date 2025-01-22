import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the unit price in INR: ");
        double unitPrice = scanner.nextDouble();
        
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        
        // Calculate the total price
        double totalPrice = unitPrice * quantity;
        
        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        
        
    }
}