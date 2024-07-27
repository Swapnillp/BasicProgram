//javapractice
import java.util.Scanner;
import java.util.*;
//binary to decimal

public class p22 {
	public static void binaryTodecimal(int no) {
		int pow=0;
		int decNum=0;
		while(no>0) {
			int lastdigit=no%10;
			decNum=decNum+(lastdigit*(int)Math.pow(2, pow));
			pow++;
			no/=10;
		}
		System.out.println(decNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number :");
		int no=sc.nextInt();
		binaryTodecimal(no);

	}

}
