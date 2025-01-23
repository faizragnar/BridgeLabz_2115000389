import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        //  checking divisiblity and printing result
		int temp = number%10;
        if(temp == 0 || 5)    System.out.println("Is the number"+ number+ "divisible by 5? Yes ");
		
		else System.out.println("Is the number"+ number+ "divisible by 5? NO ");
        
        
     
        
        
    }
}