//javapractice
//Count even and odd element in Java
public class p60 {
	public static void evenodd(int arr[]) {
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("even no is :"+even);
		System.out.println("odd no is :"+odd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		evenodd(arr);

	}

}
