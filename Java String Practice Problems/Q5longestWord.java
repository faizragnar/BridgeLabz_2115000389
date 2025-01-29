import java.util.Scanner;

public class Q5longestWord{
	String findword(String str){
		
		String[] arr = str.split(" ");
		String result= ""; 
		
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i].length()> result.length()){
				result = arr[i];
			}
			
		}
		return result;

		
		
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Q5longestWord ob = new Q5longestWord();
		
		String result = ob.findword(str);
		System.out.print(result);
		
		
	}

}