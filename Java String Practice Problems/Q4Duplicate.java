public class Q4Duplicate{
	String RemoveDupe(String str){
		
		char[] arr = str.toCharArray();
		StringBuilder result = new StringBuilder();
		char c ='\0';
		for(int i=0; i<arr.length-1;i++){
			if(arr[i]!=c){
				result.append(arr[i]);
				c=arr[i];
			}	
		}
		
		return result.toString();
	}
	
	public static void main(String[] args){
		String str= "aaabbbccdddd";
		
		Q4Duplicate ob = new Q4Duplicate();
		String result= ob.RemoveDupe(str);
		
		System.out.print(result);
		
		
	}

}