import java.util.Scanner;

public class NaturalNumberSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the number of natural numbers : ");
		int number = sc.nextInt();
		
		//Computing the n sum of natural numbers
		if(number>0){
			
			int sum = number*(number+1)/2;
			
			System.out.print("The sum of"+number+"natural numbers is "+sum);
		}
		
		else System.out.print("The number "+number+" is not a natural number");
	
	
	}
	


}