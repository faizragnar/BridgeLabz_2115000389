import java.util.Scanner;

public class ChocolateDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        
        // Calculating chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Printing the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        
       
    }
}
