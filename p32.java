//javapractice
//hollow rhombus
/*
    *****
   *   *
  *   *
 *   *
*****

 */
public class p32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		for(int i=1;i<=no;i++) {
			//space
			for(int j=1;j<=no-i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=no;j++) {
				if(i==1||i==no||j==1||j==no) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
