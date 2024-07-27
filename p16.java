//javapractice
import java.util.Scanner;
//swapping two number using third variable
public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		    //swapping by using temp var
		int temp=b;
		b=a;
		a=temp;
		System.out.println("After a swapping a result :");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
