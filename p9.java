//javapractice
import java.util.Scanner;
//switch

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice 1-5 :");
		int no=sc.nextInt();
		switch(no) {
		case 1: System.out.println("cofee");
		  break;
		case 2: System.out.println("burger");
		  break;
		case 3: System.out.println("tea");
		  break;
		case 4: System.out.println("pizza");
		  break;
		case 5: System.out.println("sandwitch");
		  break;
		default:System.out.println("Invalid choice");
   		}
	}

}
