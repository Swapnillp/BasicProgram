//javapractice
import java.util.Scanner;
//swapping without third variable
public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		//suppose a=10 and b=20
		a=a+b;   //a=10+20--->a=30
		b=a-b;   //b=30-20--->b=10
		a=a-b;
		System.out.println("After swapping :");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		}

}
