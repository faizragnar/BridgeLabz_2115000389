import java.util.Scanner;

public class FormulaAndLoop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the number of natural numbers : ");
		int number = sc.nextInt();
		if(number < 0) System.out.print("The number "+number+" is not a natural number");
							
		int sum = number*(number+1)/2;
		System.out.println("The sum of"+number+"natural numbers using formula is "+sum);
		
		int loopsum = 0;
		
		while(number!=0){
			loopsum += number;
			number--;
			
			
		}
		
		System.out.print("The sum of"+number+"natural numbers using while loop is "+loopsum);
		
	
	
	}
	


}