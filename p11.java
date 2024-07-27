//javapractice
import java.util.Scanner;
//for loop
//sum of nth natural number

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
