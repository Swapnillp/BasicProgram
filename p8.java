//javapractice
import java.util.Scanner;
//use of ternary operator
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int no=sc.nextInt();
		String ans=(no%2==0)?"no is even":"no is odd";
		System.out.println(ans);

	}

}
