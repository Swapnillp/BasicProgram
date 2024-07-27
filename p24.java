//javapractice
import java.util.Scanner;
// Write a Java method to compute the average of three numbers.

public class p24 {
	public static void average(int no1,int no2,int no3) {
		int avg=(no1+no2+no3)/3;
		System.out.println("average is:"+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int no1=sc.nextInt();
		System.out.println("Enter second number:");
		int no2=sc.nextInt();
		System.out.println("Enter third number:");
		int no3=sc.nextInt();
		average(no1,no2,no3);

	}

}
