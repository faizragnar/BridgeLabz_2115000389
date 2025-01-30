import java.util.Scanner;

public class VowelAndCons{
	
	static void numberofVandC(String str){
		int vowel=0;
		int cons=0;
		
		for(int i = 0; i<str.length();i++){
			char ch=  Character.toLowerCase(str.charAt(i));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  ){
				vowel ++;
			}
			else cons ++;
	
		}
		System.out.print("the number of vowels are "+ vowel + " and the number of consonants are " +cons );
		
	}
	


	public static void main(String [] args){
		System.out.print("Enter a String :")
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		numberofVandC(str);
	}

}