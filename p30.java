//javapractice
//butterfly pattern
/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/
public class p30 {
	public static void butterfly(int no) {
		//1st half
		for(int i=1;i<=no;i++) {
			//star- i
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//space- 2*(n-1)
			for(int j=1;j<=2*(no-i);j++) {
				System.out.print(" ");
			}
			//star- i
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd half
		for(int i=no;i>=1;i--) {
			//star- i
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//space- 2*(n-1)
			for(int j=1;j<=2*(no-i);j++) {
				System.out.print(" ");
			}
			//star- i
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		butterfly(4);

	}

}
