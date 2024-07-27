//javapractice
import java.util.Scanner;

public class p3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		float a=sc.nextFloat();
		System.out.println("Enter b:");
		float b=sc.nextFloat();
		System.out.println("Enter c:");
		float c=sc.nextFloat();
			if(a>b&&a>c) {
				System.out.println("a is maximum :"+a);
			}else if(b>c) {
				System.out.println("b is maximum :"+b);
			}else {
				System.out.println("c is maximum :"+c);
			}
		
		
	}
}
