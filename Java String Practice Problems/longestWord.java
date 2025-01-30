import java.util.Scanner;

public class longestWord{
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
		
		longestWord ob = new longestWord();
		
		String result = ob.findword(str);
		System.out.print(result);
		
		
	}

}