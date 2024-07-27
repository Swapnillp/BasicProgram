//javapractice
//diamond
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */
public class p33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		//1st half
		for(int i=1;i<=no;i++) {
			//space
			for(int j=1;j<=no-i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=(2*(i)-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd half
		for(int i=no;i>=1;i--) {
			//space
			for(int j=1;j<=no-i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=(2*(i)-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
