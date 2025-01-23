import java.util.Scanner;

public class FactorialFor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		int factorial = 1;
		int temp= number;
		
		for(int i =0; i<temp; i++){ 
			factorial *= number;
			number--;
				
		}
		
		
		System.out.print(factorial);
	
	
	}
	


}