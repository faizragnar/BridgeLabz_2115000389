import java.util.Scanner;

public class PosNegOrZero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		
		// Comparing the number and printing the result
		if(number>0) System.out.print("Positive");
		
		else if(number<0) System.out.print("negative");
		
		else System.out.print("zero");
	

	}
	
}