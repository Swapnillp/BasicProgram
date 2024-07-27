//javapractice
import java.util.Scanner;
//income tax calculator
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a income :");
		float income=sc.nextFloat();
		if(income<500000) {
			System.out.println("0% tax");
			System.out.println("no income tx");
		}else if(income>=500000&&income<1000000) {
			System.out.println("20% tax");
			float tax=(float)income*0.20f;
			System.out.println(tax);
		}else {
			System.out.println("30% tax");
			float tax=(float)income*0.30f;
			System.out.println(tax);
		}

	}

}
