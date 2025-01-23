import java.util.Scanner;

public class Countdown{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the countdown value : ");
		int countdown = sc.nextInt();
		
		// Running a loop and printing the result
		while(countdown!=0){
			System.out.println(countdown);
			countdown--;
		
		
		}
	

	}
	
}