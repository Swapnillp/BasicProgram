//javapractice
import java.util.Scanner;
//Check whether a character is a vowel or consonant
public class p62 {
	public static void checkChar(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("character is vowel");
		}
		else {
			System.out.println("character is consonant");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a input :");
		char ch = sc.next().charAt(0);
		checkChar(ch);
	}

}
