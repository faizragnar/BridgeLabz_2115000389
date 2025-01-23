import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
        int number3 = sc.nextInt();
        
        // Comparing numbers and printing result
        if(number1 > number2 && number1 > number3) System.out.print("Is the first number the largest? Yes");
		else if(number2 > number3 && number2 > number1) System.out.print("Is the second number the largest? Yes");
		else  System.out.print("Is the third number the largest? Yes");
	
    }
}