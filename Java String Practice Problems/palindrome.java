public class palindrome{
	
	boolean ispalindrome(String str){
		
		
		
		sb.reverse();
		String rev = "";
		rev =sb.toString();
		

		
		if (rev.equals(str)) return true;
		else return false;
	} 
	

	public static void main(String[] args){
		String str = "racecar";
		palindrome obj = new palindrome();
		
		boolean flag =obj.ispalindrome(str);
		
		
		if(flag) System.out.print(" it is a palindrome");
		
		else System.out.print(" it is not a palindrome");

		
		
	}
}