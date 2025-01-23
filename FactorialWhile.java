import java.util.Scanner;

public class FactorialWhile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		int factorial = 1;
		while(number!=0){ 
			factorial *= number;
			number--;
				
		}
		
		
		System.out.print(factorial);
	
	
	}
	


}