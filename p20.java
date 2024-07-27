//javapractice
//functionn overloading (by changing no of argument)

public class p20 {
	public static int multiply(int a ,int b) {
		int c=a*b;
		return c;
	}
	public static int multiply(int a,int b,int c) {
		int d=a*b*c;
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply(10,20));
		System.out.println(multiply(10,20,30));
       
	}

}
