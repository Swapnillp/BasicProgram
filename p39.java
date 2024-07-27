//javapractice
//smallest element in array
public class p39 {
	public static int smallestElement(int arr[]) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,2,122,45,54};
		System.out.println(smallestElement(arr));
	}

}
