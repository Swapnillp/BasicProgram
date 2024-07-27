//javapractice
//reverse of the array(swapping method)
public class p41 {
	public static void reverseArray(int arr[]) {
		int start=0,end=arr.length-1;
		while(start<end) {
			//swap
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		reverseArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

}
