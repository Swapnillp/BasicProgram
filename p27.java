//javapractice
//inverted half pyromid with number
/*
12345
1234
123
12
1
*/

public class p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
