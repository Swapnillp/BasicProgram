//javapractice
import java.util.Scanner;
//check whether prime number is not.
public class p4 {
	public static boolean checkPrime(int no) {
		if(no==2) {
			return true;
		}else {
			for(int i=2;i<no/2;i++) {
				if(no%i==0) {
					return false;
				}else {
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt()
;		System.out.print(p4.checkPrime(no));
		
			
		
	}

}
