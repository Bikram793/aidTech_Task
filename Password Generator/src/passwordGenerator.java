import java.lang.Math;
import java.util.*;
public class passwordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=8;
		char capitalLetter[]=new char[26];
		char smallLetter[]=new char[26];
		char number []= {'0','1','2','3','4','5','6','7','8','9'};
		char [] specialCharacter= {'!','@','#','$','%','^','&','*','`'};
		int i=0;

		for(char c='A',d='a';c<='Z';++c,++d) {
			capitalLetter[i]=c;
			smallLetter[i]=d;
			i++;
		}


		StringBuilder str=new StringBuilder();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Generate Custom Input: 'yes'  'no'");
		String inp=sc.next();
		if(inp.equals("yes")) {
			System.out.println("Enter the length");
			length=sc.nextInt();
			System.out.println("Enter the characters to use in password");
			String characters=sc.next();
			str.append(characters);
			System.out.println("Your password generated is:");
			System.out.println(password(length,str));
		}
		else {
			str.append(capitalLetter);
			str.append(smallLetter);
			str.append(number);
			str.append(specialCharacter);
			System.out.println("Your password generated is:");
			System.out.println(password(length,str));
		}
		
	}
	public static String password(int length,StringBuilder str) {
		StringBuilder generatedText=new StringBuilder();
		for(int i=0;i<length;i++) {
			int a=(int)(Math.random()*(str.length()-0+1)+0);
			generatedText.append(str.charAt(a));
		}
		return generatedText.toString() ;
	}

}
