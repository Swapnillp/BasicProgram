//javapractice
//hollow rectangle pattern
/*
****
*  *
*  *
****
*/
public class p25 {
	public static void hollow_rect(int row,int col){
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1||i==row||j==1||j==col) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         hollow_rect(4,4);
	}

}
