//javapractice
import java.util.Scanner;
//decimal to binary
public class p23 {
	public static void decTobinary(int no) {
		int bin=0;
		int pow=0;
		while(no>0) {
			int rem=no%2;
			bin=bin+(int)Math.pow(10,pow);
			pow++;
			no=no/2;
		}
		System.out.println("binary number is:"+bin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal:");
		int no=sc.nextInt();
		decTobinary(no);

	}

}
