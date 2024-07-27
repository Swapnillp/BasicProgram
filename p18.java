//javapractice
import java.util.Scanner;
//multiplication of two number by using function
public class p18 {
	public static int multiplication(int a,int b) {
		int c=a*b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		int multi=multiplication(a,b);
		System.out.println("multiplication of a*b="+multi);
		}

}
