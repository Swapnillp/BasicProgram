//javapractice
//palindromic pattern with number
/*
    1
   212
  32123
 4321234
543212345
 
 */
public class p35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		for(int i=1;i<=no;i++) {
			//spaces
			for(int j=1;j<=no-i;j++) {
				System.out.print(" ");
			}
			//stars
			//desc
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//asc
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
