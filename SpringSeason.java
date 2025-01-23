import java.util.Scanner;

public class SpringSeason{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the Month(in numbers) : ");
		int month = sc.nextInt();
		
		System.out.print("Enter the day : ");
		int day = sc.nextInt();
		
		// Checking the date and printing the result
		if(month>=3 && month <=6 && day >=20 && day<=31) System.out.print("Its a Spring Season");
		
		else System.out.print("Not a Spring Season");
	

	}
	
}