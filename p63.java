//javapractice
import java.util.Scanner;
//A character is an alphabet or not using java
public class p63 {
	public static void alphabet(char ch) {
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println("Enter input is alphabet:");
		}
		else {
			System.out.println("Enter input is not alphabet:");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a input:");
		char ch=sc.next().charAt(0);
		alphabet(ch);
		
		

	}

}
