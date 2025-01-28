import java.util.Scanner;

public class Q1SimpleInterest{
	public void SICalculator(double principal,double rate ,double time ){
		
		
		
		double SI = (principal*rate*time)/100;
		
		System.out.print("The Simple Interest is "+SI+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+ time);

	
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Q1SimpleInterest ob = new Q1SimpleInterest();
		
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		
		ob.SICalculator(principal,rate,time);
	}

}