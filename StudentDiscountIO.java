import java.util.Scanner;

public class StudentDiscountIO{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		double fee = sc.nextDouble();
		double discountPercent = sc.nextDouble();
	
		double discount = (discountPercent / 100) * fee;

        	double discountedFee = fee - discount;

        	System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f", discount, discountedFee);
	}



}
