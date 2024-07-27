//javapractice
//method overloading with changing the datatype
public class p21 {
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p21 k=new p21();
		System.out.println(k.add(10,20));
		System.out.println(k.add(10,20.2));

	}

}
