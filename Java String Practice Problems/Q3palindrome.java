public class Q3palindrome{
	
	boolean ispalindrome(String str){
		StringBuilder sb =new StringBuilder(str);
		
		
		sb.reverse();
		String rev = "";
		rev =sb.toString();
		

		
		if (rev.equals(str)) return true;
		else return false;
	} 
	

	public static void main(String[] args){
		String str = "racecar";
		Q3palindrome obj = new Q3palindrome();
		
		boolean flag =obj.ispalindrome(str);
		
		
		if(flag) System.out.print(" it is a palindrome");
		
		else System.out.print(" it is not a palindrome");

		
		
	}
}