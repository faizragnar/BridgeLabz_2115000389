import java.util.Scanner;

public class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("Enter the number of natural numbers : ");
		int number = sc.nextInt();
		if(number<0) System.out.print("The number "+number+" is not a natural number");
			
		int temp = number;
		for(int i=1; i<=number ; i++){
			
			if(i%2==0)
				System.out.println( i+" is Even");
			else
				System.out.println( i+" is Odd");
			
		}
		
		
		
		
	
	
	}
	


}