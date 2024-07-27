//javapractice
//Find Largest element in an array
public class p50 {
	public static void largest(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,6,8,0};
		largest(arr);

	}

}
