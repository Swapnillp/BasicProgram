
import java.util.Scanner;
//calculate simple interest 
public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a principle :");
		int p=sc.nextInt();
		System.out.println("Enter a rate :");
		int r=sc.nextInt();
		System.out.println("Enter a amount:");
		int t=sc.nextInt();
		int si=p*r*t/100;
		System.out.println("Simple interest is :"+si); 
	}

}
