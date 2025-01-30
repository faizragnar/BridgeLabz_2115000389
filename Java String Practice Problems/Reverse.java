public class Reverse{
	
	String reverse(String str){
		String reversed = "";
		for(int i= str.length(); i>0 ; --i){
			 reversed = reversed.concat(String.valueOf(str.charAt(i - 1)));
		}
		return reversed;
	}


	public static void main(String[] args){
	
	String str = "hello world";
	Reverse obj = new Reverse();
	String reversed = obj.reverse(str);
	
	System.out.println(str+reversed);
	
	}
}