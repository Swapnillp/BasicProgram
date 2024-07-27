//javapractice
//largest element in array
public class p38 {
	public static int largestElement(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,32,14,23,49,4};
		System.out.println(largestElement(arr));
	}

}
