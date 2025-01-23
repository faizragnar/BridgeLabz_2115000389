import java.util.Scanner;

public class AddUntilZero{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		double userInput = sc.nextDouble();
		double total = 0.0;

		while(userInput!=0){
			
			total += userInput; 
			userInput = sc.nextDouble();
		}
		
		System.out.print(total);
	
	
	}

}