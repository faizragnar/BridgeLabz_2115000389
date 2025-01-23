import java.util.Scanner;

public class VotingAge{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the age of the voter : ");
		int age = sc.nextInt();
		
		// Comparing the age and printing the result
		if(age>=18) System.out.print("The person's age is "+age+" and can vote.");
		
		else System.out.print("The person's age is "+age+" and cannot vote.");
	

	}
	
}