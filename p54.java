//javapractice
//Reverse an Array(brute force)
public class p54 {
	public static void reverse(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
//Reverse an Array(by swapping method)
	public static void reverse1(int arr1[]) {
		int start=0,end=arr1.length-1;
		while(start<end) {
			int temp=arr1[end];
			arr1[end]=arr1[start];
			arr1[start]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {1,2,3,4,5};
		 reverse(arr);
		 int arr1[]= {11,12,13,14,15};
		 reverse1(arr1);
	}

}
