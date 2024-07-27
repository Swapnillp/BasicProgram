//javapractice
import java.util.Scanner;
//factorial of number
public class p19 {
	public static int factorial(int no) {
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int no=sc.nextInt();
		//int c=factorial(no);
		//System.out.println("factorial is:"+c);
		
		System.out.println("factorial is:"+factorial(5));
	}

}
