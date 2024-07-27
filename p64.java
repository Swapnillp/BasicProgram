//javapractice
import java.util.Scanner;
//Java Program for Calculating ASCII value of a character
public class p64 {
	public static void checkAscii(char ch) {
		int i=ch;
		System.out.println("Ascii value of char is :"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		checkAscii(ch);
		

	}

}
