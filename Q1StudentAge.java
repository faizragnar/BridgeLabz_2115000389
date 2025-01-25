import java.util.Scanner;

public class Q1StudentAge{
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		int[] AgeArr = new int[10] ;
		
		 for (int i = 0; i < AgeArr.length; i++){
			System.out.print("Enter the age : ");
			age = sc.nextInt();
			AgeArr[i] = age;
		}
		
		for (int j = 0; j < AgeArr.length; j++){
		
			if(AgeArr[j]<0){
						System.out.println(" Age cannot be negative");

			}
			else if( AgeArr[j] <18 ) System.out.println(" Studen with Age "+AgeArr[j] + " cannot vote");
			
			else System.out.println(" Studen with Age "+AgeArr[j] + " can vote");
		
		}
		
	}

}