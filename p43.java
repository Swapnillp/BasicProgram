//javapractice
//subarrays
public class p43 {
	public static void subArrays(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {           //print
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		subArrays(arr);

	}

}
