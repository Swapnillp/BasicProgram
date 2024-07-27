
//sum of nth term natural number
//first mehtod
public class p1 {
    static int sum=0;
	public static void sumOf(int n) {
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of the nth term is :"+sum);
	}
// second method
	public static int sumOf1(int no) {
		int k= no*(no+1)/2;
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		p1 k=new p1();
//		k.sumOf(5);
		p1.sumOf(10);
		System.out.println("sum of :"+p1.sumOf1(10));
		
	}

}
