import java.util.Scanner;
public class KmToMilesIO{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		double km = sc.nextInt();
		
		double miles = km*0.621;

		System.out.printf("The total miles is %.2f mile for the given %.2f km" ,miles, km );

	}


}
