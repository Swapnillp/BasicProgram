//javapractice
//Find Smallest Element in an Array
public class p51 {
	public static void smallest(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,6,8,-9};
		smallest(arr);
	}

}
