//javapractice
import java.util.Scanner;
//print the prime number in given range

public class p5 {
    public static void primeNo(int lower,int upper) {
    	for(int i=lower;i<=upper;i++) {
    		if(i==0||i==1)
    			continue;
    		int flag=1;
    		for(int j=2;j<i/2;j++) {
    			if(i%j==0) {
    				flag=0;
    				break;
    			}
    			
    		}
    		if(flag==1) {
    			System.out.print(i +" ");
    		}
    	}
    		
    		
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a lower limit:");
		int lower=sc.nextInt();
		System.out.println("Enter a upper limit:");
		int upper=sc.nextInt();
		p5.primeNo(lower,upper);

	}

}
