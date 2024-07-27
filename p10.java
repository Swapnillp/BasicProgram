//javapractice
import java.util.Scanner;
//while loop
//multiplication table
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		int i=1;
		while(i<=10) {
			int multi=no*i;
			System.out.println(multi);
			i++;
		}

	}

}
